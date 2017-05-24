package met2id.adduct;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hahah on 2017/1/6.
 *
 * CONSTANTS LIST
 * elements---monoisotopic_masses
 * hydrogen and electron mass
 * adduct_names---AdductType    //http://fiehnlab.ucdavis.edu/staff/kind/Metabolomics/MS-Adduct-Calculator/
 *
 */
public class Constants {
    public static final Map<String, Double> ELEMENTMASS = new HashMap<String, Double>();

    static {
        ELEMENTMASS.put("[13C]",13.00335);
        ELEMENTMASS.put("C",12.00000);
        ELEMENTMASS.put("Al",26.98154);
        ELEMENTMASS.put("Am",243.0614);
        ELEMENTMASS.put("Ar",39.96238);
        ELEMENTMASS.put("As",74.92160);
        ELEMENTMASS.put("At",209.9871);
        ELEMENTMASS.put("Au",196.9666);
        ELEMENTMASS.put("B",11.00931);
        ELEMENTMASS.put("Ba",137.9052);
        ELEMENTMASS.put("Bi",208.9804);
        ELEMENTMASS.put("Br",78.91834);
        ELEMENTMASS.put("Ca",39.96259);
        ELEMENTMASS.put("Cd",113.9034);
        ELEMENTMASS.put("Ce",139.9054);
        ELEMENTMASS.put("Cl",34.96885);
        ELEMENTMASS.put("Co",58.93320);
        ELEMENTMASS.put("Cr",51.94051);
        ELEMENTMASS.put("Cu",62.92960);
        ELEMENTMASS.put("D",2.014102);
        ELEMENTMASS.put("F",18.99840);
        ELEMENTMASS.put("Fe",55.93494);
        ELEMENTMASS.put("Ga",68.92558);
        ELEMENTMASS.put("Gd",157.9241);
        ELEMENTMASS.put("Ge",73.92118);
        ELEMENTMASS.put("H",1.007825);
        ELEMENTMASS.put("He",4.002603);
        ELEMENTMASS.put("Hg",201.9706);
        ELEMENTMASS.put("I",126.9045);
        ELEMENTMASS.put("In",114.9039);
        ELEMENTMASS.put("K",38.96371);
        ELEMENTMASS.put("Li",7.016004);
        ELEMENTMASS.put("Mg",23.98504);
        ELEMENTMASS.put("Mn",54.93805);
        ELEMENTMASS.put("Mo",97.90541);
        ELEMENTMASS.put("[15N]",15.00011);
        ELEMENTMASS.put("N",14.00307);
        ELEMENTMASS.put("Na",22.98977);
        ELEMENTMASS.put("Ne",19.99244);
        ELEMENTMASS.put("Ni",57.93535);
        ELEMENTMASS.put("[18O]",17.99916);
        ELEMENTMASS.put("O",15.99491);
        ELEMENTMASS.put("P",30.97376);
        ELEMENTMASS.put("Pb",207.9766);
        ELEMENTMASS.put("Po",208.9824);
        ELEMENTMASS.put("Pt",194.9648);
        ELEMENTMASS.put("Ra",226.0254);
        ELEMENTMASS.put("Rb",84.91179);
        ELEMENTMASS.put("Re",186.9558);
        ELEMENTMASS.put("Ru",101.9043);
        ELEMENTMASS.put("S",31.97207);
        ELEMENTMASS.put("Sb",120.9038);
        ELEMENTMASS.put("Se",79.91652);
        ELEMENTMASS.put("Si",27.97693);
        ELEMENTMASS.put("Sn",119.9022);
        ELEMENTMASS.put("Tc",97.90722);
        ELEMENTMASS.put("Te",129.9062);
        ELEMENTMASS.put("Ti",47.94795);
        ELEMENTMASS.put("Tl",204.9744);
        ELEMENTMASS.put("U",238.0508);
        ELEMENTMASS.put("V",50.94396);
        ELEMENTMASS.put("W",183.9509);
        ELEMENTMASS.put("Y",88.90585);
        ELEMENTMASS.put("Zn",63.92915);
        ELEMENTMASS.put("Zr",89.90470);
    }

    public static final Double HYDROGEN_MASS = ELEMENTMASS.get("H");
    public static final Double ELECTRON_MASS = 0.00054858;

    public static final Map<String, AdductType> ADDUCTMAP = new HashMap<String, AdductType>();
    static {
        ADDUCTMAP.put("[M]",new AdductType("[M]",0.0));
        ADDUCTMAP.put("[M-H]",new AdductType("[M-H]",-1.0*1.007276,-1));
        ADDUCTMAP.put("[M+H]",new AdductType("[M+H]",1.007276,1));
        ADDUCTMAP.put("[M-D]",new AdductType("[M-D]",-1.0*ELEMENTMASS.get("D"),-1));
        ADDUCTMAP.put("[M+D]",new AdductType("[M+D]",ELEMENTMASS.get("D"),1));

        ADDUCTMAP.put("[M+3H]",new AdductType("[M+3H]",1.007276*3,3));
        ADDUCTMAP.put("[M+2H+Na]",new AdductType("[M+2H+Na]",8.334590*3,3));
        ADDUCTMAP.put("[M+H+2Na]",new AdductType("[M+H+2Na]",15.7661904*3,3));
        ADDUCTMAP.put("[M+3Na]",new AdductType("[M+3Na]",22.989218*3,3));
        ADDUCTMAP.put("[M+2H]",new AdductType("[M+2H]",1.007276*2,2));
        ADDUCTMAP.put("[M+H+NH4]",new AdductType("[M+H+NH4]",9.520550*2,2));
        ADDUCTMAP.put("[M+H+Na]",new AdductType("[M+H+Na]",11.998247*2,2));
        ADDUCTMAP.put("[M+H+K]",new AdductType("[M+H+K]",19.985217*2,2));
        ADDUCTMAP.put("[M+ACN+2H]",new AdductType("[M+ACN+2H]",21.520550*2,2));
        ADDUCTMAP.put("[M+2Na]",new AdductType("[M+2Na]",22.989218*2,2));
        ADDUCTMAP.put("[M+2ACN+2H]",new AdductType("[M+2ACN+2H]",42.033823*2,2));
        ADDUCTMAP.put("[M+3ACN+2H]",new AdductType("[M+3ACN+2H]",62.547097*2,2));
        ADDUCTMAP.put("[M+NH4]",new AdductType("[M+NH4]",18.033823,1));
        ADDUCTMAP.put("[M+Na]",new AdductType("[M+Na]",22.989218,1));
        ADDUCTMAP.put("[M+K]",new AdductType("[M+K]",38.963158,1));
        ADDUCTMAP.put("[M+CH3OH+H]",new AdductType("[M+CH3OH+H]",33.033489,1));
        ADDUCTMAP.put("[M+ACN+H]",new AdductType("[M+ACN+H]",42.033823,1));
        ADDUCTMAP.put("[M+ACN+Na]",new AdductType("[M+ACN+Na]",64.015765,1));
        ADDUCTMAP.put("[M+2ACN+H]",new AdductType("[M+2ACN+H]",83.060370,1));
        ADDUCTMAP.put("[M+2Na-H]",new AdductType("[M+2Na-H]",44.971160,1));
        ADDUCTMAP.put("[M+IsoProp+H]",new AdductType("[M+IsoProp+H]",61.06534,1));
        ADDUCTMAP.put("[M+2K-H]",new AdductType("[M+2K-H]",76.919040,1));
        ADDUCTMAP.put("[M+DMSO+H]",new AdductType("[M+DMSO+H]",79.02122,1));
        ADDUCTMAP.put("[M+IsoProp+Na+H]",new AdductType("[M+IsoProp+Na+H]",84.05511,1));
        ADDUCTMAP.put("[M+H-H2O]",new AdductType("[M+H-H2O]",-19.01839+1.007276*2,1));  //add

        ADDUCTMAP.put("[M+H-2H2O]",new AdductType("[M+H-2H2O]",-19.01839*2+1.007276*3,1));  //add
        ADDUCTMAP.put("[M+H-NH3]",new AdductType("[M+H-NH3]",-18.033823+1.007276*2,1));  //add
        ADDUCTMAP.put("[2M+H-H2O]",new AdductType("[2M+H-H2O]",-19.01839+1.007276*2,1,2));  //add

        ADDUCTMAP.put("[2M+H]",new AdductType("[2M+H]",1.007276,1,2));
        ADDUCTMAP.put("[2M+NH4]",new AdductType("[2M+NH4]",18.033823,1,2));
        ADDUCTMAP.put("[2M+Na]",new AdductType("[2M+Na]",22.989218,1,2));
        ADDUCTMAP.put("[2M+K]",new AdductType("[2M+K]",38.963158,1,2));
        ADDUCTMAP.put("[2M+ACN+H]",new AdductType("[2M+ACN+H]",42.033823,1,2));
        ADDUCTMAP.put("[2M+ACN+Na]",new AdductType("[2M+ACN+Na]",64.015765,1,2));

        ADDUCTMAP.put("[M-3H]",new AdductType("[M-3H]",-1.007276*3,-3));
        ADDUCTMAP.put("[M-2H]",new AdductType("[M-2H]",-1.007276*2,-2));
        ADDUCTMAP.put("[M-H2O-H]",new AdductType("[M-H2O-H]",-19.01839,-1));
        ADDUCTMAP.put("[M+Na-2H]",new AdductType("[M+Na-2H]",20.974666,-1));
        ADDUCTMAP.put("[M+K-2H]",new AdductType("[M+K-2H]",36.948606,-1));
        ADDUCTMAP.put("[M+Cl]",new AdductType("[M+Cl]",34.949602,-1));
        ADDUCTMAP.put("[M+HCOO]",new AdductType("[M+HCOO]",ELEMENTMASS.get("H")+ELEMENTMASS.get("C")+ELEMENTMASS.get("O")*2,-1));
        ADDUCTMAP.put("[M+CH3COO]",new AdductType("[M+CH3COO]",ELEMENTMASS.get("C")*2+ELEMENTMASS.get("H")*3+ELEMENTMASS.get("O")*2,-1));
        ADDUCTMAP.put("[M+FA-H]",new AdductType("[M+FA-H]",44.998201,-1));
        ADDUCTMAP.put("[M+Hac-H]",new AdductType("[M+Hac-H]",59.013851,-1));
        ADDUCTMAP.put("[M+Br]",new AdductType("[M+Br]",78.918885,-1));
        ADDUCTMAP.put("[M+TFA-H]",new AdductType("[M+TFA-H]",112.985586,-1));

        ADDUCTMAP.put("[2M-H]",new AdductType("[2M-H]",-1.007276,-1,2));
        ADDUCTMAP.put("[2M+FA-H]",new AdductType("[2M+FA-H]",44.998201,-1,2));
        ADDUCTMAP.put("[2M+Hac-H]",new AdductType("[2M+Hac-H]",59.013851,-1,2));
        ADDUCTMAP.put("[3M-H]",new AdductType("[3M-H]",-1.007276,-1,3));
    }
}
