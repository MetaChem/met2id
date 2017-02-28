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
 *         &lt;element name="Cit-proc_book">
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
 *         &lt;element name="Cit-proc_meet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Meeting"/>
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
        "citProc_Book",
        "citProc_Meet"
})
@XmlRootElement(name = "Cit-proc")
public class CitProc {

    @XmlElement(name = "Cit-proc_book", required = true)
    protected CitProc.CitProc_Book citProc_Book;
    @XmlElement(name = "Cit-proc_meet", required = true)
    protected CitProc.CitProc_Meet citProc_Meet;

    /**
     * ��ȡcitProc_Book���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitProc.CitProc_Book }
     */
    public CitProc.CitProc_Book getCitProc_Book() {
        return citProc_Book;
    }

    /**
     * ����citProc_Book���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitProc.CitProc_Book }
     */
    public void setCitProc_Book(CitProc.CitProc_Book value) {
        this.citProc_Book = value;
    }

    /**
     * ��ȡcitProc_Meet���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitProc.CitProc_Meet }
     */
    public CitProc.CitProc_Meet getCitProc_Meet() {
        return citProc_Meet;
    }

    /**
     * ����citProc_Meet���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitProc.CitProc_Meet }
     */
    public void setCitProc_Meet(CitProc.CitProc_Meet value) {
        this.citProc_Meet = value;
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
    public static class CitProc_Book {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Meeting"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "meeting"
    })
    public static class CitProc_Meet {

        @XmlElement(name = "Meeting", required = true)
        protected Meeting meeting;

        /**
         * ��ȡmeeting���Ե�ֵ��
         *
         * @return possible object is
         * {@link Meeting }
         */
        public Meeting getMeeting() {
            return meeting;
        }

        /**
         * ����meeting���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Meeting }
         */
        public void setMeeting(Meeting value) {
            this.meeting = value;
        }

    }

}
