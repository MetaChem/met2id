//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
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
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BioSource_genome" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="unknown">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="unknown"/>
 *                       &lt;enumeration value="genomic"/>
 *                       &lt;enumeration value="chloroplast"/>
 *                       &lt;enumeration value="chromoplast"/>
 *                       &lt;enumeration value="kinetoplast"/>
 *                       &lt;enumeration value="mitochondrion"/>
 *                       &lt;enumeration value="plastid"/>
 *                       &lt;enumeration value="macronuclear"/>
 *                       &lt;enumeration value="extrachrom"/>
 *                       &lt;enumeration value="plasmid"/>
 *                       &lt;enumeration value="transposon"/>
 *                       &lt;enumeration value="insertion-seq"/>
 *                       &lt;enumeration value="cyanelle"/>
 *                       &lt;enumeration value="proviral"/>
 *                       &lt;enumeration value="virion"/>
 *                       &lt;enumeration value="nucleomorph"/>
 *                       &lt;enumeration value="apicoplast"/>
 *                       &lt;enumeration value="leucoplast"/>
 *                       &lt;enumeration value="proplastid"/>
 *                       &lt;enumeration value="endogenous-virus"/>
 *                       &lt;enumeration value="hydrogenosome"/>
 *                       &lt;enumeration value="chromosome"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BioSource_origin" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="unknown">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="unknown"/>
 *                       &lt;enumeration value="natural"/>
 *                       &lt;enumeration value="natmut"/>
 *                       &lt;enumeration value="mut"/>
 *                       &lt;enumeration value="artificial"/>
 *                       &lt;enumeration value="synthetic"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BioSource_org">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Org-ref"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BioSource_subtype" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}SubSource"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BioSource_is-focus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
        "bioSource_Genome",
        "bioSource_Origin",
        "bioSource_Org",
        "bioSource_Subtype",
        "bioSource_IsFocus"
})
@XmlRootElement(name = "BioSource")
public class BioSource {

    @XmlElement(name = "BioSource_genome")
    protected BioSource.BioSource_Genome bioSource_Genome;
    @XmlElement(name = "BioSource_origin")
    protected BioSource.BioSource_Origin bioSource_Origin;
    @XmlElement(name = "BioSource_org", required = true)
    protected BioSource.BioSource_Org bioSource_Org;
    @XmlElement(name = "BioSource_subtype")
    protected BioSource.BioSource_Subtype bioSource_Subtype;
    @XmlElement(name = "BioSource_is-focus")
    protected BioSource.BioSource_IsFocus bioSource_IsFocus;

    /**
     * 获取bioSource_Genome属性的值。
     *
     * @return possible object is
     * {@link BioSource.BioSource_Genome }
     */
    public BioSource.BioSource_Genome getBioSource_Genome() {
        return bioSource_Genome;
    }

    /**
     * 设置bioSource_Genome属性的值。
     *
     * @param value allowed object is
     *              {@link BioSource.BioSource_Genome }
     */
    public void setBioSource_Genome(BioSource.BioSource_Genome value) {
        this.bioSource_Genome = value;
    }

    /**
     * 获取bioSource_Origin属性的值。
     *
     * @return possible object is
     * {@link BioSource.BioSource_Origin }
     */
    public BioSource.BioSource_Origin getBioSource_Origin() {
        return bioSource_Origin;
    }

    /**
     * 设置bioSource_Origin属性的值。
     *
     * @param value allowed object is
     *              {@link BioSource.BioSource_Origin }
     */
    public void setBioSource_Origin(BioSource.BioSource_Origin value) {
        this.bioSource_Origin = value;
    }

    /**
     * 获取bioSource_Org属性的值。
     *
     * @return possible object is
     * {@link BioSource.BioSource_Org }
     */
    public BioSource.BioSource_Org getBioSource_Org() {
        return bioSource_Org;
    }

    /**
     * 设置bioSource_Org属性的值。
     *
     * @param value allowed object is
     *              {@link BioSource.BioSource_Org }
     */
    public void setBioSource_Org(BioSource.BioSource_Org value) {
        this.bioSource_Org = value;
    }

    /**
     * 获取bioSource_Subtype属性的值。
     *
     * @return possible object is
     * {@link BioSource.BioSource_Subtype }
     */
    public BioSource.BioSource_Subtype getBioSource_Subtype() {
        return bioSource_Subtype;
    }

    /**
     * 设置bioSource_Subtype属性的值。
     *
     * @param value allowed object is
     *              {@link BioSource.BioSource_Subtype }
     */
    public void setBioSource_Subtype(BioSource.BioSource_Subtype value) {
        this.bioSource_Subtype = value;
    }

    /**
     * 获取bioSource_IsFocus属性的值。
     *
     * @return possible object is
     * {@link BioSource.BioSource_IsFocus }
     */
    public BioSource.BioSource_IsFocus getBioSource_IsFocus() {
        return bioSource_IsFocus;
    }

    /**
     * 设置bioSource_IsFocus属性的值。
     *
     * @param value allowed object is
     *              {@link BioSource.BioSource_IsFocus }
     */
    public void setBioSource_IsFocus(BioSource.BioSource_IsFocus value) {
        this.bioSource_IsFocus = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value" default="unknown">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="unknown"/>
     *             &lt;enumeration value="genomic"/>
     *             &lt;enumeration value="chloroplast"/>
     *             &lt;enumeration value="chromoplast"/>
     *             &lt;enumeration value="kinetoplast"/>
     *             &lt;enumeration value="mitochondrion"/>
     *             &lt;enumeration value="plastid"/>
     *             &lt;enumeration value="macronuclear"/>
     *             &lt;enumeration value="extrachrom"/>
     *             &lt;enumeration value="plasmid"/>
     *             &lt;enumeration value="transposon"/>
     *             &lt;enumeration value="insertion-seq"/>
     *             &lt;enumeration value="cyanelle"/>
     *             &lt;enumeration value="proviral"/>
     *             &lt;enumeration value="virion"/>
     *             &lt;enumeration value="nucleomorph"/>
     *             &lt;enumeration value="apicoplast"/>
     *             &lt;enumeration value="leucoplast"/>
     *             &lt;enumeration value="proplastid"/>
     *             &lt;enumeration value="endogenous-virus"/>
     *             &lt;enumeration value="hydrogenosome"/>
     *             &lt;enumeration value="chromosome"/>
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
    public static class BioSource_Genome {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String intValue;

        /**
         * 获取value属性的值。
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取intValue属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getIntValue() {
            if (intValue == null) {
                return "unknown";
            } else {
                return intValue;
            }
        }

        /**
         * 设置intValue属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIntValue(String value) {
            this.intValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BioSource_IsFocus {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Org-ref"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "orgRef"
    })
    public static class BioSource_Org {

        @XmlElement(name = "Org-ref", required = true)
        protected OrgRef orgRef;

        /**
         * 获取orgRef属性的值。
         *
         * @return possible object is
         * {@link OrgRef }
         */
        public OrgRef getOrgRef() {
            return orgRef;
        }

        /**
         * 设置orgRef属性的值。
         *
         * @param value allowed object is
         *              {@link OrgRef }
         */
        public void setOrgRef(OrgRef value) {
            this.orgRef = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value" default="unknown">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="unknown"/>
     *             &lt;enumeration value="natural"/>
     *             &lt;enumeration value="natmut"/>
     *             &lt;enumeration value="mut"/>
     *             &lt;enumeration value="artificial"/>
     *             &lt;enumeration value="synthetic"/>
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
    public static class BioSource_Origin {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String stringValue;

        /**
         * 获取value属性的值。
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取stringValue属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getStringValue() {
            if (stringValue == null) {
                return "unknown";
            } else {
                return stringValue;
            }
        }

        /**
         * 设置stringValue属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStringValue(String value) {
            this.stringValue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}SubSource"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "subSource"
    })
    public static class BioSource_Subtype {

        @XmlElement(name = "SubSource")
        protected List<SubSource> subSource;

        /**
         * Gets the value of the subSource property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subSource property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubSource().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubSource }
         */
        public List<SubSource> getSubSource() {
            if (subSource == null) {
                subSource = new ArrayList<SubSource>();
            }
            return this.subSource;
        }

    }

}
