package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Metabolite {

    public String accession;
    public String name;
    public String description;
    public double monisotopic_moleculate_weight;
    public String chemical_formula;
    public String pathways;
    public String biofluid_locations;
    public String tissue_locations;




    public Metabolite() {

    }

    public Metabolite(String acc, String na, String des, double moniMass) {
        this.accession = acc;
        this.name = na;
        this.description = des;
        this.monisotopic_moleculate_weight = moniMass;
    }

    public Metabolite(String acc, double moniMass) {
        this.accession = acc;
        this.monisotopic_moleculate_weight = moniMass;
    }


}
