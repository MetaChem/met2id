package met2id.metaboEntity;

public class MetaboliteDB {

    public String accession;
    public String name;
    public String description;
    public double monisotopic_moleculate_weight;
    public String chemical_formula;
    public String pathways;
    public String biofluid_locations;
    public String tissue_locations;




    public MetaboliteDB() {

    }

    public MetaboliteDB(String acc, String na, String des, double moniMass) {
        this.accession = acc;
        this.name = na;
        this.description = des;
        this.monisotopic_moleculate_weight = moniMass;
    }

    public MetaboliteDB(String acc, double moniMass) {
        this.accession = acc;
        this.monisotopic_moleculate_weight = moniMass;
    }


}
