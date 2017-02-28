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
 *         &lt;element name="PC-AssayPanelTestResult_mid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayPanelTestResult_readout-annot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="regular">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="regular"/>
 *                       &lt;enumeration value="outcome"/>
 *                       &lt;enumeration value="score"/>
 *                       &lt;enumeration value="ac"/>
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
        "pcAssayPanelTestResult_Mid",
        "pcAssayPanelTestResult_ReadoutAnnot"
})
@XmlRootElement(name = "PC-AssayPanelTestResult")
public class PCAssayPanelTestResult {

    @XmlElement(name = "PC-AssayPanelTestResult_mid", required = true)
    protected BigInteger pcAssayPanelTestResult_Mid;
    @XmlElement(name = "PC-AssayPanelTestResult_readout-annot")
    protected PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot pcAssayPanelTestResult_ReadoutAnnot;

    /**
     * ��ȡpcAssayPanelTestResult_Mid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayPanelTestResult_Mid() {
        return pcAssayPanelTestResult_Mid;
    }

    /**
     * ����pcAssayPanelTestResult_Mid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayPanelTestResult_Mid(BigInteger value) {
        this.pcAssayPanelTestResult_Mid = value;
    }

    /**
     * ��ȡpcAssayPanelTestResult_ReadoutAnnot���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot }
     */
    public PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot getPCAssayPanelTestResult_ReadoutAnnot() {
        return pcAssayPanelTestResult_ReadoutAnnot;
    }

    /**
     * ����pcAssayPanelTestResult_ReadoutAnnot���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot }
     */
    public void setPCAssayPanelTestResult_ReadoutAnnot(PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot value) {
        this.pcAssayPanelTestResult_ReadoutAnnot = value;
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
     *       &lt;attribute name="value" default="regular">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="regular"/>
     *             &lt;enumeration value="outcome"/>
     *             &lt;enumeration value="score"/>
     *             &lt;enumeration value="ac"/>
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
    public static class PCAssayPanelTestResult_ReadoutAnnot {

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
            if (stringValue == null) {
                return "regular";
            } else {
                return stringValue;
            }
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
