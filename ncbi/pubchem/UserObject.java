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
 *         &lt;element name="User-object_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User-object_type">
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
 *         &lt;element name="User-object_data">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userObject_Class",
        "userObject_Type",
        "userObject_Data"
})
@XmlRootElement(name = "User-object")
public class UserObject {

    @XmlElement(name = "User-object_class")
    protected String userObject_Class;
    @XmlElement(name = "User-object_type", required = true)
    protected UserObject.UserObject_Type userObject_Type;
    @XmlElement(name = "User-object_data", required = true)
    protected UserObject.UserObject_Data userObject_Data;

    /**
     * 获取userObject_Class属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserObject_Class() {
        return userObject_Class;
    }

    /**
     * 设置userObject_Class属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserObject_Class(String value) {
        this.userObject_Class = value;
    }

    /**
     * 获取userObject_Type属性的值。
     *
     * @return possible object is
     * {@link UserObject.UserObject_Type }
     */
    public UserObject.UserObject_Type getUserObject_Type() {
        return userObject_Type;
    }

    /**
     * 设置userObject_Type属性的值。
     *
     * @param value allowed object is
     *              {@link UserObject.UserObject_Type }
     */
    public void setUserObject_Type(UserObject.UserObject_Type value) {
        this.userObject_Type = value;
    }

    /**
     * 获取userObject_Data属性的值。
     *
     * @return possible object is
     * {@link UserObject.UserObject_Data }
     */
    public UserObject.UserObject_Data getUserObject_Data() {
        return userObject_Data;
    }

    /**
     * 设置userObject_Data属性的值。
     *
     * @param value allowed object is
     *              {@link UserObject.UserObject_Data }
     */
    public void setUserObject_Data(UserObject.UserObject_Data value) {
        this.userObject_Data = value;
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
    public static class UserObject_Data {

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
    public static class UserObject_Type {

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
