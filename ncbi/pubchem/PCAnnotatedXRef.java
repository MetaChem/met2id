//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
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
 *         &lt;element name="PC-AnnotatedXRef_xref">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-XRefData"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AnnotatedXRef_comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AnnotatedXRef_type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="pcit"/>
 *                       &lt;enumeration value="pgene"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
        "pcAnnotatedXRef_Xref",
        "pcAnnotatedXRef_Comment",
        "pcAnnotatedXRef_Type"
})
@XmlRootElement(name = "PC-AnnotatedXRef")
public class PCAnnotatedXRef {

    @XmlElement(name = "PC-AnnotatedXRef_xref", required = true)
    protected PCAnnotatedXRef.PCAnnotatedXRef_Xref pcAnnotatedXRef_Xref;
    @XmlElement(name = "PC-AnnotatedXRef_comment")
    protected String pcAnnotatedXRef_Comment;
    @XmlElement(name = "PC-AnnotatedXRef_type")
    protected PCAnnotatedXRef.PCAnnotatedXRef_Type pcAnnotatedXRef_Type;

    /**
     * ��ȡpcAnnotatedXRef_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAnnotatedXRef.PCAnnotatedXRef_Xref }
     */
    public PCAnnotatedXRef.PCAnnotatedXRef_Xref getPCAnnotatedXRef_Xref() {
        return pcAnnotatedXRef_Xref;
    }

    /**
     * ����pcAnnotatedXRef_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAnnotatedXRef.PCAnnotatedXRef_Xref }
     */
    public void setPCAnnotatedXRef_Xref(PCAnnotatedXRef.PCAnnotatedXRef_Xref value) {
        this.pcAnnotatedXRef_Xref = value;
    }

    /**
     * ��ȡpcAnnotatedXRef_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAnnotatedXRef_Comment() {
        return pcAnnotatedXRef_Comment;
    }

    /**
     * ����pcAnnotatedXRef_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAnnotatedXRef_Comment(String value) {
        this.pcAnnotatedXRef_Comment = value;
    }

    /**
     * ��ȡpcAnnotatedXRef_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAnnotatedXRef.PCAnnotatedXRef_Type }
     */
    public PCAnnotatedXRef.PCAnnotatedXRef_Type getPCAnnotatedXRef_Type() {
        return pcAnnotatedXRef_Type;
    }

    /**
     * ����pcAnnotatedXRef_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAnnotatedXRef.PCAnnotatedXRef_Type }
     */
    public void setPCAnnotatedXRef_Type(PCAnnotatedXRef.PCAnnotatedXRef_Type value) {
        this.pcAnnotatedXRef_Type = value;
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
     *             &lt;enumeration value="pcit"/>
     *             &lt;enumeration value="pgene"/>
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
    public static class PCAnnotatedXRef_Type {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-XRefData"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcxRefData"
    })
    public static class PCAnnotatedXRef_Xref {

        @XmlElement(name = "PC-XRefData", required = true)
        protected PCXRefData pcxRefData;

        /**
         * ��ȡpcxRefData���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCXRefData }
         */
        public PCXRefData getPCXRefData() {
            return pcxRefData;
        }

        /**
         * ����pcxRefData���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCXRefData }
         */
        public void setPCXRefData(PCXRefData value) {
            this.pcxRefData = value;
        }

    }

}
