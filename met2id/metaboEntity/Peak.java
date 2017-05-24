package met2id.metaboEntity;

import met2id.id.Adduct;

import java.util.ArrayList;


public class Peak {

    public String ID;
    public double mz;
    public double mass = -1;
    public double charge;
    public ArrayList<Adduct> adducts = new ArrayList<Adduct>();

    public String ori_mz_dist;
    public String ori_intensity_dist;

    public Peak(double dmz, double dmass) {
        this.mz = dmz;
        this.mass = dmass;
    }

    public Peak(double dmz) {
        this.mz = dmz;
    }


}
