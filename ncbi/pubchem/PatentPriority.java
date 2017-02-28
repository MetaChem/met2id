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
 *         &lt;element name="Patent-priority_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Patent-priority_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Patent-priority_date">
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
        "patentPriority_Country",
        "patentPriority_Number",
        "patentPriority_Date"
})
@XmlRootElement(name = "Patent-priority")
public class PatentPriority {

    @XmlElement(name = "Patent-priority_country", required = true)
    protected String patentPriority_Country;
    @XmlElement(name = "Patent-priority_number", required = true)
    protected String patentPriority_Number;
    @XmlElement(name = "Patent-priority_date", required = true)
    protected PatentPriority.PatentPriority_Date patentPriority_Date;

    /**
     * ��ȡpatentPriority_Country���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPatentPriority_Country() {
        return patentPriority_Country;
    }

    /**
     * ����patentPriority_Country���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPatentPriority_Country(String value) {
        this.patentPriority_Country = value;
    }

    /**
     * ��ȡpatentPriority_Number���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPatentPriority_Number() {
        return patentPriority_Number;
    }

    /**
     * ����patentPriority_Number���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPatentPriority_Number(String value) {
        this.patentPriority_Number = value;
    }

    /**
     * ��ȡpatentPriority_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link PatentPriority.PatentPriority_Date }
     */
    public PatentPriority.PatentPriority_Date getPatentPriority_Date() {
        return patentPriority_Date;
    }

    /**
     * ����patentPriority_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PatentPriority.PatentPriority_Date }
     */
    public void setPatentPriority_Date(PatentPriority.PatentPriority_Date value) {
        this.patentPriority_Date = value;
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
    public static class PatentPriority_Date {

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

}
