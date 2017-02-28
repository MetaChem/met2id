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
 *         &lt;element name="PC-DBTracking_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-DBTracking_source-id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-DBTracking_date" minOccurs="0">
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
 *         &lt;element name="PC-DBTracking_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-DBTracking_pub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub"/>
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
        "pcdbTracking_Name",
        "pcdbTracking_SourceId",
        "pcdbTracking_Date",
        "pcdbTracking_Description",
        "pcdbTracking_Pub"
})
@XmlRootElement(name = "PC-DBTracking")
public class PCDBTracking {

    @XmlElement(name = "PC-DBTracking_name", required = true)
    protected String pcdbTracking_Name;
    @XmlElement(name = "PC-DBTracking_source-id", required = true)
    protected PCDBTracking.PCDBTracking_SourceId pcdbTracking_SourceId;
    @XmlElement(name = "PC-DBTracking_date")
    protected PCDBTracking.PCDBTracking_Date pcdbTracking_Date;
    @XmlElement(name = "PC-DBTracking_description")
    protected String pcdbTracking_Description;
    @XmlElement(name = "PC-DBTracking_pub")
    protected PCDBTracking.PCDBTracking_Pub pcdbTracking_Pub;

    /**
     * ��ȡpcdbTracking_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCDBTracking_Name() {
        return pcdbTracking_Name;
    }

    /**
     * ����pcdbTracking_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCDBTracking_Name(String value) {
        this.pcdbTracking_Name = value;
    }

    /**
     * ��ȡpcdbTracking_SourceId���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDBTracking.PCDBTracking_SourceId }
     */
    public PCDBTracking.PCDBTracking_SourceId getPCDBTracking_SourceId() {
        return pcdbTracking_SourceId;
    }

    /**
     * ����pcdbTracking_SourceId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDBTracking.PCDBTracking_SourceId }
     */
    public void setPCDBTracking_SourceId(PCDBTracking.PCDBTracking_SourceId value) {
        this.pcdbTracking_SourceId = value;
    }

    /**
     * ��ȡpcdbTracking_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDBTracking.PCDBTracking_Date }
     */
    public PCDBTracking.PCDBTracking_Date getPCDBTracking_Date() {
        return pcdbTracking_Date;
    }

    /**
     * ����pcdbTracking_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDBTracking.PCDBTracking_Date }
     */
    public void setPCDBTracking_Date(PCDBTracking.PCDBTracking_Date value) {
        this.pcdbTracking_Date = value;
    }

    /**
     * ��ȡpcdbTracking_Description���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCDBTracking_Description() {
        return pcdbTracking_Description;
    }

    /**
     * ����pcdbTracking_Description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCDBTracking_Description(String value) {
        this.pcdbTracking_Description = value;
    }

    /**
     * ��ȡpcdbTracking_Pub���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCDBTracking.PCDBTracking_Pub }
     */
    public PCDBTracking.PCDBTracking_Pub getPCDBTracking_Pub() {
        return pcdbTracking_Pub;
    }

    /**
     * ����pcdbTracking_Pub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCDBTracking.PCDBTracking_Pub }
     */
    public void setPCDBTracking_Pub(PCDBTracking.PCDBTracking_Pub value) {
        this.pcdbTracking_Pub = value;
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
    public static class PCDBTracking_Date {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pub"
    })
    public static class PCDBTracking_Pub {

        @XmlElement(name = "Pub", required = true)
        protected Pub pub;

        /**
         * ��ȡpub���Ե�ֵ��
         *
         * @return possible object is
         * {@link Pub }
         */
        public Pub getPub() {
            return pub;
        }

        /**
         * ����pub���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Pub }
         */
        public void setPub(Pub value) {
            this.pub = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "objectId"
    })
    public static class PCDBTracking_SourceId {

        @XmlElement(name = "Object-id", required = true)
        protected ObjectId objectId;

        /**
         * ��ȡobjectId���Ե�ֵ��
         *
         * @return possible object is
         * {@link ObjectId }
         */
        public ObjectId getObjectId() {
            return objectId;
        }

        /**
         * ����objectId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ObjectId }
         */
        public void setObjectId(ObjectId value) {
            this.objectId = value;
        }

    }

}
