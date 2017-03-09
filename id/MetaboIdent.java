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
        options.addOption("s", false, "Sum up the output files");
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

        if (cmd.hasOption("p")) {
            SoftwareProperties.readPropFromFile(cmd.getOptionValue("p"));
        }
        Logger logger = Logger.getLogger(MetaboIdent.class.getName());

        Integer idFlow = 1;
        if (SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW()) != null){
            idFlow = Integer.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getID_WORKFLOW()));
        }else {
            logger.info("Set the id_workflow in the global property file, the default is 1");
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

            PostXCMSflow.ms1idSearch(tmpInputFile, tmpMS1DB, adductArray, tmpTolerance);
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

                PostXCMSflow.ms2idMFrag(tmpInputFile, metFragParalist, adductArray, tmpTolerance);
            }else {
                logger.warning("Lack of parameters__ InputFilePath, MetFragDatabasePath(offline), MetFragDatabaseType");
            }
        } else if (idFlow == 3) {
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpSLib = SoftwareProperties.getPropertiesPair().get(PropertyName.getSPECTRA_LIB_PATH());
            if (tmpInputFile != null && tmpSLib != null){
                PostXCMSflow.ms2idSLib(tmpInputFile, tmpSLib, 10.0);
            }else {
                logger.warning("Lack of parameters__-i2, -sLib");
            }
        } else if (idFlow == 4) {
            String tmpInputFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getINPUT_PATH());
            String tmpQueryFile = SoftwareProperties.getPropertiesPair().get(PropertyName.getMS2ANALYZER_Q_PATH());
            Double tmpTolerance = Double.valueOf(SoftwareProperties.getPropertiesPair().get(PropertyName.getTOL()));

            PostXCMSflow.ms2AnalyzerAnnotate(tmpInputFile, tmpQueryFile, tmpTolerance);
        }

        if (cmd.hasOption("s")) {
            ResultAss tmpAss = new ResultAss();
            tmpAss.MetFragResultAss();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time used:" + (endTime - startTime) / 1000 + "s");

    }


    public static void identify(String mzfile, double delta, int unit, String outfile, AdductGear adductGear) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outfile)));


        System.out.println("read mz file " + mzfile);
        BufferedReader br = new BufferedReader(new FileReader(new File(mzfile)));

        String line = br.readLine();
        line.trim();
        String headString[] = line.split("\t");
        HashMap<String, Integer> headMap = new HashMap<String, Integer>();
        for (int i = 0; i < headString.length; i++) {
            headMap.put(headString[i], i);
        }
        int total_mz = 0;
        int total_identify_mz = 0;

        Pattern p = Pattern.compile("\\d");

        boolean outHeader = false;
        ArrayList<String> outHeadList = new ArrayList<String>();

        while ((line = br.readLine()) != null) {
            line.trim();
            total_mz++;
            String d[] = line.split("\t");
            double mz = Double.valueOf(d[headMap.get("mz")]);
            String id = d[headMap.get("ID")];
            double charge = 0;

            Peak peak = new Peak(mz);
            peak.ID = id;

            // Tell if isotope comparison applicable
            boolean isoFlag = false;
            if (headMap.containsKey("mzDist") && headMap.containsKey("intensityDist")) {
                peak.ori_mz_dist = d[headMap.get("mzDist")];
                peak.ori_intensity_dist = d[headMap.get("intensityDist")];
                isoFlag = true;
            }

            //如果有charge就用这里的
            if (headMap.containsKey("charge") && p.matcher(d[headMap.get("charge")]).find()) {
                String chargeStr = d[headMap.get("charge")];

                String lastChar = String.valueOf(chargeStr.charAt(chargeStr.length() - 1));
                if (lastChar.equals("+")) {
                    chargeStr = chargeStr.replaceAll("\\+", "");
                } else if (lastChar.equals("-")) {
                    chargeStr = chargeStr.replaceAll("-", "");
                    chargeStr = "-" + chargeStr;
                }
                charge = Double.valueOf(chargeStr);

                //判断同位素峰
            } else if (headMap.containsKey("isotopes") && p.matcher(d[headMap.get("isotopes")]).find()) {
                //如果charge处没有电荷，isotopes这里有电荷就用这里的电荷信息
                //主要是支持CAMERA出来的注释结果
                String isoStr = d[headMap.get("isotopes")];
                //[9][M+3]+, [3][M+2]2+
                String isod[] = isoStr.split("]");
                String isoCharge = isod[2];
                if (isoCharge.equals("+")) {
                    //带一个正电荷
                    charge = 1;
                } else if (isoCharge.equals("-")) {
                    charge = -1;
                } else {
                    String lastChar = String.valueOf(isoCharge.charAt(isoCharge.length() - 1));
                    if (lastChar.equals("+")) {
                        isoCharge = isoCharge.replaceAll("\\+", "");
                    } else if (lastChar.equals("-")) {
                        isoCharge = isoCharge.replaceAll("-", "");
                        isoCharge = "-" + isoCharge;
                    }
                    charge = Double.valueOf(isoCharge);
                }

            } else if (headMap.containsKey("adduct") && p.matcher(d[headMap.get("adduct")]).find()) {
                //如果没有电荷，也没有同位素信息
                //主要是支持CAMERA出来的注释结果
                //[M+Na]+ 624.167, [M+2H-HCOOH]2+ 278.105 [M+H-C6H10O5]+ 278.105, [M+K]+ 203.207 [M+Na]+ 219.181 [M+H]+ 241.162
                //
                String adductStr = d[headMap.get("adduct")];
                String ad[] = adductStr.split("\\s");
                int nadduct = ad.length / 2;

                for (int i = 0; i < nadduct; i++) {
                    Adduct adduct = new Adduct();
                    adduct.label = ad[2 * i];
                    adduct.mass = Double.valueOf(ad[2 * i + 1]);

                    String addd[] = adduct.label.split("]");
                    String addCharge = addd[1];
                    double adductCharge;
                    if (addCharge.equals("+")) {
                        //带一个正电荷
                        adductCharge = 1;
                    } else if (addCharge.equals("-")) {
                        adductCharge = -1;
                    } else {
                        String lastChar = String.valueOf(addCharge.charAt(addCharge.length() - 1));
                        if (lastChar.equals("+")) {
                            addCharge = addCharge.replaceAll("\\+", "");
                        } else if (lastChar.equals("-")) {
                            addCharge = addCharge.replaceAll("-", "");
                            addCharge = "-" + addCharge;
                        }
                        adductCharge = Double.valueOf(addCharge);
                    }
                    adduct.charge = adductCharge;
                    adduct.fromExp = 1;
                    peak.adducts.add(adduct);

                }


            }


            //开始做鉴定
            //System.err.println(mz);

            peak.charge = charge;
            ArrayList<MatchPeak> result = new ArrayList<MatchPeak>();
            if (headMap.containsKey("mass") && p.matcher(d[headMap.get("mass")]).find()) {
                double mass = Double.valueOf(d[headMap.get("mass")]);
                peak.mass = mass;
                result = searchDB(peak.mass, delta, unit, isoFlag, peak);
            } else {
                //如果包含加合物的信息
                if (peak.adducts.size() >= 1) {
                    for (Adduct adduct : peak.adducts) {
                        ArrayList<MatchPeak> res = searchDB(adduct.mass, delta, unit, isoFlag, peak);
                        for (MatchPeak matchPeak : res) {
                            matchPeak.adduct = adduct;
                        }
                        result.addAll(res);
                    }
                } else {
                    //没有加合物信息

                    //如果有电荷的信息
                    if (peak.charge == 0) {
                        //如果没有电荷的信息，就考虑所有指定的加合物信息
                        for (int adductIndex : adductGear.sAdductMap.keySet()) {
                            Adduct adduct = adductGear.sAdductMap.get(adductIndex);
                            //计算质量
                            //[2M+H+K]2+,需要考虑这里的2M的2
                            double caclMass = (peak.mz * Math.abs(adduct.charge) - adduct.massdiff) / adduct.nmol;
                            ArrayList<MatchPeak> res = searchDB(caclMass, delta, unit, isoFlag, peak);
                            for (MatchPeak matchPeak : res) {
                                matchPeak.adduct = adduct;
                            }
                            result.addAll(res);
                        }

                    } else {
                        //如果有电荷信息，就只考虑与电荷匹配的加合物信息
                        for (int adductIndex : adductGear.sAdductMap.keySet()) {
                            Adduct adduct = adductGear.sAdductMap.get(adductIndex);
                            if (adduct.charge == peak.charge) {
                                //计算质量
                                //[2M+H+K]2+,需要考虑这里的2M的2
                                double caclMass = (peak.mz * Math.abs(adduct.charge) - adduct.massdiff) / adduct.nmol;
                                ArrayList<MatchPeak> res = searchDB(caclMass, delta, unit, isoFlag, peak);
                                for (MatchPeak matchPeak : res) {
                                    matchPeak.adduct = adduct;
                                }
                                result.addAll(res);
                                //if(174.9923434==mz){
                                //	System.err.println(mz+"\t"+caclMass+"\t"+adduct.label);
                                //}

                            } else {
                                //如果电荷不相等，就不考虑这种加合形式
                                continue;
                            }
                        }
                    }
                }

            }

            if (result.size() >= 1) {
                total_identify_mz++;
                for (MatchPeak matchPeak : result) {
                    ArrayList<String> outList = new ArrayList<String>();

                    if (outHeader == false) outHeadList.add("ID");
                    outList.add(String.valueOf(peak.ID));

                    if (outHeader == false) outHeadList.add("mz");
                    outList.add(String.valueOf(peak.mz));

                    if (outHeader == false && headMap.containsKey("mzDist")) outHeadList.add("mzDist");
                    if (headMap.containsKey("mzDist")) outList.add(peak.ori_mz_dist);

                    if (outHeader == false && headMap.containsKey("intensityDist")) outHeadList.add("intensityDist");
                    if (headMap.containsKey("intensityDist")) outList.add(peak.ori_intensity_dist);

                    if (outHeader == false && isoFlag == true) outHeadList.add("isoSimilirityScore");
                    if (isoFlag == true) {
                        if (matchPeak.iso_similirity_score != null){
                            outList.add(matchPeak.iso_similirity_score.toString());
                        }else {
                            outList.add("NA");
                        }
                    }

                    if (outHeader == false) outHeadList.add("accession");
                    outList.add(matchPeak.metaboliteDB.accession);

                    if (outHeader == false) outHeadList.add("name");
                    outList.add(matchPeak.metaboliteDB.name);

                    if (outHeader == false) outHeadList.add("expMass");
                    outList.add(String.valueOf(matchPeak.expMass));
                    if (outHeader == false) outHeadList.add("calcMass");
                    outList.add(String.valueOf(matchPeak.metaboliteDB.monisotopic_moleculate_weight));
                    if (outHeader == false) outHeadList.add("delta");
                    outList.add(String.valueOf(matchPeak.delta));

                    if (outHeader == false) outHeadList.add("adduct");
                    if (outHeader == false) outHeadList.add("adductFromExp");
                    if (outHeader == false) outHeadList.add("charge");
                    if (matchPeak.adduct != null) {
                        outList.add(matchPeak.adduct.label);
                        outList.add(String.valueOf(matchPeak.adduct.fromExp));
                        outList.add(String.valueOf(matchPeak.adduct.charge));
                    } else {
                        outList.add("-");
                        outList.add("-");
                        outList.add(String.valueOf(peak.charge));
                    }

                    if (outHeader == false && matchPeak.metaboliteDB.chemical_formula != null) {
                        outHeadList.add("chemical_formula");
                    }
                    if (matchPeak.metaboliteDB.chemical_formula != null) {
                        outList.add(matchPeak.metaboliteDB.chemical_formula);
                    }

                    if (outHeader == false && matchPeak.metaboliteDB.biofluid_locations != null) {
                        outHeadList.add("biofluid_locations");
                    }
                    if (matchPeak.metaboliteDB.biofluid_locations != null) {
                        outList.add(matchPeak.metaboliteDB.biofluid_locations);
                    }

                    if (outHeader == false && matchPeak.metaboliteDB.tissue_locations != null) {
                        outHeadList.add("tissue_locations");
                    }
                    if (matchPeak.metaboliteDB.tissue_locations != null) {
                        outList.add(matchPeak.metaboliteDB.tissue_locations);
                    }

                    if (outHeader == false && matchPeak.metaboliteDB.pathways != null) {
                        outHeadList.add("pathways");
                    }
                    if (matchPeak.metaboliteDB.pathways != null) {
                        outList.add(matchPeak.metaboliteDB.pathways);
                    }

                    if (outHeader == false) {
                        String hString = StringUtils.join(outHeadList, "\t");
                        bw.write(hString + "\n");
                    }

                    String outline = StringUtils.join(outList, "\t");
                    bw.write(outline + "\n");
                    outHeader = true;

                }


            }

        }
        br.close();
        bw.close();
        System.out.println("total mz " + total_mz);
        System.out.println("total identified mz " + total_identify_mz);

    }

    /**
     * @param mass
     * @param delta
     * @param unit  单位，1=ppm，2=da
     * @return
     * @throws IOException
     */
    public static ArrayList<MatchPeak> searchDB(double mass, double delta, int unit, boolean isoFlag, Peak peak) throws IOException {

        ArrayList<MatchPeak> result = new ArrayList<MatchPeak>();

        //int total_db_entry = readMetaboDB.massDB.size();

        int index = readMetaboDB.IntegerMassForSearch(mass);
        int ind = readMetaboDB.mass2index.get(index);
        int indMax = readMetaboDB.mass2indexUp.get(index);
        //如果usedMZ+3后大于mass2indexUp里的记录的索引的数量
        //int indMax = readMetaboDB.mass2indexUp.containsKey(mass+3)?readMetaboDB.mass2indexUp.get(mass+3):(total_db_entry-1);
        //indMax = indMax>readMetaboDB.
        //System.out.println("==>"+mass+"\t"+ind+"\t"+indMax);

        for (int i = ind; i <= indMax; i++) {
            if (indMax > (readMetaboDB.massDB.size() - 1)) {
                continue;
            }
            MetaboliteDB metaboliteDB = readMetaboDB.massDB.get(i);
            double mdel = mass - metaboliteDB.monisotopic_moleculate_weight;
            if (unit == 1) {
                mdel = mdel / metaboliteDB.monisotopic_moleculate_weight * 1000000;
            }
            //System.err.println(mass);
            //if(mass==326.193958892584){
            //	System.err.println(mdel);
            //}
            if (Math.abs(mdel) <= delta) {
                //匹配上了
                MatchPeak matchPeak = new MatchPeak();
                matchPeak.metaboliteDB = metaboliteDB;
                matchPeak.delta = mdel;
                matchPeak.expMass = mass;
                //Calculate isotope distribution similarity
                if (isoFlag){
                    matchPeak.isotope_distribution = matchPeak.parse_distribution(peak.ori_mz_dist, peak.ori_intensity_dist);
                    matchPeak.iso_similirity_score = IsotopeCal.isoDiffScore(metaboliteDB.chemical_formula,
                            matchPeak.isotope_distribution, 0.1);
                }

                result.add(matchPeak);
                //System.out.println(peak.mz+"\t"+metaboliteDB.monisotopic_moleculate_weight+"\t"+metaboliteDB.accession+"\t"+mdel);
                //bw.write(peak.mz+"\t"+metaboliteDB.monisotopic_moleculate_weight+"\t"+metaboliteDB.accession+"\t"+mdel+"\n");
                //isIdentify = true;
            }
        }
        return result;

    }


}
