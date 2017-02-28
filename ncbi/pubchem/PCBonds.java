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
 *         &lt;element name="PC-Bonds_aid1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Bonds_aid1_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Bonds_aid2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-Bonds_aid2_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-Bonds_order">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-BondType"/>
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
        "pcBonds_Aid1",
        "pcBonds_Aid2",
        "pcBonds_Order"
})
@XmlRootElement(name = "PC-Bonds")
public class PCBonds {

    @XmlElement(name = "PC-Bonds_aid1", required = true)
    protected PCBonds.PCBonds_Aid1 pcBonds_Aid1;
    @XmlElement(name = "PC-Bonds_aid2", required = true)
    protected PCBonds.PCBonds_Aid2 pcBonds_Aid2;
    @XmlElement(name = "PC-Bonds_order", required = true)
    protected PCBonds.PCBonds_Order pcBonds_Order;

    /**
     * ��ȡpcBonds_Aid1���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCBonds.PCBonds_Aid1 }
     */
    public PCBonds.PCBonds_Aid1 getPCBonds_Aid1() {
        return pcBonds_Aid1;
    }

    /**
     * ����pcBonds_Aid1���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCBonds.PCBonds_Aid1 }
     */
    public void setPCBonds_Aid1(PCBonds.PCBonds_Aid1 value) {
        this.pcBonds_Aid1 = value;
    }

    /**
     * ��ȡpcBonds_Aid2���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCBonds.PCBonds_Aid2 }
     */
    public PCBonds.PCBonds_Aid2 getPCBonds_Aid2() {
        return pcBonds_Aid2;
    }

    /**
     * ����pcBonds_Aid2���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCBonds.PCBonds_Aid2 }
     */
    public void setPCBonds_Aid2(PCBonds.PCBonds_Aid2 value) {
        this.pcBonds_Aid2 = value;
    }

    /**
     * ��ȡpcBonds_Order���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCBonds.PCBonds_Order }
     */
    public PCBonds.PCBonds_Order getPCBonds_Order() {
        return pcBonds_Order;
    }

    /**
     * ����pcBonds_Order���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCBonds.PCBonds_Order }
     */
    public void setPCBonds_Order(PCBonds.PCBonds_Order value) {
        this.pcBonds_Order = value;
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
     *         &lt;element name="PC-Bonds_aid1_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcBonds_Aid1_E"
    })
    public static class PCBonds_Aid1 {

        @XmlElement(name = "PC-Bonds_aid1_E")
        protected List<BigInteger> pcBonds_Aid1_E;

        /**
         * Gets the value of the pcBondsAid1E property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcBondsAid1E property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCBonds_Aid1_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCBonds_Aid1_E() {
            if (pcBonds_Aid1_E == null) {
                pcBonds_Aid1_E = new ArrayList<BigInteger>();
            }
            return this.pcBonds_Aid1_E;
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
     *         &lt;element name="PC-Bonds_aid2_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcBonds_Aid2_E"
    })
    public static class PCBonds_Aid2 {

        @XmlElement(name = "PC-Bonds_aid2_E")
        protected List<BigInteger> pcBonds_Aid2_E;

        /**
         * Gets the value of the pcBondsAid2E property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcBondsAid2E property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCBonds_Aid2_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCBonds_Aid2_E() {
            if (pcBonds_Aid2_E == null) {
                pcBonds_Aid2_E = new ArrayList<BigInteger>();
            }
            return this.pcBonds_Aid2_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-BondType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcBondType"
    })
    public static class PCBonds_Order {

        @XmlElement(name = "PC-BondType")
        protected List<PCBondType> pcBondType;

        /**
         * Gets the value of the pcBondType property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcBondType property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCBondType().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCBondType }
         */
        public List<PCBondType> getPCBondType() {
            if (pcBondType == null) {
                pcBondType = new ArrayList<PCBondType>();
            }
            return this.pcBondType;
        }

    }

}
