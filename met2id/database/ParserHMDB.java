package met2id.database;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ParserHMDB {

    public static boolean isHeaderOut = false;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO Auto-generated method stub
        String input = args[0];
        File iFile = new File(input);
        if (iFile.isDirectory()) {
            File xmlFile[] = iFile.listFiles();
            System.err.println(xmlFile.length);
            for (File f : xmlFile) {
                //System.out.println(f.getName().toLowerCase());
                if (f.getName().toLowerCase().endsWith(".xml")) {
                    run(f);
                }
            }
        } else {
            run(iFile);
        }

		/*File f = new File(xml); 
		SAXReader reader = new SAXReader(); 
		Document doc = reader.read(f); 
		Element root = doc.getRootElement(); 
		System.out.println("");;
		//System.out.println("root element:"); 
		Element foo; 
		for (Iterator i = root.elementIterator("VALUE"); i.hasNext() { 
		����foo = (Element) i.next(); 
		����System.out.print("���ƺ���:" + foo.elementText("NO")); 
		   System.out.println("������ַ:" + foo.elementText("ADDR"));
		}*/

    }

    public static void run(File f) throws ParserConfigurationException, SAXException, IOException {
        //String xml = "E:/research/work/java/workspace/MetaboliteIdentify/met2id.db/HMDB00001.xml";


        // step 1: ���dom���������������������������ڴ�������Ľ�������
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

//      System.out.println("class name: " + dbf.getClass().getName());  

        // step 2:��þ����dom������  
        DocumentBuilder db = dbf.newDocumentBuilder();

//      System.out.println("class name: " + met2id.db.getClass().getName());

        // step3: ����һ��xml�ĵ������Document���󣨸���㣩  
        Document document = db.parse(f);

        NodeList list = document.getElementsByTagName("metaboliteDB");
        //System.out.println(list.getLength());
        ArrayList<String> header = new ArrayList<String>();

        for (int i = 0; i < list.getLength(); i++) {
            String acc;
            String name;
            String description;
            String chemical_formula;
            String average_molecular_weight;
            String monisotopic_moleculate_weight;
            String iupac_name;
            String biofluid_locations;
            String tissue_locations;
            String pathways;


            ArrayList<String> outline = new ArrayList<String>();

            Element element = (Element) list.item(i);
            acc = element.getElementsByTagName("accession").item(0).getFirstChild().getNodeValue();
            if (isHeaderOut == false) {
                header.add("accession");
            }
            outline.add(acc);

            name = element.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();
            if (isHeaderOut == false) {
                header.add("name");
            }
            //ȥ��ĩβ�Ŀ��У���ʱ����п���
            name = name.replaceAll("((\r\n)|\n|\t)*", "");
            outline.add(name);

            if (element.getElementsByTagName("description").item(0).getFirstChild() != null) {
                description = element.getElementsByTagName("description").item(0).getFirstChild().getNodeValue();
            } else {
                description = "-";
            }
            if (isHeaderOut == false) {
                header.add("description");
            }
            //ȥ��ĩβ�Ŀ��У���ʱ����п���
            description = description.replaceAll("((\r\n)|\n|\t)*", "");
            //description = description.replaceAll("((\r\n)|\n)[\\s\t ]*(\\1)+$", "$1").replaceAll("^((\r\n)|\n)$", ""); 
            outline.add(description);

            if (element.getElementsByTagName("chemical_formula").item(0).getFirstChild() != null) {
                chemical_formula = element.getElementsByTagName("chemical_formula").item(0).getFirstChild().getNodeValue();
            } else {
                chemical_formula = "-";
            }
            if (isHeaderOut == false) {
                header.add("chemical_formula");
            }
            outline.add(chemical_formula);


            if (element.getElementsByTagName("average_molecular_weight").item(0).getFirstChild() != null) {
                average_molecular_weight = element.getElementsByTagName("average_molecular_weight").item(0).getFirstChild().getNodeValue();
            } else {
                average_molecular_weight = "NA";
            }
            if (isHeaderOut == false) {
                header.add("average_molecular_weight");
            }
            outline.add(average_molecular_weight);

            if (element.getElementsByTagName("monisotopic_moleculate_weight").item(0).getFirstChild() != null) {
                monisotopic_moleculate_weight = element.getElementsByTagName("monisotopic_moleculate_weight").item(0).getFirstChild().getNodeValue();
            } else {
                monisotopic_moleculate_weight = "NA";
            }
            if (isHeaderOut == false) {
                header.add("monisotopic_moleculate_weight");
            }
            outline.add(monisotopic_moleculate_weight);


            if (element.getElementsByTagName("iupac_name").item(0).getFirstChild() != null) {
                iupac_name = element.getElementsByTagName("iupac_name").item(0).getFirstChild().getNodeValue();
            } else {
                iupac_name = "-";
            }
            if (isHeaderOut == false) {
                header.add("iupac_name");
            }
            iupac_name = iupac_name.equals("") ? "-" : iupac_name;
            outline.add(iupac_name);

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
            if (isHeaderOut == false) {
                header.add("biofluid_locations");
            }
            biofluid_locations = biofluid_locations.equals("") ? "-" : biofluid_locations;
            outline.add(biofluid_locations);


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
            if (isHeaderOut == false) {
                header.add("tissue_locations");
            }
            tissue_locations = tissue_locations.equals("") ? "-" : tissue_locations;
            outline.add(tissue_locations);

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
            if (isHeaderOut == false) {
                header.add("pathways");
            }
            pathways = pathways.replaceAll("((\r\n)|\n|\t)*", "");
            outline.add(pathways);


            if (isHeaderOut == false) {
                String outhead = StringUtils.join(header, "\t");
                System.out.println(outhead);
                isHeaderOut = true;
            }
            String outstr = StringUtils.join(outline, "\t");
            System.out.println(outstr);

        }


    }

}
