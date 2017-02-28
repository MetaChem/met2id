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
 *         &lt;element name="ArticleId_pubmed">
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
 *         &lt;element name="ArticleId_medline">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}MedlineUID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_doi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}DOI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_pii">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PII"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_pmcid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmcID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_pmcpid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmcPid"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_pmpid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmPid"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArticleId_other">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
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
        "articleId_Pubmed",
        "articleId_Medline",
        "articleId_Doi",
        "articleId_Pii",
        "articleId_Pmcid",
        "articleId_Pmcpid",
        "articleId_Pmpid",
        "articleId_Other"
})
@XmlRootElement(name = "ArticleId")
public class ArticleId {

    @XmlElement(name = "ArticleId_pubmed")
    protected ArticleId.ArticleId_Pubmed articleId_Pubmed;
    @XmlElement(name = "ArticleId_medline")
    protected ArticleId.ArticleId_Medline articleId_Medline;
    @XmlElement(name = "ArticleId_doi")
    protected ArticleId.ArticleId_Doi articleId_Doi;
    @XmlElement(name = "ArticleId_pii")
    protected ArticleId.ArticleId_Pii articleId_Pii;
    @XmlElement(name = "ArticleId_pmcid")
    protected ArticleId.ArticleId_Pmcid articleId_Pmcid;
    @XmlElement(name = "ArticleId_pmcpid")
    protected ArticleId.ArticleId_Pmcpid articleId_Pmcpid;
    @XmlElement(name = "ArticleId_pmpid")
    protected ArticleId.ArticleId_Pmpid articleId_Pmpid;
    @XmlElement(name = "ArticleId_other")
    protected ArticleId.ArticleId_Other articleId_Other;

    /**
     * ��ȡarticleId_Pubmed���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Pubmed }
     */
    public ArticleId.ArticleId_Pubmed getArticleId_Pubmed() {
        return articleId_Pubmed;
    }

    /**
     * ����articleId_Pubmed���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Pubmed }
     */
    public void setArticleId_Pubmed(ArticleId.ArticleId_Pubmed value) {
        this.articleId_Pubmed = value;
    }

    /**
     * ��ȡarticleId_Medline���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Medline }
     */
    public ArticleId.ArticleId_Medline getArticleId_Medline() {
        return articleId_Medline;
    }

    /**
     * ����articleId_Medline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Medline }
     */
    public void setArticleId_Medline(ArticleId.ArticleId_Medline value) {
        this.articleId_Medline = value;
    }

    /**
     * ��ȡarticleId_Doi���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Doi }
     */
    public ArticleId.ArticleId_Doi getArticleId_Doi() {
        return articleId_Doi;
    }

    /**
     * ����articleId_Doi���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Doi }
     */
    public void setArticleId_Doi(ArticleId.ArticleId_Doi value) {
        this.articleId_Doi = value;
    }

    /**
     * ��ȡarticleId_Pii���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Pii }
     */
    public ArticleId.ArticleId_Pii getArticleId_Pii() {
        return articleId_Pii;
    }

    /**
     * ����articleId_Pii���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Pii }
     */
    public void setArticleId_Pii(ArticleId.ArticleId_Pii value) {
        this.articleId_Pii = value;
    }

    /**
     * ��ȡarticleId_Pmcid���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Pmcid }
     */
    public ArticleId.ArticleId_Pmcid getArticleId_Pmcid() {
        return articleId_Pmcid;
    }

    /**
     * ����articleId_Pmcid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Pmcid }
     */
    public void setArticleId_Pmcid(ArticleId.ArticleId_Pmcid value) {
        this.articleId_Pmcid = value;
    }

    /**
     * ��ȡarticleId_Pmcpid���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Pmcpid }
     */
    public ArticleId.ArticleId_Pmcpid getArticleId_Pmcpid() {
        return articleId_Pmcpid;
    }

    /**
     * ����articleId_Pmcpid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Pmcpid }
     */
    public void setArticleId_Pmcpid(ArticleId.ArticleId_Pmcpid value) {
        this.articleId_Pmcpid = value;
    }

    /**
     * ��ȡarticleId_Pmpid���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Pmpid }
     */
    public ArticleId.ArticleId_Pmpid getArticleId_Pmpid() {
        return articleId_Pmpid;
    }

    /**
     * ����articleId_Pmpid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Pmpid }
     */
    public void setArticleId_Pmpid(ArticleId.ArticleId_Pmpid value) {
        this.articleId_Pmpid = value;
    }

    /**
     * ��ȡarticleId_Other���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArticleId.ArticleId_Other }
     */
    public ArticleId.ArticleId_Other getArticleId_Other() {
        return articleId_Other;
    }

    /**
     * ����articleId_Other���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArticleId.ArticleId_Other }
     */
    public void setArticleId_Other(ArticleId.ArticleId_Other value) {
        this.articleId_Other = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}DOI"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "doi"
    })
    public static class ArticleId_Doi {

        @XmlElement(name = "DOI", required = true)
        protected String doi;

        /**
         * ��ȡdoi���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDOI() {
            return doi;
        }

        /**
         * ����doi���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDOI(String value) {
            this.doi = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}MedlineUID"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "medlineUID"
    })
    public static class ArticleId_Medline {

        @XmlElement(name = "MedlineUID", required = true)
        protected BigInteger medlineUID;

        /**
         * ��ȡmedlineUID���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMedlineUID() {
            return medlineUID;
        }

        /**
         * ����medlineUID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMedlineUID(BigInteger value) {
            this.medlineUID = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dbtag"
    })
    public static class ArticleId_Other {

        @XmlElement(name = "Dbtag", required = true)
        protected Dbtag dbtag;

        /**
         * ��ȡdbtag���Ե�ֵ��
         *
         * @return possible object is
         * {@link Dbtag }
         */
        public Dbtag getDbtag() {
            return dbtag;
        }

        /**
         * ����dbtag���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Dbtag }
         */
        public void setDbtag(Dbtag value) {
            this.dbtag = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PII"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pii"
    })
    public static class ArticleId_Pii {

        @XmlElement(name = "PII", required = true)
        protected String pii;

        /**
         * ��ȡpii���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPII() {
            return pii;
        }

        /**
         * ����pii���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPII(String value) {
            this.pii = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmcID"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pmcID"
    })
    public static class ArticleId_Pmcid {

        @XmlElement(name = "PmcID", required = true)
        protected BigInteger pmcID;

        /**
         * ��ȡpmcID���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPmcID() {
            return pmcID;
        }

        /**
         * ����pmcID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPmcID(BigInteger value) {
            this.pmcID = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmcPid"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pmcPid"
    })
    public static class ArticleId_Pmcpid {

        @XmlElement(name = "PmcPid", required = true)
        protected String pmcPid;

        /**
         * ��ȡpmcPid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPmcPid() {
            return pmcPid;
        }

        /**
         * ����pmcPid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPmcPid(String value) {
            this.pmcPid = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PmPid"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pmPid"
    })
    public static class ArticleId_Pmpid {

        @XmlElement(name = "PmPid", required = true)
        protected String pmPid;

        /**
         * ��ȡpmPid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPmPid() {
            return pmPid;
        }

        /**
         * ����pmPid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPmPid(String value) {
            this.pmPid = value;
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
    public static class ArticleId_Pubmed {

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

}
