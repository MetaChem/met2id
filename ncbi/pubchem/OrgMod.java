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
 *         &lt;element name="OrgMod_subtype">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="strain"/>
 *                       &lt;enumeration value="substrain"/>
 *                       &lt;enumeration value="type"/>
 *                       &lt;enumeration value="subtype"/>
 *                       &lt;enumeration value="variety"/>
 *                       &lt;enumeration value="serotype"/>
 *                       &lt;enumeration value="serogroup"/>
 *                       &lt;enumeration value="serovar"/>
 *                       &lt;enumeration value="cultivar"/>
 *                       &lt;enumeration value="pathovar"/>
 *                       &lt;enumeration value="chemovar"/>
 *                       &lt;enumeration value="biovar"/>
 *                       &lt;enumeration value="biotype"/>
 *                       &lt;enumeration value="group"/>
 *                       &lt;enumeration value="subgroup"/>
 *                       &lt;enumeration value="isolate"/>
 *                       &lt;enumeration value="common"/>
 *                       &lt;enumeration value="acronym"/>
 *                       &lt;enumeration value="dosage"/>
 *                       &lt;enumeration value="nat-host"/>
 *                       &lt;enumeration value="sub-species"/>
 *                       &lt;enumeration value="specimen-voucher"/>
 *                       &lt;enumeration value="authority"/>
 *                       &lt;enumeration value="forma"/>
 *                       &lt;enumeration value="forma-specialis"/>
 *                       &lt;enumeration value="ecotype"/>
 *                       &lt;enumeration value="synonym"/>
 *                       &lt;enumeration value="anamorph"/>
 *                       &lt;enumeration value="teleomorph"/>
 *                       &lt;enumeration value="breed"/>
 *                       &lt;enumeration value="gb-acronym"/>
 *                       &lt;enumeration value="gb-anamorph"/>
 *                       &lt;enumeration value="gb-synonym"/>
 *                       &lt;enumeration value="old-lineage"/>
 *                       &lt;enumeration value="old-name"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrgMod_subname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgMod_attrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "orgMod_Subtype",
        "orgMod_Subname",
        "orgMod_Attrib"
})
@XmlRootElement(name = "OrgMod")
public class OrgMod {

    @XmlElement(name = "OrgMod_subtype", required = true)
    protected OrgMod.OrgMod_Subtype orgMod_Subtype;
    @XmlElement(name = "OrgMod_subname", required = true)
    protected String orgMod_Subname;
    @XmlElement(name = "OrgMod_attrib")
    protected String orgMod_Attrib;

    /**
     * ��ȡorgMod_Subtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrgMod.OrgMod_Subtype }
     */
    public OrgMod.OrgMod_Subtype getOrgMod_Subtype() {
        return orgMod_Subtype;
    }

    /**
     * ����orgMod_Subtype���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrgMod.OrgMod_Subtype }
     */
    public void setOrgMod_Subtype(OrgMod.OrgMod_Subtype value) {
        this.orgMod_Subtype = value;
    }

    /**
     * ��ȡorgMod_Subname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgMod_Subname() {
        return orgMod_Subname;
    }

    /**
     * ����orgMod_Subname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgMod_Subname(String value) {
        this.orgMod_Subname = value;
    }

    /**
     * ��ȡorgMod_Attrib���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgMod_Attrib() {
        return orgMod_Attrib;
    }

    /**
     * ����orgMod_Attrib���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgMod_Attrib(String value) {
        this.orgMod_Attrib = value;
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
     *             &lt;enumeration value="strain"/>
     *             &lt;enumeration value="substrain"/>
     *             &lt;enumeration value="type"/>
     *             &lt;enumeration value="subtype"/>
     *             &lt;enumeration value="variety"/>
     *             &lt;enumeration value="serotype"/>
     *             &lt;enumeration value="serogroup"/>
     *             &lt;enumeration value="serovar"/>
     *             &lt;enumeration value="cultivar"/>
     *             &lt;enumeration value="pathovar"/>
     *             &lt;enumeration value="chemovar"/>
     *             &lt;enumeration value="biovar"/>
     *             &lt;enumeration value="biotype"/>
     *             &lt;enumeration value="group"/>
     *             &lt;enumeration value="subgroup"/>
     *             &lt;enumeration value="isolate"/>
     *             &lt;enumeration value="common"/>
     *             &lt;enumeration value="acronym"/>
     *             &lt;enumeration value="dosage"/>
     *             &lt;enumeration value="nat-host"/>
     *             &lt;enumeration value="sub-species"/>
     *             &lt;enumeration value="specimen-voucher"/>
     *             &lt;enumeration value="authority"/>
     *             &lt;enumeration value="forma"/>
     *             &lt;enumeration value="forma-specialis"/>
     *             &lt;enumeration value="ecotype"/>
     *             &lt;enumeration value="synonym"/>
     *             &lt;enumeration value="anamorph"/>
     *             &lt;enumeration value="teleomorph"/>
     *             &lt;enumeration value="breed"/>
     *             &lt;enumeration value="gb-acronym"/>
     *             &lt;enumeration value="gb-anamorph"/>
     *             &lt;enumeration value="gb-synonym"/>
     *             &lt;enumeration value="old-lineage"/>
     *             &lt;enumeration value="old-name"/>
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
    public static class OrgMod_Subtype {

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
