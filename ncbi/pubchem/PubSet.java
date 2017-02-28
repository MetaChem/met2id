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
 *       &lt;choice>
 *         &lt;element name="Pub-set_pub">
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
 *         &lt;element name="Pub-set_medline">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-entry"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub-set_article">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-art"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub-set_journal">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-jour"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub-set_book">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub-set_proc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-proc"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub-set_patent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-pat"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pubSet_Pub",
        "pubSet_Medline",
        "pubSet_Article",
        "pubSet_Journal",
        "pubSet_Book",
        "pubSet_Proc",
        "pubSet_Patent"
})
@XmlRootElement(name = "Pub-set")
public class PubSet {

    @XmlElement(name = "Pub-set_pub")
    protected PubSet.PubSet_Pub pubSet_Pub;
    @XmlElement(name = "Pub-set_medline")
    protected PubSet.PubSet_Medline pubSet_Medline;
    @XmlElement(name = "Pub-set_article")
    protected PubSet.PubSet_Article pubSet_Article;
    @XmlElement(name = "Pub-set_journal")
    protected PubSet.PubSet_Journal pubSet_Journal;
    @XmlElement(name = "Pub-set_book")
    protected PubSet.PubSet_Book pubSet_Book;
    @XmlElement(name = "Pub-set_proc")
    protected PubSet.PubSet_Proc pubSet_Proc;
    @XmlElement(name = "Pub-set_patent")
    protected PubSet.PubSet_Patent pubSet_Patent;

    /**
     * ��ȡpubSet_Pub���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Pub }
     */
    public PubSet.PubSet_Pub getPubSet_Pub() {
        return pubSet_Pub;
    }

    /**
     * ����pubSet_Pub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Pub }
     */
    public void setPubSet_Pub(PubSet.PubSet_Pub value) {
        this.pubSet_Pub = value;
    }

    /**
     * ��ȡpubSet_Medline���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Medline }
     */
    public PubSet.PubSet_Medline getPubSet_Medline() {
        return pubSet_Medline;
    }

    /**
     * ����pubSet_Medline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Medline }
     */
    public void setPubSet_Medline(PubSet.PubSet_Medline value) {
        this.pubSet_Medline = value;
    }

    /**
     * ��ȡpubSet_Article���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Article }
     */
    public PubSet.PubSet_Article getPubSet_Article() {
        return pubSet_Article;
    }

    /**
     * ����pubSet_Article���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Article }
     */
    public void setPubSet_Article(PubSet.PubSet_Article value) {
        this.pubSet_Article = value;
    }

    /**
     * ��ȡpubSet_Journal���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Journal }
     */
    public PubSet.PubSet_Journal getPubSet_Journal() {
        return pubSet_Journal;
    }

    /**
     * ����pubSet_Journal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Journal }
     */
    public void setPubSet_Journal(PubSet.PubSet_Journal value) {
        this.pubSet_Journal = value;
    }

    /**
     * ��ȡpubSet_Book���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Book }
     */
    public PubSet.PubSet_Book getPubSet_Book() {
        return pubSet_Book;
    }

    /**
     * ����pubSet_Book���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Book }
     */
    public void setPubSet_Book(PubSet.PubSet_Book value) {
        this.pubSet_Book = value;
    }

    /**
     * ��ȡpubSet_Proc���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Proc }
     */
    public PubSet.PubSet_Proc getPubSet_Proc() {
        return pubSet_Proc;
    }

    /**
     * ����pubSet_Proc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Proc }
     */
    public void setPubSet_Proc(PubSet.PubSet_Proc value) {
        this.pubSet_Proc = value;
    }

    /**
     * ��ȡpubSet_Patent���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubSet.PubSet_Patent }
     */
    public PubSet.PubSet_Patent getPubSet_Patent() {
        return pubSet_Patent;
    }

    /**
     * ����pubSet_Patent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubSet.PubSet_Patent }
     */
    public void setPubSet_Patent(PubSet.PubSet_Patent value) {
        this.pubSet_Patent = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-art"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citArt"
    })
    public static class PubSet_Article {

        @XmlElement(name = "Cit-art")
        protected List<CitArt> citArt;

        /**
         * Gets the value of the citArt property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citArt property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitArt().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitArt }
         */
        public List<CitArt> getCitArt() {
            if (citArt == null) {
                citArt = new ArrayList<CitArt>();
            }
            return this.citArt;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citBook"
    })
    public static class PubSet_Book {

        @XmlElement(name = "Cit-book")
        protected List<CitBook> citBook;

        /**
         * Gets the value of the citBook property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citBook property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitBook().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitBook }
         */
        public List<CitBook> getCitBook() {
            if (citBook == null) {
                citBook = new ArrayList<CitBook>();
            }
            return this.citBook;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-jour"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citJour"
    })
    public static class PubSet_Journal {

        @XmlElement(name = "Cit-jour")
        protected List<CitJour> citJour;

        /**
         * Gets the value of the citJour property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citJour property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitJour().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitJour }
         */
        public List<CitJour> getCitJour() {
            if (citJour == null) {
                citJour = new ArrayList<CitJour>();
            }
            return this.citJour;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-entry"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineEntry"
    })
    public static class PubSet_Medline {

        @XmlElement(name = "Medline-entry")
        protected List<MedlineEntry> medlineEntry;

        /**
         * Gets the value of the medlineEntry property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medlineEntry property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedlineEntry().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedlineEntry }
         */
        public List<MedlineEntry> getMedlineEntry() {
            if (medlineEntry == null) {
                medlineEntry = new ArrayList<MedlineEntry>();
            }
            return this.medlineEntry;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-pat"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citPat"
    })
    public static class PubSet_Patent {

        @XmlElement(name = "Cit-pat")
        protected List<CitPat> citPat;

        /**
         * Gets the value of the citPat property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citPat property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitPat().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitPat }
         */
        public List<CitPat> getCitPat() {
            if (citPat == null) {
                citPat = new ArrayList<CitPat>();
            }
            return this.citPat;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-proc"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citProc"
    })
    public static class PubSet_Proc {

        @XmlElement(name = "Cit-proc")
        protected List<CitProc> citProc;

        /**
         * Gets the value of the citProc property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citProc property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitProc().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitProc }
         */
        public List<CitProc> getCitProc() {
            if (citProc == null) {
                citProc = new ArrayList<CitProc>();
            }
            return this.citProc;
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
    public static class PubSet_Pub {

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

}
