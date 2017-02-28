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
 *         &lt;element name="PC-ConcentrationAttr_concentration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PC-ConcentrationAttr_unit">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="um"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ConcentrationAttr_dr-id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcConcentrationAttr_Concentration",
        "pcConcentrationAttr_Unit",
        "pcConcentrationAttr_DrId"
})
@XmlRootElement(name = "PC-ConcentrationAttr")
public class PCConcentrationAttr {

    @XmlElement(name = "PC-ConcentrationAttr_concentration")
    protected double pcConcentrationAttr_Concentration;
    @XmlElement(name = "PC-ConcentrationAttr_unit", required = true)
    protected PCConcentrationAttr.PCConcentrationAttr_Unit pcConcentrationAttr_Unit;
    @XmlElement(name = "PC-ConcentrationAttr_dr-id")
    protected BigInteger pcConcentrationAttr_DrId;

    /**
     * ��ȡpcConcentrationAttr_Concentration���Ե�ֵ��
     */
    public double getPCConcentrationAttr_Concentration() {
        return pcConcentrationAttr_Concentration;
    }

    /**
     * ����pcConcentrationAttr_Concentration���Ե�ֵ��
     */
    public void setPCConcentrationAttr_Concentration(double value) {
        this.pcConcentrationAttr_Concentration = value;
    }

    /**
     * ��ȡpcConcentrationAttr_Unit���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConcentrationAttr.PCConcentrationAttr_Unit }
     */
    public PCConcentrationAttr.PCConcentrationAttr_Unit getPCConcentrationAttr_Unit() {
        return pcConcentrationAttr_Unit;
    }

    /**
     * ����pcConcentrationAttr_Unit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConcentrationAttr.PCConcentrationAttr_Unit }
     */
    public void setPCConcentrationAttr_Unit(PCConcentrationAttr.PCConcentrationAttr_Unit value) {
        this.pcConcentrationAttr_Unit = value;
    }

    /**
     * ��ȡpcConcentrationAttr_DrId���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCConcentrationAttr_DrId() {
        return pcConcentrationAttr_DrId;
    }

    /**
     * ����pcConcentrationAttr_DrId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCConcentrationAttr_DrId(BigInteger value) {
        this.pcConcentrationAttr_DrId = value;
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
     *             &lt;enumeration value="um"/>
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
    public static class PCConcentrationAttr_Unit {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String intValue;

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
         * ��ȡintValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIntValue() {
            return intValue;
        }

        /**
         * ����intValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIntValue(String value) {
            this.intValue = value;
        }

    }

}
