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
 * <p>PC-CompoundType element declaration�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;element name="PC-CompoundType">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="PC-CompoundType_type" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                   &lt;attribute name="value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="deposited"/>
 *                         &lt;enumeration value="standardized"/>
 *                         &lt;enumeration value="component"/>
 *                         &lt;enumeration value="neutralized"/>
 *                         &lt;enumeration value="mixture"/>
 *                         &lt;enumeration value="tautomer"/>
 *                         &lt;enumeration value="pka-state"/>
 *                         &lt;enumeration value="unknown"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PC-CompoundType_id" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="PC-CompoundType_id_cid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                     &lt;element name="PC-CompoundType_id_sid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                     &lt;element name="PC-CompoundType_id_xid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcCompoundType_Type",
        "pcCompoundType_Id"
})
@XmlRootElement(name = "PC-CompoundType")
public class PCCompoundTypeClass {

    @XmlElement(name = "PC-CompoundType_type")
    protected PCCompoundTypeClass.PCCompoundType_Type pcCompoundType_Type;
    @XmlElement(name = "PC-CompoundType_id")
    protected PCCompoundTypeClass.PCCompoundType_Id pcCompoundType_Id;

    /**
     * ��ȡpcCompoundType_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompoundTypeClass.PCCompoundType_Type }
     */
    public PCCompoundTypeClass.PCCompoundType_Type getPCCompoundType_Type() {
        return pcCompoundType_Type;
    }

    /**
     * ����pcCompoundType_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompoundTypeClass.PCCompoundType_Type }
     */
    public void setPCCompoundType_Type(PCCompoundTypeClass.PCCompoundType_Type value) {
        this.pcCompoundType_Type = value;
    }

    /**
     * ��ȡpcCompoundType_Id���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompoundTypeClass.PCCompoundType_Id }
     */
    public PCCompoundTypeClass.PCCompoundType_Id getPCCompoundType_Id() {
        return pcCompoundType_Id;
    }

    /**
     * ����pcCompoundType_Id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompoundTypeClass.PCCompoundType_Id }
     */
    public void setPCCompoundType_Id(PCCompoundTypeClass.PCCompoundType_Id value) {
        this.pcCompoundType_Id = value;
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
     *       &lt;choice>
     *         &lt;element name="PC-CompoundType_id_cid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-CompoundType_id_sid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-CompoundType_id_xid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCompoundType_Id_Cid",
            "pcCompoundType_Id_Sid",
            "pcCompoundType_Id_Xid"
    })
    public static class PCCompoundType_Id {

        @XmlElement(name = "PC-CompoundType_id_cid")
        protected BigInteger pcCompoundType_Id_Cid;
        @XmlElement(name = "PC-CompoundType_id_sid")
        protected BigInteger pcCompoundType_Id_Sid;
        @XmlElement(name = "PC-CompoundType_id_xid")
        protected BigInteger pcCompoundType_Id_Xid;

        /**
         * ��ȡpcCompoundType_Id_Cid���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCCompoundType_Id_Cid() {
            return pcCompoundType_Id_Cid;
        }

        /**
         * ����pcCompoundType_Id_Cid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCCompoundType_Id_Cid(BigInteger value) {
            this.pcCompoundType_Id_Cid = value;
        }

        /**
         * ��ȡpcCompoundType_Id_Sid���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCCompoundType_Id_Sid() {
            return pcCompoundType_Id_Sid;
        }

        /**
         * ����pcCompoundType_Id_Sid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCCompoundType_Id_Sid(BigInteger value) {
            this.pcCompoundType_Id_Sid = value;
        }

        /**
         * ��ȡpcCompoundType_Id_Xid���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCCompoundType_Id_Xid() {
            return pcCompoundType_Id_Xid;
        }

        /**
         * ����pcCompoundType_Id_Xid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCCompoundType_Id_Xid(BigInteger value) {
            this.pcCompoundType_Id_Xid = value;
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
     *             &lt;enumeration value="deposited"/>
     *             &lt;enumeration value="standardized"/>
     *             &lt;enumeration value="component"/>
     *             &lt;enumeration value="neutralized"/>
     *             &lt;enumeration value="mixture"/>
     *             &lt;enumeration value="tautomer"/>
     *             &lt;enumeration value="pka-state"/>
     *             &lt;enumeration value="unknown"/>
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
    public static class PCCompoundType_Type {

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
