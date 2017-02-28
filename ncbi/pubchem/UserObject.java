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
     * ��ȡuserObject_Class���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserObject_Class() {
        return userObject_Class;
    }

    /**
     * ����userObject_Class���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserObject_Class(String value) {
        this.userObject_Class = value;
    }

    /**
     * ��ȡuserObject_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link UserObject.UserObject_Type }
     */
    public UserObject.UserObject_Type getUserObject_Type() {
        return userObject_Type;
    }

    /**
     * ����userObject_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UserObject.UserObject_Type }
     */
    public void setUserObject_Type(UserObject.UserObject_Type value) {
        this.userObject_Type = value;
    }

    /**
     * ��ȡuserObject_Data���Ե�ֵ��
     *
     * @return possible object is
     * {@link UserObject.UserObject_Data }
     */
    public UserObject.UserObject_Data getUserObject_Data() {
        return userObject_Data;
    }

    /**
     * ����userObject_Data���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UserObject.UserObject_Data }
     */
    public void setUserObject_Data(UserObject.UserObject_Data value) {
        this.userObject_Data = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡobjectId���Ե�ֵ��
         *
         * @return possible object is
         * {@link ObjectId }
         */
        public ObjectId getObjectId() {
            return objectId;
        }

        /**
         * ����objectId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ObjectId }
         */
        public void setObjectId(ObjectId value) {
            this.objectId = value;
        }

    }

}
