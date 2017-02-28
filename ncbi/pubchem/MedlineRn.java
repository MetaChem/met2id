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
 *         &lt;element name="Medline-rn_type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="nameonly"/>
 *                       &lt;enumeration value="cas"/>
 *                       &lt;enumeration value="ec"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-rn_cit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Medline-rn_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "medlineRn_Type",
        "medlineRn_Cit",
        "medlineRn_Name"
})
@XmlRootElement(name = "Medline-rn")
public class MedlineRn {

    @XmlElement(name = "Medline-rn_type", required = true)
    protected MedlineRn.MedlineRn_Type medlineRn_Type;
    @XmlElement(name = "Medline-rn_cit")
    protected String medlineRn_Cit;
    @XmlElement(name = "Medline-rn_name", required = true)
    protected String medlineRn_Name;

    /**
     * ��ȡmedlineRn_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineRn.MedlineRn_Type }
     */
    public MedlineRn.MedlineRn_Type getMedlineRn_Type() {
        return medlineRn_Type;
    }

    /**
     * ����medlineRn_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineRn.MedlineRn_Type }
     */
    public void setMedlineRn_Type(MedlineRn.MedlineRn_Type value) {
        this.medlineRn_Type = value;
    }

    /**
     * ��ȡmedlineRn_Cit���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineRn_Cit() {
        return medlineRn_Cit;
    }

    /**
     * ����medlineRn_Cit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineRn_Cit(String value) {
        this.medlineRn_Cit = value;
    }

    /**
     * ��ȡmedlineRn_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineRn_Name() {
        return medlineRn_Name;
    }

    /**
     * ����medlineRn_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineRn_Name(String value) {
        this.medlineRn_Name = value;
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
     *             &lt;enumeration value="nameonly"/>
     *             &lt;enumeration value="cas"/>
     *             &lt;enumeration value="ec"/>
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
    public static class MedlineRn_Type {

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
