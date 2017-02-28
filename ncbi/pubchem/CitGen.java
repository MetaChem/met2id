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
 *       &lt;sequence>
 *         &lt;element name="Cit-gen_cit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-gen_authors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-gen_muid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Cit-gen_journal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-gen_volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-gen_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-gen_pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-gen_date" minOccurs="0">
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
 *         &lt;element name="Cit-gen_serial-number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Cit-gen_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-gen_pmid" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "citGen_Cit",
        "citGen_Authors",
        "citGen_Muid",
        "citGen_Journal",
        "citGen_Volume",
        "citGen_Issue",
        "citGen_Pages",
        "citGen_Date",
        "citGen_SerialNumber",
        "citGen_Title",
        "citGen_Pmid"
})
@XmlRootElement(name = "Cit-gen")
public class CitGen {

    @XmlElement(name = "Cit-gen_cit")
    protected String citGen_Cit;
    @XmlElement(name = "Cit-gen_authors")
    protected CitGen.CitGen_Authors citGen_Authors;
    @XmlElement(name = "Cit-gen_muid")
    protected BigInteger citGen_Muid;
    @XmlElement(name = "Cit-gen_journal")
    protected CitGen.CitGen_Journal citGen_Journal;
    @XmlElement(name = "Cit-gen_volume")
    protected String citGen_Volume;
    @XmlElement(name = "Cit-gen_issue")
    protected String citGen_Issue;
    @XmlElement(name = "Cit-gen_pages")
    protected String citGen_Pages;
    @XmlElement(name = "Cit-gen_date")
    protected CitGen.CitGen_Date citGen_Date;
    @XmlElement(name = "Cit-gen_serial-number")
    protected BigInteger citGen_SerialNumber;
    @XmlElement(name = "Cit-gen_title")
    protected String citGen_Title;
    @XmlElement(name = "Cit-gen_pmid")
    protected CitGen.CitGen_Pmid citGen_Pmid;

    /**
     * ��ȡcitGen_Cit���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitGen_Cit() {
        return citGen_Cit;
    }

    /**
     * ����citGen_Cit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitGen_Cit(String value) {
        this.citGen_Cit = value;
    }

    /**
     * ��ȡcitGen_Authors���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitGen.CitGen_Authors }
     */
    public CitGen.CitGen_Authors getCitGen_Authors() {
        return citGen_Authors;
    }

    /**
     * ����citGen_Authors���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitGen.CitGen_Authors }
     */
    public void setCitGen_Authors(CitGen.CitGen_Authors value) {
        this.citGen_Authors = value;
    }

    /**
     * ��ȡcitGen_Muid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCitGen_Muid() {
        return citGen_Muid;
    }

    /**
     * ����citGen_Muid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCitGen_Muid(BigInteger value) {
        this.citGen_Muid = value;
    }

    /**
     * ��ȡcitGen_Journal���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitGen.CitGen_Journal }
     */
    public CitGen.CitGen_Journal getCitGen_Journal() {
        return citGen_Journal;
    }

    /**
     * ����citGen_Journal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitGen.CitGen_Journal }
     */
    public void setCitGen_Journal(CitGen.CitGen_Journal value) {
        this.citGen_Journal = value;
    }

    /**
     * ��ȡcitGen_Volume���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitGen_Volume() {
        return citGen_Volume;
    }

    /**
     * ����citGen_Volume���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitGen_Volume(String value) {
        this.citGen_Volume = value;
    }

    /**
     * ��ȡcitGen_Issue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitGen_Issue() {
        return citGen_Issue;
    }

    /**
     * ����citGen_Issue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitGen_Issue(String value) {
        this.citGen_Issue = value;
    }

    /**
     * ��ȡcitGen_Pages���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitGen_Pages() {
        return citGen_Pages;
    }

    /**
     * ����citGen_Pages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitGen_Pages(String value) {
        this.citGen_Pages = value;
    }

    /**
     * ��ȡcitGen_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitGen.CitGen_Date }
     */
    public CitGen.CitGen_Date getCitGen_Date() {
        return citGen_Date;
    }

    /**
     * ����citGen_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitGen.CitGen_Date }
     */
    public void setCitGen_Date(CitGen.CitGen_Date value) {
        this.citGen_Date = value;
    }

    /**
     * ��ȡcitGen_SerialNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCitGen_SerialNumber() {
        return citGen_SerialNumber;
    }

    /**
     * ����citGen_SerialNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCitGen_SerialNumber(BigInteger value) {
        this.citGen_SerialNumber = value;
    }

    /**
     * ��ȡcitGen_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitGen_Title() {
        return citGen_Title;
    }

    /**
     * ����citGen_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitGen_Title(String value) {
        this.citGen_Title = value;
    }

    /**
     * ��ȡcitGen_Pmid���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitGen.CitGen_Pmid }
     */
    public CitGen.CitGen_Pmid getCitGen_Pmid() {
        return citGen_Pmid;
    }

    /**
     * ����citGen_Pmid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitGen.CitGen_Pmid }
     */
    public void setCitGen_Pmid(CitGen.CitGen_Pmid value) {
        this.citGen_Pmid = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authList"
    })
    public static class CitGen_Authors {

        @XmlElement(name = "Auth-list", required = true)
        protected AuthList authList;

        /**
         * ��ȡauthList���Ե�ֵ��
         *
         * @return possible object is
         * {@link AuthList }
         */
        public AuthList getAuthList() {
            return authList;
        }

        /**
         * ����authList���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AuthList }
         */
        public void setAuthList(AuthList value) {
            this.authList = value;
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
    public static class CitGen_Date {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title"
    })
    public static class CitGen_Journal {

        @XmlElement(name = "Title", required = true)
        protected Title title;

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link Title }
         */
        public Title getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Title }
         */
        public void setTitle(Title value) {
            this.title = value;
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
    public static class CitGen_Pmid {

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

}
