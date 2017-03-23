package id;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import assemble.AssTool;
import assemble.Peak2InChI2IDResult;
import assemble.ResultAss;
import db.TransformSDF;
import isotope.IsotopeCal;
import metaboEntity.MatchPeak;
import metaboEntity.Peak;
import property.PropertyName;
import property.SoftwareProperties;
import metFrag.MetFragParaList;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.lang3.StringUtils;

import metaboEntity.MetaboliteDB;
import db.readMetaboDB;
import org.xml.sax.SAXException;
import rawData.PostXCMSflow;

import javax.xml.parsers.ParserConfigurationException;

public class MetaboIdent {

    public static void main(String[] args) throws ParseException, IOException, ParserConfigurationException, SAXException {
        // TODO Auto-generated method stub
        long startTime = System.currentTimeMillis();
        String version = "vCCCC";
        Options options = new Options();

        options.addOption("p", true, "Gloabal property file path");
        options.addOption("s", true, "Sum up the output files");
        //multi-id method

        options.addOption("h", false, "Help");

        CommandLineParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("h") || cmd.hasOption("help") || args.length == 0) {
            HelpFormatter f = new HelpFormatter();
            System.out.println("java -jar MetaboliteIdentify.jar");
            System.out.println(version);
            f.printHelp("Options", options);
            System.exit(0);
        }

        Logger logger = Logger.getLogger(MetaboIdent.class.getName());
        if (cmd.hasOption("p")) {
            SoftwareProperties.readPropFromFile(cmd.getOptionValue("p"));
        }else {
            logger.warning("Not set the property file with the option |-p|");
        }

        String proName = "tmp";
        if (SoftwareProperties.getPropertiesPair().get(PropertyName.getPROJECT_NAME()) != null) {
            proName = SoftwareProperties.getPropertiesPair().get(PropertyName.getPROJECT_NAME());
        }

        Integer idFlow = 0;
        if (SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW()) != null){
            idFlow = Integer.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW()));
        }else {
            logger.info("Set the id_workflow in the global property file, the default is 0");
        }

        if (idFlow == 1) {
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpMS1DB = SoftwareProperties.getPropertiesPair().get(PropertyName.getMS1_DB_PATH());
            Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

            String[] adductArray;
            String tmpAdductType = SoftwareProperties.getPropertiesPair().get(PropertyName.getADDUCT_TYPE());
            if (tmpAdductType != null){
                adductArray = tmpAdductType.split(",");
            }else {
                adductArray = new String[1];
                adductArray[0] = "[M+H]";
            }

            PostXCMSflow.ms1idSearch(proName, tmpInputFile, tmpMS1DB, adductArray, tmpTolerance);
        } else if(idFlow == 2){
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpMetFragDBType = SoftwareProperties.getPropertiesPair().get(PropertyName.getMETFRAG_DB_TYPE());
            String tmpMetFragDBPath = SoftwareProperties.getPropertiesPair().get(PropertyName.getMETFRAG_DB_PATH());
            Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

            if (tmpInputFile != null  && tmpMetFragDBPath != null && tmpMetFragDBType != null) {
                MetFragParaList metFragParalist = new MetFragParaList();
                if (Integer.valueOf(tmpMetFragDBType) == 1) {
                    metFragParalist.setMetFragDatabaseType("LocalPSV");
                    metFragParalist.setLocalDatabasePath(tmpMetFragDBPath);
                }else if (Integer.valueOf(tmpMetFragDBType) == 2) {
                    metFragParalist.setMetFragDatabaseType("LocalSDF");
                    String tmpDB2 = TransformSDF.breakInChIKey(tmpMetFragDBPath).toString();
                    metFragParalist.setLocalDatabasePath(tmpDB2);
                }else if (Integer.valueOf(tmpMetFragDBType) == 3) {
                    metFragParalist.setMetFragDatabaseType("PubChem");
                }else {
                    logger.warning("Illegal parameter--- MetFrag_Database_Type");
                }

                //Adduct format: -a [M] -a [M+H] -a [M-H] (old)
                String[] adductArray;
                String tmpAdductType = SoftwareProperties.getPropertiesPair().get(PropertyName.getADDUCT_TYPE());
                if (tmpAdductType != null){
                    adductArray = tmpAdductType.split(",");
                }else {
                    adductArray = new String[1];
                    adductArray[0] = "[M+H]";
                }

                PostXCMSflow.ms2idMFrag(proName, tmpInputFile, metFragParalist, adductArray, tmpTolerance);
            }else {
                logger.warning("Lack of parameters__ InputFilePath, MetFragDatabasePath(offline), MetFragDatabaseType");
            }
        } else if (idFlow == 3) {
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpSLib = SoftwareProperties.getPropertiesPair().get(PropertyName.getSPECTRA_LIB_PATH());
            if (tmpInputFile != null && tmpSLib != null){
                PostXCMSflow.ms2idSLib(proName, tmpInputFile, tmpSLib, 10.0);
            }else {
                logger.warning("Lack of parameters__-i2, -sLib");
            }
        } else if (idFlow == 4) {
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpQueryFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getMS2ANALYZER_Q_PATH());
            Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

            PostXCMSflow.ms2AnalyzerAnnotate(proName, tmpInputFile, tmpQueryFile, tmpTolerance);
        }

        if (cmd.hasOption("s")) {
            if (!cmd.hasOption("p")){ proName = cmd.getOptionValue("s");}
            Peak2InChI2IDResult acc = ResultAss.MetFragResultAss(proName);
            acc = ResultAss.SearchLibResultAss(acc, proName);
            AssTool.writeAssembleFile(proName,acc);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time used:" + (endTime - startTime) / 1000 + "s");

    }




}
