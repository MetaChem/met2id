package dbparser;

import ncbi.pubchem.PCCompound;
import ncbi.pubchem.PCCompounds;
import ncbi.pubchem.PCInfoData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;

import static javax.xml.bind.JAXB.unmarshal;

/**
 * Created by Administrator on 2016/9/17.
 */
public class PubChemGear {

    public static PCCompounds unimod = null;

    public static void main(String[] args) throws FileNotFoundException {
        String a = "D:\\cygwin64\\home\\Administrator\\Compound_001775001_001800000.xml\\Compound_001775001_001800000.xml";
        read(a);
    }

    public static void read(String xml) throws FileNotFoundException {
        System.out.println("read metabolite database " + xml);

        InputStream stream = new FileInputStream(xml);

        PCCompounds dbunmarshal = unmarshal(stream, PCCompounds.class);
        System.out.println(dbunmarshal.getPCCompound().size());
        int nCompound = dbunmarshal.getPCCompound().size();
        for (int i = 0; i < nCompound; i++) {
            PCCompound pcCompound = dbunmarshal.getPCCompound().get(i);
            BigInteger id = pcCompound.getPCCompound_Id().getPCCompoundType().getPCCompoundType_Id().getPCCompoundType_Id_Cid();
            String acc = String.valueOf(id);
            String chemical_formula = "-";
            String IUPACName = "-";
            double mass = -1;
            List<PCInfoData> pcInfoDataList = pcCompound.getPCCompound_Props().getPCInfoData();
            for (int k = 0; k < pcInfoDataList.size(); k++) {
                PCInfoData pcInfoData = pcInfoDataList.get(k);
                String label = pcInfoData.getPCInfoData_Urn().getPCUrn().getPCUrn_Label();
                if (label.equalsIgnoreCase("Mass")) {
                    mass = pcInfoData.getPCInfoData_Value().getPCInfoData_Value_Fval();
                } else if (label.equalsIgnoreCase("Molecular Formula")) {
                    chemical_formula = pcInfoData.getPCInfoData_Value().getPCInfoData_Value_Sval();
                } else if (label.equalsIgnoreCase("IUPAC Name") && pcInfoData.getPCInfoData_Urn().getPCUrn().getPCUrn_Name().equalsIgnoreCase("Preferred")) {
                    IUPACName = pcInfoData.getPCInfoData_Value().getPCInfoData_Value_Sval();
                }


            }
            System.out.println(acc + "\t" + IUPACName + "\t" + mass + "\t" + chemical_formula);
        }
    }


}
