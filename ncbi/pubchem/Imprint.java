//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Imprint_date">
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
 *         &lt;element name="Imprint_volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_pub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Affil"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Imprint_cprt" minOccurs="0">
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
 *         &lt;element name="Imprint_part-sup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Imprint_prepub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="submitted"/>
 *                       &lt;enumeration value="in-press"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Imprint_part-supi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imprint_retract" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}CitRetract"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Imprint_pubstatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatus"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Imprint_history" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatusDateSet"/>
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
        "imprint_Date",
        "imprint_Volume",
        "imprint_Issue",
        "imprint_Pages",
        "imprint_Section",
        "imprint_Pub",
        "imprint_Cprt",
        "imprint_PartSup",
        "imprint_Language",
        "imprint_Prepub",
        "imprint_PartSupi",
        "imprint_Retract",
        "imprint_Pubstatus",
        "imprint_History"
})
@XmlRootElement(name = "Imprint")
public class Imprint {

    @XmlElement(name = "Imprint_date", required = true)
    protected Imprint.Imprint_Date imprint_Date;
    @XmlElement(name = "Imprint_volume")
    protected String imprint_Volume;
    @XmlElement(name = "Imprint_issue")
    protected String imprint_Issue;
    @XmlElement(name = "Imprint_pages")
    protected String imprint_Pages;
    @XmlElement(name = "Imprint_section")
    protected String imprint_Section;
    @XmlElement(name = "Imprint_pub")
    protected Imprint.Imprint_Pub imprint_Pub;
    @XmlElement(name = "Imprint_cprt")
    protected Imprint.Imprint_Cprt imprint_Cprt;
    @XmlElement(name = "Imprint_part-sup")
    protected String imprint_PartSup;
    @XmlElement(name = "Imprint_language", required = true, defaultValue = "ENG")
    protected String imprint_Language;
    @XmlElement(name = "Imprint_prepub")
    protected Imprint.Imprint_Prepub imprint_Prepub;
    @XmlElement(name = "Imprint_part-supi")
    protected String imprint_PartSupi;
    @XmlElement(name = "Imprint_retract")
    protected Imprint.Imprint_Retract imprint_Retract;
    @XmlElement(name = "Imprint_pubstatus")
    protected Imprint.Imprint_Pubstatus imprint_Pubstatus;
    @XmlElement(name = "Imprint_history")
    protected Imprint.Imprint_History imprint_History;

    /**
     * ��ȡimprint_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Date }
     */
    public Imprint.Imprint_Date getImprint_Date() {
        return imprint_Date;
    }

    /**
     * ����imprint_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Date }
     */
    public void setImprint_Date(Imprint.Imprint_Date value) {
        this.imprint_Date = value;
    }

    /**
     * ��ȡimprint_Volume���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_Volume() {
        return imprint_Volume;
    }

    /**
     * ����imprint_Volume���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_Volume(String value) {
        this.imprint_Volume = value;
    }

    /**
     * ��ȡimprint_Issue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_Issue() {
        return imprint_Issue;
    }

    /**
     * ����imprint_Issue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_Issue(String value) {
        this.imprint_Issue = value;
    }

    /**
     * ��ȡimprint_Pages���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_Pages() {
        return imprint_Pages;
    }

    /**
     * ����imprint_Pages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_Pages(String value) {
        this.imprint_Pages = value;
    }

    /**
     * ��ȡimprint_Section���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_Section() {
        return imprint_Section;
    }

    /**
     * ����imprint_Section���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_Section(String value) {
        this.imprint_Section = value;
    }

    /**
     * ��ȡimprint_Pub���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Pub }
     */
    public Imprint.Imprint_Pub getImprint_Pub() {
        return imprint_Pub;
    }

    /**
     * ����imprint_Pub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Pub }
     */
    public void setImprint_Pub(Imprint.Imprint_Pub value) {
        this.imprint_Pub = value;
    }

    /**
     * ��ȡimprint_Cprt���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Cprt }
     */
    public Imprint.Imprint_Cprt getImprint_Cprt() {
        return imprint_Cprt;
    }

    /**
     * ����imprint_Cprt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Cprt }
     */
    public void setImprint_Cprt(Imprint.Imprint_Cprt value) {
        this.imprint_Cprt = value;
    }

    /**
     * ��ȡimprint_PartSup���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_PartSup() {
        return imprint_PartSup;
    }

    /**
     * ����imprint_PartSup���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_PartSup(String value) {
        this.imprint_PartSup = value;
    }

    /**
     * ��ȡimprint_Language���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_Language() {
        return imprint_Language;
    }

    /**
     * ����imprint_Language���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_Language(String value) {
        this.imprint_Language = value;
    }

    /**
     * ��ȡimprint_Prepub���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Prepub }
     */
    public Imprint.Imprint_Prepub getImprint_Prepub() {
        return imprint_Prepub;
    }

    /**
     * ����imprint_Prepub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Prepub }
     */
    public void setImprint_Prepub(Imprint.Imprint_Prepub value) {
        this.imprint_Prepub = value;
    }

    /**
     * ��ȡimprint_PartSupi���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImprint_PartSupi() {
        return imprint_PartSupi;
    }

    /**
     * ����imprint_PartSupi���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImprint_PartSupi(String value) {
        this.imprint_PartSupi = value;
    }

    /**
     * ��ȡimprint_Retract���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Retract }
     */
    public Imprint.Imprint_Retract getImprint_Retract() {
        return imprint_Retract;
    }

    /**
     * ����imprint_Retract���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Retract }
     */
    public void setImprint_Retract(Imprint.Imprint_Retract value) {
        this.imprint_Retract = value;
    }

    /**
     * ��ȡimprint_Pubstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_Pubstatus }
     */
    public Imprint.Imprint_Pubstatus getImprint_Pubstatus() {
        return imprint_Pubstatus;
    }

    /**
     * ����imprint_Pubstatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_Pubstatus }
     */
    public void setImprint_Pubstatus(Imprint.Imprint_Pubstatus value) {
        this.imprint_Pubstatus = value;
    }

    /**
     * ��ȡimprint_History���Ե�ֵ��
     *
     * @return possible object is
     * {@link Imprint.Imprint_History }
     */
    public Imprint.Imprint_History getImprint_History() {
        return imprint_History;
    }

    /**
     * ����imprint_History���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Imprint.Imprint_History }
     */
    public void setImprint_History(Imprint.Imprint_History value) {
        this.imprint_History = value;
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
    public static class Imprint_Cprt {

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
    public static class Imprint_Date {

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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatusDateSet"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubStatusDateSet"
    })
    public static class Imprint_History {

        @XmlElement(name = "PubStatusDateSet", required = true)
        protected PubStatusDateSet pubStatusDateSet;

        /**
         * ��ȡpubStatusDateSet���Ե�ֵ��
         *
         * @return possible object is
         * {@link PubStatusDateSet }
         */
        public PubStatusDateSet getPubStatusDateSet() {
            return pubStatusDateSet;
        }

        /**
         * ����pubStatusDateSet���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PubStatusDateSet }
         */
        public void setPubStatusDateSet(PubStatusDateSet value) {
            this.pubStatusDateSet = value;
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
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="submitted"/>
     *             &lt;enumeration value="in-press"/>
     *             &lt;enumeration value="other"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Imprint_Prepub {

        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Affil"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "affil"
    })
    public static class Imprint_Pub {

        @XmlElement(name = "Affil", required = true)
        protected Affil affil;

        /**
         * ��ȡaffil���Ե�ֵ��
         *
         * @return possible object is
         * {@link Affil }
         */
        public Affil getAffil() {
            return affil;
        }

        /**
         * ����affil���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Affil }
         */
        public void setAffil(Affil value) {
            this.affil = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatus"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubStatus"
    })
    public static class Imprint_Pubstatus {

        @XmlElement(name = "PubStatus", required = true)
        protected PubStatus pubStatus;

        /**
         * ��ȡpubStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link PubStatus }
         */
        public PubStatus getPubStatus() {
            return pubStatus;
        }

        /**
         * ����pubStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PubStatus }
         */
        public void setPubStatus(PubStatus value) {
            this.pubStatus = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}CitRetract"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citRetract"
    })
    public static class Imprint_Retract {

        @XmlElement(name = "CitRetract", required = true)
        protected CitRetract citRetract;

        /**
         * ��ȡcitRetract���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitRetract }
         */
        public CitRetract getCitRetract() {
            return citRetract;
        }

        /**
         * ����citRetract���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitRetract }
         */
        public void setCitRetract(CitRetract value) {
            this.citRetract = value;
        }

    }

}
