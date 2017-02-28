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
 *         &lt;element name="TaxElement_fixed-level">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="other"/>
 *                       &lt;enumeration value="family"/>
 *                       &lt;enumeration value="order"/>
 *                       &lt;enumeration value="class"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxElement_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxElement_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "taxElement_FixedLevel",
        "taxElement_Level",
        "taxElement_Name"
})
@XmlRootElement(name = "TaxElement")
public class TaxElement {

    @XmlElement(name = "TaxElement_fixed-level", required = true)
    protected TaxElement.TaxElement_FixedLevel taxElement_FixedLevel;
    @XmlElement(name = "TaxElement_level")
    protected String taxElement_Level;
    @XmlElement(name = "TaxElement_name", required = true)
    protected String taxElement_Name;

    /**
     * ��ȡtaxElement_FixedLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link TaxElement.TaxElement_FixedLevel }
     */
    public TaxElement.TaxElement_FixedLevel getTaxElement_FixedLevel() {
        return taxElement_FixedLevel;
    }

    /**
     * ����taxElement_FixedLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TaxElement.TaxElement_FixedLevel }
     */
    public void setTaxElement_FixedLevel(TaxElement.TaxElement_FixedLevel value) {
        this.taxElement_FixedLevel = value;
    }

    /**
     * ��ȡtaxElement_Level���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxElement_Level() {
        return taxElement_Level;
    }

    /**
     * ����taxElement_Level���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxElement_Level(String value) {
        this.taxElement_Level = value;
    }

    /**
     * ��ȡtaxElement_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxElement_Name() {
        return taxElement_Name;
    }

    /**
     * ����taxElement_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxElement_Name(String value) {
        this.taxElement_Name = value;
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
     *             &lt;enumeration value="family"/>
     *             &lt;enumeration value="order"/>
     *             &lt;enumeration value="class"/>
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
    public static class TaxElement_FixedLevel {

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
