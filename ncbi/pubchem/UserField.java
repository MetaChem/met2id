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
 *         &lt;element name="User-field_label">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="User-field_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="User-field_data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="User-field_data_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="User-field_data_int" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="User-field_data_real" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="User-field_data_bool">
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
 *                   &lt;element name="User-field_data_os" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *                   &lt;element name="User-field_data_object">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_strs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="User-field_data_strs_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_ints">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="User-field_data_ints_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_reals">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="User-field_data_reals_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_oss">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="User-field_data_oss_E" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_fields">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-field"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="User-field_data_objects">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userField_Label",
        "userField_Num",
        "userField_Data"
})
@XmlRootElement(name = "User-field")
public class UserField {

    @XmlElement(name = "User-field_label", required = true)
    protected UserField.UserField_Label userField_Label;
    @XmlElement(name = "User-field_num")
    protected BigInteger userField_Num;
    @XmlElement(name = "User-field_data", required = true)
    protected UserField.UserField_Data userField_Data;

    /**
     * 获取userField_Label属性的值。
     *
     * @return possible object is
     * {@link UserField.UserField_Label }
     */
    public UserField.UserField_Label getUserField_Label() {
        return userField_Label;
    }

    /**
     * 设置userField_Label属性的值。
     *
     * @param value allowed object is
     *              {@link UserField.UserField_Label }
     */
    public void setUserField_Label(UserField.UserField_Label value) {
        this.userField_Label = value;
    }

    /**
     * 获取userField_Num属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getUserField_Num() {
        return userField_Num;
    }

    /**
     * 设置userField_Num属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setUserField_Num(BigInteger value) {
        this.userField_Num = value;
    }

    /**
     * 获取userField_Data属性的值。
     *
     * @return possible object is
     * {@link UserField.UserField_Data }
     */
    public UserField.UserField_Data getUserField_Data() {
        return userField_Data;
    }

    /**
     * 设置userField_Data属性的值。
     *
     * @param value allowed object is
     *              {@link UserField.UserField_Data }
     */
    public void setUserField_Data(UserField.UserField_Data value) {
        this.userField_Data = value;
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
     *         &lt;element name="User-field_data_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="User-field_data_int" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="User-field_data_real" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="User-field_data_bool">
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
     *         &lt;element name="User-field_data_os" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
     *         &lt;element name="User-field_data_object">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_strs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="User-field_data_strs_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_ints">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="User-field_data_ints_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_reals">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="User-field_data_reals_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_oss">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="User-field_data_oss_E" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_fields">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-field"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="User-field_data_objects">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
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
            "userField_Data_Str",
            "userField_Data_Int",
            "userField_Data_Real",
            "userField_Data_Bool",
            "userField_Data_Os",
            "userField_Data_Object",
            "userField_Data_Strs",
            "userField_Data_Ints",
            "userField_Data_Reals",
            "userField_Data_Oss",
            "userField_Data_Fields",
            "userField_Data_Objects"
    })
    public static class UserField_Data {

        @XmlElement(name = "User-field_data_str")
        protected String userField_Data_Str;
        @XmlElement(name = "User-field_data_int")
        protected BigInteger userField_Data_Int;
        @XmlElement(name = "User-field_data_real")
        protected Double userField_Data_Real;
        @XmlElement(name = "User-field_data_bool")
        protected UserField.UserField_Data.UserField_Data_Bool userField_Data_Bool;
        @XmlElement(name = "User-field_data_os", type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] userField_Data_Os;
        @XmlElement(name = "User-field_data_object")
        protected UserField.UserField_Data.UserField_Data_Object userField_Data_Object;
        @XmlElement(name = "User-field_data_strs")
        protected UserField.UserField_Data.UserField_Data_Strs userField_Data_Strs;
        @XmlElement(name = "User-field_data_ints")
        protected UserField.UserField_Data.UserField_Data_Ints userField_Data_Ints;
        @XmlElement(name = "User-field_data_reals")
        protected UserField.UserField_Data.UserField_Data_Reals userField_Data_Reals;
        @XmlElement(name = "User-field_data_oss")
        protected UserField.UserField_Data.UserField_Data_Oss userField_Data_Oss;
        @XmlElement(name = "User-field_data_fields")
        protected UserField.UserField_Data.UserField_Data_Fields userField_Data_Fields;
        @XmlElement(name = "User-field_data_objects")
        protected UserField.UserField_Data.UserField_Data_Objects userField_Data_Objects;

        /**
         * 获取userField_Data_Str属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getUserField_Data_Str() {
            return userField_Data_Str;
        }

        /**
         * 设置userField_Data_Str属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUserField_Data_Str(String value) {
            this.userField_Data_Str = value;
        }

        /**
         * 获取userField_Data_Int属性的值。
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getUserField_Data_Int() {
            return userField_Data_Int;
        }

        /**
         * 设置userField_Data_Int属性的值。
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setUserField_Data_Int(BigInteger value) {
            this.userField_Data_Int = value;
        }

        /**
         * 获取userField_Data_Real属性的值。
         *
         * @return possible object is
         * {@link Double }
         */
        public Double getUserField_Data_Real() {
            return userField_Data_Real;
        }

        /**
         * 设置userField_Data_Real属性的值。
         *
         * @param value allowed object is
         *              {@link Double }
         */
        public void setUserField_Data_Real(Double value) {
            this.userField_Data_Real = value;
        }

        /**
         * 获取userField_Data_Bool属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Bool }
         */
        public UserField.UserField_Data.UserField_Data_Bool getUserField_Data_Bool() {
            return userField_Data_Bool;
        }

        /**
         * 设置userField_Data_Bool属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Bool }
         */
        public void setUserField_Data_Bool(UserField.UserField_Data.UserField_Data_Bool value) {
            this.userField_Data_Bool = value;
        }

        /**
         * 获取userField_Data_Os属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public byte[] getUserField_Data_Os() {
            return userField_Data_Os;
        }

        /**
         * 设置userField_Data_Os属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUserField_Data_Os(byte[] value) {
            this.userField_Data_Os = value;
        }

        /**
         * 获取userField_Data_Object属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Object }
         */
        public UserField.UserField_Data.UserField_Data_Object getUserField_Data_Object() {
            return userField_Data_Object;
        }

        /**
         * 设置userField_Data_Object属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Object }
         */
        public void setUserField_Data_Object(UserField.UserField_Data.UserField_Data_Object value) {
            this.userField_Data_Object = value;
        }

        /**
         * 获取userField_Data_Strs属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Strs }
         */
        public UserField.UserField_Data.UserField_Data_Strs getUserField_Data_Strs() {
            return userField_Data_Strs;
        }

        /**
         * 设置userField_Data_Strs属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Strs }
         */
        public void setUserField_Data_Strs(UserField.UserField_Data.UserField_Data_Strs value) {
            this.userField_Data_Strs = value;
        }

        /**
         * 获取userField_Data_Ints属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Ints }
         */
        public UserField.UserField_Data.UserField_Data_Ints getUserField_Data_Ints() {
            return userField_Data_Ints;
        }

        /**
         * 设置userField_Data_Ints属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Ints }
         */
        public void setUserField_Data_Ints(UserField.UserField_Data.UserField_Data_Ints value) {
            this.userField_Data_Ints = value;
        }

        /**
         * 获取userField_Data_Reals属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Reals }
         */
        public UserField.UserField_Data.UserField_Data_Reals getUserField_Data_Reals() {
            return userField_Data_Reals;
        }

        /**
         * 设置userField_Data_Reals属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Reals }
         */
        public void setUserField_Data_Reals(UserField.UserField_Data.UserField_Data_Reals value) {
            this.userField_Data_Reals = value;
        }

        /**
         * 获取userField_Data_Oss属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Oss }
         */
        public UserField.UserField_Data.UserField_Data_Oss getUserField_Data_Oss() {
            return userField_Data_Oss;
        }

        /**
         * 设置userField_Data_Oss属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Oss }
         */
        public void setUserField_Data_Oss(UserField.UserField_Data.UserField_Data_Oss value) {
            this.userField_Data_Oss = value;
        }

        /**
         * 获取userField_Data_Fields属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Fields }
         */
        public UserField.UserField_Data.UserField_Data_Fields getUserField_Data_Fields() {
            return userField_Data_Fields;
        }

        /**
         * 设置userField_Data_Fields属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Fields }
         */
        public void setUserField_Data_Fields(UserField.UserField_Data.UserField_Data_Fields value) {
            this.userField_Data_Fields = value;
        }

        /**
         * 获取userField_Data_Objects属性的值。
         *
         * @return possible object is
         * {@link UserField.UserField_Data.UserField_Data_Objects }
         */
        public UserField.UserField_Data.UserField_Data_Objects getUserField_Data_Objects() {
            return userField_Data_Objects;
        }

        /**
         * 设置userField_Data_Objects属性的值。
         *
         * @param value allowed object is
         *              {@link UserField.UserField_Data.UserField_Data_Objects }
         */
        public void setUserField_Data_Objects(UserField.UserField_Data.UserField_Data_Objects value) {
            this.userField_Data_Objects = value;
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
        public static class UserField_Data_Bool {

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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-field"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userField"
        })
        public static class UserField_Data_Fields {

            @XmlElement(name = "User-field")
            protected List<UserField> userField;

            /**
             * Gets the value of the userField property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userField property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserField().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserField }
             */
            public List<UserField> getUserField() {
                if (userField == null) {
                    userField = new ArrayList<UserField>();
                }
                return this.userField;
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
         *         &lt;element name="User-field_data_ints_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userField_Data_Ints_E"
        })
        public static class UserField_Data_Ints {

            @XmlElement(name = "User-field_data_ints_E")
            protected List<BigInteger> userField_Data_Ints_E;

            /**
             * Gets the value of the userFieldDataIntsE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userFieldDataIntsE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserField_Data_Ints_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             */
            public List<BigInteger> getUserField_Data_Ints_E() {
                if (userField_Data_Ints_E == null) {
                    userField_Data_Ints_E = new ArrayList<BigInteger>();
                }
                return this.userField_Data_Ints_E;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userObject"
        })
        public static class UserField_Data_Object {

            @XmlElement(name = "User-object", required = true)
            protected UserObject userObject;

            /**
             * 获取userObject属性的值。
             *
             * @return possible object is
             * {@link UserObject }
             */
            public UserObject getUserObject() {
                return userObject;
            }

            /**
             * 设置userObject属性的值。
             *
             * @param value allowed object is
             *              {@link UserObject }
             */
            public void setUserObject(UserObject value) {
                this.userObject = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}User-object"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userObject"
        })
        public static class UserField_Data_Objects {

            @XmlElement(name = "User-object")
            protected List<UserObject> userObject;

            /**
             * Gets the value of the userObject property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userObject property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserObject().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserObject }
             */
            public List<UserObject> getUserObject() {
                if (userObject == null) {
                    userObject = new ArrayList<UserObject>();
                }
                return this.userObject;
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
         *         &lt;element name="User-field_data_oss_E" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userField_Data_Oss_E"
        })
        public static class UserField_Data_Oss {

            @XmlElement(name = "User-field_data_oss_E", type = String.class)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected List<byte[]> userField_Data_Oss_E;

            /**
             * Gets the value of the userFieldDataOssE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userFieldDataOssE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserField_Data_Oss_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<byte[]> getUserField_Data_Oss_E() {
                if (userField_Data_Oss_E == null) {
                    userField_Data_Oss_E = new ArrayList<byte[]>();
                }
                return this.userField_Data_Oss_E;
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
         *         &lt;element name="User-field_data_reals_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userField_Data_Reals_E"
        })
        public static class UserField_Data_Reals {

            @XmlElement(name = "User-field_data_reals_E", type = Double.class)
            protected List<Double> userField_Data_Reals_E;

            /**
             * Gets the value of the userFieldDataRealsE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userFieldDataRealsE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserField_Data_Reals_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             */
            public List<Double> getUserField_Data_Reals_E() {
                if (userField_Data_Reals_E == null) {
                    userField_Data_Reals_E = new ArrayList<Double>();
                }
                return this.userField_Data_Reals_E;
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
         *         &lt;element name="User-field_data_strs_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "userField_Data_Strs_E"
        })
        public static class UserField_Data_Strs {

            @XmlElement(name = "User-field_data_strs_E")
            protected List<String> userField_Data_Strs_E;

            /**
             * Gets the value of the userFieldDataStrsE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userFieldDataStrsE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserField_Data_Strs_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getUserField_Data_Strs_E() {
                if (userField_Data_Strs_E == null) {
                    userField_Data_Strs_E = new ArrayList<String>();
                }
                return this.userField_Data_Strs_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "objectId"
    })
    public static class UserField_Label {

        @XmlElement(name = "Object-id", required = true)
        protected ObjectId objectId;

        /**
         * 获取objectId属性的值。
         *
         * @return possible object is
         * {@link ObjectId }
         */
        public ObjectId getObjectId() {
            return objectId;
        }

        /**
         * 设置objectId属性的值。
         *
         * @param value allowed object is
         *              {@link ObjectId }
         */
        public void setObjectId(ObjectId value) {
            this.objectId = value;
        }

    }

}
