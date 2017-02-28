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
 *       &lt;choice>
 *         &lt;element name="Date_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date_std">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date-std"/>
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
        "date_Str",
        "date_Std"
})
@XmlRootElement(name = "Date")
public class Date {

    @XmlElement(name = "Date_str")
    protected String date_Str;
    @XmlElement(name = "Date_std")
    protected Date.Date_Std date_Std;

    /**
     * ��ȡdate_Str���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDate_Str() {
        return date_Str;
    }

    /**
     * ����date_Str���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDate_Str(String value) {
        this.date_Str = value;
    }

    /**
     * ��ȡdate_Std���Ե�ֵ��
     *
     * @return possible object is
     * {@link Date.Date_Std }
     */
    public Date.Date_Std getDate_Std() {
        return date_Std;
    }

    /**
     * ����date_Std���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Date.Date_Std }
     */
    public void setDate_Std(Date.Date_Std value) {
        this.date_Std = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date-std"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dateStd"
    })
    public static class Date_Std {

        @XmlElement(name = "Date-std", required = true)
        protected DateStd dateStd;

        /**
         * ��ȡdateStd���Ե�ֵ��
         *
         * @return possible object is
         * {@link DateStd }
         */
        public DateStd getDateStd() {
            return dateStd;
        }

        /**
         * ����dateStd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DateStd }
         */
        public void setDateStd(DateStd value) {
            this.dateStd = value;
        }

    }

}
