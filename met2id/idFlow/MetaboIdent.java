package met2id.idFlow;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

import met2id.assemble.AssTool;
import met2id.assemble.PeakIDlist;
import met2id.assemble.AssFlow;
import met2id.database.TransformSDF;
import met2id.property.PropertyName;
import met2id.property.SoftwareProperties;
import met2id.metFrag.MetFragParaList;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import org.xml.sax.SAXException;
import met2id.rawData.PostXCMSflow;

import javax.xml.parsers.ParserConfigurationException;

public class MetaboIdent {

    public static void main(String[] args) throws ParseException, IOException, ParserConfigurationException, SAXException {
        // TODO Auto-generated method stub
        long startTime = System.currentTimeMillis();
        String version = "v1.0.1";
        Options options = new Options();

        options.addOption("p", true, "Gloabal met2id.property file path");
        //multi-met2id.id method

        options.addOption("h", false, "Help");

        CommandLineParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("h") || cmd.hasOption("help") || args.length == 0) {
            HelpFormatter f = new HelpFormatter();
            System.out.println("\n*****************\n" + "  met2id " + version + "\n*****************\n");
            f.printHelp("Options", options);
            System.exit(0);
        }

        Logger logger = Logger.getLogger(MetaboIdent.class.getName());
        if (cmd.hasOption("p")) {
            SoftwareProperties.readPropFromFile(cmd.getOptionValue("p"));
        }else {
            logger.warning("Not set the met2id.property file with the option |-p|");
        }

        String proName = "TMP";
        if (SoftwareProperties.getPropertiesPair().get(PropertyName.getPROJECT_NAME()) != null) {
            proName = SoftwareProperties.getPropertiesPair().get(PropertyName.getPROJECT_NAME());
        }

        ArrayList<String> idFlow = new ArrayList<String>();
        if (SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW()) != null){
            String tmpflow = SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW());
            idFlow = new ArrayList<String>(Arrays.asList(tmpflow.split(":")));
        }else {
            logger.info("Set the id_workflow in the global met2id.property file, the default is 0");
        }

        for (String tmpsf:idFlow) {
            if (tmpsf.equals("1")) {
                System.out.println("##*** MS1 searching... ***##");

                String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
                String tmpMS1DB = SoftwareProperties.getPropertiesPair().get(PropertyName.getMS1_DB_PATH());
                Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

                String[] adductArray;
                String tmpAdductType = SoftwareProperties.getPropertiesPair().get(PropertyName.getADDUCT_TYPE());
                if (tmpAdductType != null) {
                    adductArray = tmpAdductType.split(",");
                } else {
                    adductArray = new String[1];
                    adductArray[0] = "[M+H]";
                }

                PostXCMSflow.ms1idSearch(proName, tmpInputFile, tmpMS1DB, adductArray, tmpTolerance);
            } else if (tmpsf.equals("2")) {
                System.out.println("##*** MetFrag start... ***##");

                String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
                String tmpMetFragDBType = SoftwareProperties.getPropertiesPair().get(PropertyName.getMETFRAG_DB_TYPE());
                String tmpMetFragDBPath = SoftwareProperties.getPropertiesPair().get(PropertyName.getMETFRAG_DB_PATH());
                Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

                if (tmpInputFile != null && tmpMetFragDBPath != null && tmpMetFragDBType != null) {
                    MetFragParaList metFragParalist = new MetFragParaList();
                    Boolean whether_ms1_search = false;
                    if (Integer.valueOf(tmpMetFragDBType) == 1) {
                        metFragParalist.setMetFragDatabaseType("LocalPSV");
                        metFragParalist.setLocalDatabasePath(tmpMetFragDBPath);
                        whether_ms1_search = true;
                    } else if (Integer.valueOf(tmpMetFragDBType) == 2) {
                        metFragParalist.setMetFragDatabaseType("LocalSDF");
                        String tmpDB2 = TransformSDF.breakInChIKey(tmpMetFragDBPath).toString();
                        metFragParalist.setLocalDatabasePath(tmpDB2);
                    } else if (Integer.valueOf(tmpMetFragDBType) == 3) {
                        metFragParalist.setMetFragDatabaseType("PubChem");
                    } else {
                        logger.warning("Illegal parameter--- MetFrag_Database_Type");
                    }

                    //Adduct format: -a [M] -a [M+H] -a [M-H] (old)
                    String[] adductArray;
                    String tmpAdductType = SoftwareProperties.getPropertiesPair().get(PropertyName.getADDUCT_TYPE());
                    if (tmpAdductType != null) {
                        adductArray = tmpAdductType.split(",");
                    } else {
                        adductArray = new String[1];
                        adductArray[0] = "[M+H]";
                    }

                    PostXCMSflow.ms2idMFrag(proName, tmpInputFile, metFragParalist, adductArray, tmpTolerance, whether_ms1_search);
                } else {
                    logger.warning("Lack of parameters__ InputFilePath, MetFragDatabasePath(offline), MetFragDatabaseType");
                }
            } else if (tmpsf.equals("3")) {
                System.out.println("##*** Spectrum library searching... ***##");

                String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
                String tmpSLib = SoftwareProperties.getPropertiesPair().get(PropertyName.getSPECTRA_LIB_PATH());
                if (tmpInputFile != null && tmpSLib != null) {
                    PostXCMSflow.ms2idSLib(proName, tmpInputFile, tmpSLib, 10.0);
                } else {
                    logger.warning("Lack of parameters__-i2, -sLib");
                }
            } else if (tmpsf.equals("4")) {
                System.out.println("##*** MS2Analyzer searching... ***##");

                String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
                String tmpQueryFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getMS2ANALYZER_Q_PATH());
                Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

                PostXCMSflow.ms2AnalyzerAnnotate(proName, tmpInputFile, tmpQueryFile, tmpTolerance);
            } else if (tmpsf.equals("5")) {
                System.out.println("##*** MS/MS identification results integrating... ***##");

                Map<String, PeakIDlist> acc = AssFlow.MetFragResultAss(proName);
                acc = AssFlow.SearchLibResultAss(proName, acc);
                AssTool.writeAssembleFile(proName, acc);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time used:" + (endTime - startTime) / 1000 + "s");

    }




}
