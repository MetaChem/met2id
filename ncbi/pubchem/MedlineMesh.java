//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Medline-mesh_mp" minOccurs="0">
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
 *         &lt;element name="Medline-mesh_term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Medline-mesh_qual" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-qual"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
        "medlineMesh_Mp",
        "medlineMesh_Term",
        "medlineMesh_Qual"
})
@XmlRootElement(name = "Medline-mesh")
public class MedlineMesh {

    @XmlElement(name = "Medline-mesh_mp")
    protected MedlineMesh.MedlineMesh_Mp medlineMesh_Mp;
    @XmlElement(name = "Medline-mesh_term", required = true)
    protected String medlineMesh_Term;
    @XmlElement(name = "Medline-mesh_qual")
    protected MedlineMesh.MedlineMesh_Qual medlineMesh_Qual;

    /**
     * ��ȡmedlineMesh_Mp���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineMesh.MedlineMesh_Mp }
     */
    public MedlineMesh.MedlineMesh_Mp getMedlineMesh_Mp() {
        return medlineMesh_Mp;
    }

    /**
     * ����medlineMesh_Mp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineMesh.MedlineMesh_Mp }
     */
    public void setMedlineMesh_Mp(MedlineMesh.MedlineMesh_Mp value) {
        this.medlineMesh_Mp = value;
    }

    /**
     * ��ȡmedlineMesh_Term���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedlineMesh_Term() {
        return medlineMesh_Term;
    }

    /**
     * ����medlineMesh_Term���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedlineMesh_Term(String value) {
        this.medlineMesh_Term = value;
    }

    /**
     * ��ȡmedlineMesh_Qual���Ե�ֵ��
     *
     * @return possible object is
     * {@link MedlineMesh.MedlineMesh_Qual }
     */
    public MedlineMesh.MedlineMesh_Qual getMedlineMesh_Qual() {
        return medlineMesh_Qual;
    }

    /**
     * ����medlineMesh_Qual���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MedlineMesh.MedlineMesh_Qual }
     */
    public void setMedlineMesh_Qual(MedlineMesh.MedlineMesh_Qual value) {
        this.medlineMesh_Qual = value;
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
    public static class MedlineMesh_Mp {

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


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-qual"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineQual"
    })
    public static class MedlineMesh_Qual {

        @XmlElement(name = "Medline-qual")
        protected List<MedlineQual> medlineQual;

        /**
         * Gets the value of the medlineQual property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineQual property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineQual().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineQual }
         */
        public List<MedlineQual> getMedlineQual() {
            if (medlineQual == null) {
                medlineQual = new ArrayList<MedlineQual>();
            }
            return this.medlineQual;
        }

    }

}
