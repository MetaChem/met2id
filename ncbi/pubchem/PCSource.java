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
 *         &lt;element name="PC-Source_individual">
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
 *         &lt;element name="PC-Source_db">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-DBTracking"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Source_mmdb">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-MMDBSource"/>
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
        "pcSource_Individual",
        "pcSource_Db",
        "pcSource_Mmdb"
})
@XmlRootElement(name = "PC-Source")
public class PCSource {

    @XmlElement(name = "PC-Source_individual")
    protected PCSource.PCSource_Individual pcSource_Individual;
    @XmlElement(name = "PC-Source_db")
    protected PCSource.PCSource_Db pcSource_Db;
    @XmlElement(name = "PC-Source_mmdb")
    protected PCSource.PCSource_Mmdb pcSource_Mmdb;

    /**
     * ��ȡpcSource_Individual���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSource.PCSource_Individual }
     */
    public PCSource.PCSource_Individual getPCSource_Individual() {
        return pcSource_Individual;
    }

    /**
     * ����pcSource_Individual���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSource.PCSource_Individual }
     */
    public void setPCSource_Individual(PCSource.PCSource_Individual value) {
        this.pcSource_Individual = value;
    }

    /**
     * ��ȡpcSource_Db���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSource.PCSource_Db }
     */
    public PCSource.PCSource_Db getPCSource_Db() {
        return pcSource_Db;
    }

    /**
     * ����pcSource_Db���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSource.PCSource_Db }
     */
    public void setPCSource_Db(PCSource.PCSource_Db value) {
        this.pcSource_Db = value;
    }

    /**
     * ��ȡpcSource_Mmdb���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCSource.PCSource_Mmdb }
     */
    public PCSource.PCSource_Mmdb getPCSource_Mmdb() {
        return pcSource_Mmdb;
    }

    /**
     * ����pcSource_Mmdb���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCSource.PCSource_Mmdb }
     */
    public void setPCSource_Mmdb(PCSource.PCSource_Mmdb value) {
        this.pcSource_Mmdb = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-DBTracking"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcdbTracking"
    })
    public static class PCSource_Db {

        @XmlElement(name = "PC-DBTracking", required = true)
        protected PCDBTracking pcdbTracking;

        /**
         * ��ȡpcdbTracking���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCDBTracking }
         */
        public PCDBTracking getPCDBTracking() {
            return pcdbTracking;
        }

        /**
         * ����pcdbTracking���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCDBTracking }
         */
        public void setPCDBTracking(PCDBTracking value) {
            this.pcdbTracking = value;
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
    public static class PCSource_Individual {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-MMDBSource"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcmmdbSource"
    })
    public static class PCSource_Mmdb {

        @XmlElement(name = "PC-MMDBSource", required = true)
        protected PCMMDBSource pcmmdbSource;

        /**
         * ��ȡpcmmdbSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCMMDBSource }
         */
        public PCMMDBSource getPCMMDBSource() {
            return pcmmdbSource;
        }

        /**
         * ����pcmmdbSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCMMDBSource }
         */
        public void setPCMMDBSource(PCMMDBSource value) {
            this.pcmmdbSource = value;
        }

    }

}
