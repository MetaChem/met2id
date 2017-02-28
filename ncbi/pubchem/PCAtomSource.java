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
 *         &lt;element name="PC-AtomSource_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AtomSource_source">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAtomSource_Aid",
        "pcAtomSource_Source"
})
@XmlRootElement(name = "PC-AtomSource")
public class PCAtomSource {

    @XmlElement(name = "PC-AtomSource_aid", required = true)
    protected BigInteger pcAtomSource_Aid;
    @XmlElement(name = "PC-AtomSource_source", required = true)
    protected PCAtomSource.PCAtomSource_Source pcAtomSource_Source;

    /**
     * ��ȡpcAtomSource_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAtomSource_Aid() {
        return pcAtomSource_Aid;
    }

    /**
     * ����pcAtomSource_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAtomSource_Aid(BigInteger value) {
        this.pcAtomSource_Aid = value;
    }

    /**
     * ��ȡpcAtomSource_Source���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAtomSource.PCAtomSource_Source }
     */
    public PCAtomSource.PCAtomSource_Source getPCAtomSource_Source() {
        return pcAtomSource_Source;
    }

    /**
     * ����pcAtomSource_Source���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAtomSource.PCAtomSource_Source }
     */
    public void setPCAtomSource_Source(PCAtomSource.PCAtomSource_Source value) {
        this.pcAtomSource_Source = value;
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
    public static class PCAtomSource_Source {

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
