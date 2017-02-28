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
 *       &lt;sequence>
 *         &lt;element name="Date-std_year" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Date-std_month" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Date-std_day" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Date-std_season" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date-std_hour" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Date-std_minute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Date-std_second" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dateStd_Year",
        "dateStd_Month",
        "dateStd_Day",
        "dateStd_Season",
        "dateStd_Hour",
        "dateStd_Minute",
        "dateStd_Second"
})
@XmlRootElement(name = "Date-std")
public class DateStd {

    @XmlElement(name = "Date-std_year", required = true)
    protected BigInteger dateStd_Year;
    @XmlElement(name = "Date-std_month")
    protected BigInteger dateStd_Month;
    @XmlElement(name = "Date-std_day")
    protected BigInteger dateStd_Day;
    @XmlElement(name = "Date-std_season")
    protected String dateStd_Season;
    @XmlElement(name = "Date-std_hour")
    protected BigInteger dateStd_Hour;
    @XmlElement(name = "Date-std_minute")
    protected BigInteger dateStd_Minute;
    @XmlElement(name = "Date-std_second")
    protected BigInteger dateStd_Second;

    /**
     * ��ȡdateStd_Year���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Year() {
        return dateStd_Year;
    }

    /**
     * ����dateStd_Year���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Year(BigInteger value) {
        this.dateStd_Year = value;
    }

    /**
     * ��ȡdateStd_Month���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Month() {
        return dateStd_Month;
    }

    /**
     * ����dateStd_Month���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Month(BigInteger value) {
        this.dateStd_Month = value;
    }

    /**
     * ��ȡdateStd_Day���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Day() {
        return dateStd_Day;
    }

    /**
     * ����dateStd_Day���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Day(BigInteger value) {
        this.dateStd_Day = value;
    }

    /**
     * ��ȡdateStd_Season���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateStd_Season() {
        return dateStd_Season;
    }

    /**
     * ����dateStd_Season���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateStd_Season(String value) {
        this.dateStd_Season = value;
    }

    /**
     * ��ȡdateStd_Hour���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Hour() {
        return dateStd_Hour;
    }

    /**
     * ����dateStd_Hour���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Hour(BigInteger value) {
        this.dateStd_Hour = value;
    }

    /**
     * ��ȡdateStd_Minute���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Minute() {
        return dateStd_Minute;
    }

    /**
     * ����dateStd_Minute���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Minute(BigInteger value) {
        this.dateStd_Minute = value;
    }

    /**
     * ��ȡdateStd_Second���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDateStd_Second() {
        return dateStd_Second;
    }

    /**
     * ����dateStd_Second���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDateStd_Second(BigInteger value) {
        this.dateStd_Second = value;
    }

}
