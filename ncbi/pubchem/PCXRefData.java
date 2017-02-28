//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PC-XRefData_regid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_rn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_mesh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_pmid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_gi" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_mmdb" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_sid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_cid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_dburl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_sburl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_asurl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-XRefData_protein-gi" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_nucleotide-gi" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_taxonomy" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_mim" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_gene" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_probe" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_biosystem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_geogse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_geogsm" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-XRefData_patent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcxRefData_Regid",
        "pcxRefData_Rn",
        "pcxRefData_Mesh",
        "pcxRefData_Pmid",
        "pcxRefData_Gi",
        "pcxRefData_Mmdb",
        "pcxRefData_Sid",
        "pcxRefData_Cid",
        "pcxRefData_Dburl",
        "pcxRefData_Sburl",
        "pcxRefData_Asurl",
        "pcxRefData_ProteinGi",
        "pcxRefData_NucleotideGi",
        "pcxRefData_Taxonomy",
        "pcxRefData_Aid",
        "pcxRefData_Mim",
        "pcxRefData_Gene",
        "pcxRefData_Probe",
        "pcxRefData_Biosystem",
        "pcxRefData_Geogse",
        "pcxRefData_Geogsm",
        "pcxRefData_Patent"
})
@XmlRootElement(name = "PC-XRefData")
public class PCXRefData {

    @XmlElement(name = "PC-XRefData_regid")
    protected String pcxRefData_Regid;
    @XmlElement(name = "PC-XRefData_rn")
    protected String pcxRefData_Rn;
    @XmlElement(name = "PC-XRefData_mesh")
    protected String pcxRefData_Mesh;
    @XmlElement(name = "PC-XRefData_pmid")
    protected BigInteger pcxRefData_Pmid;
    @XmlElement(name = "PC-XRefData_gi")
    protected BigInteger pcxRefData_Gi;
    @XmlElement(name = "PC-XRefData_mmdb")
    protected BigInteger pcxRefData_Mmdb;
    @XmlElement(name = "PC-XRefData_sid")
    protected BigInteger pcxRefData_Sid;
    @XmlElement(name = "PC-XRefData_cid")
    protected BigInteger pcxRefData_Cid;
    @XmlElement(name = "PC-XRefData_dburl")
    protected String pcxRefData_Dburl;
    @XmlElement(name = "PC-XRefData_sburl")
    protected String pcxRefData_Sburl;
    @XmlElement(name = "PC-XRefData_asurl")
    protected String pcxRefData_Asurl;
    @XmlElement(name = "PC-XRefData_protein-gi")
    protected BigInteger pcxRefData_ProteinGi;
    @XmlElement(name = "PC-XRefData_nucleotide-gi")
    protected BigInteger pcxRefData_NucleotideGi;
    @XmlElement(name = "PC-XRefData_taxonomy")
    protected BigInteger pcxRefData_Taxonomy;
    @XmlElement(name = "PC-XRefData_aid")
    protected BigInteger pcxRefData_Aid;
    @XmlElement(name = "PC-XRefData_mim")
    protected BigInteger pcxRefData_Mim;
    @XmlElement(name = "PC-XRefData_gene")
    protected BigInteger pcxRefData_Gene;
    @XmlElement(name = "PC-XRefData_probe")
    protected BigInteger pcxRefData_Probe;
    @XmlElement(name = "PC-XRefData_biosystem")
    protected BigInteger pcxRefData_Biosystem;
    @XmlElement(name = "PC-XRefData_geogse")
    protected BigInteger pcxRefData_Geogse;
    @XmlElement(name = "PC-XRefData_geogsm")
    protected BigInteger pcxRefData_Geogsm;
    @XmlElement(name = "PC-XRefData_patent")
    protected String pcxRefData_Patent;

    /**
     * ��ȡpcxRefData_Regid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Regid() {
        return pcxRefData_Regid;
    }

    /**
     * ����pcxRefData_Regid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Regid(String value) {
        this.pcxRefData_Regid = value;
    }

    /**
     * ��ȡpcxRefData_Rn���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Rn() {
        return pcxRefData_Rn;
    }

    /**
     * ����pcxRefData_Rn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Rn(String value) {
        this.pcxRefData_Rn = value;
    }

    /**
     * ��ȡpcxRefData_Mesh���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Mesh() {
        return pcxRefData_Mesh;
    }

    /**
     * ����pcxRefData_Mesh���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Mesh(String value) {
        this.pcxRefData_Mesh = value;
    }

    /**
     * ��ȡpcxRefData_Pmid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Pmid() {
        return pcxRefData_Pmid;
    }

    /**
     * ����pcxRefData_Pmid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Pmid(BigInteger value) {
        this.pcxRefData_Pmid = value;
    }

    /**
     * ��ȡpcxRefData_Gi���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Gi() {
        return pcxRefData_Gi;
    }

    /**
     * ����pcxRefData_Gi���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Gi(BigInteger value) {
        this.pcxRefData_Gi = value;
    }

    /**
     * ��ȡpcxRefData_Mmdb���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Mmdb() {
        return pcxRefData_Mmdb;
    }

    /**
     * ����pcxRefData_Mmdb���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Mmdb(BigInteger value) {
        this.pcxRefData_Mmdb = value;
    }

    /**
     * ��ȡpcxRefData_Sid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Sid() {
        return pcxRefData_Sid;
    }

    /**
     * ����pcxRefData_Sid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Sid(BigInteger value) {
        this.pcxRefData_Sid = value;
    }

    /**
     * ��ȡpcxRefData_Cid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Cid() {
        return pcxRefData_Cid;
    }

    /**
     * ����pcxRefData_Cid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Cid(BigInteger value) {
        this.pcxRefData_Cid = value;
    }

    /**
     * ��ȡpcxRefData_Dburl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Dburl() {
        return pcxRefData_Dburl;
    }

    /**
     * ����pcxRefData_Dburl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Dburl(String value) {
        this.pcxRefData_Dburl = value;
    }

    /**
     * ��ȡpcxRefData_Sburl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Sburl() {
        return pcxRefData_Sburl;
    }

    /**
     * ����pcxRefData_Sburl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Sburl(String value) {
        this.pcxRefData_Sburl = value;
    }

    /**
     * ��ȡpcxRefData_Asurl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Asurl() {
        return pcxRefData_Asurl;
    }

    /**
     * ����pcxRefData_Asurl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Asurl(String value) {
        this.pcxRefData_Asurl = value;
    }

    /**
     * ��ȡpcxRefData_ProteinGi���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_ProteinGi() {
        return pcxRefData_ProteinGi;
    }

    /**
     * ����pcxRefData_ProteinGi���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_ProteinGi(BigInteger value) {
        this.pcxRefData_ProteinGi = value;
    }

    /**
     * ��ȡpcxRefData_NucleotideGi���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_NucleotideGi() {
        return pcxRefData_NucleotideGi;
    }

    /**
     * ����pcxRefData_NucleotideGi���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_NucleotideGi(BigInteger value) {
        this.pcxRefData_NucleotideGi = value;
    }

    /**
     * ��ȡpcxRefData_Taxonomy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Taxonomy() {
        return pcxRefData_Taxonomy;
    }

    /**
     * ����pcxRefData_Taxonomy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Taxonomy(BigInteger value) {
        this.pcxRefData_Taxonomy = value;
    }

    /**
     * ��ȡpcxRefData_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Aid() {
        return pcxRefData_Aid;
    }

    /**
     * ����pcxRefData_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Aid(BigInteger value) {
        this.pcxRefData_Aid = value;
    }

    /**
     * ��ȡpcxRefData_Mim���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Mim() {
        return pcxRefData_Mim;
    }

    /**
     * ����pcxRefData_Mim���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Mim(BigInteger value) {
        this.pcxRefData_Mim = value;
    }

    /**
     * ��ȡpcxRefData_Gene���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Gene() {
        return pcxRefData_Gene;
    }

    /**
     * ����pcxRefData_Gene���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Gene(BigInteger value) {
        this.pcxRefData_Gene = value;
    }

    /**
     * ��ȡpcxRefData_Probe���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Probe() {
        return pcxRefData_Probe;
    }

    /**
     * ����pcxRefData_Probe���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Probe(BigInteger value) {
        this.pcxRefData_Probe = value;
    }

    /**
     * ��ȡpcxRefData_Biosystem���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Biosystem() {
        return pcxRefData_Biosystem;
    }

    /**
     * ����pcxRefData_Biosystem���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Biosystem(BigInteger value) {
        this.pcxRefData_Biosystem = value;
    }

    /**
     * ��ȡpcxRefData_Geogse���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Geogse() {
        return pcxRefData_Geogse;
    }

    /**
     * ����pcxRefData_Geogse���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Geogse(BigInteger value) {
        this.pcxRefData_Geogse = value;
    }

    /**
     * ��ȡpcxRefData_Geogsm���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCXRefData_Geogsm() {
        return pcxRefData_Geogsm;
    }

    /**
     * ����pcxRefData_Geogsm���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCXRefData_Geogsm(BigInteger value) {
        this.pcxRefData_Geogsm = value;
    }

    /**
     * ��ȡpcxRefData_Patent���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCXRefData_Patent() {
        return pcxRefData_Patent;
    }

    /**
     * ����pcxRefData_Patent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCXRefData_Patent(String value) {
        this.pcxRefData_Patent = value;
    }

}
