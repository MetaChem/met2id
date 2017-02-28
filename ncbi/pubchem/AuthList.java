//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
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
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth-list_names">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Auth-list_names_std">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}Author"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Auth-list_names_ml">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Auth-list_names_ml_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Auth-list_names_str">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="Auth-list_names_str_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Auth-list_affil" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "authList_Names",
        "authList_Affil"
})
@XmlRootElement(name = "Auth-list")
public class AuthList {

    @XmlElement(name = "Auth-list_names", required = true)
    protected AuthList.AuthList_Names authList_Names;
    @XmlElement(name = "Auth-list_affil")
    protected AuthList.AuthList_Affil authList_Affil;

    /**
     * 获取authList_Names属性的值。
     *
     * @return possible object is
     * {@link AuthList.AuthList_Names }
     */
    public AuthList.AuthList_Names getAuthList_Names() {
        return authList_Names;
    }

    /**
     * 设置authList_Names属性的值。
     *
     * @param value allowed object is
     *              {@link AuthList.AuthList_Names }
     */
    public void setAuthList_Names(AuthList.AuthList_Names value) {
        this.authList_Names = value;
    }

    /**
     * 获取authList_Affil属性的值。
     *
     * @return possible object is
     * {@link AuthList.AuthList_Affil }
     */
    public AuthList.AuthList_Affil getAuthList_Affil() {
        return authList_Affil;
    }

    /**
     * 设置authList_Affil属性的值。
     *
     * @param value allowed object is
     *              {@link AuthList.AuthList_Affil }
     */
    public void setAuthList_Affil(AuthList.AuthList_Affil value) {
        this.authList_Affil = value;
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
    public static class AuthList_Affil {

        @XmlElement(name = "Affil", required = true)
        protected Affil affil;

        /**
         * 获取affil属性的值。
         *
         * @return possible object is
         * {@link Affil }
         */
        public Affil getAffil() {
            return affil;
        }

        /**
         * 设置affil属性的值。
         *
         * @param value allowed object is
         *              {@link Affil }
         */
        public void setAffil(Affil value) {
            this.affil = value;
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
     *         &lt;element name="Auth-list_names_std">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Author"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Auth-list_names_ml">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="Auth-list_names_ml_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Auth-list_names_str">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="Auth-list_names_str_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "authList_Names_Std",
            "authList_Names_Ml",
            "authList_Names_Str"
    })
    public static class AuthList_Names {

        @XmlElement(name = "Auth-list_names_std")
        protected AuthList.AuthList_Names.AuthList_Names_Std authList_Names_Std;
        @XmlElement(name = "Auth-list_names_ml")
        protected AuthList.AuthList_Names.AuthList_Names_Ml authList_Names_Ml;
        @XmlElement(name = "Auth-list_names_str")
        protected AuthList.AuthList_Names.AuthList_Names_Str authList_Names_Str;

        /**
         * 获取authList_Names_Std属性的值。
         *
         * @return possible object is
         * {@link AuthList.AuthList_Names.AuthList_Names_Std }
         */
        public AuthList.AuthList_Names.AuthList_Names_Std getAuthList_Names_Std() {
            return authList_Names_Std;
        }

        /**
         * 设置authList_Names_Std属性的值。
         *
         * @param value allowed object is
         *              {@link AuthList.AuthList_Names.AuthList_Names_Std }
         */
        public void setAuthList_Names_Std(AuthList.AuthList_Names.AuthList_Names_Std value) {
            this.authList_Names_Std = value;
        }

        /**
         * 获取authList_Names_Ml属性的值。
         *
         * @return possible object is
         * {@link AuthList.AuthList_Names.AuthList_Names_Ml }
         */
        public AuthList.AuthList_Names.AuthList_Names_Ml getAuthList_Names_Ml() {
            return authList_Names_Ml;
        }

        /**
         * 设置authList_Names_Ml属性的值。
         *
         * @param value allowed object is
         *              {@link AuthList.AuthList_Names.AuthList_Names_Ml }
         */
        public void setAuthList_Names_Ml(AuthList.AuthList_Names.AuthList_Names_Ml value) {
            this.authList_Names_Ml = value;
        }

        /**
         * 获取authList_Names_Str属性的值。
         *
         * @return possible object is
         * {@link AuthList.AuthList_Names.AuthList_Names_Str }
         */
        public AuthList.AuthList_Names.AuthList_Names_Str getAuthList_Names_Str() {
            return authList_Names_Str;
        }

        /**
         * 设置authList_Names_Str属性的值。
         *
         * @param value allowed object is
         *              {@link AuthList.AuthList_Names.AuthList_Names_Str }
         */
        public void setAuthList_Names_Str(AuthList.AuthList_Names.AuthList_Names_Str value) {
            this.authList_Names_Str = value;
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
         *         &lt;element name="Auth-list_names_ml_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "authList_Names_Ml_E"
        })
        public static class AuthList_Names_Ml {

            @XmlElement(name = "Auth-list_names_ml_E")
            protected List<String> authList_Names_Ml_E;

            /**
             * Gets the value of the authListNamesMlE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the authListNamesMlE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthList_Names_Ml_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getAuthList_Names_Ml_E() {
                if (authList_Names_Ml_E == null) {
                    authList_Names_Ml_E = new ArrayList<String>();
                }
                return this.authList_Names_Ml_E;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Author"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "author"
        })
        public static class AuthList_Names_Std {

            @XmlElement(name = "Author")
            protected List<Author> author;

            /**
             * Gets the value of the author property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the author property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthor().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Author }
             */
            public List<Author> getAuthor() {
                if (author == null) {
                    author = new ArrayList<Author>();
                }
                return this.author;
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
         *         &lt;element name="Auth-list_names_str_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "authList_Names_Str_E"
        })
        public static class AuthList_Names_Str {

            @XmlElement(name = "Auth-list_names_str_E")
            protected List<String> authList_Names_Str_E;

            /**
             * Gets the value of the authListNamesStrE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the authListNamesStrE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthList_Names_Str_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getAuthList_Names_Str_E() {
                if (authList_Names_Str_E == null) {
                    authList_Names_Str_E = new ArrayList<String>();
                }
                return this.authList_Names_Str_E;
            }

        }

    }

}
