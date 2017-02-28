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
 *         &lt;element name="Medline-si_type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ddbj"/>
 *                       &lt;enumeration value="carbbank"/>
 *                       &lt;enumeration value="embl"/>
 *                       &lt;enumeration value="hdb"/>
 *                       &lt;enumeration value="genbank"/>
 *                       &lt;enumeration value="hgml"/>
 *                       &lt;enumeration value="mim"/>
 *                       &lt;enumeration value="msd"/>
 *                       &lt;enumeration value="pdb"/>
 *                       &lt;enumeration value="pir"/>
 *                       &lt;enumeration value="prfseqdb"/>
 *                       &lt;enumeration value="psd"/>
 *                       &lt;enumeration value="swissprot"/>
 *                       &lt;enumeration value="gdb"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Medline-si_cit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "medlineSi_Type",
        "medlineSi_Cit"
})
@XmlRootElement(name = "Medline-si")
public class MedlineSi {

    @XmlElement(name = "Medline-si_type", required = true)
    protected MedlineSi.MedlineSi_Type medlineSi_Type;
    @XmlElement(name = "Medline-si_cit")
    protected String medlineSi_Cit;

    /**
     * ��ȡmedlineSi_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineSi.MedlineSi_Type }
     */
    public MedlineSi.MedlineSi_Type getMedlineSi_Type() {
        return medlineSi_Type;
    }

    /**
     * ����medlineSi_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineSi.MedlineSi_Type }
     */
    public void setMedlineSi_Type(MedlineSi.MedlineSi_Type value) {
        this.medlineSi_Type = value;
    }

    /**
     * ��ȡmedlineSi_Cit���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineSi_Cit() {
        return medlineSi_Cit;
    }

    /**
     * ����medlineSi_Cit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineSi_Cit(String value) {
        this.medlineSi_Cit = value;
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
     *             &lt;enumeration value="ddbj"/>
     *             &lt;enumeration value="carbbank"/>
     *             &lt;enumeration value="embl"/>
     *             &lt;enumeration value="hdb"/>
     *             &lt;enumeration value="genbank"/>
     *             &lt;enumeration value="hgml"/>
     *             &lt;enumeration value="mim"/>
     *             &lt;enumeration value="msd"/>
     *             &lt;enumeration value="pdb"/>
     *             &lt;enumeration value="pir"/>
     *             &lt;enumeration value="prfseqdb"/>
     *             &lt;enumeration value="psd"/>
     *             &lt;enumeration value="swissprot"/>
     *             &lt;enumeration value="gdb"/>
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
    public static class MedlineSi_Type {

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
