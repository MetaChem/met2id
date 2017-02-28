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
 *         &lt;element name="PC-Conformer_x">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Conformer_x_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Conformer_y">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Conformer_y_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Conformer_z" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Conformer_z_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Conformer_style" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-DrawAnnotations"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Conformer_data" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-InfoData"/>
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
        "pcConformer_X",
        "pcConformer_Y",
        "pcConformer_Z",
        "pcConformer_Style",
        "pcConformer_Data"
})
@XmlRootElement(name = "PC-Conformer")
public class PCConformer {

    @XmlElement(name = "PC-Conformer_x", required = true)
    protected PCConformer.PCConformer_X pcConformer_X;
    @XmlElement(name = "PC-Conformer_y", required = true)
    protected PCConformer.PCConformer_Y pcConformer_Y;
    @XmlElement(name = "PC-Conformer_z")
    protected PCConformer.PCConformer_Z pcConformer_Z;
    @XmlElement(name = "PC-Conformer_style")
    protected PCConformer.PCConformer_Style pcConformer_Style;
    @XmlElement(name = "PC-Conformer_data")
    protected PCConformer.PCConformer_Data pcConformer_Data;

    /**
     * ��ȡpcConformer_X���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConformer.PCConformer_X }
     */
    public PCConformer.PCConformer_X getPCConformer_X() {
        return pcConformer_X;
    }

    /**
     * ����pcConformer_X���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConformer.PCConformer_X }
     */
    public void setPCConformer_X(PCConformer.PCConformer_X value) {
        this.pcConformer_X = value;
    }

    /**
     * ��ȡpcConformer_Y���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConformer.PCConformer_Y }
     */
    public PCConformer.PCConformer_Y getPCConformer_Y() {
        return pcConformer_Y;
    }

    /**
     * ����pcConformer_Y���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConformer.PCConformer_Y }
     */
    public void setPCConformer_Y(PCConformer.PCConformer_Y value) {
        this.pcConformer_Y = value;
    }

    /**
     * ��ȡpcConformer_Z���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConformer.PCConformer_Z }
     */
    public PCConformer.PCConformer_Z getPCConformer_Z() {
        return pcConformer_Z;
    }

    /**
     * ����pcConformer_Z���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConformer.PCConformer_Z }
     */
    public void setPCConformer_Z(PCConformer.PCConformer_Z value) {
        this.pcConformer_Z = value;
    }

    /**
     * ��ȡpcConformer_Style���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConformer.PCConformer_Style }
     */
    public PCConformer.PCConformer_Style getPCConformer_Style() {
        return pcConformer_Style;
    }

    /**
     * ����pcConformer_Style���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConformer.PCConformer_Style }
     */
    public void setPCConformer_Style(PCConformer.PCConformer_Style value) {
        this.pcConformer_Style = value;
    }

    /**
     * ��ȡpcConformer_Data���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCConformer.PCConformer_Data }
     */
    public PCConformer.PCConformer_Data getPCConformer_Data() {
        return pcConformer_Data;
    }

    /**
     * ����pcConformer_Data���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCConformer.PCConformer_Data }
     */
    public void setPCConformer_Data(PCConformer.PCConformer_Data value) {
        this.pcConformer_Data = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-InfoData"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcInfoData"
    })
    public static class PCConformer_Data {

        @XmlElement(name = "PC-InfoData")
        protected List<PCInfoData> pcInfoData;

        /**
         * Gets the value of the pcInfoData property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcInfoData property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCInfoData().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCInfoData }
         */
        public List<PCInfoData> getPCInfoData() {
            if (pcInfoData == null) {
                pcInfoData = new ArrayList<PCInfoData>();
            }
            return this.pcInfoData;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-DrawAnnotations"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcDrawAnnotations"
    })
    public static class PCConformer_Style {

        @XmlElement(name = "PC-DrawAnnotations", required = true)
        protected PCDrawAnnotations pcDrawAnnotations;

        /**
         * ��ȡpcDrawAnnotations���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCDrawAnnotations }
         */
        public PCDrawAnnotations getPCDrawAnnotations() {
            return pcDrawAnnotations;
        }

        /**
         * ����pcDrawAnnotations���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCDrawAnnotations }
         */
        public void setPCDrawAnnotations(PCDrawAnnotations value) {
            this.pcDrawAnnotations = value;
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
     *         &lt;element name="PC-Conformer_x_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcConformer_X_E"
    })
    public static class PCConformer_X {

        @XmlElement(name = "PC-Conformer_x_E", type = Double.class)
        protected List<Double> pcConformer_X_E;

        /**
         * Gets the value of the pcConformerXE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcConformerXE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCConformer_X_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         */
        public List<Double> getPCConformer_X_E() {
            if (pcConformer_X_E == null) {
                pcConformer_X_E = new ArrayList<Double>();
            }
            return this.pcConformer_X_E;
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
     *         &lt;element name="PC-Conformer_y_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcConformer_Y_E"
    })
    public static class PCConformer_Y {

        @XmlElement(name = "PC-Conformer_y_E", type = Double.class)
        protected List<Double> pcConformer_Y_E;

        /**
         * Gets the value of the pcConformerYE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcConformerYE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCConformer_Y_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         */
        public List<Double> getPCConformer_Y_E() {
            if (pcConformer_Y_E == null) {
                pcConformer_Y_E = new ArrayList<Double>();
            }
            return this.pcConformer_Y_E;
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
     *         &lt;element name="PC-Conformer_z_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcConformer_Z_E"
    })
    public static class PCConformer_Z {

        @XmlElement(name = "PC-Conformer_z_E", type = Double.class)
        protected List<Double> pcConformer_Z_E;

        /**
         * Gets the value of the pcConformerZE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcConformerZE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCConformer_Z_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         */
        public List<Double> getPCConformer_Z_E() {
            if (pcConformer_Z_E == null) {
                pcConformer_Z_E = new ArrayList<Double>();
            }
            return this.pcConformer_Z_E;
        }

    }

}
