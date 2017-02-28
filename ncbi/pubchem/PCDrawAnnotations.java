//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PC-DrawAnnotations_annotation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-BondAnnotation"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-DrawAnnotations_aid1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-DrawAnnotations_aid1_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-DrawAnnotations_aid2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-DrawAnnotations_aid2_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "pcDrawAnnotations_Annotation",
        "pcDrawAnnotations_Aid1",
        "pcDrawAnnotations_Aid2"
})
@XmlRootElement(name = "PC-DrawAnnotations")
public class PCDrawAnnotations {

    @XmlElement(name = "PC-DrawAnnotations_annotation", required = true)
    protected PCDrawAnnotations.PCDrawAnnotations_Annotation pcDrawAnnotations_Annotation;
    @XmlElement(name = "PC-DrawAnnotations_aid1", required = true)
    protected PCDrawAnnotations.PCDrawAnnotations_Aid1 pcDrawAnnotations_Aid1;
    @XmlElement(name = "PC-DrawAnnotations_aid2", required = true)
    protected PCDrawAnnotations.PCDrawAnnotations_Aid2 pcDrawAnnotations_Aid2;

    /**
     * ��ȡpcDrawAnnotations_Annotation���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDrawAnnotations.PCDrawAnnotations_Annotation }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Annotation getPCDrawAnnotations_Annotation() {
        return pcDrawAnnotations_Annotation;
    }

    /**
     * ����pcDrawAnnotations_Annotation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDrawAnnotations.PCDrawAnnotations_Annotation }
     */
    public void setPCDrawAnnotations_Annotation(PCDrawAnnotations.PCDrawAnnotations_Annotation value) {
        this.pcDrawAnnotations_Annotation = value;
    }

    /**
     * ��ȡpcDrawAnnotations_Aid1���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDrawAnnotations.PCDrawAnnotations_Aid1 }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Aid1 getPCDrawAnnotations_Aid1() {
        return pcDrawAnnotations_Aid1;
    }

    /**
     * ����pcDrawAnnotations_Aid1���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDrawAnnotations.PCDrawAnnotations_Aid1 }
     */
    public void setPCDrawAnnotations_Aid1(PCDrawAnnotations.PCDrawAnnotations_Aid1 value) {
        this.pcDrawAnnotations_Aid1 = value;
    }

    /**
     * ��ȡpcDrawAnnotations_Aid2���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDrawAnnotations.PCDrawAnnotations_Aid2 }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Aid2 getPCDrawAnnotations_Aid2() {
        return pcDrawAnnotations_Aid2;
    }

    /**
     * ����pcDrawAnnotations_Aid2���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDrawAnnotations.PCDrawAnnotations_Aid2 }
     */
    public void setPCDrawAnnotations_Aid2(PCDrawAnnotations.PCDrawAnnotations_Aid2 value) {
        this.pcDrawAnnotations_Aid2 = value;
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
     *         &lt;element name="PC-DrawAnnotations_aid1_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcDrawAnnotations_Aid1_E"
    })
    public static class PCDrawAnnotations_Aid1 {

        @XmlElement(name = "PC-DrawAnnotations_aid1_E")
        protected List<BigInteger> pcDrawAnnotations_Aid1_E;

        /**
         * Gets the value of the pcDrawAnnotationsAid1E property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcDrawAnnotationsAid1E property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCDrawAnnotations_Aid1_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCDrawAnnotations_Aid1_E() {
            if (pcDrawAnnotations_Aid1_E == null) {
                pcDrawAnnotations_Aid1_E = new ArrayList<BigInteger>();
            }
            return this.pcDrawAnnotations_Aid1_E;
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
     *         &lt;element name="PC-DrawAnnotations_aid2_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcDrawAnnotations_Aid2_E"
    })
    public static class PCDrawAnnotations_Aid2 {

        @XmlElement(name = "PC-DrawAnnotations_aid2_E")
        protected List<BigInteger> pcDrawAnnotations_Aid2_E;

        /**
         * Gets the value of the pcDrawAnnotationsAid2E property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcDrawAnnotationsAid2E property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCDrawAnnotations_Aid2_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCDrawAnnotations_Aid2_E() {
            if (pcDrawAnnotations_Aid2_E == null) {
                pcDrawAnnotations_Aid2_E = new ArrayList<BigInteger>();
            }
            return this.pcDrawAnnotations_Aid2_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-BondAnnotation"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcBondAnnotation"
    })
    public static class PCDrawAnnotations_Annotation {

        @XmlElement(name = "PC-BondAnnotation")
        protected List<PCBondAnnotation> pcBondAnnotation;

        /**
         * Gets the value of the pcBondAnnotation property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcBondAnnotation property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCBondAnnotation().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCBondAnnotation }
         */
        public List<PCBondAnnotation> getPCBondAnnotation() {
            if (pcBondAnnotation == null) {
                pcBondAnnotation = new ArrayList<PCBondAnnotation>();
            }
            return this.pcBondAnnotation;
        }

    }

}
