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
 *         &lt;element name="PC-Coordinates_type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CoordinateType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Coordinates_aid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Coordinates_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Coordinates_conformers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Conformer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Coordinates_atomlabels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomString"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Coordinates_data" minOccurs="0">
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
        "pcCoordinates_Type",
        "pcCoordinates_Aid",
        "pcCoordinates_Conformers",
        "pcCoordinates_Atomlabels",
        "pcCoordinates_Data"
})
@XmlRootElement(name = "PC-Coordinates")
public class PCCoordinates {

    @XmlElement(name = "PC-Coordinates_type", required = true)
    protected PCCoordinates.PCCoordinates_Type pcCoordinates_Type;
    @XmlElement(name = "PC-Coordinates_aid", required = true)
    protected PCCoordinates.PCCoordinates_Aid pcCoordinates_Aid;
    @XmlElement(name = "PC-Coordinates_conformers")
    protected PCCoordinates.PCCoordinates_Conformers pcCoordinates_Conformers;
    @XmlElement(name = "PC-Coordinates_atomlabels")
    protected PCCoordinates.PCCoordinates_Atomlabels pcCoordinates_Atomlabels;
    @XmlElement(name = "PC-Coordinates_data")
    protected PCCoordinates.PCCoordinates_Data pcCoordinates_Data;

    /**
     * ��ȡpcCoordinates_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCoordinates.PCCoordinates_Type }
     */
    public PCCoordinates.PCCoordinates_Type getPCCoordinates_Type() {
        return pcCoordinates_Type;
    }

    /**
     * ����pcCoordinates_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCoordinates.PCCoordinates_Type }
     */
    public void setPCCoordinates_Type(PCCoordinates.PCCoordinates_Type value) {
        this.pcCoordinates_Type = value;
    }

    /**
     * ��ȡpcCoordinates_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCoordinates.PCCoordinates_Aid }
     */
    public PCCoordinates.PCCoordinates_Aid getPCCoordinates_Aid() {
        return pcCoordinates_Aid;
    }

    /**
     * ����pcCoordinates_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCoordinates.PCCoordinates_Aid }
     */
    public void setPCCoordinates_Aid(PCCoordinates.PCCoordinates_Aid value) {
        this.pcCoordinates_Aid = value;
    }

    /**
     * ��ȡpcCoordinates_Conformers���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCoordinates.PCCoordinates_Conformers }
     */
    public PCCoordinates.PCCoordinates_Conformers getPCCoordinates_Conformers() {
        return pcCoordinates_Conformers;
    }

    /**
     * ����pcCoordinates_Conformers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCoordinates.PCCoordinates_Conformers }
     */
    public void setPCCoordinates_Conformers(PCCoordinates.PCCoordinates_Conformers value) {
        this.pcCoordinates_Conformers = value;
    }

    /**
     * ��ȡpcCoordinates_Atomlabels���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCoordinates.PCCoordinates_Atomlabels }
     */
    public PCCoordinates.PCCoordinates_Atomlabels getPCCoordinates_Atomlabels() {
        return pcCoordinates_Atomlabels;
    }

    /**
     * ����pcCoordinates_Atomlabels���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCoordinates.PCCoordinates_Atomlabels }
     */
    public void setPCCoordinates_Atomlabels(PCCoordinates.PCCoordinates_Atomlabels value) {
        this.pcCoordinates_Atomlabels = value;
    }

    /**
     * ��ȡpcCoordinates_Data���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCoordinates.PCCoordinates_Data }
     */
    public PCCoordinates.PCCoordinates_Data getPCCoordinates_Data() {
        return pcCoordinates_Data;
    }

    /**
     * ����pcCoordinates_Data���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCoordinates.PCCoordinates_Data }
     */
    public void setPCCoordinates_Data(PCCoordinates.PCCoordinates_Data value) {
        this.pcCoordinates_Data = value;
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
     *         &lt;element name="PC-Coordinates_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCoordinates_Aid_E"
    })
    public static class PCCoordinates_Aid {

        @XmlElement(name = "PC-Coordinates_aid_E")
        protected List<BigInteger> pcCoordinates_Aid_E;

        /**
         * Gets the value of the pcCoordinatesAidE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcCoordinatesAidE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCCoordinates_Aid_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCCoordinates_Aid_E() {
            if (pcCoordinates_Aid_E == null) {
                pcCoordinates_Aid_E = new ArrayList<BigInteger>();
            }
            return this.pcCoordinates_Aid_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomString"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtomString"
    })
    public static class PCCoordinates_Atomlabels {

        @XmlElement(name = "PC-AtomString")
        protected List<PCAtomString> pcAtomString;

        /**
         * Gets the value of the pcAtomString property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomString property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtomString().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAtomString }
         */
        public List<PCAtomString> getPCAtomString() {
            if (pcAtomString == null) {
                pcAtomString = new ArrayList<PCAtomString>();
            }
            return this.pcAtomString;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Conformer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcConformer"
    })
    public static class PCCoordinates_Conformers {

        @XmlElement(name = "PC-Conformer")
        protected List<PCConformer> pcConformer;

        /**
         * Gets the value of the pcConformer property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcConformer property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCConformer().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCConformer }
         */
        public List<PCConformer> getPCConformer() {
            if (pcConformer == null) {
                pcConformer = new ArrayList<PCConformer>();
            }
            return this.pcConformer;
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
    public static class PCCoordinates_Data {

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CoordinateType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCoordinateType"
    })
    public static class PCCoordinates_Type {

        @XmlElement(name = "PC-CoordinateType")
        protected List<PCCoordinateType> pcCoordinateType;

        /**
         * Gets the value of the pcCoordinateType property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcCoordinateType property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCCoordinateType().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCCoordinateType }
         */
        public List<PCCoordinateType> getPCCoordinateType() {
            if (pcCoordinateType == null) {
                pcCoordinateType = new ArrayList<PCCoordinateType>();
            }
            return this.pcCoordinateType;
        }

    }

}
