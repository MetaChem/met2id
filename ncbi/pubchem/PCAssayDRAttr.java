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
 *         &lt;element name="PC-AssayDRAttr_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayDRAttr_descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayDRAttr_dn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayDRAttr_rn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayDRAttr_type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="experimental"/>
 *                       &lt;enumeration value="calculated"/>
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
        "pcAssayDRAttr_Id",
        "pcAssayDRAttr_Descr",
        "pcAssayDRAttr_Dn",
        "pcAssayDRAttr_Rn",
        "pcAssayDRAttr_Type"
})
@XmlRootElement(name = "PC-AssayDRAttr")
public class PCAssayDRAttr {

    @XmlElement(name = "PC-AssayDRAttr_id", required = true)
    protected BigInteger pcAssayDRAttr_Id;
    @XmlElement(name = "PC-AssayDRAttr_descr")
    protected String pcAssayDRAttr_Descr;
    @XmlElement(name = "PC-AssayDRAttr_dn")
    protected String pcAssayDRAttr_Dn;
    @XmlElement(name = "PC-AssayDRAttr_rn")
    protected String pcAssayDRAttr_Rn;
    @XmlElement(name = "PC-AssayDRAttr_type")
    protected PCAssayDRAttr.PCAssayDRAttr_Type pcAssayDRAttr_Type;

    /**
     * ��ȡpcAssayDRAttr_Id���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayDRAttr_Id() {
        return pcAssayDRAttr_Id;
    }

    /**
     * ����pcAssayDRAttr_Id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayDRAttr_Id(BigInteger value) {
        this.pcAssayDRAttr_Id = value;
    }

    /**
     * ��ȡpcAssayDRAttr_Descr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayDRAttr_Descr() {
        return pcAssayDRAttr_Descr;
    }

    /**
     * ����pcAssayDRAttr_Descr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayDRAttr_Descr(String value) {
        this.pcAssayDRAttr_Descr = value;
    }

    /**
     * ��ȡpcAssayDRAttr_Dn���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayDRAttr_Dn() {
        return pcAssayDRAttr_Dn;
    }

    /**
     * ����pcAssayDRAttr_Dn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayDRAttr_Dn(String value) {
        this.pcAssayDRAttr_Dn = value;
    }

    /**
     * ��ȡpcAssayDRAttr_Rn���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayDRAttr_Rn() {
        return pcAssayDRAttr_Rn;
    }

    /**
     * ����pcAssayDRAttr_Rn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayDRAttr_Rn(String value) {
        this.pcAssayDRAttr_Rn = value;
    }

    /**
     * ��ȡpcAssayDRAttr_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDRAttr.PCAssayDRAttr_Type }
     */
    public PCAssayDRAttr.PCAssayDRAttr_Type getPCAssayDRAttr_Type() {
        return pcAssayDRAttr_Type;
    }

    /**
     * ����pcAssayDRAttr_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDRAttr.PCAssayDRAttr_Type }
     */
    public void setPCAssayDRAttr_Type(PCAssayDRAttr.PCAssayDRAttr_Type value) {
        this.pcAssayDRAttr_Type = value;
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
     *             &lt;enumeration value="experimental"/>
     *             &lt;enumeration value="calculated"/>
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
    public static class PCAssayDRAttr_Type {

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
