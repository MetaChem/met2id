package met2id.metaboEntity;

import met2id.idFlow.Adduct;

import java.util.HashMap;
import java.util.Map;

public class MatchPeak {

    public MetaboliteDB metaboliteDB;
    public double delta;
    public double expMass;
    public Adduct adduct = null;

    public Map<Double, Double> isotope_distribution;
    public Double iso_similirity_score;

    public MatchPeak() {

    }

    public static Map<Double, Double> parse_distribution (String ori_mz_dist, String ori_intensity_dist){
        if (ori_mz_dist.equals("NA")) return null;
        String[] mz_dist = ori_mz_dist.split("-");
        String[] intensity_dist = ori_intensity_dist.split("-");
        Map<Double, Double> iso_dist = new HashMap<Double, Double>();
        int minLength = Math.min(mz_dist.length, intensity_dist.length);
        int i = 0;
        while (i < minLength){
            iso_dist.put(Double.valueOf(mz_dist[i]), Double.valueOf(intensity_dist[i]));
            i++;
        }
        return iso_dist;
    }
}
