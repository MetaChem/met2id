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
 *         &lt;element name="PC-Substance_sid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_source">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Source"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_pub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_synonyms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Substance_synonyms_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Substance_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_xref" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-XRefData"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Substance_compound" minOccurs="0">
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
        "pcSubstance_Sid",
        "pcSubstance_Source",
        "pcSubstance_Pub",
        "pcSubstance_Synonyms",
        "pcSubstance_Comment",
        "pcSubstance_Xref",
        "pcSubstance_Compound"
})
@XmlRootElement(name = "PC-Substance")
public class PCSubstance {

    @XmlElement(name = "PC-Substance_sid", required = true)
    protected PCSubstance.PCSubstance_Sid pcSubstance_Sid;
    @XmlElement(name = "PC-Substance_source", required = true)
    protected PCSubstance.PCSubstance_Source pcSubstance_Source;
    @XmlElement(name = "PC-Substance_pub")
    protected PCSubstance.PCSubstance_Pub pcSubstance_Pub;
    @XmlElement(name = "PC-Substance_synonyms")
    protected PCSubstance.PCSubstance_Synonyms pcSubstance_Synonyms;
    @XmlElement(name = "PC-Substance_comment")
    protected PCSubstance.PCSubstance_Comment pcSubstance_Comment;
    @XmlElement(name = "PC-Substance_xref")
    protected PCSubstance.PCSubstance_Xref pcSubstance_Xref;
    @XmlElement(name = "PC-Substance_compound")
    protected PCSubstance.PCSubstance_Compound pcSubstance_Compound;

    /**
     * ��ȡpcSubstance_Sid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Sid }
     */
    public PCSubstance.PCSubstance_Sid getPCSubstance_Sid() {
        return pcSubstance_Sid;
    }

    /**
     * ����pcSubstance_Sid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Sid }
     */
    public void setPCSubstance_Sid(PCSubstance.PCSubstance_Sid value) {
        this.pcSubstance_Sid = value;
    }

    /**
     * ��ȡpcSubstance_Source���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Source }
     */
    public PCSubstance.PCSubstance_Source getPCSubstance_Source() {
        return pcSubstance_Source;
    }

    /**
     * ����pcSubstance_Source���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Source }
     */
    public void setPCSubstance_Source(PCSubstance.PCSubstance_Source value) {
        this.pcSubstance_Source = value;
    }

    /**
     * ��ȡpcSubstance_Pub���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Pub }
     */
    public PCSubstance.PCSubstance_Pub getPCSubstance_Pub() {
        return pcSubstance_Pub;
    }

    /**
     * ����pcSubstance_Pub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Pub }
     */
    public void setPCSubstance_Pub(PCSubstance.PCSubstance_Pub value) {
        this.pcSubstance_Pub = value;
    }

    /**
     * ��ȡpcSubstance_Synonyms���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Synonyms }
     */
    public PCSubstance.PCSubstance_Synonyms getPCSubstance_Synonyms() {
        return pcSubstance_Synonyms;
    }

    /**
     * ����pcSubstance_Synonyms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Synonyms }
     */
    public void setPCSubstance_Synonyms(PCSubstance.PCSubstance_Synonyms value) {
        this.pcSubstance_Synonyms = value;
    }

    /**
     * ��ȡpcSubstance_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Comment }
     */
    public PCSubstance.PCSubstance_Comment getPCSubstance_Comment() {
        return pcSubstance_Comment;
    }

    /**
     * ����pcSubstance_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Comment }
     */
    public void setPCSubstance_Comment(PCSubstance.PCSubstance_Comment value) {
        this.pcSubstance_Comment = value;
    }

    /**
     * ��ȡpcSubstance_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Xref }
     */
    public PCSubstance.PCSubstance_Xref getPCSubstance_Xref() {
        return pcSubstance_Xref;
    }

    /**
     * ����pcSubstance_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Xref }
     */
    public void setPCSubstance_Xref(PCSubstance.PCSubstance_Xref value) {
        this.pcSubstance_Xref = value;
    }

    /**
     * ��ȡpcSubstance_Compound���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSubstance.PCSubstance_Compound }
     */
    public PCSubstance.PCSubstance_Compound getPCSubstance_Compound() {
        return pcSubstance_Compound;
    }

    /**
     * ����pcSubstance_Compound���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSubstance.PCSubstance_Compound }
     */
    public void setPCSubstance_Compound(PCSubstance.PCSubstance_Compound value) {
        this.pcSubstance_Compound = value;
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
     *         &lt;element name="PC-Substance_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcSubstance_Comment_E"
    })
    public static class PCSubstance_Comment {

        @XmlElement(name = "PC-Substance_comment_E")
        protected List<String> pcSubstance_Comment_E;

        /**
         * Gets the value of the pcSubstanceCommentE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcSubstanceCommentE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCSubstance_Comment_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCSubstance_Comment_E() {
            if (pcSubstance_Comment_E == null) {
                pcSubstance_Comment_E = new ArrayList<String>();
            }
            return this.pcSubstance_Comment_E;
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
    public static class PCSubstance_Compound {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pub"
    })
    public static class PCSubstance_Pub {

        @XmlElement(name = "Pub")
        protected List<Pub> pub;

        /**
         * Gets the value of the pub property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pub property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPub().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pub }
         */
        public List<Pub> getPub() {
            if (pub == null) {
                pub = new ArrayList<Pub>();
            }
            return this.pub;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ID"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcid"
    })
    public static class PCSubstance_Sid {

        @XmlElement(name = "PC-ID", required = true)
        protected PCID pcid;

        /**
         * ��ȡpcid���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCID }
         */
        public PCID getPCID() {
            return pcid;
        }

        /**
         * ����pcid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCID }
         */
        public void setPCID(PCID value) {
            this.pcid = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Source"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcSource"
    })
    public static class PCSubstance_Source {

        @XmlElement(name = "PC-Source", required = true)
        protected PCSource pcSource;

        /**
         * ��ȡpcSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCSource }
         */
        public PCSource getPCSource() {
            return pcSource;
        }

        /**
         * ����pcSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCSource }
         */
        public void setPCSource(PCSource value) {
            this.pcSource = value;
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
     *         &lt;element name="PC-Substance_synonyms_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcSubstance_Synonyms_E"
    })
    public static class PCSubstance_Synonyms {

        @XmlElement(name = "PC-Substance_synonyms_E")
        protected List<String> pcSubstance_Synonyms_E;

        /**
         * Gets the value of the pcSubstanceSynonymsE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcSubstanceSynonymsE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCSubstance_Synonyms_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCSubstance_Synonyms_E() {
            if (pcSubstance_Synonyms_E == null) {
                pcSubstance_Synonyms_E = new ArrayList<String>();
            }
            return this.pcSubstance_Synonyms_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-XRefData"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcxRefData"
    })
    public static class PCSubstance_Xref {

        @XmlElement(name = "PC-XRefData")
        protected List<PCXRefData> pcxRefData;

        /**
         * Gets the value of the pcxRefData property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcxRefData property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCXRefData().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCXRefData }
         */
        public List<PCXRefData> getPCXRefData() {
            if (pcxRefData == null) {
                pcxRefData = new ArrayList<PCXRefData>();
            }
            return this.pcxRefData;
        }

    }

}
