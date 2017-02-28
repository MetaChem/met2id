//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
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
 *         &lt;element name="Pub_gen">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-gen"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_sub">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-sub"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_medline">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Medline-entry"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_muid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Pub_article">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-art"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_journal">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-jour"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_book">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_proc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-proc"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_patent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-pat"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_pat-id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Id-pat"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_man">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-let"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_equiv">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub-equiv"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pub_pmid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubMedId"/>
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
        "pub_Gen",
        "pub_Sub",
        "pub_Medline",
        "pub_Muid",
        "pub_Article",
        "pub_Journal",
        "pub_Book",
        "pub_Proc",
        "pub_Patent",
        "pub_PatId",
        "pub_Man",
        "pub_Equiv",
        "pub_Pmid"
})
@XmlRootElement(name = "Pub")
public class Pub {

    @XmlElement(name = "Pub_gen")
    protected Pub.Pub_Gen pub_Gen;
    @XmlElement(name = "Pub_sub")
    protected Pub.Pub_Sub pub_Sub;
    @XmlElement(name = "Pub_medline")
    protected Pub.Pub_Medline pub_Medline;
    @XmlElement(name = "Pub_muid")
    protected BigInteger pub_Muid;
    @XmlElement(name = "Pub_article")
    protected Pub.Pub_Article pub_Article;
    @XmlElement(name = "Pub_journal")
    protected Pub.Pub_Journal pub_Journal;
    @XmlElement(name = "Pub_book")
    protected Pub.Pub_Book pub_Book;
    @XmlElement(name = "Pub_proc")
    protected Pub.Pub_Proc pub_Proc;
    @XmlElement(name = "Pub_patent")
    protected Pub.Pub_Patent pub_Patent;
    @XmlElement(name = "Pub_pat-id")
    protected Pub.Pub_PatId pub_PatId;
    @XmlElement(name = "Pub_man")
    protected Pub.Pub_Man pub_Man;
    @XmlElement(name = "Pub_equiv")
    protected Pub.Pub_Equiv pub_Equiv;
    @XmlElement(name = "Pub_pmid")
    protected Pub.Pub_Pmid pub_Pmid;

    /**
     * ��ȡpub_Gen���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Gen }
     */
    public Pub.Pub_Gen getPub_Gen() {
        return pub_Gen;
    }

    /**
     * ����pub_Gen���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Gen }
     */
    public void setPub_Gen(Pub.Pub_Gen value) {
        this.pub_Gen = value;
    }

    /**
     * ��ȡpub_Sub���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Sub }
     */
    public Pub.Pub_Sub getPub_Sub() {
        return pub_Sub;
    }

    /**
     * ����pub_Sub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Sub }
     */
    public void setPub_Sub(Pub.Pub_Sub value) {
        this.pub_Sub = value;
    }

    /**
     * ��ȡpub_Medline���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Medline }
     */
    public Pub.Pub_Medline getPub_Medline() {
        return pub_Medline;
    }

    /**
     * ����pub_Medline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Medline }
     */
    public void setPub_Medline(Pub.Pub_Medline value) {
        this.pub_Medline = value;
    }

    /**
     * ��ȡpub_Muid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPub_Muid() {
        return pub_Muid;
    }

    /**
     * ����pub_Muid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPub_Muid(BigInteger value) {
        this.pub_Muid = value;
    }

    /**
     * ��ȡpub_Article���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Article }
     */
    public Pub.Pub_Article getPub_Article() {
        return pub_Article;
    }

    /**
     * ����pub_Article���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Article }
     */
    public void setPub_Article(Pub.Pub_Article value) {
        this.pub_Article = value;
    }

    /**
     * ��ȡpub_Journal���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Journal }
     */
    public Pub.Pub_Journal getPub_Journal() {
        return pub_Journal;
    }

    /**
     * ����pub_Journal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Journal }
     */
    public void setPub_Journal(Pub.Pub_Journal value) {
        this.pub_Journal = value;
    }

    /**
     * ��ȡpub_Book���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Book }
     */
    public Pub.Pub_Book getPub_Book() {
        return pub_Book;
    }

    /**
     * ����pub_Book���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Book }
     */
    public void setPub_Book(Pub.Pub_Book value) {
        this.pub_Book = value;
    }

    /**
     * ��ȡpub_Proc���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Proc }
     */
    public Pub.Pub_Proc getPub_Proc() {
        return pub_Proc;
    }

    /**
     * ����pub_Proc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Proc }
     */
    public void setPub_Proc(Pub.Pub_Proc value) {
        this.pub_Proc = value;
    }

    /**
     * ��ȡpub_Patent���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Patent }
     */
    public Pub.Pub_Patent getPub_Patent() {
        return pub_Patent;
    }

    /**
     * ����pub_Patent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Patent }
     */
    public void setPub_Patent(Pub.Pub_Patent value) {
        this.pub_Patent = value;
    }

    /**
     * ��ȡpub_PatId���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_PatId }
     */
    public Pub.Pub_PatId getPub_PatId() {
        return pub_PatId;
    }

    /**
     * ����pub_PatId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_PatId }
     */
    public void setPub_PatId(Pub.Pub_PatId value) {
        this.pub_PatId = value;
    }

    /**
     * ��ȡpub_Man���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Man }
     */
    public Pub.Pub_Man getPub_Man() {
        return pub_Man;
    }

    /**
     * ����pub_Man���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Man }
     */
    public void setPub_Man(Pub.Pub_Man value) {
        this.pub_Man = value;
    }

    /**
     * ��ȡpub_Equiv���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Equiv }
     */
    public Pub.Pub_Equiv getPub_Equiv() {
        return pub_Equiv;
    }

    /**
     * ����pub_Equiv���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Equiv }
     */
    public void setPub_Equiv(Pub.Pub_Equiv value) {
        this.pub_Equiv = value;
    }

    /**
     * ��ȡpub_Pmid���Ե�ֵ��
     *
     * @return possible object is
     * {@link Pub.Pub_Pmid }
     */
    public Pub.Pub_Pmid getPub_Pmid() {
        return pub_Pmid;
    }

    /**
     * ����pub_Pmid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Pub.Pub_Pmid }
     */
    public void setPub_Pmid(Pub.Pub_Pmid value) {
        this.pub_Pmid = value;
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
    public static class Pub_Article {

        @XmlElement(name = "Cit-art", required = true)
        protected CitArt citArt;

        /**
         * ��ȡcitArt���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitArt }
         */
        public CitArt getCitArt() {
            return citArt;
        }

        /**
         * ����citArt���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitArt }
         */
        public void setCitArt(CitArt value) {
            this.citArt = value;
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
    public static class Pub_Book {

        @XmlElement(name = "Cit-book", required = true)
        protected CitBook citBook;

        /**
         * ��ȡcitBook���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitBook }
         */
        public CitBook getCitBook() {
            return citBook;
        }

        /**
         * ����citBook���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitBook }
         */
        public void setCitBook(CitBook value) {
            this.citBook = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub-equiv"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubEquiv"
    })
    public static class Pub_Equiv {

        @XmlElement(name = "Pub-equiv", required = true)
        protected PubEquiv pubEquiv;

        /**
         * ��ȡpubEquiv���Ե�ֵ��
         *
         * @return possible object is
         * {@link PubEquiv }
         */
        public PubEquiv getPubEquiv() {
            return pubEquiv;
        }

        /**
         * ����pubEquiv���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PubEquiv }
         */
        public void setPubEquiv(PubEquiv value) {
            this.pubEquiv = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-gen"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citGen"
    })
    public static class Pub_Gen {

        @XmlElement(name = "Cit-gen", required = true)
        protected CitGen citGen;

        /**
         * ��ȡcitGen���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitGen }
         */
        public CitGen getCitGen() {
            return citGen;
        }

        /**
         * ����citGen���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitGen }
         */
        public void setCitGen(CitGen value) {
            this.citGen = value;
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
    public static class Pub_Journal {

        @XmlElement(name = "Cit-jour", required = true)
        protected CitJour citJour;

        /**
         * ��ȡcitJour���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitJour }
         */
        public CitJour getCitJour() {
            return citJour;
        }

        /**
         * ����citJour���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitJour }
         */
        public void setCitJour(CitJour value) {
            this.citJour = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-let"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citLet"
    })
    public static class Pub_Man {

        @XmlElement(name = "Cit-let", required = true)
        protected CitLet citLet;

        /**
         * ��ȡcitLet���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitLet }
         */
        public CitLet getCitLet() {
            return citLet;
        }

        /**
         * ����citLet���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitLet }
         */
        public void setCitLet(CitLet value) {
            this.citLet = value;
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
    public static class Pub_Medline {

        @XmlElement(name = "Medline-entry", required = true)
        protected MedlineEntry medlineEntry;

        /**
         * ��ȡmedlineEntry���Ե�ֵ��
         *
         * @return possible object is
         * {@link MedlineEntry }
         */
        public MedlineEntry getMedlineEntry() {
            return medlineEntry;
        }

        /**
         * ����medlineEntry���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MedlineEntry }
         */
        public void setMedlineEntry(MedlineEntry value) {
            this.medlineEntry = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Id-pat"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "idPat"
    })
    public static class Pub_PatId {

        @XmlElement(name = "Id-pat", required = true)
        protected IdPat idPat;

        /**
         * ��ȡidPat���Ե�ֵ��
         *
         * @return possible object is
         * {@link IdPat }
         */
        public IdPat getIdPat() {
            return idPat;
        }

        /**
         * ����idPat���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link IdPat }
         */
        public void setIdPat(IdPat value) {
            this.idPat = value;
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
    public static class Pub_Patent {

        @XmlElement(name = "Cit-pat", required = true)
        protected CitPat citPat;

        /**
         * ��ȡcitPat���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitPat }
         */
        public CitPat getCitPat() {
            return citPat;
        }

        /**
         * ����citPat���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitPat }
         */
        public void setCitPat(CitPat value) {
            this.citPat = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubMedId"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubMedId"
    })
    public static class Pub_Pmid {

        @XmlElement(name = "PubMedId", required = true)
        protected BigInteger pubMedId;

        /**
         * ��ȡpubMedId���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPubMedId() {
            return pubMedId;
        }

        /**
         * ����pubMedId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPubMedId(BigInteger value) {
            this.pubMedId = value;
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
    public static class Pub_Proc {

        @XmlElement(name = "Cit-proc", required = true)
        protected CitProc citProc;

        /**
         * ��ȡcitProc���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitProc }
         */
        public CitProc getCitProc() {
            return citProc;
        }

        /**
         * ����citProc���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitProc }
         */
        public void setCitProc(CitProc value) {
            this.citProc = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-sub"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citSub"
    })
    public static class Pub_Sub {

        @XmlElement(name = "Cit-sub", required = true)
        protected CitSub citSub;

        /**
         * ��ȡcitSub���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitSub }
         */
        public CitSub getCitSub() {
            return citSub;
        }

        /**
         * ����citSub���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitSub }
         */
        public void setCitSub(CitSub value) {
            this.citSub = value;
        }

    }

}
