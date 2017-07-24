package met2id.idFlow;

public class Adduct {

    //��ֵ
    public double massdiff;
    //���
    public int index;
    //�Ӻ�������
    public String label;

    public double charge;

    public double mass;

    public double mz;

    public double nmol;

    public int fromExp = 0;//0��ʾ��������ʵ�飬������ʱ����ʱ�����Ŀ��ǣ�1��ʾ���Ա�ʵ��ļӺ���


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
