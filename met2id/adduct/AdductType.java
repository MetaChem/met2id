package met2id.adduct;

/**
 * Created by hahah on 2017/1/6.
 */
public class AdductType {
    private String name;
    private double mass;
    private int charge;
    private int molNum; //maybe 2 mol to 1 ion

    public AdductType(String name, double mass){
        this.name = name;
        this.mass = mass;
        this.charge = 0;
        this.molNum = 1;
    }
    public AdductType(String name, double mass, int charge){
        this.name = name;
        this.mass = mass;
        this.charge = charge;
        this.molNum = 1;
    }
    public AdductType(String name, double mass, int charge, int molNum){
        this.name = name;
        this.mass = mass;
        this.charge = charge;
        this.molNum = molNum;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Name_").append(name).append(" Mass_").append(mass).append(" Charge_"
        ).append(charge).append(" MolNum_").append(molNum).toString();
    }

    public String getName(){return name;}
    public double getMass(){return mass;}
    public int getCharge(){return charge;}
    public int getMolNum(){return molNum;}
}
