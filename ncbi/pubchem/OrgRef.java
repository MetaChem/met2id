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
 *         &lt;element name="Org-ref_taxname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Org-ref_common" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Org-ref_mod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Org-ref_mod_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Org-ref_db" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Org-ref_syn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Org-ref_syn_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Org-ref_orgname" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}OrgName"/>
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
        "orgRef_Taxname",
        "orgRef_Common",
        "orgRef_Mod",
        "orgRef_Db",
        "orgRef_Syn",
        "orgRef_Orgname"
})
@XmlRootElement(name = "Org-ref")
public class OrgRef {

    @XmlElement(name = "Org-ref_taxname")
    protected String orgRef_Taxname;
    @XmlElement(name = "Org-ref_common")
    protected String orgRef_Common;
    @XmlElement(name = "Org-ref_mod")
    protected OrgRef.OrgRef_Mod orgRef_Mod;
    @XmlElement(name = "Org-ref_db")
    protected OrgRef.OrgRef_Db orgRef_Db;
    @XmlElement(name = "Org-ref_syn")
    protected OrgRef.OrgRef_Syn orgRef_Syn;
    @XmlElement(name = "Org-ref_orgname")
    protected OrgRef.OrgRef_Orgname orgRef_Orgname;

    /**
     * ��ȡorgRef_Taxname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgRef_Taxname() {
        return orgRef_Taxname;
    }

    /**
     * ����orgRef_Taxname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgRef_Taxname(String value) {
        this.orgRef_Taxname = value;
    }

    /**
     * ��ȡorgRef_Common���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgRef_Common() {
        return orgRef_Common;
    }

    /**
     * ����orgRef_Common���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgRef_Common(String value) {
        this.orgRef_Common = value;
    }

    /**
     * ��ȡorgRef_Mod���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgRef.OrgRef_Mod }
     */
    public OrgRef.OrgRef_Mod getOrgRef_Mod() {
        return orgRef_Mod;
    }

    /**
     * ����orgRef_Mod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgRef.OrgRef_Mod }
     */
    public void setOrgRef_Mod(OrgRef.OrgRef_Mod value) {
        this.orgRef_Mod = value;
    }

    /**
     * ��ȡorgRef_Db���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgRef.OrgRef_Db }
     */
    public OrgRef.OrgRef_Db getOrgRef_Db() {
        return orgRef_Db;
    }

    /**
     * ����orgRef_Db���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgRef.OrgRef_Db }
     */
    public void setOrgRef_Db(OrgRef.OrgRef_Db value) {
        this.orgRef_Db = value;
    }

    /**
     * ��ȡorgRef_Syn���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgRef.OrgRef_Syn }
     */
    public OrgRef.OrgRef_Syn getOrgRef_Syn() {
        return orgRef_Syn;
    }

    /**
     * ����orgRef_Syn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgRef.OrgRef_Syn }
     */
    public void setOrgRef_Syn(OrgRef.OrgRef_Syn value) {
        this.orgRef_Syn = value;
    }

    /**
     * ��ȡorgRef_Orgname���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgRef.OrgRef_Orgname }
     */
    public OrgRef.OrgRef_Orgname getOrgRef_Orgname() {
        return orgRef_Orgname;
    }

    /**
     * ����orgRef_Orgname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgRef.OrgRef_Orgname }
     */
    public void setOrgRef_Orgname(OrgRef.OrgRef_Orgname value) {
        this.orgRef_Orgname = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dbtag"
    })
    public static class OrgRef_Db {

        @XmlElement(name = "Dbtag")
        protected List<Dbtag> dbtag;

        /**
         * Gets the value of the dbtag property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dbtag property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDbtag().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dbtag }
         */
        public List<Dbtag> getDbtag() {
            if (dbtag == null) {
                dbtag = new ArrayList<Dbtag>();
            }
            return this.dbtag;
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
     *         &lt;element name="Org-ref_mod_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgRef_Mod_E"
    })
    public static class OrgRef_Mod {

        @XmlElement(name = "Org-ref_mod_E")
        protected List<String> orgRef_Mod_E;

        /**
         * Gets the value of the orgRefModE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgRefModE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrgRef_Mod_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getOrgRef_Mod_E() {
            if (orgRef_Mod_E == null) {
                orgRef_Mod_E = new ArrayList<String>();
            }
            return this.orgRef_Mod_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}OrgName"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgName"
    })
    public static class OrgRef_Orgname {

        @XmlElement(name = "OrgName", required = true)
        protected OrgName orgName;

        /**
         * ��ȡorgName���Ե�ֵ��
         *
         * @return possible object is
         * {@link OrgName }
         */
        public OrgName getOrgName() {
            return orgName;
        }

        /**
         * ����orgName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OrgName }
         */
        public void setOrgName(OrgName value) {
            this.orgName = value;
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
     *         &lt;element name="Org-ref_syn_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgRef_Syn_E"
    })
    public static class OrgRef_Syn {

        @XmlElement(name = "Org-ref_syn_E")
        protected List<String> orgRef_Syn_E;

        /**
         * Gets the value of the orgRefSynE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgRefSynE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrgRef_Syn_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getOrgRef_Syn_E() {
            if (orgRef_Syn_E == null) {
                orgRef_Syn_E = new ArrayList<String>();
            }
            return this.orgRef_Syn_E;
        }

    }

}
