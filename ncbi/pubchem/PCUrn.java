//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="PC-Urn_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-Urn_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_datatype" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-UrnDataType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Urn_parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_implementation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-Urn_release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcUrn_Label",
        "pcUrn_Name",
        "pcUrn_Datatype",
        "pcUrn_Parameters",
        "pcUrn_Implementation",
        "pcUrn_Version",
        "pcUrn_Software",
        "pcUrn_Source",
        "pcUrn_Release"
})
@XmlRootElement(name = "PC-Urn")
public class PCUrn {

    @XmlElement(name = "PC-Urn_label", required = true)
    protected String pcUrn_Label;
    @XmlElement(name = "PC-Urn_name")
    protected String pcUrn_Name;
    @XmlElement(name = "PC-Urn_datatype")
    protected PCUrn.PCUrn_Datatype pcUrn_Datatype;
    @XmlElement(name = "PC-Urn_parameters")
    protected String pcUrn_Parameters;
    @XmlElement(name = "PC-Urn_implementation")
    protected String pcUrn_Implementation;
    @XmlElement(name = "PC-Urn_version")
    protected String pcUrn_Version;
    @XmlElement(name = "PC-Urn_software")
    protected String pcUrn_Software;
    @XmlElement(name = "PC-Urn_source")
    protected String pcUrn_Source;
    @XmlElement(name = "PC-Urn_release")
    protected String pcUrn_Release;

    /**
     * ��ȡpcUrn_Label���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Label() {
        return pcUrn_Label;
    }

    /**
     * ����pcUrn_Label���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Label(String value) {
        this.pcUrn_Label = value;
    }

    /**
     * ��ȡpcUrn_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Name() {
        return pcUrn_Name;
    }

    /**
     * ����pcUrn_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Name(String value) {
        this.pcUrn_Name = value;
    }

    /**
     * ��ȡpcUrn_Datatype���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCUrn.PCUrn_Datatype }
     */
    public PCUrn.PCUrn_Datatype getPCUrn_Datatype() {
        return pcUrn_Datatype;
    }

    /**
     * ����pcUrn_Datatype���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCUrn.PCUrn_Datatype }
     */
    public void setPCUrn_Datatype(PCUrn.PCUrn_Datatype value) {
        this.pcUrn_Datatype = value;
    }

    /**
     * ��ȡpcUrn_Parameters���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Parameters() {
        return pcUrn_Parameters;
    }

    /**
     * ����pcUrn_Parameters���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Parameters(String value) {
        this.pcUrn_Parameters = value;
    }

    /**
     * ��ȡpcUrn_Implementation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Implementation() {
        return pcUrn_Implementation;
    }

    /**
     * ����pcUrn_Implementation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Implementation(String value) {
        this.pcUrn_Implementation = value;
    }

    /**
     * ��ȡpcUrn_Version���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Version() {
        return pcUrn_Version;
    }

    /**
     * ����pcUrn_Version���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Version(String value) {
        this.pcUrn_Version = value;
    }

    /**
     * ��ȡpcUrn_Software���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Software() {
        return pcUrn_Software;
    }

    /**
     * ����pcUrn_Software���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Software(String value) {
        this.pcUrn_Software = value;
    }

    /**
     * ��ȡpcUrn_Source���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Source() {
        return pcUrn_Source;
    }

    /**
     * ����pcUrn_Source���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Source(String value) {
        this.pcUrn_Source = value;
    }

    /**
     * ��ȡpcUrn_Release���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCUrn_Release() {
        return pcUrn_Release;
    }

    /**
     * ����pcUrn_Release���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCUrn_Release(String value) {
        this.pcUrn_Release = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-UrnDataType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcUrnDataType"
    })
    public static class PCUrn_Datatype {

        @XmlElement(name = "PC-UrnDataType", required = true)
        protected PCUrnDataType pcUrnDataType;

        /**
         * ��ȡpcUrnDataType���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCUrnDataType }
         */
        public PCUrnDataType getPCUrnDataType() {
            return pcUrnDataType;
        }

        /**
         * ����pcUrnDataType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCUrnDataType }
         */
        public void setPCUrnDataType(PCUrnDataType value) {
            this.pcUrnDataType = value;
        }

    }

}
