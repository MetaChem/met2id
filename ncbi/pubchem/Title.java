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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Title_E">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Title_E_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_tsub" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_iso-jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_ml-jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_coden" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_abr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Title_E_isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
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
        "title_E"
})
@XmlRootElement(name = "Title")
public class Title {

    @XmlElement(name = "Title_E")
    protected List<Title.Title_E> title_E;

    /**
     * Gets the value of the titleE property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleE property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle_E().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title.Title_E }
     */
    public List<Title.Title_E> getTitle_E() {
        if (title_E == null) {
            title_E = new ArrayList<Title.Title_E>();
        }
        return this.title_E;
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
     *         &lt;element name="Title_E_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_tsub" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_iso-jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_ml-jta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_coden" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_abr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Title_E_isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title_E_Name",
            "title_E_Tsub",
            "title_E_Trans",
            "title_E_Jta",
            "title_E_IsoJta",
            "title_E_MlJta",
            "title_E_Coden",
            "title_E_Issn",
            "title_E_Abr",
            "title_E_Isbn"
    })
    public static class Title_E {

        @XmlElement(name = "Title_E_name")
        protected String title_E_Name;
        @XmlElement(name = "Title_E_tsub")
        protected String title_E_Tsub;
        @XmlElement(name = "Title_E_trans")
        protected String title_E_Trans;
        @XmlElement(name = "Title_E_jta")
        protected String title_E_Jta;
        @XmlElement(name = "Title_E_iso-jta")
        protected String title_E_IsoJta;
        @XmlElement(name = "Title_E_ml-jta")
        protected String title_E_MlJta;
        @XmlElement(name = "Title_E_coden")
        protected String title_E_Coden;
        @XmlElement(name = "Title_E_issn")
        protected String title_E_Issn;
        @XmlElement(name = "Title_E_abr")
        protected String title_E_Abr;
        @XmlElement(name = "Title_E_isbn")
        protected String title_E_Isbn;

        /**
         * ��ȡtitle_E_Name���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Name() {
            return title_E_Name;
        }

        /**
         * ����title_E_Name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Name(String value) {
            this.title_E_Name = value;
        }

        /**
         * ��ȡtitle_E_Tsub���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Tsub() {
            return title_E_Tsub;
        }

        /**
         * ����title_E_Tsub���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Tsub(String value) {
            this.title_E_Tsub = value;
        }

        /**
         * ��ȡtitle_E_Trans���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Trans() {
            return title_E_Trans;
        }

        /**
         * ����title_E_Trans���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Trans(String value) {
            this.title_E_Trans = value;
        }

        /**
         * ��ȡtitle_E_Jta���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Jta() {
            return title_E_Jta;
        }

        /**
         * ����title_E_Jta���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Jta(String value) {
            this.title_E_Jta = value;
        }

        /**
         * ��ȡtitle_E_IsoJta���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_IsoJta() {
            return title_E_IsoJta;
        }

        /**
         * ����title_E_IsoJta���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_IsoJta(String value) {
            this.title_E_IsoJta = value;
        }

        /**
         * ��ȡtitle_E_MlJta���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_MlJta() {
            return title_E_MlJta;
        }

        /**
         * ����title_E_MlJta���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_MlJta(String value) {
            this.title_E_MlJta = value;
        }

        /**
         * ��ȡtitle_E_Coden���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Coden() {
            return title_E_Coden;
        }

        /**
         * ����title_E_Coden���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Coden(String value) {
            this.title_E_Coden = value;
        }

        /**
         * ��ȡtitle_E_Issn���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Issn() {
            return title_E_Issn;
        }

        /**
         * ����title_E_Issn���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Issn(String value) {
            this.title_E_Issn = value;
        }

        /**
         * ��ȡtitle_E_Abr���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Abr() {
            return title_E_Abr;
        }

        /**
         * ����title_E_Abr���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Abr(String value) {
            this.title_E_Abr = value;
        }

        /**
         * ��ȡtitle_E_Isbn���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle_E_Isbn() {
            return title_E_Isbn;
        }

        /**
         * ����title_E_Isbn���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle_E_Isbn(String value) {
            this.title_E_Isbn = value;
        }

    }

}
