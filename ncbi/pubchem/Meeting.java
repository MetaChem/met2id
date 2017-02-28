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
 *         &lt;element name="Meeting_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Meeting_date">
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
 *         &lt;element name="Meeting_place" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Affil"/>
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
        "meeting_Number",
        "meeting_Date",
        "meeting_Place"
})
@XmlRootElement(name = "Meeting")
public class Meeting {

    @XmlElement(name = "Meeting_number", required = true)
    protected String meeting_Number;
    @XmlElement(name = "Meeting_date", required = true)
    protected Meeting.Meeting_Date meeting_Date;
    @XmlElement(name = "Meeting_place")
    protected Meeting.Meeting_Place meeting_Place;

    /**
     * ��ȡmeeting_Number���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMeeting_Number() {
        return meeting_Number;
    }

    /**
     * ����meeting_Number���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMeeting_Number(String value) {
        this.meeting_Number = value;
    }

    /**
     * ��ȡmeeting_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link Meeting.Meeting_Date }
     */
    public Meeting.Meeting_Date getMeeting_Date() {
        return meeting_Date;
    }

    /**
     * ����meeting_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Meeting.Meeting_Date }
     */
    public void setMeeting_Date(Meeting.Meeting_Date value) {
        this.meeting_Date = value;
    }

    /**
     * ��ȡmeeting_Place���Ե�ֵ��
     *
     * @return possible object is
     * {@link Meeting.Meeting_Place }
     */
    public Meeting.Meeting_Place getMeeting_Place() {
        return meeting_Place;
    }

    /**
     * ����meeting_Place���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Meeting.Meeting_Place }
     */
    public void setMeeting_Place(Meeting.Meeting_Place value) {
        this.meeting_Place = value;
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
    public static class Meeting_Date {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Affil"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "affil"
    })
    public static class Meeting_Place {

        @XmlElement(name = "Affil", required = true)
        protected Affil affil;

        /**
         * ��ȡaffil���Ե�ֵ��
         *
         * @return possible object is
         * {@link Affil }
         */
        public Affil getAffil() {
            return affil;
        }

        /**
         * ����affil���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Affil }
         */
        public void setAffil(Affil value) {
            this.affil = value;
        }

    }

}
