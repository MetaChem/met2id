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
 *         &lt;element name="SubSource_subtype">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="chromosome"/>
 *                       &lt;enumeration value="map"/>
 *                       &lt;enumeration value="clone"/>
 *                       &lt;enumeration value="subclone"/>
 *                       &lt;enumeration value="haplotype"/>
 *                       &lt;enumeration value="genotype"/>
 *                       &lt;enumeration value="sex"/>
 *                       &lt;enumeration value="cell-line"/>
 *                       &lt;enumeration value="cell-type"/>
 *                       &lt;enumeration value="tissue-type"/>
 *                       &lt;enumeration value="clone-lib"/>
 *                       &lt;enumeration value="dev-stage"/>
 *                       &lt;enumeration value="frequency"/>
 *                       &lt;enumeration value="germline"/>
 *                       &lt;enumeration value="rearranged"/>
 *                       &lt;enumeration value="lab-host"/>
 *                       &lt;enumeration value="pop-variant"/>
 *                       &lt;enumeration value="tissue-lib"/>
 *                       &lt;enumeration value="plasmid-name"/>
 *                       &lt;enumeration value="transposon-name"/>
 *                       &lt;enumeration value="insertion-seq-name"/>
 *                       &lt;enumeration value="plastid-name"/>
 *                       &lt;enumeration value="country"/>
 *                       &lt;enumeration value="segment"/>
 *                       &lt;enumeration value="endogenous-virus-name"/>
 *                       &lt;enumeration value="transgenic"/>
 *                       &lt;enumeration value="environmental-sample"/>
 *                       &lt;enumeration value="isolation-source"/>
 *                       &lt;enumeration value="lat-lon"/>
 *                       &lt;enumeration value="collection-date"/>
 *                       &lt;enumeration value="collected-by"/>
 *                       &lt;enumeration value="identified-by"/>
 *                       &lt;enumeration value="fwd-primer-seq"/>
 *                       &lt;enumeration value="rev-primer-seq"/>
 *                       &lt;enumeration value="fwd-primer-name"/>
 *                       &lt;enumeration value="rev-primer-name"/>
 *                       &lt;enumeration value="metagenomic"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubSource_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubSource_attrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "subSource_Subtype",
        "subSource_Name",
        "subSource_Attrib"
})
@XmlRootElement(name = "SubSource")
public class SubSource {

    @XmlElement(name = "SubSource_subtype", required = true)
    protected SubSource.SubSource_Subtype subSource_Subtype;
    @XmlElement(name = "SubSource_name", required = true)
    protected String subSource_Name;
    @XmlElement(name = "SubSource_attrib")
    protected String subSource_Attrib;

    /**
     * ��ȡsubSource_Subtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link SubSource.SubSource_Subtype }
     */
    public SubSource.SubSource_Subtype getSubSource_Subtype() {
        return subSource_Subtype;
    }

    /**
     * ����subSource_Subtype���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SubSource.SubSource_Subtype }
     */
    public void setSubSource_Subtype(SubSource.SubSource_Subtype value) {
        this.subSource_Subtype = value;
    }

    /**
     * ��ȡsubSource_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubSource_Name() {
        return subSource_Name;
    }

    /**
     * ����subSource_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubSource_Name(String value) {
        this.subSource_Name = value;
    }

    /**
     * ��ȡsubSource_Attrib���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubSource_Attrib() {
        return subSource_Attrib;
    }

    /**
     * ����subSource_Attrib���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubSource_Attrib(String value) {
        this.subSource_Attrib = value;
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
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="chromosome"/>
     *             &lt;enumeration value="map"/>
     *             &lt;enumeration value="clone"/>
     *             &lt;enumeration value="subclone"/>
     *             &lt;enumeration value="haplotype"/>
     *             &lt;enumeration value="genotype"/>
     *             &lt;enumeration value="sex"/>
     *             &lt;enumeration value="cell-line"/>
     *             &lt;enumeration value="cell-type"/>
     *             &lt;enumeration value="tissue-type"/>
     *             &lt;enumeration value="clone-lib"/>
     *             &lt;enumeration value="dev-stage"/>
     *             &lt;enumeration value="frequency"/>
     *             &lt;enumeration value="germline"/>
     *             &lt;enumeration value="rearranged"/>
     *             &lt;enumeration value="lab-host"/>
     *             &lt;enumeration value="pop-variant"/>
     *             &lt;enumeration value="tissue-lib"/>
     *             &lt;enumeration value="plasmid-name"/>
     *             &lt;enumeration value="transposon-name"/>
     *             &lt;enumeration value="insertion-seq-name"/>
     *             &lt;enumeration value="plastid-name"/>
     *             &lt;enumeration value="country"/>
     *             &lt;enumeration value="segment"/>
     *             &lt;enumeration value="endogenous-virus-name"/>
     *             &lt;enumeration value="transgenic"/>
     *             &lt;enumeration value="environmental-sample"/>
     *             &lt;enumeration value="isolation-source"/>
     *             &lt;enumeration value="lat-lon"/>
     *             &lt;enumeration value="collection-date"/>
     *             &lt;enumeration value="collected-by"/>
     *             &lt;enumeration value="identified-by"/>
     *             &lt;enumeration value="fwd-primer-seq"/>
     *             &lt;enumeration value="rev-primer-seq"/>
     *             &lt;enumeration value="fwd-primer-name"/>
     *             &lt;enumeration value="rev-primer-name"/>
     *             &lt;enumeration value="metagenomic"/>
     *             &lt;enumeration value="other"/>
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
    public static class SubSource_Subtype {

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
            return stringValue;
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

}
