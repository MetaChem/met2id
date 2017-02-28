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
 *         &lt;element name="PC-StereoPlanar_left" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_ltop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_lbottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_right" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_rtop" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_rbottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPlanar_parity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="same"/>
 *                       &lt;enumeration value="opposite"/>
 *                       &lt;enumeration value="any"/>
 *                       &lt;enumeration value="unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoPlanar_type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="planar"/>
 *                       &lt;enumeration value="cumulenic"/>
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
        "pcStereoPlanar_Left",
        "pcStereoPlanar_Ltop",
        "pcStereoPlanar_Lbottom",
        "pcStereoPlanar_Right",
        "pcStereoPlanar_Rtop",
        "pcStereoPlanar_Rbottom",
        "pcStereoPlanar_Parity",
        "pcStereoPlanar_Type"
})
@XmlRootElement(name = "PC-StereoPlanar")
public class PCStereoPlanar {

    @XmlElement(name = "PC-StereoPlanar_left", required = true)
    protected BigInteger pcStereoPlanar_Left;
    @XmlElement(name = "PC-StereoPlanar_ltop", required = true)
    protected BigInteger pcStereoPlanar_Ltop;
    @XmlElement(name = "PC-StereoPlanar_lbottom", required = true)
    protected BigInteger pcStereoPlanar_Lbottom;
    @XmlElement(name = "PC-StereoPlanar_right", required = true)
    protected BigInteger pcStereoPlanar_Right;
    @XmlElement(name = "PC-StereoPlanar_rtop", required = true)
    protected BigInteger pcStereoPlanar_Rtop;
    @XmlElement(name = "PC-StereoPlanar_rbottom", required = true)
    protected BigInteger pcStereoPlanar_Rbottom;
    @XmlElement(name = "PC-StereoPlanar_parity")
    protected PCStereoPlanar.PCStereoPlanar_Parity pcStereoPlanar_Parity;
    @XmlElement(name = "PC-StereoPlanar_type")
    protected PCStereoPlanar.PCStereoPlanar_Type pcStereoPlanar_Type;

    /**
     * ��ȡpcStereoPlanar_Left���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Left() {
        return pcStereoPlanar_Left;
    }

    /**
     * ����pcStereoPlanar_Left���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Left(BigInteger value) {
        this.pcStereoPlanar_Left = value;
    }

    /**
     * ��ȡpcStereoPlanar_Ltop���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Ltop() {
        return pcStereoPlanar_Ltop;
    }

    /**
     * ����pcStereoPlanar_Ltop���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Ltop(BigInteger value) {
        this.pcStereoPlanar_Ltop = value;
    }

    /**
     * ��ȡpcStereoPlanar_Lbottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Lbottom() {
        return pcStereoPlanar_Lbottom;
    }

    /**
     * ����pcStereoPlanar_Lbottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Lbottom(BigInteger value) {
        this.pcStereoPlanar_Lbottom = value;
    }

    /**
     * ��ȡpcStereoPlanar_Right���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Right() {
        return pcStereoPlanar_Right;
    }

    /**
     * ����pcStereoPlanar_Right���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Right(BigInteger value) {
        this.pcStereoPlanar_Right = value;
    }

    /**
     * ��ȡpcStereoPlanar_Rtop���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Rtop() {
        return pcStereoPlanar_Rtop;
    }

    /**
     * ����pcStereoPlanar_Rtop���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Rtop(BigInteger value) {
        this.pcStereoPlanar_Rtop = value;
    }

    /**
     * ��ȡpcStereoPlanar_Rbottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPlanar_Rbottom() {
        return pcStereoPlanar_Rbottom;
    }

    /**
     * ����pcStereoPlanar_Rbottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPlanar_Rbottom(BigInteger value) {
        this.pcStereoPlanar_Rbottom = value;
    }

    /**
     * ��ȡpcStereoPlanar_Parity���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoPlanar.PCStereoPlanar_Parity }
     */
    public PCStereoPlanar.PCStereoPlanar_Parity getPCStereoPlanar_Parity() {
        return pcStereoPlanar_Parity;
    }

    /**
     * ����pcStereoPlanar_Parity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoPlanar.PCStereoPlanar_Parity }
     */
    public void setPCStereoPlanar_Parity(PCStereoPlanar.PCStereoPlanar_Parity value) {
        this.pcStereoPlanar_Parity = value;
    }

    /**
     * ��ȡpcStereoPlanar_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoPlanar.PCStereoPlanar_Type }
     */
    public PCStereoPlanar.PCStereoPlanar_Type getPCStereoPlanar_Type() {
        return pcStereoPlanar_Type;
    }

    /**
     * ����pcStereoPlanar_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoPlanar.PCStereoPlanar_Type }
     */
    public void setPCStereoPlanar_Type(PCStereoPlanar.PCStereoPlanar_Type value) {
        this.pcStereoPlanar_Type = value;
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
     *             &lt;enumeration value="same"/>
     *             &lt;enumeration value="opposite"/>
     *             &lt;enumeration value="any"/>
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
    public static class PCStereoPlanar_Parity {

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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="planar"/>
     *             &lt;enumeration value="cumulenic"/>
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
    public static class PCStereoPlanar_Type {

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
