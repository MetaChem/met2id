//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="PC-AssayResults_sid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayResults_sid-source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Source"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayResults_version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-AssayResults_comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayResults_outcome" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value" default="unspecified">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="inactive"/>
 *                       &lt;enumeration value="active"/>
 *                       &lt;enumeration value="inconclusive"/>
 *                       &lt;enumeration value="unspecified"/>
 *                       &lt;enumeration value="probe"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayResults_rank" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-AssayResults_data" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayData"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayResults_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayResults_xref" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AnnotatedXRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayResults_date" minOccurs="0">
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
        "pcAssayResults_Sid",
        "pcAssayResults_SidSource",
        "pcAssayResults_Version",
        "pcAssayResults_Comment",
        "pcAssayResults_Outcome",
        "pcAssayResults_Rank",
        "pcAssayResults_Data",
        "pcAssayResults_Url",
        "pcAssayResults_Xref",
        "pcAssayResults_Date"
})
@XmlRootElement(name = "PC-AssayResults")
public class PCAssayResults {

    @XmlElement(name = "PC-AssayResults_sid", required = true)
    protected BigInteger pcAssayResults_Sid;
    @XmlElement(name = "PC-AssayResults_sid-source")
    protected PCAssayResults.PCAssayResults_SidSource pcAssayResults_SidSource;
    @XmlElement(name = "PC-AssayResults_version")
    protected BigInteger pcAssayResults_Version;
    @XmlElement(name = "PC-AssayResults_comment")
    protected String pcAssayResults_Comment;
    @XmlElement(name = "PC-AssayResults_outcome")
    protected PCAssayResults.PCAssayResults_Outcome pcAssayResults_Outcome;
    @XmlElement(name = "PC-AssayResults_rank")
    protected BigInteger pcAssayResults_Rank;
    @XmlElement(name = "PC-AssayResults_data")
    protected PCAssayResults.PCAssayResults_Data pcAssayResults_Data;
    @XmlElement(name = "PC-AssayResults_url")
    protected String pcAssayResults_Url;
    @XmlElement(name = "PC-AssayResults_xref")
    protected PCAssayResults.PCAssayResults_Xref pcAssayResults_Xref;
    @XmlElement(name = "PC-AssayResults_date")
    protected PCAssayResults.PCAssayResults_Date pcAssayResults_Date;

    /**
     * ��ȡpcAssayResults_Sid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayResults_Sid() {
        return pcAssayResults_Sid;
    }

    /**
     * ����pcAssayResults_Sid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayResults_Sid(BigInteger value) {
        this.pcAssayResults_Sid = value;
    }

    /**
     * ��ȡpcAssayResults_SidSource���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayResults.PCAssayResults_SidSource }
     */
    public PCAssayResults.PCAssayResults_SidSource getPCAssayResults_SidSource() {
        return pcAssayResults_SidSource;
    }

    /**
     * ����pcAssayResults_SidSource���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayResults.PCAssayResults_SidSource }
     */
    public void setPCAssayResults_SidSource(PCAssayResults.PCAssayResults_SidSource value) {
        this.pcAssayResults_SidSource = value;
    }

    /**
     * ��ȡpcAssayResults_Version���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayResults_Version() {
        return pcAssayResults_Version;
    }

    /**
     * ����pcAssayResults_Version���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayResults_Version(BigInteger value) {
        this.pcAssayResults_Version = value;
    }

    /**
     * ��ȡpcAssayResults_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayResults_Comment() {
        return pcAssayResults_Comment;
    }

    /**
     * ����pcAssayResults_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayResults_Comment(String value) {
        this.pcAssayResults_Comment = value;
    }

    /**
     * ��ȡpcAssayResults_Outcome���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayResults.PCAssayResults_Outcome }
     */
    public PCAssayResults.PCAssayResults_Outcome getPCAssayResults_Outcome() {
        return pcAssayResults_Outcome;
    }

    /**
     * ����pcAssayResults_Outcome���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayResults.PCAssayResults_Outcome }
     */
    public void setPCAssayResults_Outcome(PCAssayResults.PCAssayResults_Outcome value) {
        this.pcAssayResults_Outcome = value;
    }

    /**
     * ��ȡpcAssayResults_Rank���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayResults_Rank() {
        return pcAssayResults_Rank;
    }

    /**
     * ����pcAssayResults_Rank���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayResults_Rank(BigInteger value) {
        this.pcAssayResults_Rank = value;
    }

    /**
     * ��ȡpcAssayResults_Data���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayResults.PCAssayResults_Data }
     */
    public PCAssayResults.PCAssayResults_Data getPCAssayResults_Data() {
        return pcAssayResults_Data;
    }

    /**
     * ����pcAssayResults_Data���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayResults.PCAssayResults_Data }
     */
    public void setPCAssayResults_Data(PCAssayResults.PCAssayResults_Data value) {
        this.pcAssayResults_Data = value;
    }

    /**
     * ��ȡpcAssayResults_Url���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayResults_Url() {
        return pcAssayResults_Url;
    }

    /**
     * ����pcAssayResults_Url���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayResults_Url(String value) {
        this.pcAssayResults_Url = value;
    }

    /**
     * ��ȡpcAssayResults_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayResults.PCAssayResults_Xref }
     */
    public PCAssayResults.PCAssayResults_Xref getPCAssayResults_Xref() {
        return pcAssayResults_Xref;
    }

    /**
     * ����pcAssayResults_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayResults.PCAssayResults_Xref }
     */
    public void setPCAssayResults_Xref(PCAssayResults.PCAssayResults_Xref value) {
        this.pcAssayResults_Xref = value;
    }

    /**
     * ��ȡpcAssayResults_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayResults.PCAssayResults_Date }
     */
    public PCAssayResults.PCAssayResults_Date getPCAssayResults_Date() {
        return pcAssayResults_Date;
    }

    /**
     * ����pcAssayResults_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayResults.PCAssayResults_Date }
     */
    public void setPCAssayResults_Date(PCAssayResults.PCAssayResults_Date value) {
        this.pcAssayResults_Date = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayData"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayData"
    })
    public static class PCAssayResults_Data {

        @XmlElement(name = "PC-AssayData")
        protected List<PCAssayData> pcAssayData;

        /**
         * Gets the value of the pcAssayData property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayData property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayData().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAssayData }
         */
        public List<PCAssayData> getPCAssayData() {
            if (pcAssayData == null) {
                pcAssayData = new ArrayList<PCAssayData>();
            }
            return this.pcAssayData;
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
    public static class PCAssayResults_Date {

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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="value" default="unspecified">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="inactive"/>
     *             &lt;enumeration value="active"/>
     *             &lt;enumeration value="inconclusive"/>
     *             &lt;enumeration value="unspecified"/>
     *             &lt;enumeration value="probe"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class PCAssayResults_Outcome {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String stringValue;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * ��ȡstringValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStringValue() {
            if (stringValue == null) {
                return "unspecified";
            } else {
                return stringValue;
            }
        }

        /**
         * ����stringValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStringValue(String value) {
            this.stringValue = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Source"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcSource"
    })
    public static class PCAssayResults_SidSource {

        @XmlElement(name = "PC-Source", required = true)
        protected PCSource pcSource;

        /**
         * ��ȡpcSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCSource }
         */
        public PCSource getPCSource() {
            return pcSource;
        }

        /**
         * ����pcSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCSource }
         */
        public void setPCSource(PCSource value) {
            this.pcSource = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AnnotatedXRef"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAnnotatedXRef"
    })
    public static class PCAssayResults_Xref {

        @XmlElement(name = "PC-AnnotatedXRef")
        protected List<PCAnnotatedXRef> pcAnnotatedXRef;

        /**
         * Gets the value of the pcAnnotatedXRef property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAnnotatedXRef property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAnnotatedXRef().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAnnotatedXRef }
         */
        public List<PCAnnotatedXRef> getPCAnnotatedXRef() {
            if (pcAnnotatedXRef == null) {
                pcAnnotatedXRef = new ArrayList<PCAnnotatedXRef>();
            }
            return this.pcAnnotatedXRef;
        }

    }

}
