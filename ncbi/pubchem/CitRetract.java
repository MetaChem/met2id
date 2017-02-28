//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CitRetract_type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="retracted"/>
 *                       &lt;enumeration value="notice"/>
 *                       &lt;enumeration value="in-error"/>
 *                       &lt;enumeration value="erratum"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CitRetract_exp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "citRetract_Type",
        "citRetract_Exp"
})
@XmlRootElement(name = "CitRetract")
public class CitRetract {

    @XmlElement(name = "CitRetract_type", required = true)
    protected CitRetract.CitRetract_Type citRetract_Type;
    @XmlElement(name = "CitRetract_exp")
    protected String citRetract_Exp;

    /**
     * ��ȡcitRetract_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitRetract.CitRetract_Type }
     */
    public CitRetract.CitRetract_Type getCitRetract_Type() {
        return citRetract_Type;
    }

    /**
     * ����citRetract_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitRetract.CitRetract_Type }
     */
    public void setCitRetract_Type(CitRetract.CitRetract_Type value) {
        this.citRetract_Type = value;
    }

    /**
     * ��ȡcitRetract_Exp���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitRetract_Exp() {
        return citRetract_Exp;
    }

    /**
     * ����citRetract_Exp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitRetract_Exp(String value) {
        this.citRetract_Exp = value;
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
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="retracted"/>
     *             &lt;enumeration value="notice"/>
     *             &lt;enumeration value="in-error"/>
     *             &lt;enumeration value="erratum"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CitRetract_Type {

        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
