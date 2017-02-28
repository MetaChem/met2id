//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *       &lt;sequence>
 *         &lt;element name="BinomialOrgName_genus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BinomialOrgName_species" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinomialOrgName_subspecies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "binomialOrgName_Genus",
        "binomialOrgName_Species",
        "binomialOrgName_Subspecies"
})
@XmlRootElement(name = "BinomialOrgName")
public class BinomialOrgName {

    @XmlElement(name = "BinomialOrgName_genus", required = true)
    protected String binomialOrgName_Genus;
    @XmlElement(name = "BinomialOrgName_species")
    protected String binomialOrgName_Species;
    @XmlElement(name = "BinomialOrgName_subspecies")
    protected String binomialOrgName_Subspecies;

    /**
     * ��ȡbinomialOrgName_Genus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Genus() {
        return binomialOrgName_Genus;
    }

    /**
     * ����binomialOrgName_Genus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Genus(String value) {
        this.binomialOrgName_Genus = value;
    }

    /**
     * ��ȡbinomialOrgName_Species���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Species() {
        return binomialOrgName_Species;
    }

    /**
     * ����binomialOrgName_Species���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Species(String value) {
        this.binomialOrgName_Species = value;
    }

    /**
     * ��ȡbinomialOrgName_Subspecies���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Subspecies() {
        return binomialOrgName_Subspecies;
    }

    /**
     * ����binomialOrgName_Subspecies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Subspecies(String value) {
        this.binomialOrgName_Subspecies = value;
    }

}
