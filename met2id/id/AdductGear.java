package met2id.id;

import java.io.IOException;
import java.util.HashMap;

/*
 * 每个
 */
public class AdductGear {

    /**
     * 所有的加合物
     */
    public HashMap<Integer, Adduct> adductMap = new HashMap<Integer, Adduct>();
    /**
     * 选中的加合物
     */
    public HashMap<Integer, Adduct> sAdductMap = new HashMap<Integer, Adduct>();
    public int maxIndex = 0;

    public void initialize(int mode, String adductStr) throws IOException {
        readAdducts(mode);
        selectAdduct(adductStr);
    }

    public void printAdducts(int mode) throws IOException {
        // TODO Auto-generated method stub
        readAdducts(mode);
        for (int i = 1; i <= this.maxIndex; i++) {
            String outline = "";
            outline = adductMap.get(i).index + "\t" + adductMap.get(i).label + "\t" + adductMap.get(i).massdiff;
            System.out.println(outline);
        }

    }

    /**
     * 根据
     *
     * @param mz
     */
    public double[] calcMZdiff(double mz) {
        if (this.sAdductMap.size() == 0) {
            System.err.println("Please select the met2id.adduct");
            System.exit(0);
        }
        double mass[] = new double[sAdductMap.size()];
        for (int i = 0; i < sAdductMap.size(); i++) {
            double mzdiff = sAdductMap.get(i).massdiff;
            mass[i] = mz - mzdiff;
        }
        return mass;
    }

    public HashMap<Integer, Adduct> selectAdduct(String indexStr) {
        indexStr = "1";     //new
        String ind[] = indexStr.split(";");

        for (int i = 0; i < ind.length; i++) {
            int index = Integer.valueOf(ind[i]);
            sAdductMap.put(index, this.adductMap.get(index));
        }
        return sAdductMap;
    }

    public  void readAdducts(int mode){
        double massdiff = 1;
        double charge = 1;
        double nmol = 1;
        int index = 1;
        String d = "H+";
        Adduct adduct = new Adduct(index, massdiff, d, charge);
        adduct.nmol = nmol;
        adduct.fromExp = 0;
        adductMap.put(index, adduct);
    }

    /*public void readAdducts(int mode) throws IOException {
        String adductsFile;
        if (mode == 1) {
            adductsFile = "/extended_adducts_pos.csv";
        } else {
            adductsFile = "/extended_adducts_neg.csv";
        }
        AdductGear adducts = new AdductGear();
        InputStream is = adducts.getClass().getResourceAsStream(adductsFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        int index = 0;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            index++;
            line.trim();
            String d[] = line.split("\t");
            double massdiff = Double.valueOf(d[3]);
            double charge = Double.valueOf(d[2]);
            double nmol = Double.valueOf(d[1]);
            d[0] = d[0].replaceAll("\"", "");
            Adduct met2id.adduct = new Adduct(index, massdiff, d[0], charge);
            met2id.adduct.nmol = nmol;
            met2id.adduct.fromExp = 0;
            adductMap.put(index, met2id.adduct);

        }
        this.maxIndex = index;
        br.close();
    }*/

}
