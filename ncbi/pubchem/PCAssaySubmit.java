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
 *         &lt;element name="PC-AssaySubmit_assay">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PC-AssaySubmit_assay_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PC-AssaySubmit_assay_aid-source">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-Source"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-AssaySubmit_assay_descr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayDescription"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-AssaySubmit_assay_aidver">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ID"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssaySubmit_data" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayResults"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssaySubmit_revoke" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssaySubmit_revoke_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "pcAssaySubmit_Assay",
        "pcAssaySubmit_Data",
        "pcAssaySubmit_Revoke"
})
@XmlRootElement(name = "PC-AssaySubmit")
public class PCAssaySubmit {

    @XmlElement(name = "PC-AssaySubmit_assay", required = true)
    protected PCAssaySubmit.PCAssaySubmit_Assay pcAssaySubmit_Assay;
    @XmlElement(name = "PC-AssaySubmit_data")
    protected PCAssaySubmit.PCAssaySubmit_Data pcAssaySubmit_Data;
    @XmlElement(name = "PC-AssaySubmit_revoke")
    protected PCAssaySubmit.PCAssaySubmit_Revoke pcAssaySubmit_Revoke;

    /**
     * ��ȡpcAssaySubmit_Assay���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssaySubmit.PCAssaySubmit_Assay }
     */
    public PCAssaySubmit.PCAssaySubmit_Assay getPCAssaySubmit_Assay() {
        return pcAssaySubmit_Assay;
    }

    /**
     * ����pcAssaySubmit_Assay���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssaySubmit.PCAssaySubmit_Assay }
     */
    public void setPCAssaySubmit_Assay(PCAssaySubmit.PCAssaySubmit_Assay value) {
        this.pcAssaySubmit_Assay = value;
    }

    /**
     * ��ȡpcAssaySubmit_Data���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssaySubmit.PCAssaySubmit_Data }
     */
    public PCAssaySubmit.PCAssaySubmit_Data getPCAssaySubmit_Data() {
        return pcAssaySubmit_Data;
    }

    /**
     * ����pcAssaySubmit_Data���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssaySubmit.PCAssaySubmit_Data }
     */
    public void setPCAssaySubmit_Data(PCAssaySubmit.PCAssaySubmit_Data value) {
        this.pcAssaySubmit_Data = value;
    }

    /**
     * ��ȡpcAssaySubmit_Revoke���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssaySubmit.PCAssaySubmit_Revoke }
     */
    public PCAssaySubmit.PCAssaySubmit_Revoke getPCAssaySubmit_Revoke() {
        return pcAssaySubmit_Revoke;
    }

    /**
     * ����pcAssaySubmit_Revoke���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssaySubmit.PCAssaySubmit_Revoke }
     */
    public void setPCAssaySubmit_Revoke(PCAssaySubmit.PCAssaySubmit_Revoke value) {
        this.pcAssaySubmit_Revoke = value;
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
     *         &lt;element name="PC-AssaySubmit_assay_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-AssaySubmit_assay_aid-source">
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
     *         &lt;element name="PC-AssaySubmit_assay_descr">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayDescription"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-AssaySubmit_assay_aidver">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ID"/>
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
            "pcAssaySubmit_Assay_Aid",
            "pcAssaySubmit_Assay_AidSource",
            "pcAssaySubmit_Assay_Descr",
            "pcAssaySubmit_Assay_Aidver"
    })
    public static class PCAssaySubmit_Assay {

        @XmlElement(name = "PC-AssaySubmit_assay_aid")
        protected BigInteger pcAssaySubmit_Assay_Aid;
        @XmlElement(name = "PC-AssaySubmit_assay_aid-source")
        protected PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource pcAssaySubmit_Assay_AidSource;
        @XmlElement(name = "PC-AssaySubmit_assay_descr")
        protected PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr pcAssaySubmit_Assay_Descr;
        @XmlElement(name = "PC-AssaySubmit_assay_aidver")
        protected PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver pcAssaySubmit_Assay_Aidver;

        /**
         * ��ȡpcAssaySubmit_Assay_Aid���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCAssaySubmit_Assay_Aid() {
            return pcAssaySubmit_Assay_Aid;
        }

        /**
         * ����pcAssaySubmit_Assay_Aid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCAssaySubmit_Assay_Aid(BigInteger value) {
            this.pcAssaySubmit_Assay_Aid = value;
        }

        /**
         * ��ȡpcAssaySubmit_Assay_AidSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource }
         */
        public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource getPCAssaySubmit_Assay_AidSource() {
            return pcAssaySubmit_Assay_AidSource;
        }

        /**
         * ����pcAssaySubmit_Assay_AidSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource }
         */
        public void setPCAssaySubmit_Assay_AidSource(PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource value) {
            this.pcAssaySubmit_Assay_AidSource = value;
        }

        /**
         * ��ȡpcAssaySubmit_Assay_Descr���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr }
         */
        public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr getPCAssaySubmit_Assay_Descr() {
            return pcAssaySubmit_Assay_Descr;
        }

        /**
         * ����pcAssaySubmit_Assay_Descr���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr }
         */
        public void setPCAssaySubmit_Assay_Descr(PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr value) {
            this.pcAssaySubmit_Assay_Descr = value;
        }

        /**
         * ��ȡpcAssaySubmit_Assay_Aidver���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver }
         */
        public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver getPCAssaySubmit_Assay_Aidver() {
            return pcAssaySubmit_Assay_Aidver;
        }

        /**
         * ����pcAssaySubmit_Assay_Aidver���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver }
         */
        public void setPCAssaySubmit_Assay_Aidver(PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver value) {
            this.pcAssaySubmit_Assay_Aidver = value;
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
        public static class PCAssaySubmit_Assay_AidSource {

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
         *       &lt;sequence>
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ID"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcid"
        })
        public static class PCAssaySubmit_Assay_Aidver {

            @XmlElement(name = "PC-ID", required = true)
            protected PCID pcid;

            /**
             * ��ȡpcid���Ե�ֵ��
             *
             * @return possible object is
             * {@link PCID }
             */
            public PCID getPCID() {
                return pcid;
            }

            /**
             * ����pcid���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PCID }
             */
            public void setPCID(PCID value) {
                this.pcid = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayDescription"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcAssayDescription"
        })
        public static class PCAssaySubmit_Assay_Descr {

            @XmlElement(name = "PC-AssayDescription", required = true)
            protected PCAssayDescription pcAssayDescription;

            /**
             * ��ȡpcAssayDescription���Ե�ֵ��
             *
             * @return possible object is
             * {@link PCAssayDescription }
             */
            public PCAssayDescription getPCAssayDescription() {
                return pcAssayDescription;
            }

            /**
             * ����pcAssayDescription���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PCAssayDescription }
             */
            public void setPCAssayDescription(PCAssayDescription value) {
                this.pcAssayDescription = value;
            }

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayResults"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayResults"
    })
    public static class PCAssaySubmit_Data {

        @XmlElement(name = "PC-AssayResults")
        protected List<PCAssayResults> pcAssayResults;

        /**
         * Gets the value of the pcAssayResults property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayResults property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayResults().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAssayResults }
         */
        public List<PCAssayResults> getPCAssayResults() {
            if (pcAssayResults == null) {
                pcAssayResults = new ArrayList<PCAssayResults>();
            }
            return this.pcAssayResults;
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
     *         &lt;element name="PC-AssaySubmit_revoke_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssaySubmit_Revoke_E"
    })
    public static class PCAssaySubmit_Revoke {

        @XmlElement(name = "PC-AssaySubmit_revoke_E")
        protected List<BigInteger> pcAssaySubmit_Revoke_E;

        /**
         * Gets the value of the pcAssaySubmitRevokeE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssaySubmitRevokeE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssaySubmit_Revoke_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCAssaySubmit_Revoke_E() {
            if (pcAssaySubmit_Revoke_E == null) {
                pcAssaySubmit_Revoke_E = new ArrayList<BigInteger>();
            }
            return this.pcAssaySubmit_Revoke_E;
        }

    }

}
