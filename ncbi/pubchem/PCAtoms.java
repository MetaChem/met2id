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
 *         &lt;element name="PC-Atoms_aid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Atoms_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_element">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Element"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_label" minOccurs="0">
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
 *         &lt;element name="PC-Atoms_isotope" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomInt"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_charge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomInt"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_radical" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomRadical"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomSource"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Atoms_comment" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAtoms_Aid",
        "pcAtoms_Element",
        "pcAtoms_Label",
        "pcAtoms_Isotope",
        "pcAtoms_Charge",
        "pcAtoms_Radical",
        "pcAtoms_Source",
        "pcAtoms_Comment"
})
@XmlRootElement(name = "PC-Atoms")
public class PCAtoms {

    @XmlElement(name = "PC-Atoms_aid", required = true)
    protected PCAtoms.PCAtoms_Aid pcAtoms_Aid;
    @XmlElement(name = "PC-Atoms_element", required = true)
    protected PCAtoms.PCAtoms_Element pcAtoms_Element;
    @XmlElement(name = "PC-Atoms_label")
    protected PCAtoms.PCAtoms_Label pcAtoms_Label;
    @XmlElement(name = "PC-Atoms_isotope")
    protected PCAtoms.PCAtoms_Isotope pcAtoms_Isotope;
    @XmlElement(name = "PC-Atoms_charge")
    protected PCAtoms.PCAtoms_Charge pcAtoms_Charge;
    @XmlElement(name = "PC-Atoms_radical")
    protected PCAtoms.PCAtoms_Radical pcAtoms_Radical;
    @XmlElement(name = "PC-Atoms_source")
    protected PCAtoms.PCAtoms_Source pcAtoms_Source;
    @XmlElement(name = "PC-Atoms_comment")
    protected PCAtoms.PCAtoms_Comment pcAtoms_Comment;

    /**
     * ��ȡpcAtoms_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Aid }
     */
    public PCAtoms.PCAtoms_Aid getPCAtoms_Aid() {
        return pcAtoms_Aid;
    }

    /**
     * ����pcAtoms_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Aid }
     */
    public void setPCAtoms_Aid(PCAtoms.PCAtoms_Aid value) {
        this.pcAtoms_Aid = value;
    }

    /**
     * ��ȡpcAtoms_Element���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Element }
     */
    public PCAtoms.PCAtoms_Element getPCAtoms_Element() {
        return pcAtoms_Element;
    }

    /**
     * ����pcAtoms_Element���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Element }
     */
    public void setPCAtoms_Element(PCAtoms.PCAtoms_Element value) {
        this.pcAtoms_Element = value;
    }

    /**
     * ��ȡpcAtoms_Label���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Label }
     */
    public PCAtoms.PCAtoms_Label getPCAtoms_Label() {
        return pcAtoms_Label;
    }

    /**
     * ����pcAtoms_Label���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Label }
     */
    public void setPCAtoms_Label(PCAtoms.PCAtoms_Label value) {
        this.pcAtoms_Label = value;
    }

    /**
     * ��ȡpcAtoms_Isotope���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Isotope }
     */
    public PCAtoms.PCAtoms_Isotope getPCAtoms_Isotope() {
        return pcAtoms_Isotope;
    }

    /**
     * ����pcAtoms_Isotope���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Isotope }
     */
    public void setPCAtoms_Isotope(PCAtoms.PCAtoms_Isotope value) {
        this.pcAtoms_Isotope = value;
    }

    /**
     * ��ȡpcAtoms_Charge���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Charge }
     */
    public PCAtoms.PCAtoms_Charge getPCAtoms_Charge() {
        return pcAtoms_Charge;
    }

    /**
     * ����pcAtoms_Charge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Charge }
     */
    public void setPCAtoms_Charge(PCAtoms.PCAtoms_Charge value) {
        this.pcAtoms_Charge = value;
    }

    /**
     * ��ȡpcAtoms_Radical���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Radical }
     */
    public PCAtoms.PCAtoms_Radical getPCAtoms_Radical() {
        return pcAtoms_Radical;
    }

    /**
     * ����pcAtoms_Radical���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Radical }
     */
    public void setPCAtoms_Radical(PCAtoms.PCAtoms_Radical value) {
        this.pcAtoms_Radical = value;
    }

    /**
     * ��ȡpcAtoms_Source���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Source }
     */
    public PCAtoms.PCAtoms_Source getPCAtoms_Source() {
        return pcAtoms_Source;
    }

    /**
     * ����pcAtoms_Source���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Source }
     */
    public void setPCAtoms_Source(PCAtoms.PCAtoms_Source value) {
        this.pcAtoms_Source = value;
    }

    /**
     * ��ȡpcAtoms_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtoms.PCAtoms_Comment }
     */
    public PCAtoms.PCAtoms_Comment getPCAtoms_Comment() {
        return pcAtoms_Comment;
    }

    /**
     * ����pcAtoms_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtoms.PCAtoms_Comment }
     */
    public void setPCAtoms_Comment(PCAtoms.PCAtoms_Comment value) {
        this.pcAtoms_Comment = value;
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
     *         &lt;element name="PC-Atoms_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtoms_Aid_E"
    })
    public static class PCAtoms_Aid {

        @XmlElement(name = "PC-Atoms_aid_E")
        protected List<BigInteger> pcAtoms_Aid_E;

        /**
         * Gets the value of the pcAtomsAidE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomsAidE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtoms_Aid_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCAtoms_Aid_E() {
            if (pcAtoms_Aid_E == null) {
                pcAtoms_Aid_E = new ArrayList<BigInteger>();
            }
            return this.pcAtoms_Aid_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomInt"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtomInt"
    })
    public static class PCAtoms_Charge {

        @XmlElement(name = "PC-AtomInt")
        protected List<PCAtomInt> pcAtomInt;

        /**
         * Gets the value of the pcAtomInt property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomInt property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtomInt().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAtomInt }
         */
        public List<PCAtomInt> getPCAtomInt() {
            if (pcAtomInt == null) {
                pcAtomInt = new ArrayList<PCAtomInt>();
            }
            return this.pcAtomInt;
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
    public static class PCAtoms_Comment {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Element"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcElement"
    })
    public static class PCAtoms_Element {

        @XmlElement(name = "PC-Element")
        protected List<PCElement> pcElement;

        /**
         * Gets the value of the pcElement property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcElement property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCElement().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCElement }
         */
        public List<PCElement> getPCElement() {
            if (pcElement == null) {
                pcElement = new ArrayList<PCElement>();
            }
            return this.pcElement;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomInt"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtomInt"
    })
    public static class PCAtoms_Isotope {

        @XmlElement(name = "PC-AtomInt")
        protected List<PCAtomInt> pcAtomInt;

        /**
         * Gets the value of the pcAtomInt property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomInt property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtomInt().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAtomInt }
         */
        public List<PCAtomInt> getPCAtomInt() {
            if (pcAtomInt == null) {
                pcAtomInt = new ArrayList<PCAtomInt>();
            }
            return this.pcAtomInt;
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
    public static class PCAtoms_Label {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomRadical"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtomRadical"
    })
    public static class PCAtoms_Radical {

        @XmlElement(name = "PC-AtomRadical")
        protected List<PCAtomRadical> pcAtomRadical;

        /**
         * Gets the value of the pcAtomRadical property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomRadical property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtomRadical().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAtomRadical }
         */
        public List<PCAtomRadical> getPCAtomRadical() {
            if (pcAtomRadical == null) {
                pcAtomRadical = new ArrayList<PCAtomRadical>();
            }
            return this.pcAtomRadical;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AtomSource"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAtomSource"
    })
    public static class PCAtoms_Source {

        @XmlElement(name = "PC-AtomSource")
        protected List<PCAtomSource> pcAtomSource;

        /**
         * Gets the value of the pcAtomSource property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAtomSource property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAtomSource().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAtomSource }
         */
        public List<PCAtomSource> getPCAtomSource() {
            if (pcAtomSource == null) {
                pcAtomSource = new ArrayList<PCAtomSource>();
            }
            return this.pcAtomSource;
        }

    }

}
