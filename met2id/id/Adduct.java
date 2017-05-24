package met2id.id;

public class Adduct {

    //差值
    public double massdiff;
    //编号
    public int index;
    //加和物名称
    public String label;

    public double charge;

    public double mass;

    public double mz;

    public double nmol;

    public int fromExp = 0;//0表示不是来自实验，而是来时鉴定时遍历的考虑；1表示来自本实验的加合物


    public Adduct() {

    }

    public Adduct(int id, double md, String lab) {
        this.index = id;
        this.massdiff = md;
        this.label = lab;
    }

    public Adduct(int id, double md, String lab, double ch) {
        this.index = id;
        this.massdiff = md;
        this.label = lab;
        this.charge = ch;
    }

}
