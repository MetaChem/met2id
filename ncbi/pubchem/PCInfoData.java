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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="PC-InfoData_urn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Urn"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-InfoData_value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PC-InfoData_value_bval">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="true"/>
 *                                 &lt;enumeration value="false"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_bvec">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-InfoData_value_bvec_E">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="true"/>
 *                                           &lt;enumeration value="false"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_ival" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PC-InfoData_value_ivec">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-InfoData_value_ivec_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_fval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="PC-InfoData_value_fvec">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-InfoData_value_fvec_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_sval" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PC-InfoData_value_slist">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-InfoData_value_slist_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_date">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-InfoData_value_binary" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *                   &lt;element name="PC-InfoData_value_bitlist">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([0-1])*"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
        "pcInfoData_Urn",
        "pcInfoData_Value"
})
@XmlRootElement(name = "PC-InfoData")
public class PCInfoData {

    @XmlElement(name = "PC-InfoData_urn", required = true)
    protected PCInfoData.PCInfoData_Urn pcInfoData_Urn;
    @XmlElement(name = "PC-InfoData_value", required = true)
    protected PCInfoData.PCInfoData_Value pcInfoData_Value;

    /**
     * 获取pcInfoData_Urn属性的值。
     *
     * @return possible object is
     * {@link PCInfoData.PCInfoData_Urn }
     */
    public PCInfoData.PCInfoData_Urn getPCInfoData_Urn() {
        return pcInfoData_Urn;
    }

    /**
     * 设置pcInfoData_Urn属性的值。
     *
     * @param value allowed object is
     *              {@link PCInfoData.PCInfoData_Urn }
     */
    public void setPCInfoData_Urn(PCInfoData.PCInfoData_Urn value) {
        this.pcInfoData_Urn = value;
    }

    /**
     * 获取pcInfoData_Value属性的值。
     *
     * @return possible object is
     * {@link PCInfoData.PCInfoData_Value }
     */
    public PCInfoData.PCInfoData_Value getPCInfoData_Value() {
        return pcInfoData_Value;
    }

    /**
     * 设置pcInfoData_Value属性的值。
     *
     * @param value allowed object is
     *              {@link PCInfoData.PCInfoData_Value }
     */
    public void setPCInfoData_Value(PCInfoData.PCInfoData_Value value) {
        this.pcInfoData_Value = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Urn"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcUrn"
    })
    public static class PCInfoData_Urn {

        @XmlElement(name = "PC-Urn", required = true)
        protected PCUrn pcUrn;

        /**
         * 获取pcUrn属性的值。
         *
         * @return possible object is
         * {@link PCUrn }
         */
        public PCUrn getPCUrn() {
            return pcUrn;
        }

        /**
         * 设置pcUrn属性的值。
         *
         * @param value allowed object is
         *              {@link PCUrn }
         */
        public void setPCUrn(PCUrn value) {
            this.pcUrn = value;
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
     *       &lt;choice>
     *         &lt;element name="PC-InfoData_value_bval">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="value" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="true"/>
     *                       &lt;enumeration value="false"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-InfoData_value_bvec">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-InfoData_value_bvec_E">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="true"/>
     *                                 &lt;enumeration value="false"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-InfoData_value_ival" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-InfoData_value_ivec">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-InfoData_value_ivec_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-InfoData_value_fval" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="PC-InfoData_value_fvec">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-InfoData_value_fvec_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-InfoData_value_sval" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PC-InfoData_value_slist">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-InfoData_value_slist_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-InfoData_value_date">
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
     *         &lt;element name="PC-InfoData_value_binary" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
     *         &lt;element name="PC-InfoData_value_bitlist">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([0-1])*"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcInfoData_Value_Bval",
            "pcInfoData_Value_Bvec",
            "pcInfoData_Value_Ival",
            "pcInfoData_Value_Ivec",
            "pcInfoData_Value_Fval",
            "pcInfoData_Value_Fvec",
            "pcInfoData_Value_Sval",
            "pcInfoData_Value_Slist",
            "pcInfoData_Value_Date",
            "pcInfoData_Value_Binary",
            "pcInfoData_Value_Bitlist"
    })
    public static class PCInfoData_Value {

        @XmlElement(name = "PC-InfoData_value_bval")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval pcInfoData_Value_Bval;
        @XmlElement(name = "PC-InfoData_value_bvec")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec pcInfoData_Value_Bvec;
        @XmlElement(name = "PC-InfoData_value_ival")
        protected BigInteger pcInfoData_Value_Ival;
        @XmlElement(name = "PC-InfoData_value_ivec")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec pcInfoData_Value_Ivec;
        @XmlElement(name = "PC-InfoData_value_fval")
        protected Double pcInfoData_Value_Fval;
        @XmlElement(name = "PC-InfoData_value_fvec")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec pcInfoData_Value_Fvec;
        @XmlElement(name = "PC-InfoData_value_sval")
        protected String pcInfoData_Value_Sval;
        @XmlElement(name = "PC-InfoData_value_slist")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist pcInfoData_Value_Slist;
        @XmlElement(name = "PC-InfoData_value_date")
        protected PCInfoData.PCInfoData_Value.PCInfoData_Value_Date pcInfoData_Value_Date;
        @XmlElement(name = "PC-InfoData_value_binary", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] pcInfoData_Value_Binary;
        @XmlElement(name = "PC-InfoData_value_bitlist")
        protected String pcInfoData_Value_Bitlist;

        /**
         * 获取pcInfoData_Value_Bval属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval getPCInfoData_Value_Bval() {
            return pcInfoData_Value_Bval;
        }

        /**
         * 设置pcInfoData_Value_Bval属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval }
         */
        public void setPCInfoData_Value_Bval(PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval value) {
            this.pcInfoData_Value_Bval = value;
        }

        /**
         * 获取pcInfoData_Value_Bvec属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec getPCInfoData_Value_Bvec() {
            return pcInfoData_Value_Bvec;
        }

        /**
         * 设置pcInfoData_Value_Bvec属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec }
         */
        public void setPCInfoData_Value_Bvec(PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec value) {
            this.pcInfoData_Value_Bvec = value;
        }

        /**
         * 获取pcInfoData_Value_Ival属性的值。
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCInfoData_Value_Ival() {
            return pcInfoData_Value_Ival;
        }

        /**
         * 设置pcInfoData_Value_Ival属性的值。
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCInfoData_Value_Ival(BigInteger value) {
            this.pcInfoData_Value_Ival = value;
        }

        /**
         * 获取pcInfoData_Value_Ivec属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec getPCInfoData_Value_Ivec() {
            return pcInfoData_Value_Ivec;
        }

        /**
         * 设置pcInfoData_Value_Ivec属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec }
         */
        public void setPCInfoData_Value_Ivec(PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec value) {
            this.pcInfoData_Value_Ivec = value;
        }

        /**
         * 获取pcInfoData_Value_Fval属性的值。
         *
         * @return possible object is
         * {@link Double }
         */
        public Double getPCInfoData_Value_Fval() {
            return pcInfoData_Value_Fval;
        }

        /**
         * 设置pcInfoData_Value_Fval属性的值。
         *
         * @param value allowed object is
         *              {@link Double }
         */
        public void setPCInfoData_Value_Fval(Double value) {
            this.pcInfoData_Value_Fval = value;
        }

        /**
         * 获取pcInfoData_Value_Fvec属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec getPCInfoData_Value_Fvec() {
            return pcInfoData_Value_Fvec;
        }

        /**
         * 设置pcInfoData_Value_Fvec属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec }
         */
        public void setPCInfoData_Value_Fvec(PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec value) {
            this.pcInfoData_Value_Fvec = value;
        }

        /**
         * 获取pcInfoData_Value_Sval属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getPCInfoData_Value_Sval() {
            return pcInfoData_Value_Sval;
        }

        /**
         * 设置pcInfoData_Value_Sval属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPCInfoData_Value_Sval(String value) {
            this.pcInfoData_Value_Sval = value;
        }

        /**
         * 获取pcInfoData_Value_Slist属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist getPCInfoData_Value_Slist() {
            return pcInfoData_Value_Slist;
        }

        /**
         * 设置pcInfoData_Value_Slist属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist }
         */
        public void setPCInfoData_Value_Slist(PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist value) {
            this.pcInfoData_Value_Slist = value;
        }

        /**
         * 获取pcInfoData_Value_Date属性的值。
         *
         * @return possible object is
         * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Date }
         */
        public PCInfoData.PCInfoData_Value.PCInfoData_Value_Date getPCInfoData_Value_Date() {
            return pcInfoData_Value_Date;
        }

        /**
         * 设置pcInfoData_Value_Date属性的值。
         *
         * @param value allowed object is
         *              {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Date }
         */
        public void setPCInfoData_Value_Date(PCInfoData.PCInfoData_Value.PCInfoData_Value_Date value) {
            this.pcInfoData_Value_Date = value;
        }

        /**
         * 获取pcInfoData_Value_Binary属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public byte[] getPCInfoData_Value_Binary() {
            return pcInfoData_Value_Binary;
        }

        /**
         * 设置pcInfoData_Value_Binary属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPCInfoData_Value_Binary(byte[] value) {
            this.pcInfoData_Value_Binary = value;
        }

        /**
         * 获取pcInfoData_Value_Bitlist属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getPCInfoData_Value_Bitlist() {
            return pcInfoData_Value_Bitlist;
        }

        /**
         * 设置pcInfoData_Value_Bitlist属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPCInfoData_Value_Bitlist(String value) {
            this.pcInfoData_Value_Bitlist = value;
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
         *       &lt;attribute name="value" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="true"/>
         *             &lt;enumeration value="false"/>
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
        public static class PCInfoData_Value_Bval {

            @XmlAttribute(name = "value", required = true)
            protected String value;

            /**
             * 获取value属性的值。
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
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
         *         &lt;element name="PC-InfoData_value_bvec_E">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="true"/>
         *                       &lt;enumeration value="false"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
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
                "pcInfoData_Value_Bvec_E"
        })
        public static class PCInfoData_Value_Bvec {

            @XmlElement(name = "PC-InfoData_value_bvec_E")
            protected List<PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E> pcInfoData_Value_Bvec_E;

            /**
             * Gets the value of the pcInfoDataValueBvecE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcInfoDataValueBvecE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCInfoData_Value_Bvec_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E }
             */
            public List<PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E> getPCInfoData_Value_Bvec_E() {
                if (pcInfoData_Value_Bvec_E == null) {
                    pcInfoData_Value_Bvec_E = new ArrayList<PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E>();
                }
                return this.pcInfoData_Value_Bvec_E;
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
             *       &lt;attribute name="value" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="true"/>
             *             &lt;enumeration value="false"/>
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
            public static class PCInfoData_Value_Bvec_E {

                @XmlAttribute(name = "value", required = true)
                protected String value;

                /**
                 * 获取value属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setValue(String value) {
                    this.value = value;
                }

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
        public static class PCInfoData_Value_Date {

            @XmlElement(name = "Date", required = true)
            protected Date date;

            /**
             * 获取date属性的值。
             *
             * @return possible object is
             * {@link Date }
             */
            public Date getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             *
             * @param value allowed object is
             *              {@link Date }
             */
            public void setDate(Date value) {
                this.date = value;
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
         *         &lt;element name="PC-InfoData_value_fvec_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcInfoData_Value_Fvec_E"
        })
        public static class PCInfoData_Value_Fvec {

            @XmlElement(name = "PC-InfoData_value_fvec_E", type = Double.class)
            protected List<Double> pcInfoData_Value_Fvec_E;

            /**
             * Gets the value of the pcInfoDataValueFvecE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcInfoDataValueFvecE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCInfoData_Value_Fvec_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             */
            public List<Double> getPCInfoData_Value_Fvec_E() {
                if (pcInfoData_Value_Fvec_E == null) {
                    pcInfoData_Value_Fvec_E = new ArrayList<Double>();
                }
                return this.pcInfoData_Value_Fvec_E;
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
         *         &lt;element name="PC-InfoData_value_ivec_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcInfoData_Value_Ivec_E"
        })
        public static class PCInfoData_Value_Ivec {

            @XmlElement(name = "PC-InfoData_value_ivec_E")
            protected List<BigInteger> pcInfoData_Value_Ivec_E;

            /**
             * Gets the value of the pcInfoDataValueIvecE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcInfoDataValueIvecE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCInfoData_Value_Ivec_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             */
            public List<BigInteger> getPCInfoData_Value_Ivec_E() {
                if (pcInfoData_Value_Ivec_E == null) {
                    pcInfoData_Value_Ivec_E = new ArrayList<BigInteger>();
                }
                return this.pcInfoData_Value_Ivec_E;
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
         *         &lt;element name="PC-InfoData_value_slist_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcInfoData_Value_Slist_E"
        })
        public static class PCInfoData_Value_Slist {

            @XmlElement(name = "PC-InfoData_value_slist_E")
            protected List<String> pcInfoData_Value_Slist_E;

            /**
             * Gets the value of the pcInfoDataValueSlistE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcInfoDataValueSlistE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCInfoData_Value_Slist_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getPCInfoData_Value_Slist_E() {
                if (pcInfoData_Value_Slist_E == null) {
                    pcInfoData_Value_Slist_E = new ArrayList<String>();
                }
                return this.pcInfoData_Value_Slist_E;
            }

        }

    }

}
