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
 *         &lt;element name="Medline-qual_mp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" default="false">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="true"/>
 *                       &lt;enumeration value="false"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-qual_subh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "medlineQual_Mp",
        "medlineQual_Subh"
})
@XmlRootElement(name = "Medline-qual")
public class MedlineQual {

    @XmlElement(name = "Medline-qual_mp")
    protected MedlineQual.MedlineQual_Mp medlineQual_Mp;
    @XmlElement(name = "Medline-qual_subh", required = true)
    protected String medlineQual_Subh;

    /**
     * ��ȡmedlineQual_Mp���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineQual.MedlineQual_Mp }
     */
    public MedlineQual.MedlineQual_Mp getMedlineQual_Mp() {
        return medlineQual_Mp;
    }

    /**
     * ����medlineQual_Mp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineQual.MedlineQual_Mp }
     */
    public void setMedlineQual_Mp(MedlineQual.MedlineQual_Mp value) {
        this.medlineQual_Mp = value;
    }

    /**
     * ��ȡmedlineQual_Subh���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineQual_Subh() {
        return medlineQual_Subh;
    }

    /**
     * ����medlineQual_Subh���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineQual_Subh(String value) {
        this.medlineQual_Subh = value;
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
     *       &lt;attribute name="value" default="false">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="true"/>
     *             &lt;enumeration value="false"/>
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
    public static class MedlineQual_Mp {

        @XmlAttribute(name = "value")
        protected String value;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            if (value == null) {
                return "false";
            } else {
                return value;
            }
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
