//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Author_name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Person-id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Author_level" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="primary"/>
 *                       &lt;enumeration value="secondary"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Author_role" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="compiler"/>
 *                       &lt;enumeration value="editor"/>
 *                       &lt;enumeration value="patent-assignee"/>
 *                       &lt;enumeration value="translator"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Author_affil" minOccurs="0">
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
 *         &lt;element name="Author_is-corr" minOccurs="0">
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
        "author_Name",
        "author_Level",
        "author_Role",
        "author_Affil",
        "author_IsCorr"
})
@XmlRootElement(name = "Author")
public class Author {

    @XmlElement(name = "Author_name", required = true)
    protected Author.Author_Name author_Name;
    @XmlElement(name = "Author_level")
    protected Author.Author_Level author_Level;
    @XmlElement(name = "Author_role")
    protected Author.Author_Role author_Role;
    @XmlElement(name = "Author_affil")
    protected Author.Author_Affil author_Affil;
    @XmlElement(name = "Author_is-corr")
    protected Author.Author_IsCorr author_IsCorr;

    /**
     * 获取author_Name属性的值。
     *
     * @return possible object is
     * {@link Author.Author_Name }
     */
    public Author.Author_Name getAuthor_Name() {
        return author_Name;
    }

    /**
     * 设置author_Name属性的值。
     *
     * @param value allowed object is
     *              {@link Author.Author_Name }
     */
    public void setAuthor_Name(Author.Author_Name value) {
        this.author_Name = value;
    }

    /**
     * 获取author_Level属性的值。
     *
     * @return possible object is
     * {@link Author.Author_Level }
     */
    public Author.Author_Level getAuthor_Level() {
        return author_Level;
    }

    /**
     * 设置author_Level属性的值。
     *
     * @param value allowed object is
     *              {@link Author.Author_Level }
     */
    public void setAuthor_Level(Author.Author_Level value) {
        this.author_Level = value;
    }

    /**
     * 获取author_Role属性的值。
     *
     * @return possible object is
     * {@link Author.Author_Role }
     */
    public Author.Author_Role getAuthor_Role() {
        return author_Role;
    }

    /**
     * 设置author_Role属性的值。
     *
     * @param value allowed object is
     *              {@link Author.Author_Role }
     */
    public void setAuthor_Role(Author.Author_Role value) {
        this.author_Role = value;
    }

    /**
     * 获取author_Affil属性的值。
     *
     * @return possible object is
     * {@link Author.Author_Affil }
     */
    public Author.Author_Affil getAuthor_Affil() {
        return author_Affil;
    }

    /**
     * 设置author_Affil属性的值。
     *
     * @param value allowed object is
     *              {@link Author.Author_Affil }
     */
    public void setAuthor_Affil(Author.Author_Affil value) {
        this.author_Affil = value;
    }

    /**
     * 获取author_IsCorr属性的值。
     *
     * @return possible object is
     * {@link Author.Author_IsCorr }
     */
    public Author.Author_IsCorr getAuthor_IsCorr() {
        return author_IsCorr;
    }

    /**
     * 设置author_IsCorr属性的值。
     *
     * @param value allowed object is
     *              {@link Author.Author_IsCorr }
     */
    public void setAuthor_IsCorr(Author.Author_IsCorr value) {
        this.author_IsCorr = value;
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
    public static class Author_Affil {

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
    public static class Author_IsCorr {

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
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="primary"/>
     *             &lt;enumeration value="secondary"/>
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
    public static class Author_Level {

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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Person-id"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "personId"
    })
    public static class Author_Name {

        @XmlElement(name = "Person-id", required = true)
        protected PersonId personId;

        /**
         * 获取personId属性的值。
         *
         * @return possible object is
         * {@link PersonId }
         */
        public PersonId getPersonId() {
            return personId;
        }

        /**
         * 设置personId属性的值。
         *
         * @param value allowed object is
         *              {@link PersonId }
         */
        public void setPersonId(PersonId value) {
            this.personId = value;
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
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="compiler"/>
     *             &lt;enumeration value="editor"/>
     *             &lt;enumeration value="patent-assignee"/>
     *             &lt;enumeration value="translator"/>
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
    public static class Author_Role {

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
