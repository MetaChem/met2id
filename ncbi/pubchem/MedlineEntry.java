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
 *         &lt;element name="Medline-entry_uid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Medline-entry_em">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_cit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-art"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Medline-entry_mesh" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-mesh"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_substance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-rn"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_xref" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-si"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_idnum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Medline-entry_idnum_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_gene" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Medline-entry_gene_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_pmid" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubMedId"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_pub-type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Medline-entry_pub-type_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_mlfield" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-field"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-entry_status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="medline">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="publisher"/>
 *                       &lt;enumeration value="premedline"/>
 *                       &lt;enumeration value="medline"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
        "medlineEntry_Uid",
        "medlineEntry_Em",
        "medlineEntry_Cit",
        "medlineEntry_Abstract",
        "medlineEntry_Mesh",
        "medlineEntry_Substance",
        "medlineEntry_Xref",
        "medlineEntry_Idnum",
        "medlineEntry_Gene",
        "medlineEntry_Pmid",
        "medlineEntry_PubType",
        "medlineEntry_Mlfield",
        "medlineEntry_Status"
})
@XmlRootElement(name = "Medline-entry")
public class MedlineEntry {

    @XmlElement(name = "Medline-entry_uid")
    protected BigInteger medlineEntry_Uid;
    @XmlElement(name = "Medline-entry_em", required = true)
    protected MedlineEntry.MedlineEntry_Em medlineEntry_Em;
    @XmlElement(name = "Medline-entry_cit", required = true)
    protected MedlineEntry.MedlineEntry_Cit medlineEntry_Cit;
    @XmlElement(name = "Medline-entry_abstract")
    protected String medlineEntry_Abstract;
    @XmlElement(name = "Medline-entry_mesh")
    protected MedlineEntry.MedlineEntry_Mesh medlineEntry_Mesh;
    @XmlElement(name = "Medline-entry_substance")
    protected MedlineEntry.MedlineEntry_Substance medlineEntry_Substance;
    @XmlElement(name = "Medline-entry_xref")
    protected MedlineEntry.MedlineEntry_Xref medlineEntry_Xref;
    @XmlElement(name = "Medline-entry_idnum")
    protected MedlineEntry.MedlineEntry_Idnum medlineEntry_Idnum;
    @XmlElement(name = "Medline-entry_gene")
    protected MedlineEntry.MedlineEntry_Gene medlineEntry_Gene;
    @XmlElement(name = "Medline-entry_pmid")
    protected MedlineEntry.MedlineEntry_Pmid medlineEntry_Pmid;
    @XmlElement(name = "Medline-entry_pub-type")
    protected MedlineEntry.MedlineEntry_PubType medlineEntry_PubType;
    @XmlElement(name = "Medline-entry_mlfield")
    protected MedlineEntry.MedlineEntry_Mlfield medlineEntry_Mlfield;
    @XmlElement(name = "Medline-entry_status")
    protected MedlineEntry.MedlineEntry_Status medlineEntry_Status;

    /**
     * ��ȡmedlineEntry_Uid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMedlineEntry_Uid() {
        return medlineEntry_Uid;
    }

    /**
     * ����medlineEntry_Uid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMedlineEntry_Uid(BigInteger value) {
        this.medlineEntry_Uid = value;
    }

    /**
     * ��ȡmedlineEntry_Em���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Em }
     */
    public MedlineEntry.MedlineEntry_Em getMedlineEntry_Em() {
        return medlineEntry_Em;
    }

    /**
     * ����medlineEntry_Em���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Em }
     */
    public void setMedlineEntry_Em(MedlineEntry.MedlineEntry_Em value) {
        this.medlineEntry_Em = value;
    }

    /**
     * ��ȡmedlineEntry_Cit���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Cit }
     */
    public MedlineEntry.MedlineEntry_Cit getMedlineEntry_Cit() {
        return medlineEntry_Cit;
    }

    /**
     * ����medlineEntry_Cit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Cit }
     */
    public void setMedlineEntry_Cit(MedlineEntry.MedlineEntry_Cit value) {
        this.medlineEntry_Cit = value;
    }

    /**
     * ��ȡmedlineEntry_Abstract���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineEntry_Abstract() {
        return medlineEntry_Abstract;
    }

    /**
     * ����medlineEntry_Abstract���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineEntry_Abstract(String value) {
        this.medlineEntry_Abstract = value;
    }

    /**
     * ��ȡmedlineEntry_Mesh���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Mesh }
     */
    public MedlineEntry.MedlineEntry_Mesh getMedlineEntry_Mesh() {
        return medlineEntry_Mesh;
    }

    /**
     * ����medlineEntry_Mesh���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Mesh }
     */
    public void setMedlineEntry_Mesh(MedlineEntry.MedlineEntry_Mesh value) {
        this.medlineEntry_Mesh = value;
    }

    /**
     * ��ȡmedlineEntry_Substance���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Substance }
     */
    public MedlineEntry.MedlineEntry_Substance getMedlineEntry_Substance() {
        return medlineEntry_Substance;
    }

    /**
     * ����medlineEntry_Substance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Substance }
     */
    public void setMedlineEntry_Substance(MedlineEntry.MedlineEntry_Substance value) {
        this.medlineEntry_Substance = value;
    }

    /**
     * ��ȡmedlineEntry_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Xref }
     */
    public MedlineEntry.MedlineEntry_Xref getMedlineEntry_Xref() {
        return medlineEntry_Xref;
    }

    /**
     * ����medlineEntry_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Xref }
     */
    public void setMedlineEntry_Xref(MedlineEntry.MedlineEntry_Xref value) {
        this.medlineEntry_Xref = value;
    }

    /**
     * ��ȡmedlineEntry_Idnum���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Idnum }
     */
    public MedlineEntry.MedlineEntry_Idnum getMedlineEntry_Idnum() {
        return medlineEntry_Idnum;
    }

    /**
     * ����medlineEntry_Idnum���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Idnum }
     */
    public void setMedlineEntry_Idnum(MedlineEntry.MedlineEntry_Idnum value) {
        this.medlineEntry_Idnum = value;
    }

    /**
     * ��ȡmedlineEntry_Gene���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Gene }
     */
    public MedlineEntry.MedlineEntry_Gene getMedlineEntry_Gene() {
        return medlineEntry_Gene;
    }

    /**
     * ����medlineEntry_Gene���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Gene }
     */
    public void setMedlineEntry_Gene(MedlineEntry.MedlineEntry_Gene value) {
        this.medlineEntry_Gene = value;
    }

    /**
     * ��ȡmedlineEntry_Pmid���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Pmid }
     */
    public MedlineEntry.MedlineEntry_Pmid getMedlineEntry_Pmid() {
        return medlineEntry_Pmid;
    }

    /**
     * ����medlineEntry_Pmid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Pmid }
     */
    public void setMedlineEntry_Pmid(MedlineEntry.MedlineEntry_Pmid value) {
        this.medlineEntry_Pmid = value;
    }

    /**
     * ��ȡmedlineEntry_PubType���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_PubType }
     */
    public MedlineEntry.MedlineEntry_PubType getMedlineEntry_PubType() {
        return medlineEntry_PubType;
    }

    /**
     * ����medlineEntry_PubType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_PubType }
     */
    public void setMedlineEntry_PubType(MedlineEntry.MedlineEntry_PubType value) {
        this.medlineEntry_PubType = value;
    }

    /**
     * ��ȡmedlineEntry_Mlfield���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Mlfield }
     */
    public MedlineEntry.MedlineEntry_Mlfield getMedlineEntry_Mlfield() {
        return medlineEntry_Mlfield;
    }

    /**
     * ����medlineEntry_Mlfield���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Mlfield }
     */
    public void setMedlineEntry_Mlfield(MedlineEntry.MedlineEntry_Mlfield value) {
        this.medlineEntry_Mlfield = value;
    }

    /**
     * ��ȡmedlineEntry_Status���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineEntry.MedlineEntry_Status }
     */
    public MedlineEntry.MedlineEntry_Status getMedlineEntry_Status() {
        return medlineEntry_Status;
    }

    /**
     * ����medlineEntry_Status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineEntry.MedlineEntry_Status }
     */
    public void setMedlineEntry_Status(MedlineEntry.MedlineEntry_Status value) {
        this.medlineEntry_Status = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-art"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citArt"
    })
    public static class MedlineEntry_Cit {

        @XmlElement(name = "Cit-art", required = true)
        protected CitArt citArt;

        /**
         * ��ȡcitArt���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitArt }
         */
        public CitArt getCitArt() {
            return citArt;
        }

        /**
         * ����citArt���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitArt }
         */
        public void setCitArt(CitArt value) {
            this.citArt = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "date"
    })
    public static class MedlineEntry_Em {

        @XmlElement(name = "Date", required = true)
        protected Date date;

        /**
         * ��ȡdate���Ե�ֵ��
         *
         * @return possible object is
         * {@link Date }
         */
        public Date getDate() {
            return date;
        }

        /**
         * ����date���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Date }
         */
        public void setDate(Date value) {
            this.date = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Medline-entry_gene_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineEntry_Gene_E"
    })
    public static class MedlineEntry_Gene {

        @XmlElement(name = "Medline-entry_gene_E")
        protected List<String> medlineEntry_Gene_E;

        /**
         * Gets the value of the medlineEntryGeneE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineEntryGeneE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineEntry_Gene_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getMedlineEntry_Gene_E() {
            if (medlineEntry_Gene_E == null) {
                medlineEntry_Gene_E = new ArrayList<String>();
            }
            return this.medlineEntry_Gene_E;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Medline-entry_idnum_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineEntry_Idnum_E"
    })
    public static class MedlineEntry_Idnum {

        @XmlElement(name = "Medline-entry_idnum_E")
        protected List<String> medlineEntry_Idnum_E;

        /**
         * Gets the value of the medlineEntryIdnumE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineEntryIdnumE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineEntry_Idnum_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getMedlineEntry_Idnum_E() {
            if (medlineEntry_Idnum_E == null) {
                medlineEntry_Idnum_E = new ArrayList<String>();
            }
            return this.medlineEntry_Idnum_E;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-mesh"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineMesh"
    })
    public static class MedlineEntry_Mesh {

        @XmlElement(name = "Medline-mesh")
        protected List<MedlineMesh> medlineMesh;

        /**
         * Gets the value of the medlineMesh property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineMesh property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineMesh().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineMesh }
         */
        public List<MedlineMesh> getMedlineMesh() {
            if (medlineMesh == null) {
                medlineMesh = new ArrayList<MedlineMesh>();
            }
            return this.medlineMesh;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-field"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineField"
    })
    public static class MedlineEntry_Mlfield {

        @XmlElement(name = "Medline-field")
        protected List<MedlineField> medlineField;

        /**
         * Gets the value of the medlineField property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineField property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineField().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineField }
         */
        public List<MedlineField> getMedlineField() {
            if (medlineField == null) {
                medlineField = new ArrayList<MedlineField>();
            }
            return this.medlineField;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubMedId"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubMedId"
    })
    public static class MedlineEntry_Pmid {

        @XmlElement(name = "PubMedId", required = true)
        protected BigInteger pubMedId;

        /**
         * ��ȡpubMedId���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPubMedId() {
            return pubMedId;
        }

        /**
         * ����pubMedId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPubMedId(BigInteger value) {
            this.pubMedId = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Medline-entry_pub-type_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineEntry_PubType_E"
    })
    public static class MedlineEntry_PubType {

        @XmlElement(name = "Medline-entry_pub-type_E")
        protected List<String> medlineEntry_PubType_E;

        /**
         * Gets the value of the medlineEntryPubTypeE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineEntryPubTypeE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineEntry_PubType_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getMedlineEntry_PubType_E() {
            if (medlineEntry_PubType_E == null) {
                medlineEntry_PubType_E = new ArrayList<String>();
            }
            return this.medlineEntry_PubType_E;
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
     *       &lt;attribute name="value" default="medline">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="publisher"/>
     *             &lt;enumeration value="premedline"/>
     *             &lt;enumeration value="medline"/>
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
    public static class MedlineEntry_Status {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String stringValue;

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
         * ��ȡstringValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStringValue() {
            if (stringValue == null) {
                return "medline";
            } else {
                return stringValue;
            }
        }

        /**
         * ����stringValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStringValue(String value) {
            this.stringValue = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-rn"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineRn"
    })
    public static class MedlineEntry_Substance {

        @XmlElement(name = "Medline-rn")
        protected List<MedlineRn> medlineRn;

        /**
         * Gets the value of the medlineRn property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineRn property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineRn().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineRn }
         */
        public List<MedlineRn> getMedlineRn() {
            if (medlineRn == null) {
                medlineRn = new ArrayList<MedlineRn>();
            }
            return this.medlineRn;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-si"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineSi"
    })
    public static class MedlineEntry_Xref {

        @XmlElement(name = "Medline-si")
        protected List<MedlineSi> medlineSi;

        /**
         * Gets the value of the medlineSi property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineSi property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineSi().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineSi }
         */
        public List<MedlineSi> getMedlineSi() {
            if (medlineSi == null) {
                medlineSi = new ArrayList<MedlineSi>();
            }
            return this.medlineSi;
        }

    }

}
