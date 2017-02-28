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
 *         &lt;element name="OrgName_name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="OrgName_name_binomial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OrgName_name_virus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrgName_name_hybrid">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}MultiOrgName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OrgName_name_namedhybrid">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OrgName_name_partial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PartialOrgName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrgName_attrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgName_mod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}OrgMod"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrgName_lineage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgName_gcode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OrgName_mgcode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OrgName_div" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "orgName_Name",
        "orgName_Attrib",
        "orgName_Mod",
        "orgName_Lineage",
        "orgName_Gcode",
        "orgName_Mgcode",
        "orgName_Div"
})
@XmlRootElement(name = "OrgName")
public class OrgName {

    @XmlElement(name = "OrgName_name")
    protected OrgName.OrgName_Name orgName_Name;
    @XmlElement(name = "OrgName_attrib")
    protected String orgName_Attrib;
    @XmlElement(name = "OrgName_mod")
    protected OrgName.OrgName_Mod orgName_Mod;
    @XmlElement(name = "OrgName_lineage")
    protected String orgName_Lineage;
    @XmlElement(name = "OrgName_gcode")
    protected BigInteger orgName_Gcode;
    @XmlElement(name = "OrgName_mgcode")
    protected BigInteger orgName_Mgcode;
    @XmlElement(name = "OrgName_div")
    protected String orgName_Div;

    /**
     * ��ȡorgName_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgName.OrgName_Name }
     */
    public OrgName.OrgName_Name getOrgName_Name() {
        return orgName_Name;
    }

    /**
     * ����orgName_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgName.OrgName_Name }
     */
    public void setOrgName_Name(OrgName.OrgName_Name value) {
        this.orgName_Name = value;
    }

    /**
     * ��ȡorgName_Attrib���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgName_Attrib() {
        return orgName_Attrib;
    }

    /**
     * ����orgName_Attrib���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgName_Attrib(String value) {
        this.orgName_Attrib = value;
    }

    /**
     * ��ȡorgName_Mod���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgName.OrgName_Mod }
     */
    public OrgName.OrgName_Mod getOrgName_Mod() {
        return orgName_Mod;
    }

    /**
     * ����orgName_Mod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgName.OrgName_Mod }
     */
    public void setOrgName_Mod(OrgName.OrgName_Mod value) {
        this.orgName_Mod = value;
    }

    /**
     * ��ȡorgName_Lineage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgName_Lineage() {
        return orgName_Lineage;
    }

    /**
     * ����orgName_Lineage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgName_Lineage(String value) {
        this.orgName_Lineage = value;
    }

    /**
     * ��ȡorgName_Gcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getOrgName_Gcode() {
        return orgName_Gcode;
    }

    /**
     * ����orgName_Gcode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setOrgName_Gcode(BigInteger value) {
        this.orgName_Gcode = value;
    }

    /**
     * ��ȡorgName_Mgcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getOrgName_Mgcode() {
        return orgName_Mgcode;
    }

    /**
     * ����orgName_Mgcode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setOrgName_Mgcode(BigInteger value) {
        this.orgName_Mgcode = value;
    }

    /**
     * ��ȡorgName_Div���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgName_Div() {
        return orgName_Div;
    }

    /**
     * ����orgName_Div���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgName_Div(String value) {
        this.orgName_Div = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}OrgMod"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgMod"
    })
    public static class OrgName_Mod {

        @XmlElement(name = "OrgMod")
        protected List<OrgMod> orgMod;

        /**
         * Gets the value of the orgMod property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgMod property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrgMod().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrgMod }
         */
        public List<OrgMod> getOrgMod() {
            if (orgMod == null) {
                orgMod = new ArrayList<OrgMod>();
            }
            return this.orgMod;
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
     *       &lt;choice>
     *         &lt;element name="OrgName_name_binomial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OrgName_name_virus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrgName_name_hybrid">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}MultiOrgName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OrgName_name_namedhybrid">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OrgName_name_partial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PartialOrgName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgName_Name_Binomial",
            "orgName_Name_Virus",
            "orgName_Name_Hybrid",
            "orgName_Name_Namedhybrid",
            "orgName_Name_Partial"
    })
    public static class OrgName_Name {

        @XmlElement(name = "OrgName_name_binomial")
        protected OrgName.OrgName_Name.OrgName_Name_Binomial orgName_Name_Binomial;
        @XmlElement(name = "OrgName_name_virus")
        protected String orgName_Name_Virus;
        @XmlElement(name = "OrgName_name_hybrid")
        protected OrgName.OrgName_Name.OrgName_Name_Hybrid orgName_Name_Hybrid;
        @XmlElement(name = "OrgName_name_namedhybrid")
        protected OrgName.OrgName_Name.OrgName_Name_Namedhybrid orgName_Name_Namedhybrid;
        @XmlElement(name = "OrgName_name_partial")
        protected OrgName.OrgName_Name.OrgName_Name_Partial orgName_Name_Partial;

        /**
         * ��ȡorgName_Name_Binomial���Ե�ֵ��
         *
         * @return possible object is
         * {@link OrgName.OrgName_Name.OrgName_Name_Binomial }
         */
        public OrgName.OrgName_Name.OrgName_Name_Binomial getOrgName_Name_Binomial() {
            return orgName_Name_Binomial;
        }

        /**
         * ����orgName_Name_Binomial���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OrgName.OrgName_Name.OrgName_Name_Binomial }
         */
        public void setOrgName_Name_Binomial(OrgName.OrgName_Name.OrgName_Name_Binomial value) {
            this.orgName_Name_Binomial = value;
        }

        /**
         * ��ȡorgName_Name_Virus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOrgName_Name_Virus() {
            return orgName_Name_Virus;
        }

        /**
         * ����orgName_Name_Virus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOrgName_Name_Virus(String value) {
            this.orgName_Name_Virus = value;
        }

        /**
         * ��ȡorgName_Name_Hybrid���Ե�ֵ��
         *
         * @return possible object is
         * {@link OrgName.OrgName_Name.OrgName_Name_Hybrid }
         */
        public OrgName.OrgName_Name.OrgName_Name_Hybrid getOrgName_Name_Hybrid() {
            return orgName_Name_Hybrid;
        }

        /**
         * ����orgName_Name_Hybrid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OrgName.OrgName_Name.OrgName_Name_Hybrid }
         */
        public void setOrgName_Name_Hybrid(OrgName.OrgName_Name.OrgName_Name_Hybrid value) {
            this.orgName_Name_Hybrid = value;
        }

        /**
         * ��ȡorgName_Name_Namedhybrid���Ե�ֵ��
         *
         * @return possible object is
         * {@link OrgName.OrgName_Name.OrgName_Name_Namedhybrid }
         */
        public OrgName.OrgName_Name.OrgName_Name_Namedhybrid getOrgName_Name_Namedhybrid() {
            return orgName_Name_Namedhybrid;
        }

        /**
         * ����orgName_Name_Namedhybrid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OrgName.OrgName_Name.OrgName_Name_Namedhybrid }
         */
        public void setOrgName_Name_Namedhybrid(OrgName.OrgName_Name.OrgName_Name_Namedhybrid value) {
            this.orgName_Name_Namedhybrid = value;
        }

        /**
         * ��ȡorgName_Name_Partial���Ե�ֵ��
         *
         * @return possible object is
         * {@link OrgName.OrgName_Name.OrgName_Name_Partial }
         */
        public OrgName.OrgName_Name.OrgName_Name_Partial getOrgName_Name_Partial() {
            return orgName_Name_Partial;
        }

        /**
         * ����orgName_Name_Partial���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OrgName.OrgName_Name.OrgName_Name_Partial }
         */
        public void setOrgName_Name_Partial(OrgName.OrgName_Name.OrgName_Name_Partial value) {
            this.orgName_Name_Partial = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "binomialOrgName"
        })
        public static class OrgName_Name_Binomial {

            @XmlElement(name = "BinomialOrgName", required = true)
            protected BinomialOrgName binomialOrgName;

            /**
             * ��ȡbinomialOrgName���Ե�ֵ��
             *
             * @return possible object is
             * {@link BinomialOrgName }
             */
            public BinomialOrgName getBinomialOrgName() {
                return binomialOrgName;
            }

            /**
             * ����binomialOrgName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BinomialOrgName }
             */
            public void setBinomialOrgName(BinomialOrgName value) {
                this.binomialOrgName = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}MultiOrgName"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "multiOrgName"
        })
        public static class OrgName_Name_Hybrid {

            @XmlElement(name = "MultiOrgName", required = true)
            protected MultiOrgName multiOrgName;

            /**
             * ��ȡmultiOrgName���Ե�ֵ��
             *
             * @return possible object is
             * {@link MultiOrgName }
             */
            public MultiOrgName getMultiOrgName() {
                return multiOrgName;
            }

            /**
             * ����multiOrgName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link MultiOrgName }
             */
            public void setMultiOrgName(MultiOrgName value) {
                this.multiOrgName = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}BinomialOrgName"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "binomialOrgName"
        })
        public static class OrgName_Name_Namedhybrid {

            @XmlElement(name = "BinomialOrgName", required = true)
            protected BinomialOrgName binomialOrgName;

            /**
             * ��ȡbinomialOrgName���Ե�ֵ��
             *
             * @return possible object is
             * {@link BinomialOrgName }
             */
            public BinomialOrgName getBinomialOrgName() {
                return binomialOrgName;
            }

            /**
             * ����binomialOrgName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BinomialOrgName }
             */
            public void setBinomialOrgName(BinomialOrgName value) {
                this.binomialOrgName = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PartialOrgName"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "partialOrgName"
        })
        public static class OrgName_Name_Partial {

            @XmlElement(name = "PartialOrgName", required = true)
            protected PartialOrgName partialOrgName;

            /**
             * ��ȡpartialOrgName���Ե�ֵ��
             *
             * @return possible object is
             * {@link PartialOrgName }
             */
            public PartialOrgName getPartialOrgName() {
                return partialOrgName;
            }

            /**
             * ����partialOrgName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PartialOrgName }
             */
            public void setPartialOrgName(PartialOrgName value) {
                this.partialOrgName = value;
            }

        }

    }

}
