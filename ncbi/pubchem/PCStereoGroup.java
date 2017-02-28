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
 *         &lt;element name="PC-StereoGroup_type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="absolute"/>
 *                       &lt;enumeration value="or"/>
 *                       &lt;enumeration value="and"/>
 *                       &lt;enumeration value="unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoGroup_aid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-StereoGroup_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "pcStereoGroup_Type",
        "pcStereoGroup_Aid"
})
@XmlRootElement(name = "PC-StereoGroup")
public class PCStereoGroup {

    @XmlElement(name = "PC-StereoGroup_type", required = true)
    protected PCStereoGroup.PCStereoGroup_Type pcStereoGroup_Type;
    @XmlElement(name = "PC-StereoGroup_aid", required = true)
    protected PCStereoGroup.PCStereoGroup_Aid pcStereoGroup_Aid;

    /**
     * ��ȡpcStereoGroup_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoGroup.PCStereoGroup_Type }
     */
    public PCStereoGroup.PCStereoGroup_Type getPCStereoGroup_Type() {
        return pcStereoGroup_Type;
    }

    /**
     * ����pcStereoGroup_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoGroup.PCStereoGroup_Type }
     */
    public void setPCStereoGroup_Type(PCStereoGroup.PCStereoGroup_Type value) {
        this.pcStereoGroup_Type = value;
    }

    /**
     * ��ȡpcStereoGroup_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoGroup.PCStereoGroup_Aid }
     */
    public PCStereoGroup.PCStereoGroup_Aid getPCStereoGroup_Aid() {
        return pcStereoGroup_Aid;
    }

    /**
     * ����pcStereoGroup_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoGroup.PCStereoGroup_Aid }
     */
    public void setPCStereoGroup_Aid(PCStereoGroup.PCStereoGroup_Aid value) {
        this.pcStereoGroup_Aid = value;
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
     *         &lt;element name="PC-StereoGroup_aid_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoGroup_Aid_E"
    })
    public static class PCStereoGroup_Aid {

        @XmlElement(name = "PC-StereoGroup_aid_E")
        protected List<BigInteger> pcStereoGroup_Aid_E;

        /**
         * Gets the value of the pcStereoGroupAidE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcStereoGroupAidE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCStereoGroup_Aid_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getPCStereoGroup_Aid_E() {
            if (pcStereoGroup_Aid_E == null) {
                pcStereoGroup_Aid_E = new ArrayList<BigInteger>();
            }
            return this.pcStereoGroup_Aid_E;
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
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="absolute"/>
     *             &lt;enumeration value="or"/>
     *             &lt;enumeration value="and"/>
     *             &lt;enumeration value="unknown"/>
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
    public static class PCStereoGroup_Type {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "value")
        protected String intValue;

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
         * ��ȡintValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIntValue() {
            return intValue;
        }

        /**
         * ����intValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIntValue(String value) {
            this.intValue = value;
        }

    }

}
