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
 *         &lt;element name="Cit-art_title" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-art_authors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-art_from">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Cit-art_from_journal">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-jour"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cit-art_from_book">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cit-art_from_proc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-proc"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-art_ids" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}ArticleIdSet"/>
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
        "citArt_Title",
        "citArt_Authors",
        "citArt_From",
        "citArt_Ids"
})
@XmlRootElement(name = "Cit-art")
public class CitArt {

    @XmlElement(name = "Cit-art_title")
    protected CitArt.CitArt_Title citArt_Title;
    @XmlElement(name = "Cit-art_authors")
    protected CitArt.CitArt_Authors citArt_Authors;
    @XmlElement(name = "Cit-art_from", required = true)
    protected CitArt.CitArt_From citArt_From;
    @XmlElement(name = "Cit-art_ids")
    protected CitArt.CitArt_Ids citArt_Ids;

    /**
     * ��ȡcitArt_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitArt.CitArt_Title }
     */
    public CitArt.CitArt_Title getCitArt_Title() {
        return citArt_Title;
    }

    /**
     * ����citArt_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitArt.CitArt_Title }
     */
    public void setCitArt_Title(CitArt.CitArt_Title value) {
        this.citArt_Title = value;
    }

    /**
     * ��ȡcitArt_Authors���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitArt.CitArt_Authors }
     */
    public CitArt.CitArt_Authors getCitArt_Authors() {
        return citArt_Authors;
    }

    /**
     * ����citArt_Authors���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitArt.CitArt_Authors }
     */
    public void setCitArt_Authors(CitArt.CitArt_Authors value) {
        this.citArt_Authors = value;
    }

    /**
     * ��ȡcitArt_From���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitArt.CitArt_From }
     */
    public CitArt.CitArt_From getCitArt_From() {
        return citArt_From;
    }

    /**
     * ����citArt_From���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitArt.CitArt_From }
     */
    public void setCitArt_From(CitArt.CitArt_From value) {
        this.citArt_From = value;
    }

    /**
     * ��ȡcitArt_Ids���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitArt.CitArt_Ids }
     */
    public CitArt.CitArt_Ids getCitArt_Ids() {
        return citArt_Ids;
    }

    /**
     * ����citArt_Ids���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitArt.CitArt_Ids }
     */
    public void setCitArt_Ids(CitArt.CitArt_Ids value) {
        this.citArt_Ids = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authList"
    })
    public static class CitArt_Authors {

        @XmlElement(name = "Auth-list", required = true)
        protected AuthList authList;

        /**
         * ��ȡauthList���Ե�ֵ��
         *
         * @return possible object is
         * {@link AuthList }
         */
        public AuthList getAuthList() {
            return authList;
        }

        /**
         * ����authList���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AuthList }
         */
        public void setAuthList(AuthList value) {
            this.authList = value;
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
     *       &lt;choice>
     *         &lt;element name="Cit-art_from_journal">
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
     *         &lt;element name="Cit-art_from_book">
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
     *         &lt;element name="Cit-art_from_proc">
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
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citArt_From_Journal",
            "citArt_From_Book",
            "citArt_From_Proc"
    })
    public static class CitArt_From {

        @XmlElement(name = "Cit-art_from_journal")
        protected CitArt.CitArt_From.CitArt_From_Journal citArt_From_Journal;
        @XmlElement(name = "Cit-art_from_book")
        protected CitArt.CitArt_From.CitArt_From_Book citArt_From_Book;
        @XmlElement(name = "Cit-art_from_proc")
        protected CitArt.CitArt_From.CitArt_From_Proc citArt_From_Proc;

        /**
         * ��ȡcitArt_From_Journal���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitArt.CitArt_From.CitArt_From_Journal }
         */
        public CitArt.CitArt_From.CitArt_From_Journal getCitArt_From_Journal() {
            return citArt_From_Journal;
        }

        /**
         * ����citArt_From_Journal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitArt.CitArt_From.CitArt_From_Journal }
         */
        public void setCitArt_From_Journal(CitArt.CitArt_From.CitArt_From_Journal value) {
            this.citArt_From_Journal = value;
        }

        /**
         * ��ȡcitArt_From_Book���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitArt.CitArt_From.CitArt_From_Book }
         */
        public CitArt.CitArt_From.CitArt_From_Book getCitArt_From_Book() {
            return citArt_From_Book;
        }

        /**
         * ����citArt_From_Book���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitArt.CitArt_From.CitArt_From_Book }
         */
        public void setCitArt_From_Book(CitArt.CitArt_From.CitArt_From_Book value) {
            this.citArt_From_Book = value;
        }

        /**
         * ��ȡcitArt_From_Proc���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitArt.CitArt_From.CitArt_From_Proc }
         */
        public CitArt.CitArt_From.CitArt_From_Proc getCitArt_From_Proc() {
            return citArt_From_Proc;
        }

        /**
         * ����citArt_From_Proc���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitArt.CitArt_From.CitArt_From_Proc }
         */
        public void setCitArt_From_Proc(CitArt.CitArt_From.CitArt_From_Proc value) {
            this.citArt_From_Proc = value;
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
        public static class CitArt_From_Book {

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
        public static class CitArt_From_Journal {

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
        public static class CitArt_From_Proc {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}ArticleIdSet"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "articleIdSet"
    })
    public static class CitArt_Ids {

        @XmlElement(name = "ArticleIdSet", required = true)
        protected ArticleIdSet articleIdSet;

        /**
         * ��ȡarticleIdSet���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArticleIdSet }
         */
        public ArticleIdSet getArticleIdSet() {
            return articleIdSet;
        }

        /**
         * ����articleIdSet���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArticleIdSet }
         */
        public void setArticleIdSet(ArticleIdSet value) {
            this.articleIdSet = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title"
    })
    public static class CitArt_Title {

        @XmlElement(name = "Title", required = true)
        protected Title title;

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link Title }
         */
        public Title getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Title }
         */
        public void setTitle(Title value) {
            this.title = value;
        }

    }

}
