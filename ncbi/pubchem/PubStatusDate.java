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
 *         &lt;element name="PubStatusDate_pubstatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatus"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PubStatusDate_date">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
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
        "pubStatusDate_Pubstatus",
        "pubStatusDate_Date"
})
@XmlRootElement(name = "PubStatusDate")
public class PubStatusDate {

    @XmlElement(name = "PubStatusDate_pubstatus", required = true)
    protected PubStatusDate.PubStatusDate_Pubstatus pubStatusDate_Pubstatus;
    @XmlElement(name = "PubStatusDate_date", required = true)
    protected PubStatusDate.PubStatusDate_Date pubStatusDate_Date;

    /**
     * ��ȡpubStatusDate_Pubstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubStatusDate.PubStatusDate_Pubstatus }
     */
    public PubStatusDate.PubStatusDate_Pubstatus getPubStatusDate_Pubstatus() {
        return pubStatusDate_Pubstatus;
    }

    /**
     * ����pubStatusDate_Pubstatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubStatusDate.PubStatusDate_Pubstatus }
     */
    public void setPubStatusDate_Pubstatus(PubStatusDate.PubStatusDate_Pubstatus value) {
        this.pubStatusDate_Pubstatus = value;
    }

    /**
     * ��ȡpubStatusDate_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link PubStatusDate.PubStatusDate_Date }
     */
    public PubStatusDate.PubStatusDate_Date getPubStatusDate_Date() {
        return pubStatusDate_Date;
    }

    /**
     * ����pubStatusDate_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PubStatusDate.PubStatusDate_Date }
     */
    public void setPubStatusDate_Date(PubStatusDate.PubStatusDate_Date value) {
        this.pubStatusDate_Date = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "date"
    })
    public static class PubStatusDate_Date {

        @XmlElement(name = "Date", required = true)
        protected Date date;

        /**
         * ��ȡdate���Ե�ֵ��
         *
         * @return possible object is
         * {@link Date }
         */
        public Date getDate() {
            return date;
        }

        /**
         * ����date���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Date }
         */
        public void setDate(Date value) {
            this.date = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PubStatus"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pubStatus"
    })
    public static class PubStatusDate_Pubstatus {

        @XmlElement(name = "PubStatus", required = true)
        protected PubStatus pubStatus;

        /**
         * ��ȡpubStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link PubStatus }
         */
        public PubStatus getPubStatus() {
            return pubStatus;
        }

        /**
         * ����pubStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PubStatus }
         */
        public void setPubStatus(PubStatus value) {
            this.pubStatus = value;
        }

    }

}
