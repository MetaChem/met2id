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
 *         &lt;element name="PC-Compound_id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CompoundType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_atoms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Atoms"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_bonds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Bonds"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_stereo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoCenter"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_coords" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Coordinates"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_charge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-Compound_props" minOccurs="0">
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
 *         &lt;element name="PC-Compound_stereogroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoGroup"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_count" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Count"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Compound_vbalt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Compounds"/>
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
        "pcCompound_Id",
        "pcCompound_Atoms",
        "pcCompound_Bonds",
        "pcCompound_Stereo",
        "pcCompound_Coords",
        "pcCompound_Charge",
        "pcCompound_Props",
        "pcCompound_Stereogroups",
        "pcCompound_Count",
        "pcCompound_Vbalt"
})
@XmlRootElement(name = "PC-Compound")
public class PCCompound {

    @XmlElement(name = "PC-Compound_id", required = true)
    protected PCCompound.PCCompound_Id pcCompound_Id;
    @XmlElement(name = "PC-Compound_atoms")
    protected PCCompound.PCCompound_Atoms pcCompound_Atoms;
    @XmlElement(name = "PC-Compound_bonds")
    protected PCCompound.PCCompound_Bonds pcCompound_Bonds;
    @XmlElement(name = "PC-Compound_stereo")
    protected PCCompound.PCCompound_Stereo pcCompound_Stereo;
    @XmlElement(name = "PC-Compound_coords")
    protected PCCompound.PCCompound_Coords pcCompound_Coords;
    @XmlElement(name = "PC-Compound_charge")
    protected BigInteger pcCompound_Charge;
    @XmlElement(name = "PC-Compound_props")
    protected PCCompound.PCCompound_Props pcCompound_Props;
    @XmlElement(name = "PC-Compound_stereogroups")
    protected PCCompound.PCCompound_Stereogroups pcCompound_Stereogroups;
    @XmlElement(name = "PC-Compound_count")
    protected PCCompound.PCCompound_Count pcCompound_Count;
    @XmlElement(name = "PC-Compound_vbalt")
    protected PCCompound.PCCompound_Vbalt pcCompound_Vbalt;

    /**
     * ��ȡpcCompound_Id���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Id }
     */
    public PCCompound.PCCompound_Id getPCCompound_Id() {
        return pcCompound_Id;
    }

    /**
     * ����pcCompound_Id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Id }
     */
    public void setPCCompound_Id(PCCompound.PCCompound_Id value) {
        this.pcCompound_Id = value;
    }

    /**
     * ��ȡpcCompound_Atoms���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Atoms }
     */
    public PCCompound.PCCompound_Atoms getPCCompound_Atoms() {
        return pcCompound_Atoms;
    }

    /**
     * ����pcCompound_Atoms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Atoms }
     */
    public void setPCCompound_Atoms(PCCompound.PCCompound_Atoms value) {
        this.pcCompound_Atoms = value;
    }

    /**
     * ��ȡpcCompound_Bonds���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Bonds }
     */
    public PCCompound.PCCompound_Bonds getPCCompound_Bonds() {
        return pcCompound_Bonds;
    }

    /**
     * ����pcCompound_Bonds���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Bonds }
     */
    public void setPCCompound_Bonds(PCCompound.PCCompound_Bonds value) {
        this.pcCompound_Bonds = value;
    }

    /**
     * ��ȡpcCompound_Stereo���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Stereo }
     */
    public PCCompound.PCCompound_Stereo getPCCompound_Stereo() {
        return pcCompound_Stereo;
    }

    /**
     * ����pcCompound_Stereo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Stereo }
     */
    public void setPCCompound_Stereo(PCCompound.PCCompound_Stereo value) {
        this.pcCompound_Stereo = value;
    }

    /**
     * ��ȡpcCompound_Coords���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Coords }
     */
    public PCCompound.PCCompound_Coords getPCCompound_Coords() {
        return pcCompound_Coords;
    }

    /**
     * ����pcCompound_Coords���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Coords }
     */
    public void setPCCompound_Coords(PCCompound.PCCompound_Coords value) {
        this.pcCompound_Coords = value;
    }

    /**
     * ��ȡpcCompound_Charge���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCompound_Charge() {
        return pcCompound_Charge;
    }

    /**
     * ����pcCompound_Charge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCompound_Charge(BigInteger value) {
        this.pcCompound_Charge = value;
    }

    /**
     * ��ȡpcCompound_Props���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Props }
     */
    public PCCompound.PCCompound_Props getPCCompound_Props() {
        return pcCompound_Props;
    }

    /**
     * ����pcCompound_Props���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Props }
     */
    public void setPCCompound_Props(PCCompound.PCCompound_Props value) {
        this.pcCompound_Props = value;
    }

    /**
     * ��ȡpcCompound_Stereogroups���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Stereogroups }
     */
    public PCCompound.PCCompound_Stereogroups getPCCompound_Stereogroups() {
        return pcCompound_Stereogroups;
    }

    /**
     * ����pcCompound_Stereogroups���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Stereogroups }
     */
    public void setPCCompound_Stereogroups(PCCompound.PCCompound_Stereogroups value) {
        this.pcCompound_Stereogroups = value;
    }

    /**
     * ��ȡpcCompound_Count���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Count }
     */
    public PCCompound.PCCompound_Count getPCCompound_Count() {
        return pcCompound_Count;
    }

    /**
     * ����pcCompound_Count���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Count }
     */
    public void setPCCompound_Count(PCCompound.PCCompound_Count value) {
        this.pcCompound_Count = value;
    }

    /**
     * ��ȡpcCompound_Vbalt���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCompound.PCCompound_Vbalt }
     */
    public PCCompound.PCCompound_Vbalt getPCCompound_Vbalt() {
        return pcCompound_Vbalt;
    }

    /**
     * ����pcCompound_Vbalt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCompound.PCCompound_Vbalt }
     */
    public void setPCCompound_Vbalt(PCCompound.PCCompound_Vbalt value) {
        this.pcCompound_Vbalt = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Atoms"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtoms"
    })
    public static class PCCompound_Atoms {

        @XmlElement(name = "PC-Atoms", required = true)
        protected PCAtoms pcAtoms;

        /**
         * ��ȡpcAtoms���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAtoms }
         */
        public PCAtoms getPCAtoms() {
            return pcAtoms;
        }

        /**
         * ����pcAtoms���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAtoms }
         */
        public void setPCAtoms(PCAtoms value) {
            this.pcAtoms = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Bonds"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcBonds"
    })
    public static class PCCompound_Bonds {

        @XmlElement(name = "PC-Bonds", required = true)
        protected PCBonds pcBonds;

        /**
         * ��ȡpcBonds���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCBonds }
         */
        public PCBonds getPCBonds() {
            return pcBonds;
        }

        /**
         * ����pcBonds���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCBonds }
         */
        public void setPCBonds(PCBonds value) {
            this.pcBonds = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Coordinates"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCoordinates"
    })
    public static class PCCompound_Coords {

        @XmlElement(name = "PC-Coordinates")
        protected List<PCCoordinates> pcCoordinates;

        /**
         * Gets the value of the pcCoordinates property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcCoordinates property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCCoordinates().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCCoordinates }
         */
        public List<PCCoordinates> getPCCoordinates() {
            if (pcCoordinates == null) {
                pcCoordinates = new ArrayList<PCCoordinates>();
            }
            return this.pcCoordinates;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Count"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCount"
    })
    public static class PCCompound_Count {

        @XmlElement(name = "PC-Count", required = true)
        protected PCCount pcCount;

        /**
         * ��ȡpcCount���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCCount }
         */
        public PCCount getPCCount() {
            return pcCount;
        }

        /**
         * ����pcCount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCCount }
         */
        public void setPCCount(PCCount value) {
            this.pcCount = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CompoundType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCompoundType"
    })
    public static class PCCompound_Id {

        @XmlElement(name = "PC-CompoundType", required = true)
        protected PCCompoundTypeClass pcCompoundType;

        /**
         * ��ȡpcCompoundType���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCCompoundTypeClass }
         */
        public PCCompoundTypeClass getPCCompoundType() {
            return pcCompoundType;
        }

        /**
         * ����pcCompoundType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCCompoundTypeClass }
         */
        public void setPCCompoundType(PCCompoundTypeClass value) {
            this.pcCompoundType = value;
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
    public static class PCCompound_Props {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoCenter"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoCenter"
    })
    public static class PCCompound_Stereo {

        @XmlElement(name = "PC-StereoCenter")
        protected List<PCStereoCenter> pcStereoCenter;

        /**
         * Gets the value of the pcStereoCenter property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcStereoCenter property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCStereoCenter().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCStereoCenter }
         */
        public List<PCStereoCenter> getPCStereoCenter() {
            if (pcStereoCenter == null) {
                pcStereoCenter = new ArrayList<PCStereoCenter>();
            }
            return this.pcStereoCenter;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoGroup"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoGroup"
    })
    public static class PCCompound_Stereogroups {

        @XmlElement(name = "PC-StereoGroup")
        protected List<PCStereoGroup> pcStereoGroup;

        /**
         * Gets the value of the pcStereoGroup property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcStereoGroup property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCStereoGroup().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCStereoGroup }
         */
        public List<PCStereoGroup> getPCStereoGroup() {
            if (pcStereoGroup == null) {
                pcStereoGroup = new ArrayList<PCStereoGroup>();
            }
            return this.pcStereoGroup;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Compounds"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCompounds"
    })
    public static class PCCompound_Vbalt {

        @XmlElement(name = "PC-Compounds", required = true)
        protected PCCompounds pcCompounds;

        /**
         * ��ȡpcCompounds���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCCompounds }
         */
        public PCCompounds getPCCompounds() {
            return pcCompounds;
        }

        /**
         * ����pcCompounds���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCCompounds }
         */
        public void setPCCompounds(PCCompounds value) {
            this.pcCompounds = value;
        }

    }

}
