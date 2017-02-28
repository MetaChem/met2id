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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Medline-field_type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="other"/>
 *                       &lt;enumeration value="comment"/>
 *                       &lt;enumeration value="erratum"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-field_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Medline-field_ids" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}DocRef"/>
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
        "medlineField_Type",
        "medlineField_Str",
        "medlineField_Ids"
})
@XmlRootElement(name = "Medline-field")
public class MedlineField {

    @XmlElement(name = "Medline-field_type", required = true)
    protected MedlineField.MedlineField_Type medlineField_Type;
    @XmlElement(name = "Medline-field_str", required = true)
    protected String medlineField_Str;
    @XmlElement(name = "Medline-field_ids")
    protected MedlineField.MedlineField_Ids medlineField_Ids;

    /**
     * ��ȡmedlineField_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineField.MedlineField_Type }
     */
    public MedlineField.MedlineField_Type getMedlineField_Type() {
        return medlineField_Type;
    }

    /**
     * ����medlineField_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineField.MedlineField_Type }
     */
    public void setMedlineField_Type(MedlineField.MedlineField_Type value) {
        this.medlineField_Type = value;
    }

    /**
     * ��ȡmedlineField_Str���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineField_Str() {
        return medlineField_Str;
    }

    /**
     * ����medlineField_Str���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineField_Str(String value) {
        this.medlineField_Str = value;
    }

    /**
     * ��ȡmedlineField_Ids���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineField.MedlineField_Ids }
     */
    public MedlineField.MedlineField_Ids getMedlineField_Ids() {
        return medlineField_Ids;
    }

    /**
     * ����medlineField_Ids���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineField.MedlineField_Ids }
     */
    public void setMedlineField_Ids(MedlineField.MedlineField_Ids value) {
        this.medlineField_Ids = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}DocRef"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "docRef"
    })
    public static class MedlineField_Ids {

        @XmlElement(name = "DocRef")
        protected List<DocRef> docRef;

        /**
         * Gets the value of the docRef property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docRef property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocRef().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocRef }
         */
        public List<DocRef> getDocRef() {
            if (docRef == null) {
                docRef = new ArrayList<DocRef>();
            }
            return this.docRef;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="other"/>
     *             &lt;enumeration value="comment"/>
     *             &lt;enumeration value="erratum"/>
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
    public static class MedlineField_Type {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String stringValue;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * ��ȡstringValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStringValue() {
            return stringValue;
        }

        /**
         * ����stringValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStringValue(String value) {
            this.stringValue = value;
        }

    }

}
