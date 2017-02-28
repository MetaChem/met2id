//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *         &lt;element name="Cit-pat_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cit-pat_authors">
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
 *         &lt;element name="Cit-pat_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cit-pat_doc-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cit-pat_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-pat_date-issue" minOccurs="0">
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
 *         &lt;element name="Cit-pat_class" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Cit-pat_class_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-pat_app-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-pat_app-date" minOccurs="0">
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
 *         &lt;element name="Cit-pat_applicants" minOccurs="0">
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
 *         &lt;element name="Cit-pat_assignees" minOccurs="0">
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
 *         &lt;element name="Cit-pat_priority" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Patent-priority"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-pat_abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "citPat_Title",
        "citPat_Authors",
        "citPat_Country",
        "citPat_DocType",
        "citPat_Number",
        "citPat_DateIssue",
        "citPat_Class",
        "citPat_AppNumber",
        "citPat_AppDate",
        "citPat_Applicants",
        "citPat_Assignees",
        "citPat_Priority",
        "citPat_Abstract"
})
@XmlRootElement(name = "Cit-pat")
public class CitPat {

    @XmlElement(name = "Cit-pat_title", required = true)
    protected String citPat_Title;
    @XmlElement(name = "Cit-pat_authors", required = true)
    protected CitPat.CitPat_Authors citPat_Authors;
    @XmlElement(name = "Cit-pat_country", required = true)
    protected String citPat_Country;
    @XmlElement(name = "Cit-pat_doc-type", required = true)
    protected String citPat_DocType;
    @XmlElement(name = "Cit-pat_number")
    protected String citPat_Number;
    @XmlElement(name = "Cit-pat_date-issue")
    protected CitPat.CitPat_DateIssue citPat_DateIssue;
    @XmlElement(name = "Cit-pat_class")
    protected CitPat.CitPat_Class citPat_Class;
    @XmlElement(name = "Cit-pat_app-number")
    protected String citPat_AppNumber;
    @XmlElement(name = "Cit-pat_app-date")
    protected CitPat.CitPat_AppDate citPat_AppDate;
    @XmlElement(name = "Cit-pat_applicants")
    protected CitPat.CitPat_Applicants citPat_Applicants;
    @XmlElement(name = "Cit-pat_assignees")
    protected CitPat.CitPat_Assignees citPat_Assignees;
    @XmlElement(name = "Cit-pat_priority")
    protected CitPat.CitPat_Priority citPat_Priority;
    @XmlElement(name = "Cit-pat_abstract")
    protected String citPat_Abstract;

    /**
     * ��ȡcitPat_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_Title() {
        return citPat_Title;
    }

    /**
     * ����citPat_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_Title(String value) {
        this.citPat_Title = value;
    }

    /**
     * ��ȡcitPat_Authors���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_Authors }
     */
    public CitPat.CitPat_Authors getCitPat_Authors() {
        return citPat_Authors;
    }

    /**
     * ����citPat_Authors���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_Authors }
     */
    public void setCitPat_Authors(CitPat.CitPat_Authors value) {
        this.citPat_Authors = value;
    }

    /**
     * ��ȡcitPat_Country���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_Country() {
        return citPat_Country;
    }

    /**
     * ����citPat_Country���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_Country(String value) {
        this.citPat_Country = value;
    }

    /**
     * ��ȡcitPat_DocType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_DocType() {
        return citPat_DocType;
    }

    /**
     * ����citPat_DocType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_DocType(String value) {
        this.citPat_DocType = value;
    }

    /**
     * ��ȡcitPat_Number���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_Number() {
        return citPat_Number;
    }

    /**
     * ����citPat_Number���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_Number(String value) {
        this.citPat_Number = value;
    }

    /**
     * ��ȡcitPat_DateIssue���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_DateIssue }
     */
    public CitPat.CitPat_DateIssue getCitPat_DateIssue() {
        return citPat_DateIssue;
    }

    /**
     * ����citPat_DateIssue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_DateIssue }
     */
    public void setCitPat_DateIssue(CitPat.CitPat_DateIssue value) {
        this.citPat_DateIssue = value;
    }

    /**
     * ��ȡcitPat_Class���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_Class }
     */
    public CitPat.CitPat_Class getCitPat_Class() {
        return citPat_Class;
    }

    /**
     * ����citPat_Class���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_Class }
     */
    public void setCitPat_Class(CitPat.CitPat_Class value) {
        this.citPat_Class = value;
    }

    /**
     * ��ȡcitPat_AppNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_AppNumber() {
        return citPat_AppNumber;
    }

    /**
     * ����citPat_AppNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_AppNumber(String value) {
        this.citPat_AppNumber = value;
    }

    /**
     * ��ȡcitPat_AppDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_AppDate }
     */
    public CitPat.CitPat_AppDate getCitPat_AppDate() {
        return citPat_AppDate;
    }

    /**
     * ����citPat_AppDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_AppDate }
     */
    public void setCitPat_AppDate(CitPat.CitPat_AppDate value) {
        this.citPat_AppDate = value;
    }

    /**
     * ��ȡcitPat_Applicants���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_Applicants }
     */
    public CitPat.CitPat_Applicants getCitPat_Applicants() {
        return citPat_Applicants;
    }

    /**
     * ����citPat_Applicants���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_Applicants }
     */
    public void setCitPat_Applicants(CitPat.CitPat_Applicants value) {
        this.citPat_Applicants = value;
    }

    /**
     * ��ȡcitPat_Assignees���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_Assignees }
     */
    public CitPat.CitPat_Assignees getCitPat_Assignees() {
        return citPat_Assignees;
    }

    /**
     * ����citPat_Assignees���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_Assignees }
     */
    public void setCitPat_Assignees(CitPat.CitPat_Assignees value) {
        this.citPat_Assignees = value;
    }

    /**
     * ��ȡcitPat_Priority���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitPat.CitPat_Priority }
     */
    public CitPat.CitPat_Priority getCitPat_Priority() {
        return citPat_Priority;
    }

    /**
     * ����citPat_Priority���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitPat.CitPat_Priority }
     */
    public void setCitPat_Priority(CitPat.CitPat_Priority value) {
        this.citPat_Priority = value;
    }

    /**
     * ��ȡcitPat_Abstract���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitPat_Abstract() {
        return citPat_Abstract;
    }

    /**
     * ����citPat_Abstract���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitPat_Abstract(String value) {
        this.citPat_Abstract = value;
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
    public static class CitPat_AppDate {

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
    public static class CitPat_Applicants {

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
    public static class CitPat_Assignees {

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
    public static class CitPat_Authors {

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Cit-pat_class_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citPat_Class_E"
    })
    public static class CitPat_Class {

        @XmlElement(name = "Cit-pat_class_E")
        protected List<String> citPat_Class_E;

        /**
         * Gets the value of the citPatClassE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citPatClassE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitPat_Class_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCitPat_Class_E() {
            if (citPat_Class_E == null) {
                citPat_Class_E = new ArrayList<String>();
            }
            return this.citPat_Class_E;
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
    public static class CitPat_DateIssue {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Patent-priority"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "patentPriority"
    })
    public static class CitPat_Priority {

        @XmlElement(name = "Patent-priority")
        protected List<PatentPriority> patentPriority;

        /**
         * Gets the value of the patentPriority property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patentPriority property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatentPriority().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PatentPriority }
         */
        public List<PatentPriority> getPatentPriority() {
            if (patentPriority == null) {
                patentPriority = new ArrayList<PatentPriority>();
            }
            return this.patentPriority;
        }

    }

}
