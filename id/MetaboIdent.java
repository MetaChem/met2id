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
import rawData.MzXMLflow;
import metFrag.MetFragParaList;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.lang3.StringUtils;

import db.Metabolite;
import db.readMetaboDB;
import org.xml.sax.SAXException;
import rawData.PostXCMSflow;

import javax.xml.parsers.ParserConfigurationException;

public class MetaboIdent {

    public static void main(String[] args) throws ParseException, IOException, ParserConfigurationException, SAXException {
        // TODO Auto-generated method stub
        long startTime = System.currentTimeMillis();

        String version = "v20150315";
        Options options = new Options();

        //multi-id method
        options.addOption("f", true, "ID flow__1=MS1, 2=MetFrag, 3=SpectrumLib. Default is 1");
        options.addOption("db2Type", true, "MS2 metabolites database type\n1=LocalPSV 2=LocalSDF 3=PubChem");
        options.addOption("db2", true, "MS2 metabolites database path");
        options.addOption("i2", true, "MS2 mzXml file path");

        options.addOption("sLib", true, "Spectrum library path");

        options.addOption("i", true, "mz file for metabolite identification");
        options.addOption("o", true, "Output dir. Default is ./");
        options.addOption("unit", true, "1:ppm,2:da. Default is ppm");
        options.addOption("delta", true, "The delta for database searching. Default is 10 (ppm)");
        options.addOption("db", true, "Metabolite database file");
        options.addOption("dbType", true, "1=HMDB,2=PubChem,3=KEGG,4=MassBank,5=LipidMaps,6=PlantCyc");
        options.addOption("mode", true, "1:positive, 2:negative");
        options.addOption("prefix", true, "The prefix of output file");
        options.addOption("pa", false, "Print the adducts");
        options.addOption("a", true, "The index of adduct. Default: 1;7;9;12 ([M+H]+,[M+Na]+,[M+K]+,[M+NH4]+)");
        options.addOption("h", false, "Help");

        options.addOption("s", false, "Sum up the output files");

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

        int idFlow = 1;
        if (cmd.hasOption("f")){
            idFlow = Integer.valueOf(cmd.getOptionValue("f"));
        }else {
            logger.info("Choose the id workflow with -f, this turn MS1 runs identification");
        }

        if (idFlow == 1) {
            int dbType = 1;
            if (cmd.hasOption("dbType")) {
                dbType = Integer.valueOf(cmd.getOptionValue("dbType"));
            }

            int mode = 1;
            if (cmd.hasOption("mode")) {
                mode = Integer.valueOf(cmd.getOptionValue("mode"));
            }
            if (cmd.hasOption("pa")) {
                AdductGear adductGear = new AdductGear();
                adductGear.printAdducts(mode);
                System.exit(0);
            }

            if (cmd.hasOption("db")) {
                String db = cmd.getOptionValue("db");
                if (dbType == 1) {
                    readMetaboDB.readHMDBFromXMLs(db);
                } else if (dbType == 2) {
                    readMetaboDB.readPubChem(db);
                } else if (dbType == 3) {
                    readMetaboDB.readKEGG(db);
                } else if (dbType == 4) {
                    readMetaboDB.readMassBank(db);
                } else if (dbType == 5) {
                    readMetaboDB.readLipidMaps(db);
                } else if (dbType == 6) {
                    readMetaboDB.readPlantCyc(db);
                }

            }

            //误差
            int unit = 1;
            double delta = 10;
            if (cmd.hasOption("unit")) {
                unit = Integer.valueOf(cmd.getOptionValue("unit"));
                if (unit != 1 && unit != 2) {
                    System.out.println("Please provide valid unit for delta!");
                    System.exit(0);
                }
            }

            if (cmd.hasOption("delta")) {
                delta = Double.valueOf(cmd.getOptionValue("delta"));
            }

            //输出
            String outdir = "./";
            if (cmd.hasOption("o")) {
                outdir = cmd.getOptionValue("o");
                File dirFile = new File(outdir);
                if (!dirFile.isDirectory()) {
                    dirFile.mkdirs();
                }
            }
            String prefix = "MetaboliteIdentify";
            if (cmd.hasOption("prefix")) {
                prefix = cmd.getOptionValue("prefix");
            }

            //加合物
            String adductStr = "1;7;9;12"; //([M+H]+,[M+Na]+,[M+K]+,[M+NH4]+)
            if (cmd.hasOption("a")) {
                adductStr = cmd.getOptionValue("a");
            }
            AdductGear adductGear = new AdductGear();
            adductGear.initialize(mode, adductStr);


            if (cmd.hasOption("i")) {
                String mzfile = cmd.getOptionValue("i");
                String outfile = outdir + "/" + prefix + "-identify.txt";
                identify(mzfile, delta, unit, outfile, adductGear);
            }
        } else if(idFlow == 2){
            if (cmd.hasOption("i2")  && cmd.hasOption("db2Type")) {
                MetFragParaList metFragParalist = new MetFragParaList();
                if (Integer.valueOf(cmd.getOptionValue("db2Type")) == 1) {
                    metFragParalist.setMetFragDatabaseType("LocalPSV");
                }
                if (Integer.valueOf(cmd.getOptionValue("db2Type")) == 2) {
                    metFragParalist.setMetFragDatabaseType("LocalSDF");
                }
                if (Integer.valueOf(cmd.getOptionValue("db2Type")) == 3) {
                    metFragParalist.setMetFragDatabaseType("PubChem");
                }
                if (cmd.hasOption("db2")) {
                    if (Integer.valueOf(cmd.getOptionValue("db2Type")) == 2) {
                        String tmpDB2 = TransformSDF.breakInChIKey(cmd.getOptionValue("db2")).toString();
                        metFragParalist.setLocalDatabasePath(tmpDB2);
                    }
                    if (Integer.valueOf(cmd.getOptionValue("db2Type")) == 1){
                        metFragParalist.setLocalDatabasePath(cmd.getOptionValue("db2"));
                    }
                }
                //Adduct format: -a [M] -a [M+H] -a [M-H]
                String[] adductArray;
                if (cmd.hasOption("a")){
                    adductArray = cmd.getOptionValues("a");
                }else {
                    adductArray = new String[1];
                    adductArray[0] = "[M+H]";
                }

                String mz2List = cmd.getOptionValue("i2");
                PostXCMSflow.ms2idMFrag(mz2List, metFragParalist, adductArray);
            }else {
                logger.warning("Lack of parameters__ -i2, -db2Type, -db2(offline)");
            }
        } else if (idFlow == 3) {
            if (cmd.hasOption("i2") && cmd.hasOption("sLib")){
                PostXCMSflow.ms2idSLib(cmd.getOptionValue("i2"), cmd.getOptionValue("sLib"), 10.0);
            }else {
                logger.warning("Lack of parameters__-i2, -sLib");
            }
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
            ArrayList<MatchMetabolite> result = new ArrayList<MatchMetabolite>();
            if (headMap.containsKey("mass") && p.matcher(d[headMap.get("mass")]).find()) {
                double mass = Double.valueOf(d[headMap.get("mass")]);
                peak.mass = mass;
                result = searchDB(peak.mass, delta, unit, isoFlag, peak);
            } else {
                //如果包含加合物的信息
                if (peak.adducts.size() >= 1) {
                    for (Adduct adduct : peak.adducts) {
                        ArrayList<MatchMetabolite> res = searchDB(adduct.mass, delta, unit, isoFlag, peak);
                        for (MatchMetabolite matchMetabolite : res) {
                            matchMetabolite.adduct = adduct;
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
                            ArrayList<MatchMetabolite> res = searchDB(caclMass, delta, unit, isoFlag, peak);
                            for (MatchMetabolite matchMetabolite : res) {
                                matchMetabolite.adduct = adduct;
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
                                ArrayList<MatchMetabolite> res = searchDB(caclMass, delta, unit, isoFlag, peak);
                                for (MatchMetabolite matchMetabolite : res) {
                                    matchMetabolite.adduct = adduct;
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
                for (MatchMetabolite matchMetabolite : result) {
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
                        if (matchMetabolite.iso_similirity_score != null){
                            outList.add(matchMetabolite.iso_similirity_score.toString());
                        }else {
                            outList.add("NA");
                        }
                    }

                    if (outHeader == false) outHeadList.add("accession");
                    outList.add(matchMetabolite.metabolite.accession);

                    if (outHeader == false) outHeadList.add("name");
                    outList.add(matchMetabolite.metabolite.name);

                    if (outHeader == false) outHeadList.add("expMass");
                    outList.add(String.valueOf(matchMetabolite.expMass));
                    if (outHeader == false) outHeadList.add("calcMass");
                    outList.add(String.valueOf(matchMetabolite.metabolite.monisotopic_moleculate_weight));
                    if (outHeader == false) outHeadList.add("delta");
                    outList.add(String.valueOf(matchMetabolite.delta));

                    if (outHeader == false) outHeadList.add("adduct");
                    if (outHeader == false) outHeadList.add("adductFromExp");
                    if (outHeader == false) outHeadList.add("charge");
                    if (matchMetabolite.adduct != null) {
                        outList.add(matchMetabolite.adduct.label);
                        outList.add(String.valueOf(matchMetabolite.adduct.fromExp));
                        outList.add(String.valueOf(matchMetabolite.adduct.charge));
                    } else {
                        outList.add("-");
                        outList.add("-");
                        outList.add(String.valueOf(peak.charge));
                    }

                    if (outHeader == false && matchMetabolite.metabolite.chemical_formula != null) {
                        outHeadList.add("chemical_formula");
                    }
                    if (matchMetabolite.metabolite.chemical_formula != null) {
                        outList.add(matchMetabolite.metabolite.chemical_formula);
                    }

                    if (outHeader == false && matchMetabolite.metabolite.biofluid_locations != null) {
                        outHeadList.add("biofluid_locations");
                    }
                    if (matchMetabolite.metabolite.biofluid_locations != null) {
                        outList.add(matchMetabolite.metabolite.biofluid_locations);
                    }

                    if (outHeader == false && matchMetabolite.metabolite.tissue_locations != null) {
                        outHeadList.add("tissue_locations");
                    }
                    if (matchMetabolite.metabolite.tissue_locations != null) {
                        outList.add(matchMetabolite.metabolite.tissue_locations);
                    }

                    if (outHeader == false && matchMetabolite.metabolite.pathways != null) {
                        outHeadList.add("pathways");
                    }
                    if (matchMetabolite.metabolite.pathways != null) {
                        outList.add(matchMetabolite.metabolite.pathways);
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
    public static ArrayList<MatchMetabolite> searchDB(double mass, double delta, int unit, boolean isoFlag, Peak peak) throws IOException {

        ArrayList<MatchMetabolite> result = new ArrayList<MatchMetabolite>();

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
            Metabolite metabolite = readMetaboDB.massDB.get(i);
            double mdel = mass - metabolite.monisotopic_moleculate_weight;
            if (unit == 1) {
                mdel = mdel / metabolite.monisotopic_moleculate_weight * 1000000;
            }
            //System.err.println(mass);
            //if(mass==326.193958892584){
            //	System.err.println(mdel);
            //}
            if (Math.abs(mdel) <= delta) {
                //匹配上了
                MatchMetabolite matchMetabolite = new MatchMetabolite();
                matchMetabolite.metabolite = metabolite;
                matchMetabolite.delta = mdel;
                matchMetabolite.expMass = mass;
                //Calculate isotope distribution similarity
                if (isoFlag){
                    matchMetabolite.isotope_distribution = matchMetabolite.parse_distribution(peak.ori_mz_dist, peak.ori_intensity_dist);
                    matchMetabolite.iso_similirity_score = IsotopeCal.isoDiffScore(metabolite.chemical_formula,
                            matchMetabolite.isotope_distribution, 0.1);
                }

                result.add(matchMetabolite);
                //System.out.println(peak.mz+"\t"+metabolite.monisotopic_moleculate_weight+"\t"+metabolite.accession+"\t"+mdel);
                //bw.write(peak.mz+"\t"+metabolite.monisotopic_moleculate_weight+"\t"+metabolite.accession+"\t"+mdel+"\n");
                //isIdentify = true;
            }
        }
        return result;

    }


}
