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
 *         &lt;element name="PC-AtomRadical_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AtomRadical_type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="singlet"/>
 *                       &lt;enumeration value="doublet"/>
 *                       &lt;enumeration value="triplet"/>
 *                       &lt;enumeration value="quartet"/>
 *                       &lt;enumeration value="quintet"/>
 *                       &lt;enumeration value="hextet"/>
 *                       &lt;enumeration value="heptet"/>
 *                       &lt;enumeration value="octet"/>
 *                       &lt;enumeration value="none"/>
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
        "pcAtomRadical_Aid",
        "pcAtomRadical_Type"
})
@XmlRootElement(name = "PC-AtomRadical")
public class PCAtomRadical {

    @XmlElement(name = "PC-AtomRadical_aid", required = true)
    protected BigInteger pcAtomRadical_Aid;
    @XmlElement(name = "PC-AtomRadical_type", required = true)
    protected PCAtomRadical.PCAtomRadical_Type pcAtomRadical_Type;

    /**
     * ��ȡpcAtomRadical_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAtomRadical_Aid() {
        return pcAtomRadical_Aid;
    }

    /**
     * ����pcAtomRadical_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAtomRadical_Aid(BigInteger value) {
        this.pcAtomRadical_Aid = value;
    }

    /**
     * ��ȡpcAtomRadical_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtomRadical.PCAtomRadical_Type }
     */
    public PCAtomRadical.PCAtomRadical_Type getPCAtomRadical_Type() {
        return pcAtomRadical_Type;
    }

    /**
     * ����pcAtomRadical_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtomRadical.PCAtomRadical_Type }
     */
    public void setPCAtomRadical_Type(PCAtomRadical.PCAtomRadical_Type value) {
        this.pcAtomRadical_Type = value;
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
     *             &lt;enumeration value="singlet"/>
     *             &lt;enumeration value="doublet"/>
     *             &lt;enumeration value="triplet"/>
     *             &lt;enumeration value="quartet"/>
     *             &lt;enumeration value="quintet"/>
     *             &lt;enumeration value="hextet"/>
     *             &lt;enumeration value="heptet"/>
     *             &lt;enumeration value="octet"/>
     *             &lt;enumeration value="none"/>
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
    public static class PCAtomRadical_Type {

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
