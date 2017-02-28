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
 *         &lt;element name="PC-StereoTetrahedral_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTetrahedral_above" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTetrahedral_top" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTetrahedral_bottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTetrahedral_below" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTetrahedral_parity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="clockwise"/>
 *                       &lt;enumeration value="counterclockwise"/>
 *                       &lt;enumeration value="any"/>
 *                       &lt;enumeration value="unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoTetrahedral_type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="tetrahedral"/>
 *                       &lt;enumeration value="cumulenic"/>
 *                       &lt;enumeration value="biaryl"/>
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
        "pcStereoTetrahedral_Center",
        "pcStereoTetrahedral_Above",
        "pcStereoTetrahedral_Top",
        "pcStereoTetrahedral_Bottom",
        "pcStereoTetrahedral_Below",
        "pcStereoTetrahedral_Parity",
        "pcStereoTetrahedral_Type"
})
@XmlRootElement(name = "PC-StereoTetrahedral")
public class PCStereoTetrahedral {

    @XmlElement(name = "PC-StereoTetrahedral_center", required = true)
    protected BigInteger pcStereoTetrahedral_Center;
    @XmlElement(name = "PC-StereoTetrahedral_above", required = true)
    protected BigInteger pcStereoTetrahedral_Above;
    @XmlElement(name = "PC-StereoTetrahedral_top", required = true)
    protected BigInteger pcStereoTetrahedral_Top;
    @XmlElement(name = "PC-StereoTetrahedral_bottom", required = true)
    protected BigInteger pcStereoTetrahedral_Bottom;
    @XmlElement(name = "PC-StereoTetrahedral_below", required = true)
    protected BigInteger pcStereoTetrahedral_Below;
    @XmlElement(name = "PC-StereoTetrahedral_parity")
    protected PCStereoTetrahedral.PCStereoTetrahedral_Parity pcStereoTetrahedral_Parity;
    @XmlElement(name = "PC-StereoTetrahedral_type")
    protected PCStereoTetrahedral.PCStereoTetrahedral_Type pcStereoTetrahedral_Type;

    /**
     * ��ȡpcStereoTetrahedral_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTetrahedral_Center() {
        return pcStereoTetrahedral_Center;
    }

    /**
     * ����pcStereoTetrahedral_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTetrahedral_Center(BigInteger value) {
        this.pcStereoTetrahedral_Center = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Above���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTetrahedral_Above() {
        return pcStereoTetrahedral_Above;
    }

    /**
     * ����pcStereoTetrahedral_Above���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTetrahedral_Above(BigInteger value) {
        this.pcStereoTetrahedral_Above = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Top���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTetrahedral_Top() {
        return pcStereoTetrahedral_Top;
    }

    /**
     * ����pcStereoTetrahedral_Top���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTetrahedral_Top(BigInteger value) {
        this.pcStereoTetrahedral_Top = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Bottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTetrahedral_Bottom() {
        return pcStereoTetrahedral_Bottom;
    }

    /**
     * ����pcStereoTetrahedral_Bottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTetrahedral_Bottom(BigInteger value) {
        this.pcStereoTetrahedral_Bottom = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Below���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTetrahedral_Below() {
        return pcStereoTetrahedral_Below;
    }

    /**
     * ����pcStereoTetrahedral_Below���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTetrahedral_Below(BigInteger value) {
        this.pcStereoTetrahedral_Below = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Parity���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoTetrahedral.PCStereoTetrahedral_Parity }
     */
    public PCStereoTetrahedral.PCStereoTetrahedral_Parity getPCStereoTetrahedral_Parity() {
        return pcStereoTetrahedral_Parity;
    }

    /**
     * ����pcStereoTetrahedral_Parity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoTetrahedral.PCStereoTetrahedral_Parity }
     */
    public void setPCStereoTetrahedral_Parity(PCStereoTetrahedral.PCStereoTetrahedral_Parity value) {
        this.pcStereoTetrahedral_Parity = value;
    }

    /**
     * ��ȡpcStereoTetrahedral_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoTetrahedral.PCStereoTetrahedral_Type }
     */
    public PCStereoTetrahedral.PCStereoTetrahedral_Type getPCStereoTetrahedral_Type() {
        return pcStereoTetrahedral_Type;
    }

    /**
     * ����pcStereoTetrahedral_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoTetrahedral.PCStereoTetrahedral_Type }
     */
    public void setPCStereoTetrahedral_Type(PCStereoTetrahedral.PCStereoTetrahedral_Type value) {
        this.pcStereoTetrahedral_Type = value;
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
     *             &lt;enumeration value="clockwise"/>
     *             &lt;enumeration value="counterclockwise"/>
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
    public static class PCStereoTetrahedral_Parity {

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
     *             &lt;enumeration value="tetrahedral"/>
     *             &lt;enumeration value="cumulenic"/>
     *             &lt;enumeration value="biaryl"/>
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
    public static class PCStereoTetrahedral_Type {

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
