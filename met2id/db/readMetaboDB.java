package met2id.db;

import met2id.metaboEntity.MetaboliteDB;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.xml.bind.JAXB.unmarshal;

public class readMetaboDB {

    //public static HashMap<K, V>

    public static String dbfile;
    /**
     * �����л�����������С��������
     */
    public static ArrayList<MetaboliteDB> massDB = new ArrayList<MetaboliteDB>();

    /**
     * �����Ӧmass�������λ������Сindex
     */
    public static HashMap<Integer, Integer> mass2index = new HashMap<Integer, Integer>();
    public static HashMap<Integer, Integer> mass2indexUp = new HashMap<Integer, Integer>();


    /**
     * ��ȡ����HMDB XML����ת���ɵ�txt��ʽ����
     *
     * @param db
     * @throws IOException
     */
    public static void readHMDB(String db) throws IOException {
        System.out.println("read metaboliteDB database " + db);
        BufferedReader br = new BufferedReader(new FileReader(new File(db)));

        String line = br.readLine();
        line.trim();
        String headString[] = line.split("\t");
        HashMap<String, Integer> headMap = new HashMap<String, Integer>();
        for (int i = 0; i < headString.length; i++) {
            headMap.put(headString[i], i);
        }
        int total_metabolite = 0;
        int total_valid_metabolite = 0;
        while ((line = br.readLine()) != null) {
            line.trim();
            total_metabolite++;
            String d[] = line.split("\t");
            String acc = d[headMap.get("accession")];
            String ma = d[headMap.get("monisotopic_moleculate_weight")];
            String name = d[headMap.get("name")];
            Pattern p = Pattern.compile("\\d");
            Matcher m = p.matcher(ma);
            double mass;
            if (m.find()) {
                mass = Double.valueOf(ma);
                total_valid_metabolite++;
            } else {
                continue;
            }

            MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
            metaboliteDB.name = name;
            if (headMap.containsKey("chemical_formula")) {
                metaboliteDB.chemical_formula = d[headMap.get("chemical_formula")];
            }
            if (headMap.containsKey("pathways")) {
                metaboliteDB.pathways = d[headMap.get("pathways")];
            }

            if (headMap.containsKey("biofluid_locations")) {
                metaboliteDB.biofluid_locations = d[headMap.get("biofluid_locations")];
            }
            if (headMap.containsKey("tissue_locations")) {
                metaboliteDB.tissue_locations = d[headMap.get("tissue_locations")];
            }
            massDB.add(metaboliteDB);

        }
        br.close();
        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
        for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }


    /**
     * ��ȡ HMDB xml��ʽ����
     *
     * @param dbxml HMDB xml��ʽ�ļ�
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     */
    public static void readHMDBFromXMLs(String dbxml) throws IOException, ParserConfigurationException, SAXException {
        System.out.println("read metaboliteDB database " + dbxml);
        File inFile = new File(dbxml);
        ArrayList<File> xmlList = new ArrayList<File>();
        if (inFile.isFile()) {
            xmlList.add(inFile);
        } else if (inFile.isDirectory()) {
            File[] files = inFile.listFiles();
            for (int j = 0; j < files.length; j++) {
                if (files[j].getName().startsWith("HMDB") && files[j].getName().endsWith(".xml")) {
                    xmlList.add(files[j]);
                }
            }
        }

        int total_metabolite = 0;
        int total_valid_metabolite = 0;

        for (int f = 0; f < xmlList.size(); f++) {
            //if(f%200==0){
            //    System.out.println("read:"+f);
            //}
            // step 1: ���dom���������������������������ڴ�������Ľ�������
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            // System.out.println("class name: " + dbf.getClass().getName());

            // step 2:��þ����dom������
            DocumentBuilder db = dbf.newDocumentBuilder();

            // System.out.println("class name: " + met2id.db.getClass().getName());

            // step3: ����һ��xml�ĵ������Document���󣨸���㣩
            Document document = db.parse(xmlList.get(f));

            NodeList list = document.getElementsByTagName("metaboliteDB");
            //System.out.println(list.getLength());
            ArrayList<String> header = new ArrayList<String>();

            for (int i = 0; i < list.getLength(); i++) {
                String acc;
                String name;
                //String description;
                String chemical_formula;
                //String average_molecular_weight;
                String monisotopic_moleculate_weight;
                String iupac_name;
                String biofluid_locations;
                String tissue_locations;
                String pathways;


                ArrayList<String> outline = new ArrayList<String>();

                Element element = (Element) list.item(i);
                acc = element.getElementsByTagName("accession").item(0).getFirstChild().getNodeValue();
                name = element.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();
                //ȥ��ĩβ�Ŀ��У���ʱ����п���
                name = name.replaceAll("((\r\n)|\n|\t)*", "");

                //if (element.getElementsByTagName("description").item(0).getFirstChild() != null) {
                //    description = element.getElementsByTagName("description").item(0).getFirstChild().getNodeValue();
                //} else {
                //    description = "-";
                //}

                //ȥ��ĩβ�Ŀ��У���ʱ����п���
                //description = description.replaceAll("((\r\n)|\n|\t)*", "");
                //description = description.replaceAll("((\r\n)|\n)[\\s\t ]*(\\1)+$", "$1").replaceAll("^((\r\n)|\n)$", "");

                if (element.getElementsByTagName("chemical_formula").item(0).getFirstChild() != null) {
                    chemical_formula = element.getElementsByTagName("chemical_formula").item(0).getFirstChild().getNodeValue();
                } else {
                    chemical_formula = "-";
                }

                //if (element.getElementsByTagName("average_molecular_weight").item(0).getFirstChild() != null) {
                //    average_molecular_weight = element.getElementsByTagName("average_molecular_weight").item(0).getFirstChild().getNodeValue();
                //} else {
                //    average_molecular_weight = "NA";
                //}
                if (element.getElementsByTagName("monisotopic_moleculate_weight").item(0).getFirstChild() != null) {
                    monisotopic_moleculate_weight = element.getElementsByTagName("monisotopic_moleculate_weight").item(0).getFirstChild().getNodeValue();
                } else {
                    monisotopic_moleculate_weight = "NA";
                }

                if (element.getElementsByTagName("iupac_name").item(0).getFirstChild() != null) {
                    iupac_name = element.getElementsByTagName("iupac_name").item(0).getFirstChild().getNodeValue();
                } else {
                    iupac_name = "-";
                }
                iupac_name = iupac_name.equals("") ? "-" : iupac_name;

                //biofluid_locations

                biofluid_locations = "";
                NodeList bllist = element.getElementsByTagName("biofluid_locations");
                if (bllist.getLength() >= 1) {
                    for (int j = 0; j < bllist.getLength(); j++) {
                        Element el = (Element) bllist.item(j);
                        NodeList bl = el.getElementsByTagName("biofluid");
                        for (int k = 0; k < bl.getLength(); k++) {
                            Element el2 = (Element) bl.item(k);
                            if (biofluid_locations.equals("")) {
                                biofluid_locations = el2.getFirstChild().getNodeValue();
                            } else {
                                biofluid_locations = biofluid_locations + ";" + el2.getFirstChild().getNodeValue();
                            }

                        }

                    }
                }
                biofluid_locations = biofluid_locations.equals("") ? "-" : biofluid_locations;


                //tissue_locations

                tissue_locations = "";
                bllist = element.getElementsByTagName("tissue_locations");
                if (bllist.getLength() >= 1) {
                    for (int j = 0; j < bllist.getLength(); j++) {
                        Element el = (Element) bllist.item(j);
                        NodeList bl = el.getElementsByTagName("tissue");
                        for (int k = 0; k < bl.getLength(); k++) {
                            Element el2 = (Element) bl.item(k);
                            if (tissue_locations.equals("")) {
                                tissue_locations = el2.getFirstChild().getNodeValue();
                            } else {
                                tissue_locations = tissue_locations + ";" + el2.getFirstChild().getNodeValue();
                            }

                        }

                    }
                }
                tissue_locations = tissue_locations.equals("") ? "-" : tissue_locations;

                //pathways

                pathways = "";
                bllist = element.getElementsByTagName("pathways");
                if (bllist.getLength() >= 1) {
                    for (int j = 0; j < bllist.getLength(); j++) {
                        Element el = (Element) bllist.item(j);
                        NodeList bl = el.getElementsByTagName("pathway");
                        for (int k = 0; k < bl.getLength(); k++) {
                            Element el2 = (Element) bl.item(k);

                            if (pathways.equals("")) {
                                String kegg_name = el2.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();
                                String smpdb_id = el2.getElementsByTagName("smpdb_id").item(0).getFirstChild().getNodeValue();
                                String kegg_map_id;
                                if (null != el2.getElementsByTagName("kegg_map_id").item(0).getFirstChild()) {
                                    kegg_map_id = el2.getElementsByTagName("kegg_map_id").item(0).getFirstChild().getNodeValue();
                                } else {
                                    kegg_map_id = "null";
                                }
                                pathways = kegg_name + "," + smpdb_id + "," + kegg_map_id;
                            } else {
                                String kegg_name = el2.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();
                                String smpdb_id = el2.getElementsByTagName("smpdb_id").item(0).getFirstChild().getNodeValue();
                                String kegg_map_id;
                                //System.out.println(k);
                                //System.out.println(el2.getElementsByTagName("kegg_map_id").item(0).getFirstChild());
                                if (null != el2.getElementsByTagName("kegg_map_id").item(0).getFirstChild()) {
                                    kegg_map_id = el2.getElementsByTagName("kegg_map_id").item(0).getFirstChild().getNodeValue();
                                } else {
                                    kegg_map_id = "null";
                                }
                                pathways = pathways + ";" + kegg_name + "," + smpdb_id + "," + kegg_map_id;

                            }

                        }

                    }
                }
                pathways = pathways.equals("") ? "-" : pathways;
                pathways = pathways.replaceAll("((\r\n)|\n|\t)*", "");

                Pattern p = Pattern.compile("\\d");
                Matcher m = p.matcher(monisotopic_moleculate_weight);
                double mass;
                total_metabolite++;
                if (m.find()) {
                    mass = Double.valueOf(monisotopic_moleculate_weight);
                    total_valid_metabolite++;
                } else {
                    continue;
                }
                MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
                metaboliteDB.name = name;

                metaboliteDB.chemical_formula = chemical_formula;

                metaboliteDB.pathways = pathways;

                metaboliteDB.biofluid_locations = biofluid_locations;

                metaboliteDB.tissue_locations = tissue_locations;

                massDB.add(metaboliteDB);
            }
        }

        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
		for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }

    /**
     * ��ȡ����PubChem XML��ʽ����
     *
     * @param dbxml �ļ����߰���xml���ļ���
     * @throws IOException
     */

		/*//����㷨
		for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    /**
     * ��ȡKEGG compound�ļ�����
     * http://www.genome.jp/kegg/document/help_bget_compound.html
     * @param db KEGG compound�ļ���Ϊ�����ļ�
     * @throws IOException
     */
    public static void readKEGG(String db) throws IOException {
        System.out.println("read metaboliteDB database " + db);
        BufferedReader br = new BufferedReader(new FileReader(new File(db)));

        int total_metabolite = 0;
        int total_valid_metabolite = 0;
        String line;
        while ((line = br.readLine()) != null) {
            line.trim();
            if (line.startsWith("ENTRY")) {
                total_metabolite++;
                total_valid_metabolite++;
                String[] d = line.split("\\s+");
                String acc = d[1];
                String name = "-";
                double mass = -1;
                String chemical_formula = "-";
                //����������һ���µ���Ŀ
                //��Ҫ���������ѭ������
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("///")) {
                        // ˵����ǰ�����Ŀ�Ѿ�����β��
                        break;// �˳���ǰѭ��
                    } else if (line.startsWith("FORMULA")) {
                        String[] dd = line.split("\\s+");
                        chemical_formula = dd[1];
                    } else if (line.startsWith("EXACT_MASS")) {
                        String[] dd = line.split("\\s+");
                        mass = Double.valueOf(dd[1]);
                    } else if (line.startsWith("NAME")) {
                        String[] dd = line.split("\\s+");
                        name = dd[1].replaceFirst(";$", "");
                    }
                }

                MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
                metaboliteDB.name = name;
                metaboliteDB.chemical_formula = chemical_formula;
                massDB.add(metaboliteDB);
            }
        }
        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
        for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }


    /**
     * ��ȡMassBank �ļ�����
     *
     * @param dir ����MassBank���ݿ���ļ���
     * @throws IOException
     */
    public static void readMassBank(String dir) throws IOException {
        System.out.println("read metaboliteDB database " + dir);

        File inFile = new File(dir);
        ArrayList<String> xmlList = new ArrayList<String>();// ����xml��ʽ�ļ���ֻ��������֮ǰ��ģ��
        if (inFile.isFile()) {
            xmlList.add(dir);
        } else if (inFile.isDirectory()) {
            File[] files = inFile.listFiles();
            for (int j = 0; j < files.length; j++) {
                xmlList.add(files[j].getAbsolutePath());
            }
        }

        int total_metabolite = 0;
        int total_valid_metabolite = 0;

        for (int f = 0; f < xmlList.size(); f++) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(xmlList.get(f))));
            String line;
            String acc = "-";
            String name = "-";
            String chemical_formula = "-";
            double mass = -1;
            while ((line = bufferedReader.readLine()) != null) {
                line.trim();
                if (line.startsWith("ACCESSION")) {
                    String dd[] = line.split(":\\s*");
                    acc = dd[1];
                } else if (line.startsWith("CH$NAME")) {
                    String dd[] = line.split(":\\s*");
                    name = dd[1];
                }
                if (line.startsWith("CH$FORMULA")) {
                    String dd[] = line.split(":\\s*");
                    chemical_formula = dd[1];
                }
                if (line.startsWith("CH$EXACT_MASS")) {
                    String dd[] = line.split(":\\s*");
                    mass = Double.valueOf(dd[1]);
                }
                if (line.startsWith("ACCESSION")) {
                    String dd[] = line.split(":\\s*");
                    acc = dd[1];
                }

            }
            MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
            metaboliteDB.name = name;
            metaboliteDB.chemical_formula = chemical_formula;
            total_metabolite++;
            total_valid_metabolite++;
            massDB.add(metaboliteDB);
            bufferedReader.close();
        }

        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
		for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }


    /**
     * ��ȡLipid Maps �ļ�����
     *
     * @param db .sdf ��ʽ�ļ���һ���ļ���
     *           http://www.lipidmaps.org/resources/downloads/index.html
     * @throws IOException
     */
    public static void readLipidMaps(String db) throws IOException {
        System.out.println("read metaboliteDB database " + db);
        BufferedReader br = new BufferedReader(new FileReader(new File(db)));

        int total_metabolite = 0;
        int total_valid_metabolite = 0;
        String line;
        while ((line = br.readLine()) != null) {
            line.trim();
            if (line.startsWith("LM")) {
                total_metabolite++;
                total_valid_metabolite++;
                String acc = line;
                String name = "-";
                double mass = -1;
                String chemical_formula = "-";
                //����������һ���µ���Ŀ
                //��Ҫ���������ѭ������
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("$$$$")) {
                        // ˵����ǰ�����Ŀ�Ѿ�����β��
                        break;// �˳���ǰѭ��
                    } else if (line.startsWith("> <LM_ID>")) {
                        acc = br.readLine().trim();
                    } else if (line.startsWith("> <FORMULA>")) {
                        chemical_formula = br.readLine().trim();
                    } else if (line.startsWith("> <SYSTEMATIC_NAME>")) {
                        name = br.readLine().trim();
                    } else if (line.startsWith("> <EXACT_MASS>")) {
                        mass = Double.valueOf(br.readLine().trim());
                    }
                }

                MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
                metaboliteDB.name = name;
                metaboliteDB.chemical_formula = chemical_formula;
                massDB.add(metaboliteDB);
            }
        }
        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
        for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }


    /**
     * ��ȡPlantCyc �ļ�����
     *
     * @param db compounds.dat ��ʽ�ļ���Ϊһ���ļ�
     * @throws IOException
     */
    public static void readPlantCyc(String db) throws IOException {
        System.out.println("read metaboliteDB database " + db);
        BufferedReader br = new BufferedReader(new FileReader(new File(db)));

        int total_metabolite = 0;
        int total_valid_metabolite = 0;
        String line;
        String pattern = "^[^\\s]+ \\- (.+)$";
        Pattern pn = Pattern.compile(pattern);
        while ((line = br.readLine()) != null) {
            line.trim();
            if (line.startsWith("UNIQUE-ID")) {
                String acc = line;
                Matcher m = pn.matcher(line);
                if (m.find()) {
                    acc = m.group(1);//��õ�һ��ƥ��ģʽ
                } else {
                    System.err.println("Error:" + line);
                    System.exit(0);
                }
                total_metabolite++;


                String name = "-";
                double mass = -1;
                String chemical_formula = "-";
                //����������һ���µ���Ŀ
                //��Ҫ���������ѭ������
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("//")) {
                        // ˵����ǰ�����Ŀ�Ѿ�����β��
                        break;// �˳���ǰѭ��
                    } else if (line.startsWith("CHEMICAL-FORMULA")) {
                        // CHEMICAL-FORMULA - (C 9)
                        // CHEMICAL-FORMULA - (H 9)
                        // ���ж���
                        Matcher mm = pn.matcher(line);
                        if (mm.find()) {
                            String cf = mm.group(1).replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(" ", "");
                            if (chemical_formula.equalsIgnoreCase("-")) {
                                chemical_formula = cf;
                            } else {
                                chemical_formula = chemical_formula + cf;//��õ�һ��ƥ��ģʽ
                            }
                        } else {
                            System.err.println("Error:" + line);
                            System.exit(0);
                        }

                    } else if (line.startsWith("COMMON-NAME")) {
                        // COMMON-NAME - (2<i>E</i>)-3-(5,6-dihydroxycyclohexa-1,3-dien-1-yl)prop-2-enoate
                        // ֻ��һ��
                        Matcher mm = pn.matcher(line);
                        if (mm.find()) {
                            name = mm.group(1);//��õ�һ��ƥ��ģʽ
                        } else {
                            System.err.println("Error:" + line);
                            System.exit(0);
                        }
                    } else if (line.startsWith("MONOISOTOPIC-MW")) {
                        // MONOISOTOPIC-MW - 182.0579088094
                        // ֻ��һ��
                        Matcher mm = pn.matcher(line);
                        if (mm.find()) {
                            mass = Double.valueOf(mm.group(1));//��õ�һ��ƥ��ģʽ
                        } else {
                            System.err.println("Error:" + line);
                            System.exit(0);
                        }
                    }
                }
                if (mass > 0) {
                    total_valid_metabolite++;
                    MetaboliteDB metaboliteDB = new MetaboliteDB(acc, mass);
                    metaboliteDB.name = name;
                    metaboliteDB.chemical_formula = chemical_formula;
                    massDB.add(metaboliteDB);
                }
            }
        }
        System.out.println("total metabolites: " + total_metabolite);
        System.out.println("total valid metabolites: " + total_valid_metabolite);
        System.out.println();

        //���򣬴�С����
        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����½�����
         */

        Collections.sort(massDB, comparator);
        int maxMass = (int) Math.ceil(massDB.get(massDB.size() - 1).monisotopic_moleculate_weight + 1);
        for (int i = 0; i < massDB.size(); i++) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMass(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2index.containsKey(minMass)) {
                mass2index.put(minMass, i);
            }


        }

        System.out.println("max mass in database " + maxMass);
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        int lastIndex = 0;
        for (int i = 1; i <= maxMass; i++) {
            if (!mass2index.containsKey(i)) {
                mass2index.put(i, lastIndex);
            } else {
                lastIndex = mass2index.get(i);
            }
        }

        /**
         * ��ö�Ӧmz�Ƚϵ�ʱ����Ͻ�����
         */
        for (int i = massDB.size() - 1; i >= 0; i--) {
            //System.out.println(massDB.get(i));
            //��ûһ����������С���λ����ID��ס
            int minMass = IntegerMassUp(massDB.get(i).monisotopic_moleculate_weight);

            //��������ж����л��������Ƚ������ֻȡ�ǰ��index����
            if (!mass2indexUp.containsKey(minMass)) {
                mass2indexUp.put(minMass, i);
            }


        }
        //��1��maxMass���ÿһ���������б����������Ƿ���mass2index������ˣ����û�д��ڣ����������С��index���
        lastIndex = massDB.size() - 1;
        //System.out.println("max mass in database "+maxMass);
        for (int i = maxMass; i >= 1; i--) {
            if (!mass2indexUp.containsKey(i)) {
                mass2indexUp.put(i, lastIndex);

            } else {
                lastIndex = mass2indexUp.get(i);
            }
        }

		/*//����㷨
        for(int i=0;i<massDB.size();i++){
			int index = IntegerMassForSearch(massDB.get(i).monisotopic_moleculate_weight);
			System.out.println(i+"\t"+massDB.get(i).monisotopic_moleculate_weight+"\t"+mass2index.get(index)+"\t"+mass2indexUp.get(index));
		}*/


    }




    /**
     * �����������ݿ�ʱ�����
     *
     * @param mass
     * @return
     */
    public static int IntegerMass(double mass) {
        return (int) (Math.ceil(mass) + 2);
    }

    /**
     * �����������ݿ�ʱ�����
     *
     * @param mass
     * @return
     */
    public static int IntegerMassUp(double mass) {
        return (int) (Math.floor(mass) - 2);
    }

    public static int IntegerMassForSearch(double mass) {
        return (int) (Math.floor(mass));
    }


    public static Comparator<MetaboliteDB> comparator = new Comparator<MetaboliteDB>() {
        public int compare(MetaboliteDB s1, MetaboliteDB s2) {
            if (s2.monisotopic_moleculate_weight > s1.monisotopic_moleculate_weight) {
                return -1;
            } else if (s2.monisotopic_moleculate_weight == s1.monisotopic_moleculate_weight) {
                return 0;
            } else {
                return 1;
            }

        }
    };

}
