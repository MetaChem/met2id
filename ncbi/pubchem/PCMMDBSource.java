//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PC-MMDBSource_mmdb-id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-MMDBSource_molecule-id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-MMDBSource_molecule-name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-MMDBSource_molecule-name_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-MMDBSource_residue-id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-MMDBSource_residue-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-MMDBSource_atom-id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-MMDBSource_atom-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcmmdbSource_MmdbId",
        "pcmmdbSource_MoleculeId",
        "pcmmdbSource_MoleculeName",
        "pcmmdbSource_ResidueId",
        "pcmmdbSource_ResidueName",
        "pcmmdbSource_AtomId",
        "pcmmdbSource_AtomName"
})
@XmlRootElement(name = "PC-MMDBSource")
public class PCMMDBSource {

    @XmlElement(name = "PC-MMDBSource_mmdb-id", required = true)
    protected BigInteger pcmmdbSource_MmdbId;
    @XmlElement(name = "PC-MMDBSource_molecule-id", required = true)
    protected BigInteger pcmmdbSource_MoleculeId;
    @XmlElement(name = "PC-MMDBSource_molecule-name", required = true)
    protected PCMMDBSource.PCMMDBSource_MoleculeName pcmmdbSource_MoleculeName;
    @XmlElement(name = "PC-MMDBSource_residue-id")
    protected BigInteger pcmmdbSource_ResidueId;
    @XmlElement(name = "PC-MMDBSource_residue-name")
    protected String pcmmdbSource_ResidueName;
    @XmlElement(name = "PC-MMDBSource_atom-id")
    protected BigInteger pcmmdbSource_AtomId;
    @XmlElement(name = "PC-MMDBSource_atom-name")
    protected String pcmmdbSource_AtomName;

    /**
     * ��ȡpcmmdbSource_MmdbId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCMMDBSource_MmdbId() {
        return pcmmdbSource_MmdbId;
    }

    /**
     * ����pcmmdbSource_MmdbId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCMMDBSource_MmdbId(BigInteger value) {
        this.pcmmdbSource_MmdbId = value;
    }

    /**
     * ��ȡpcmmdbSource_MoleculeId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCMMDBSource_MoleculeId() {
        return pcmmdbSource_MoleculeId;
    }

    /**
     * ����pcmmdbSource_MoleculeId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCMMDBSource_MoleculeId(BigInteger value) {
        this.pcmmdbSource_MoleculeId = value;
    }

    /**
     * ��ȡpcmmdbSource_MoleculeName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCMMDBSource.PCMMDBSource_MoleculeName }
     */
    public PCMMDBSource.PCMMDBSource_MoleculeName getPCMMDBSource_MoleculeName() {
        return pcmmdbSource_MoleculeName;
    }

    /**
     * ����pcmmdbSource_MoleculeName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCMMDBSource.PCMMDBSource_MoleculeName }
     */
    public void setPCMMDBSource_MoleculeName(PCMMDBSource.PCMMDBSource_MoleculeName value) {
        this.pcmmdbSource_MoleculeName = value;
    }

    /**
     * ��ȡpcmmdbSource_ResidueId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCMMDBSource_ResidueId() {
        return pcmmdbSource_ResidueId;
    }

    /**
     * ����pcmmdbSource_ResidueId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCMMDBSource_ResidueId(BigInteger value) {
        this.pcmmdbSource_ResidueId = value;
    }

    /**
     * ��ȡpcmmdbSource_ResidueName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCMMDBSource_ResidueName() {
        return pcmmdbSource_ResidueName;
    }

    /**
     * ����pcmmdbSource_ResidueName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCMMDBSource_ResidueName(String value) {
        this.pcmmdbSource_ResidueName = value;
    }

    /**
     * ��ȡpcmmdbSource_AtomId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCMMDBSource_AtomId() {
        return pcmmdbSource_AtomId;
    }

    /**
     * ����pcmmdbSource_AtomId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCMMDBSource_AtomId(BigInteger value) {
        this.pcmmdbSource_AtomId = value;
    }

    /**
     * ��ȡpcmmdbSource_AtomName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCMMDBSource_AtomName() {
        return pcmmdbSource_AtomName;
    }

    /**
     * ����pcmmdbSource_AtomName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCMMDBSource_AtomName(String value) {
        this.pcmmdbSource_AtomName = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="PC-MMDBSource_molecule-name_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcmmdbSource_MoleculeName_E"
    })
    public static class PCMMDBSource_MoleculeName {

        @XmlElement(name = "PC-MMDBSource_molecule-name_E")
        protected List<String> pcmmdbSource_MoleculeName_E;

        /**
         * Gets the value of the pcmmdbSourceMoleculeNameE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcmmdbSourceMoleculeNameE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCMMDBSource_MoleculeName_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCMMDBSource_MoleculeName_E() {
            if (pcmmdbSource_MoleculeName_E == null) {
                pcmmdbSource_MoleculeName_E = new ArrayList<String>();
            }
            return this.pcmmdbSource_MoleculeName_E;
        }

    }

}
