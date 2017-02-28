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
 *         &lt;element name="PC-StereoSquarePlanar_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoSquarePlanar_lbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoSquarePlanar_rbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoSquarePlanar_labove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoSquarePlanar_rabove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoSquarePlanar_parity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="u-shape"/>
 *                       &lt;enumeration value="z-shape"/>
 *                       &lt;enumeration value="x-shape"/>
 *                       &lt;enumeration value="any"/>
 *                       &lt;enumeration value="unknown"/>
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
        "pcStereoSquarePlanar_Center",
        "pcStereoSquarePlanar_Lbelow",
        "pcStereoSquarePlanar_Rbelow",
        "pcStereoSquarePlanar_Labove",
        "pcStereoSquarePlanar_Rabove",
        "pcStereoSquarePlanar_Parity"
})
@XmlRootElement(name = "PC-StereoSquarePlanar")
public class PCStereoSquarePlanar {

    @XmlElement(name = "PC-StereoSquarePlanar_center", required = true)
    protected BigInteger pcStereoSquarePlanar_Center;
    @XmlElement(name = "PC-StereoSquarePlanar_lbelow", required = true)
    protected BigInteger pcStereoSquarePlanar_Lbelow;
    @XmlElement(name = "PC-StereoSquarePlanar_rbelow", required = true)
    protected BigInteger pcStereoSquarePlanar_Rbelow;
    @XmlElement(name = "PC-StereoSquarePlanar_labove", required = true)
    protected BigInteger pcStereoSquarePlanar_Labove;
    @XmlElement(name = "PC-StereoSquarePlanar_rabove", required = true)
    protected BigInteger pcStereoSquarePlanar_Rabove;
    @XmlElement(name = "PC-StereoSquarePlanar_parity")
    protected PCStereoSquarePlanar.PCStereoSquarePlanar_Parity pcStereoSquarePlanar_Parity;

    /**
     * ��ȡpcStereoSquarePlanar_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoSquarePlanar_Center() {
        return pcStereoSquarePlanar_Center;
    }

    /**
     * ����pcStereoSquarePlanar_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoSquarePlanar_Center(BigInteger value) {
        this.pcStereoSquarePlanar_Center = value;
    }

    /**
     * ��ȡpcStereoSquarePlanar_Lbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoSquarePlanar_Lbelow() {
        return pcStereoSquarePlanar_Lbelow;
    }

    /**
     * ����pcStereoSquarePlanar_Lbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoSquarePlanar_Lbelow(BigInteger value) {
        this.pcStereoSquarePlanar_Lbelow = value;
    }

    /**
     * ��ȡpcStereoSquarePlanar_Rbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoSquarePlanar_Rbelow() {
        return pcStereoSquarePlanar_Rbelow;
    }

    /**
     * ����pcStereoSquarePlanar_Rbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoSquarePlanar_Rbelow(BigInteger value) {
        this.pcStereoSquarePlanar_Rbelow = value;
    }

    /**
     * ��ȡpcStereoSquarePlanar_Labove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoSquarePlanar_Labove() {
        return pcStereoSquarePlanar_Labove;
    }

    /**
     * ����pcStereoSquarePlanar_Labove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoSquarePlanar_Labove(BigInteger value) {
        this.pcStereoSquarePlanar_Labove = value;
    }

    /**
     * ��ȡpcStereoSquarePlanar_Rabove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoSquarePlanar_Rabove() {
        return pcStereoSquarePlanar_Rabove;
    }

    /**
     * ����pcStereoSquarePlanar_Rabove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoSquarePlanar_Rabove(BigInteger value) {
        this.pcStereoSquarePlanar_Rabove = value;
    }

    /**
     * ��ȡpcStereoSquarePlanar_Parity���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoSquarePlanar.PCStereoSquarePlanar_Parity }
     */
    public PCStereoSquarePlanar.PCStereoSquarePlanar_Parity getPCStereoSquarePlanar_Parity() {
        return pcStereoSquarePlanar_Parity;
    }

    /**
     * ����pcStereoSquarePlanar_Parity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoSquarePlanar.PCStereoSquarePlanar_Parity }
     */
    public void setPCStereoSquarePlanar_Parity(PCStereoSquarePlanar.PCStereoSquarePlanar_Parity value) {
        this.pcStereoSquarePlanar_Parity = value;
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
     *             &lt;enumeration value="u-shape"/>
     *             &lt;enumeration value="z-shape"/>
     *             &lt;enumeration value="x-shape"/>
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
    public static class PCStereoSquarePlanar_Parity {

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
