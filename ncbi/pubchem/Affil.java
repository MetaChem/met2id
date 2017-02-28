//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Affil_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Affil_std">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Affil_std_affil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_div" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_sub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Affil_std_postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "affil_Str",
        "affil_Std"
})
@XmlRootElement(name = "Affil")
public class Affil {

    @XmlElement(name = "Affil_str")
    protected String affil_Str;
    @XmlElement(name = "Affil_std")
    protected Affil.Affil_Std affil_Std;

    /**
     * 获取affil_Str属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getAffil_Str() {
        return affil_Str;
    }

    /**
     * 设置affil_Str属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAffil_Str(String value) {
        this.affil_Str = value;
    }

    /**
     * 获取affil_Std属性的值。
     *
     * @return possible object is
     * {@link Affil.Affil_Std }
     */
    public Affil.Affil_Std getAffil_Std() {
        return affil_Std;
    }

    /**
     * 设置affil_Std属性的值。
     *
     * @param value allowed object is
     *              {@link Affil.Affil_Std }
     */
    public void setAffil_Std(Affil.Affil_Std value) {
        this.affil_Std = value;
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
     *         &lt;element name="Affil_std_affil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_div" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_sub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Affil_std_postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "affil_Std_Affil",
            "affil_Std_Div",
            "affil_Std_City",
            "affil_Std_Sub",
            "affil_Std_Country",
            "affil_Std_Street",
            "affil_Std_Email",
            "affil_Std_Fax",
            "affil_Std_Phone",
            "affil_Std_PostalCode"
    })
    public static class Affil_Std {

        @XmlElement(name = "Affil_std_affil")
        protected String affil_Std_Affil;
        @XmlElement(name = "Affil_std_div")
        protected String affil_Std_Div;
        @XmlElement(name = "Affil_std_city")
        protected String affil_Std_City;
        @XmlElement(name = "Affil_std_sub")
        protected String affil_Std_Sub;
        @XmlElement(name = "Affil_std_country")
        protected String affil_Std_Country;
        @XmlElement(name = "Affil_std_street")
        protected String affil_Std_Street;
        @XmlElement(name = "Affil_std_email")
        protected String affil_Std_Email;
        @XmlElement(name = "Affil_std_fax")
        protected String affil_Std_Fax;
        @XmlElement(name = "Affil_std_phone")
        protected String affil_Std_Phone;
        @XmlElement(name = "Affil_std_postal-code")
        protected String affil_Std_PostalCode;

        /**
         * 获取affil_Std_Affil属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Affil() {
            return affil_Std_Affil;
        }

        /**
         * 设置affil_Std_Affil属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Affil(String value) {
            this.affil_Std_Affil = value;
        }

        /**
         * 获取affil_Std_Div属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Div() {
            return affil_Std_Div;
        }

        /**
         * 设置affil_Std_Div属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Div(String value) {
            this.affil_Std_Div = value;
        }

        /**
         * 获取affil_Std_City属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_City() {
            return affil_Std_City;
        }

        /**
         * 设置affil_Std_City属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_City(String value) {
            this.affil_Std_City = value;
        }

        /**
         * 获取affil_Std_Sub属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Sub() {
            return affil_Std_Sub;
        }

        /**
         * 设置affil_Std_Sub属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Sub(String value) {
            this.affil_Std_Sub = value;
        }

        /**
         * 获取affil_Std_Country属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Country() {
            return affil_Std_Country;
        }

        /**
         * 设置affil_Std_Country属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Country(String value) {
            this.affil_Std_Country = value;
        }

        /**
         * 获取affil_Std_Street属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Street() {
            return affil_Std_Street;
        }

        /**
         * 设置affil_Std_Street属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Street(String value) {
            this.affil_Std_Street = value;
        }

        /**
         * 获取affil_Std_Email属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Email() {
            return affil_Std_Email;
        }

        /**
         * 设置affil_Std_Email属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Email(String value) {
            this.affil_Std_Email = value;
        }

        /**
         * 获取affil_Std_Fax属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Fax() {
            return affil_Std_Fax;
        }

        /**
         * 设置affil_Std_Fax属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Fax(String value) {
            this.affil_Std_Fax = value;
        }

        /**
         * 获取affil_Std_Phone属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_Phone() {
            return affil_Std_Phone;
        }

        /**
         * 设置affil_Std_Phone属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_Phone(String value) {
            this.affil_Std_Phone = value;
        }

        /**
         * 获取affil_Std_PostalCode属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getAffil_Std_PostalCode() {
            return affil_Std_PostalCode;
        }

        /**
         * 设置affil_Std_PostalCode属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAffil_Std_PostalCode(String value) {
            this.affil_Std_PostalCode = value;
        }

    }

}
