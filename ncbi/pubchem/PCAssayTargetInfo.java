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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="PC-AssayTargetInfo_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-AssayTargetInfo_mol-id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayTargetInfo_molecule-type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="protein">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="protein"/>
 *                       &lt;enumeration value="dna"/>
 *                       &lt;enumeration value="rna"/>
 *                       &lt;enumeration value="gene"/>
 *                       &lt;enumeration value="biosystem"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayTargetInfo_organism" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}BioSource"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayTargetInfo_descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayTargetInfo_comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayTargetInfo_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAssayTargetInfo_Name",
        "pcAssayTargetInfo_MolId",
        "pcAssayTargetInfo_MoleculeType",
        "pcAssayTargetInfo_Organism",
        "pcAssayTargetInfo_Descr",
        "pcAssayTargetInfo_Comment"
})
@XmlRootElement(name = "PC-AssayTargetInfo")
public class PCAssayTargetInfo {

    @XmlElement(name = "PC-AssayTargetInfo_name", required = true)
    protected String pcAssayTargetInfo_Name;
    @XmlElement(name = "PC-AssayTargetInfo_mol-id", required = true)
    protected BigInteger pcAssayTargetInfo_MolId;
    @XmlElement(name = "PC-AssayTargetInfo_molecule-type")
    protected PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType pcAssayTargetInfo_MoleculeType;
    @XmlElement(name = "PC-AssayTargetInfo_organism")
    protected PCAssayTargetInfo.PCAssayTargetInfo_Organism pcAssayTargetInfo_Organism;
    @XmlElement(name = "PC-AssayTargetInfo_descr")
    protected String pcAssayTargetInfo_Descr;
    @XmlElement(name = "PC-AssayTargetInfo_comment")
    protected PCAssayTargetInfo.PCAssayTargetInfo_Comment pcAssayTargetInfo_Comment;

    /**
     * ��ȡpcAssayTargetInfo_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayTargetInfo_Name() {
        return pcAssayTargetInfo_Name;
    }

    /**
     * ����pcAssayTargetInfo_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayTargetInfo_Name(String value) {
        this.pcAssayTargetInfo_Name = value;
    }

    /**
     * ��ȡpcAssayTargetInfo_MolId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayTargetInfo_MolId() {
        return pcAssayTargetInfo_MolId;
    }

    /**
     * ����pcAssayTargetInfo_MolId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayTargetInfo_MolId(BigInteger value) {
        this.pcAssayTargetInfo_MolId = value;
    }

    /**
     * ��ȡpcAssayTargetInfo_MoleculeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType getPCAssayTargetInfo_MoleculeType() {
        return pcAssayTargetInfo_MoleculeType;
    }

    /**
     * ����pcAssayTargetInfo_MoleculeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType }
     */
    public void setPCAssayTargetInfo_MoleculeType(PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType value) {
        this.pcAssayTargetInfo_MoleculeType = value;
    }

    /**
     * ��ȡpcAssayTargetInfo_Organism���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayTargetInfo.PCAssayTargetInfo_Organism }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_Organism getPCAssayTargetInfo_Organism() {
        return pcAssayTargetInfo_Organism;
    }

    /**
     * ����pcAssayTargetInfo_Organism���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayTargetInfo.PCAssayTargetInfo_Organism }
     */
    public void setPCAssayTargetInfo_Organism(PCAssayTargetInfo.PCAssayTargetInfo_Organism value) {
        this.pcAssayTargetInfo_Organism = value;
    }

    /**
     * ��ȡpcAssayTargetInfo_Descr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayTargetInfo_Descr() {
        return pcAssayTargetInfo_Descr;
    }

    /**
     * ����pcAssayTargetInfo_Descr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayTargetInfo_Descr(String value) {
        this.pcAssayTargetInfo_Descr = value;
    }

    /**
     * ��ȡpcAssayTargetInfo_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayTargetInfo.PCAssayTargetInfo_Comment }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_Comment getPCAssayTargetInfo_Comment() {
        return pcAssayTargetInfo_Comment;
    }

    /**
     * ����pcAssayTargetInfo_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayTargetInfo.PCAssayTargetInfo_Comment }
     */
    public void setPCAssayTargetInfo_Comment(PCAssayTargetInfo.PCAssayTargetInfo_Comment value) {
        this.pcAssayTargetInfo_Comment = value;
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
     *         &lt;element name="PC-AssayTargetInfo_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayTargetInfo_Comment_E"
    })
    public static class PCAssayTargetInfo_Comment {

        @XmlElement(name = "PC-AssayTargetInfo_comment_E")
        protected List<String> pcAssayTargetInfo_Comment_E;

        /**
         * Gets the value of the pcAssayTargetInfoCommentE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayTargetInfoCommentE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayTargetInfo_Comment_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayTargetInfo_Comment_E() {
            if (pcAssayTargetInfo_Comment_E == null) {
                pcAssayTargetInfo_Comment_E = new ArrayList<String>();
            }
            return this.pcAssayTargetInfo_Comment_E;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value" default="protein">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="protein"/>
     *             &lt;enumeration value="dna"/>
     *             &lt;enumeration value="rna"/>
     *             &lt;enumeration value="gene"/>
     *             &lt;enumeration value="biosystem"/>
     *             &lt;enumeration value="other"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class PCAssayTargetInfo_MoleculeType {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String intValue;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * ��ȡintValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIntValue() {
            if (intValue == null) {
                return "protein";
            } else {
                return intValue;
            }
        }

        /**
         * ����intValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIntValue(String value) {
            this.intValue = value;
        }

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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}BioSource"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "bioSource"
    })
    public static class PCAssayTargetInfo_Organism {

        @XmlElement(name = "BioSource", required = true)
        protected BioSource bioSource;

        /**
         * ��ȡbioSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link BioSource }
         */
        public BioSource getBioSource() {
            return bioSource;
        }

        /**
         * ����bioSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BioSource }
         */
        public void setBioSource(BioSource value) {
            this.bioSource = value;
        }

    }

}
