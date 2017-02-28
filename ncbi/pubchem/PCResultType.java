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
 *         &lt;element name="PC-ResultType_tid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-ResultType_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-ResultType_description" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-ResultType_description_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="float"/>
 *                       &lt;enumeration value="int"/>
 *                       &lt;enumeration value="bool"/>
 *                       &lt;enumeration value="string"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PC-ResultType_constraints_fset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-ResultType_constraints_fset_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-ResultType_constraints_fmin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="PC-ResultType_constraints_fmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="PC-ResultType_constraints_frange">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-RealMinMax"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-ResultType_constraints_iset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-ResultType_constraints_iset_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-ResultType_constraints_imin" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PC-ResultType_constraints_imax" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PC-ResultType_constraints_irange">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-IntegerMinMax"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-ResultType_constraints_sset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="PC-ResultType_constraints_sset_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="PC-ResultType_unit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ppt"/>
 *                       &lt;enumeration value="ppm"/>
 *                       &lt;enumeration value="ppb"/>
 *                       &lt;enumeration value="mm"/>
 *                       &lt;enumeration value="um"/>
 *                       &lt;enumeration value="nm"/>
 *                       &lt;enumeration value="pm"/>
 *                       &lt;enumeration value="fm"/>
 *                       &lt;enumeration value="mgml"/>
 *                       &lt;enumeration value="ugml"/>
 *                       &lt;enumeration value="ngml"/>
 *                       &lt;enumeration value="pgml"/>
 *                       &lt;enumeration value="fgml"/>
 *                       &lt;enumeration value="m"/>
 *                       &lt;enumeration value="percent"/>
 *                       &lt;enumeration value="ratio"/>
 *                       &lt;enumeration value="sec"/>
 *                       &lt;enumeration value="rsec"/>
 *                       &lt;enumeration value="min"/>
 *                       &lt;enumeration value="rmin"/>
 *                       &lt;enumeration value="day"/>
 *                       &lt;enumeration value="rday"/>
 *                       &lt;enumeration value="ml-min-kg"/>
 *                       &lt;enumeration value="l-kg"/>
 *                       &lt;enumeration value="hr-ng-ml"/>
 *                       &lt;enumeration value="cm-sec"/>
 *                       &lt;enumeration value="mg-kg"/>
 *                       &lt;enumeration value="none"/>
 *                       &lt;enumeration value="unspecified"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_sunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-ResultType_transform" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="linear"/>
 *                       &lt;enumeration value="ln"/>
 *                       &lt;enumeration value="log"/>
 *                       &lt;enumeration value="reciprocal"/>
 *                       &lt;enumeration value="negative"/>
 *                       &lt;enumeration value="nlog"/>
 *                       &lt;enumeration value="nln"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_stransform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-ResultType_tc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ConcentrationAttr"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_ac" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="true"/>
 *                       &lt;enumeration value="false"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_panel-info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanelTestResult"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-ResultType_annot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="pmid"/>
 *                       &lt;enumeration value="mmdb"/>
 *                       &lt;enumeration value="url"/>
 *                       &lt;enumeration value="protein-gi"/>
 *                       &lt;enumeration value="nucleotide-gi"/>
 *                       &lt;enumeration value="taxonomy"/>
 *                       &lt;enumeration value="mim"/>
 *                       &lt;enumeration value="gene"/>
 *                       &lt;enumeration value="probe"/>
 *                       &lt;enumeration value="aid"/>
 *                       &lt;enumeration value="sid"/>
 *                       &lt;enumeration value="cid"/>
 *                       &lt;enumeration value="protein-target-gi"/>
 *                       &lt;enumeration value="biosystems-target-id"/>
 *                       &lt;enumeration value="target-name"/>
 *                       &lt;enumeration value="target-descr"/>
 *                       &lt;enumeration value="target-tax-id"/>
 *                       &lt;enumeration value="gene-target-id"/>
 *                       &lt;enumeration value="dna-nucleotide-target-gi"/>
 *                       &lt;enumeration value="rna-nucleotide-target-gi"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
        "pcResultType_Tid",
        "pcResultType_Name",
        "pcResultType_Description",
        "pcResultType_Type",
        "pcResultType_Constraints",
        "pcResultType_Unit",
        "pcResultType_Sunit",
        "pcResultType_Transform",
        "pcResultType_Stransform",
        "pcResultType_Tc",
        "pcResultType_Ac",
        "pcResultType_PanelInfo",
        "pcResultType_Annot"
})
@XmlRootElement(name = "PC-ResultType")
public class PCResultType {

    @XmlElement(name = "PC-ResultType_tid", required = true)
    protected BigInteger pcResultType_Tid;
    @XmlElement(name = "PC-ResultType_name", required = true)
    protected String pcResultType_Name;
    @XmlElement(name = "PC-ResultType_description")
    protected PCResultType.PCResultType_Description pcResultType_Description;
    @XmlElement(name = "PC-ResultType_type", required = true)
    protected PCResultType.PCResultType_Type pcResultType_Type;
    @XmlElement(name = "PC-ResultType_constraints")
    protected PCResultType.PCResultType_Constraints pcResultType_Constraints;
    @XmlElement(name = "PC-ResultType_unit")
    protected PCResultType.PCResultType_Unit pcResultType_Unit;
    @XmlElement(name = "PC-ResultType_sunit")
    protected String pcResultType_Sunit;
    @XmlElement(name = "PC-ResultType_transform")
    protected PCResultType.PCResultType_Transform pcResultType_Transform;
    @XmlElement(name = "PC-ResultType_stransform")
    protected String pcResultType_Stransform;
    @XmlElement(name = "PC-ResultType_tc")
    protected PCResultType.PCResultType_Tc pcResultType_Tc;
    @XmlElement(name = "PC-ResultType_ac")
    protected PCResultType.PCResultType_Ac pcResultType_Ac;
    @XmlElement(name = "PC-ResultType_panel-info")
    protected PCResultType.PCResultType_PanelInfo pcResultType_PanelInfo;
    @XmlElement(name = "PC-ResultType_annot")
    protected PCResultType.PCResultType_Annot pcResultType_Annot;

    /**
     * ��ȡpcResultType_Tid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCResultType_Tid() {
        return pcResultType_Tid;
    }

    /**
     * ����pcResultType_Tid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCResultType_Tid(BigInteger value) {
        this.pcResultType_Tid = value;
    }

    /**
     * ��ȡpcResultType_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCResultType_Name() {
        return pcResultType_Name;
    }

    /**
     * ����pcResultType_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCResultType_Name(String value) {
        this.pcResultType_Name = value;
    }

    /**
     * ��ȡpcResultType_Description���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Description }
     */
    public PCResultType.PCResultType_Description getPCResultType_Description() {
        return pcResultType_Description;
    }

    /**
     * ����pcResultType_Description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Description }
     */
    public void setPCResultType_Description(PCResultType.PCResultType_Description value) {
        this.pcResultType_Description = value;
    }

    /**
     * ��ȡpcResultType_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Type }
     */
    public PCResultType.PCResultType_Type getPCResultType_Type() {
        return pcResultType_Type;
    }

    /**
     * ����pcResultType_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Type }
     */
    public void setPCResultType_Type(PCResultType.PCResultType_Type value) {
        this.pcResultType_Type = value;
    }

    /**
     * ��ȡpcResultType_Constraints���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Constraints }
     */
    public PCResultType.PCResultType_Constraints getPCResultType_Constraints() {
        return pcResultType_Constraints;
    }

    /**
     * ����pcResultType_Constraints���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Constraints }
     */
    public void setPCResultType_Constraints(PCResultType.PCResultType_Constraints value) {
        this.pcResultType_Constraints = value;
    }

    /**
     * ��ȡpcResultType_Unit���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Unit }
     */
    public PCResultType.PCResultType_Unit getPCResultType_Unit() {
        return pcResultType_Unit;
    }

    /**
     * ����pcResultType_Unit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Unit }
     */
    public void setPCResultType_Unit(PCResultType.PCResultType_Unit value) {
        this.pcResultType_Unit = value;
    }

    /**
     * ��ȡpcResultType_Sunit���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCResultType_Sunit() {
        return pcResultType_Sunit;
    }

    /**
     * ����pcResultType_Sunit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCResultType_Sunit(String value) {
        this.pcResultType_Sunit = value;
    }

    /**
     * ��ȡpcResultType_Transform���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Transform }
     */
    public PCResultType.PCResultType_Transform getPCResultType_Transform() {
        return pcResultType_Transform;
    }

    /**
     * ����pcResultType_Transform���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Transform }
     */
    public void setPCResultType_Transform(PCResultType.PCResultType_Transform value) {
        this.pcResultType_Transform = value;
    }

    /**
     * ��ȡpcResultType_Stransform���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCResultType_Stransform() {
        return pcResultType_Stransform;
    }

    /**
     * ����pcResultType_Stransform���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCResultType_Stransform(String value) {
        this.pcResultType_Stransform = value;
    }

    /**
     * ��ȡpcResultType_Tc���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Tc }
     */
    public PCResultType.PCResultType_Tc getPCResultType_Tc() {
        return pcResultType_Tc;
    }

    /**
     * ����pcResultType_Tc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Tc }
     */
    public void setPCResultType_Tc(PCResultType.PCResultType_Tc value) {
        this.pcResultType_Tc = value;
    }

    /**
     * ��ȡpcResultType_Ac���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Ac }
     */
    public PCResultType.PCResultType_Ac getPCResultType_Ac() {
        return pcResultType_Ac;
    }

    /**
     * ����pcResultType_Ac���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Ac }
     */
    public void setPCResultType_Ac(PCResultType.PCResultType_Ac value) {
        this.pcResultType_Ac = value;
    }

    /**
     * ��ȡpcResultType_PanelInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_PanelInfo }
     */
    public PCResultType.PCResultType_PanelInfo getPCResultType_PanelInfo() {
        return pcResultType_PanelInfo;
    }

    /**
     * ����pcResultType_PanelInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_PanelInfo }
     */
    public void setPCResultType_PanelInfo(PCResultType.PCResultType_PanelInfo value) {
        this.pcResultType_PanelInfo = value;
    }

    /**
     * ��ȡpcResultType_Annot���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCResultType.PCResultType_Annot }
     */
    public PCResultType.PCResultType_Annot getPCResultType_Annot() {
        return pcResultType_Annot;
    }

    /**
     * ����pcResultType_Annot���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCResultType.PCResultType_Annot }
     */
    public void setPCResultType_Annot(PCResultType.PCResultType_Annot value) {
        this.pcResultType_Annot = value;
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
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="true"/>
     *             &lt;enumeration value="false"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PCResultType_Ac {

        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
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
     *             &lt;enumeration value="pmid"/>
     *             &lt;enumeration value="mmdb"/>
     *             &lt;enumeration value="url"/>
     *             &lt;enumeration value="protein-gi"/>
     *             &lt;enumeration value="nucleotide-gi"/>
     *             &lt;enumeration value="taxonomy"/>
     *             &lt;enumeration value="mim"/>
     *             &lt;enumeration value="gene"/>
     *             &lt;enumeration value="probe"/>
     *             &lt;enumeration value="aid"/>
     *             &lt;enumeration value="sid"/>
     *             &lt;enumeration value="cid"/>
     *             &lt;enumeration value="protein-target-gi"/>
     *             &lt;enumeration value="biosystems-target-id"/>
     *             &lt;enumeration value="target-name"/>
     *             &lt;enumeration value="target-descr"/>
     *             &lt;enumeration value="target-tax-id"/>
     *             &lt;enumeration value="gene-target-id"/>
     *             &lt;enumeration value="dna-nucleotide-target-gi"/>
     *             &lt;enumeration value="rna-nucleotide-target-gi"/>
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
    public static class PCResultType_Annot {

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
     *         &lt;element name="PC-ResultType_constraints_fset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-ResultType_constraints_fset_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-ResultType_constraints_fmin" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="PC-ResultType_constraints_fmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="PC-ResultType_constraints_frange">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-RealMinMax"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-ResultType_constraints_iset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-ResultType_constraints_iset_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-ResultType_constraints_imin" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-ResultType_constraints_imax" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-ResultType_constraints_irange">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-IntegerMinMax"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-ResultType_constraints_sset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="PC-ResultType_constraints_sset_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "pcResultType_Constraints_Fset",
            "pcResultType_Constraints_Fmin",
            "pcResultType_Constraints_Fmax",
            "pcResultType_Constraints_Frange",
            "pcResultType_Constraints_Iset",
            "pcResultType_Constraints_Imin",
            "pcResultType_Constraints_Imax",
            "pcResultType_Constraints_Irange",
            "pcResultType_Constraints_Sset"
    })
    public static class PCResultType_Constraints {

        @XmlElement(name = "PC-ResultType_constraints_fset")
        protected PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset pcResultType_Constraints_Fset;
        @XmlElement(name = "PC-ResultType_constraints_fmin")
        protected Double pcResultType_Constraints_Fmin;
        @XmlElement(name = "PC-ResultType_constraints_fmax")
        protected Double pcResultType_Constraints_Fmax;
        @XmlElement(name = "PC-ResultType_constraints_frange")
        protected PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange pcResultType_Constraints_Frange;
        @XmlElement(name = "PC-ResultType_constraints_iset")
        protected PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset pcResultType_Constraints_Iset;
        @XmlElement(name = "PC-ResultType_constraints_imin")
        protected BigInteger pcResultType_Constraints_Imin;
        @XmlElement(name = "PC-ResultType_constraints_imax")
        protected BigInteger pcResultType_Constraints_Imax;
        @XmlElement(name = "PC-ResultType_constraints_irange")
        protected PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange pcResultType_Constraints_Irange;
        @XmlElement(name = "PC-ResultType_constraints_sset")
        protected PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset pcResultType_Constraints_Sset;

        /**
         * ��ȡpcResultType_Constraints_Fset���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset }
         */
        public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset getPCResultType_Constraints_Fset() {
            return pcResultType_Constraints_Fset;
        }

        /**
         * ����pcResultType_Constraints_Fset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset }
         */
        public void setPCResultType_Constraints_Fset(PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset value) {
            this.pcResultType_Constraints_Fset = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Fmin���Ե�ֵ��
         *
         * @return possible object is
         * {@link Double }
         */
        public Double getPCResultType_Constraints_Fmin() {
            return pcResultType_Constraints_Fmin;
        }

        /**
         * ����pcResultType_Constraints_Fmin���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Double }
         */
        public void setPCResultType_Constraints_Fmin(Double value) {
            this.pcResultType_Constraints_Fmin = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Fmax���Ե�ֵ��
         *
         * @return possible object is
         * {@link Double }
         */
        public Double getPCResultType_Constraints_Fmax() {
            return pcResultType_Constraints_Fmax;
        }

        /**
         * ����pcResultType_Constraints_Fmax���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Double }
         */
        public void setPCResultType_Constraints_Fmax(Double value) {
            this.pcResultType_Constraints_Fmax = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Frange���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange }
         */
        public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange getPCResultType_Constraints_Frange() {
            return pcResultType_Constraints_Frange;
        }

        /**
         * ����pcResultType_Constraints_Frange���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange }
         */
        public void setPCResultType_Constraints_Frange(PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange value) {
            this.pcResultType_Constraints_Frange = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Iset���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset }
         */
        public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset getPCResultType_Constraints_Iset() {
            return pcResultType_Constraints_Iset;
        }

        /**
         * ����pcResultType_Constraints_Iset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset }
         */
        public void setPCResultType_Constraints_Iset(PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset value) {
            this.pcResultType_Constraints_Iset = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Imin���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCResultType_Constraints_Imin() {
            return pcResultType_Constraints_Imin;
        }

        /**
         * ����pcResultType_Constraints_Imin���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCResultType_Constraints_Imin(BigInteger value) {
            this.pcResultType_Constraints_Imin = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Imax���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCResultType_Constraints_Imax() {
            return pcResultType_Constraints_Imax;
        }

        /**
         * ����pcResultType_Constraints_Imax���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCResultType_Constraints_Imax(BigInteger value) {
            this.pcResultType_Constraints_Imax = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Irange���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange }
         */
        public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange getPCResultType_Constraints_Irange() {
            return pcResultType_Constraints_Irange;
        }

        /**
         * ����pcResultType_Constraints_Irange���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange }
         */
        public void setPCResultType_Constraints_Irange(PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange value) {
            this.pcResultType_Constraints_Irange = value;
        }

        /**
         * ��ȡpcResultType_Constraints_Sset���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset }
         */
        public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset getPCResultType_Constraints_Sset() {
            return pcResultType_Constraints_Sset;
        }

        /**
         * ����pcResultType_Constraints_Sset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset }
         */
        public void setPCResultType_Constraints_Sset(PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset value) {
            this.pcResultType_Constraints_Sset = value;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-RealMinMax"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcRealMinMax"
        })
        public static class PCResultType_Constraints_Frange {

            @XmlElement(name = "PC-RealMinMax", required = true)
            protected PCRealMinMax pcRealMinMax;

            /**
             * ��ȡpcRealMinMax���Ե�ֵ��
             *
             * @return possible object is
             * {@link PCRealMinMax }
             */
            public PCRealMinMax getPCRealMinMax() {
                return pcRealMinMax;
            }

            /**
             * ����pcRealMinMax���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PCRealMinMax }
             */
            public void setPCRealMinMax(PCRealMinMax value) {
                this.pcRealMinMax = value;
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
         *         &lt;element name="PC-ResultType_constraints_fset_E" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcResultType_Constraints_Fset_E"
        })
        public static class PCResultType_Constraints_Fset {

            @XmlElement(name = "PC-ResultType_constraints_fset_E", type = Double.class)
            protected List<Double> pcResultType_Constraints_Fset_E;

            /**
             * Gets the value of the pcResultTypeConstraintsFsetE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcResultTypeConstraintsFsetE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCResultType_Constraints_Fset_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             */
            public List<Double> getPCResultType_Constraints_Fset_E() {
                if (pcResultType_Constraints_Fset_E == null) {
                    pcResultType_Constraints_Fset_E = new ArrayList<Double>();
                }
                return this.pcResultType_Constraints_Fset_E;
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
         *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-IntegerMinMax"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcIntegerMinMax"
        })
        public static class PCResultType_Constraints_Irange {

            @XmlElement(name = "PC-IntegerMinMax", required = true)
            protected PCIntegerMinMax pcIntegerMinMax;

            /**
             * ��ȡpcIntegerMinMax���Ե�ֵ��
             *
             * @return possible object is
             * {@link PCIntegerMinMax }
             */
            public PCIntegerMinMax getPCIntegerMinMax() {
                return pcIntegerMinMax;
            }

            /**
             * ����pcIntegerMinMax���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PCIntegerMinMax }
             */
            public void setPCIntegerMinMax(PCIntegerMinMax value) {
                this.pcIntegerMinMax = value;
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
         *         &lt;element name="PC-ResultType_constraints_iset_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcResultType_Constraints_Iset_E"
        })
        public static class PCResultType_Constraints_Iset {

            @XmlElement(name = "PC-ResultType_constraints_iset_E")
            protected List<BigInteger> pcResultType_Constraints_Iset_E;

            /**
             * Gets the value of the pcResultTypeConstraintsIsetE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcResultTypeConstraintsIsetE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCResultType_Constraints_Iset_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             */
            public List<BigInteger> getPCResultType_Constraints_Iset_E() {
                if (pcResultType_Constraints_Iset_E == null) {
                    pcResultType_Constraints_Iset_E = new ArrayList<BigInteger>();
                }
                return this.pcResultType_Constraints_Iset_E;
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
         *         &lt;element name="PC-ResultType_constraints_sset_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "pcResultType_Constraints_Sset_E"
        })
        public static class PCResultType_Constraints_Sset {

            @XmlElement(name = "PC-ResultType_constraints_sset_E")
            protected List<String> pcResultType_Constraints_Sset_E;

            /**
             * Gets the value of the pcResultTypeConstraintsSsetE property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pcResultTypeConstraintsSsetE property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPCResultType_Constraints_Sset_E().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getPCResultType_Constraints_Sset_E() {
                if (pcResultType_Constraints_Sset_E == null) {
                    pcResultType_Constraints_Sset_E = new ArrayList<String>();
                }
                return this.pcResultType_Constraints_Sset_E;
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
     *         &lt;element name="PC-ResultType_description_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcResultType_Description_E"
    })
    public static class PCResultType_Description {

        @XmlElement(name = "PC-ResultType_description_E")
        protected List<String> pcResultType_Description_E;

        /**
         * Gets the value of the pcResultTypeDescriptionE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcResultTypeDescriptionE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCResultType_Description_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCResultType_Description_E() {
            if (pcResultType_Description_E == null) {
                pcResultType_Description_E = new ArrayList<String>();
            }
            return this.pcResultType_Description_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanelTestResult"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayPanelTestResult"
    })
    public static class PCResultType_PanelInfo {

        @XmlElement(name = "PC-AssayPanelTestResult", required = true)
        protected PCAssayPanelTestResult pcAssayPanelTestResult;

        /**
         * ��ȡpcAssayPanelTestResult���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssayPanelTestResult }
         */
        public PCAssayPanelTestResult getPCAssayPanelTestResult() {
            return pcAssayPanelTestResult;
        }

        /**
         * ����pcAssayPanelTestResult���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssayPanelTestResult }
         */
        public void setPCAssayPanelTestResult(PCAssayPanelTestResult value) {
            this.pcAssayPanelTestResult = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ConcentrationAttr"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcConcentrationAttr"
    })
    public static class PCResultType_Tc {

        @XmlElement(name = "PC-ConcentrationAttr", required = true)
        protected PCConcentrationAttr pcConcentrationAttr;

        /**
         * ��ȡpcConcentrationAttr���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCConcentrationAttr }
         */
        public PCConcentrationAttr getPCConcentrationAttr() {
            return pcConcentrationAttr;
        }

        /**
         * ����pcConcentrationAttr���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCConcentrationAttr }
         */
        public void setPCConcentrationAttr(PCConcentrationAttr value) {
            this.pcConcentrationAttr = value;
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
     *             &lt;enumeration value="linear"/>
     *             &lt;enumeration value="ln"/>
     *             &lt;enumeration value="log"/>
     *             &lt;enumeration value="reciprocal"/>
     *             &lt;enumeration value="negative"/>
     *             &lt;enumeration value="nlog"/>
     *             &lt;enumeration value="nln"/>
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
    public static class PCResultType_Transform {

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
     *             &lt;enumeration value="float"/>
     *             &lt;enumeration value="int"/>
     *             &lt;enumeration value="bool"/>
     *             &lt;enumeration value="string"/>
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
    public static class PCResultType_Type {

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
     *             &lt;enumeration value="ppt"/>
     *             &lt;enumeration value="ppm"/>
     *             &lt;enumeration value="ppb"/>
     *             &lt;enumeration value="mm"/>
     *             &lt;enumeration value="um"/>
     *             &lt;enumeration value="nm"/>
     *             &lt;enumeration value="pm"/>
     *             &lt;enumeration value="fm"/>
     *             &lt;enumeration value="mgml"/>
     *             &lt;enumeration value="ugml"/>
     *             &lt;enumeration value="ngml"/>
     *             &lt;enumeration value="pgml"/>
     *             &lt;enumeration value="fgml"/>
     *             &lt;enumeration value="m"/>
     *             &lt;enumeration value="percent"/>
     *             &lt;enumeration value="ratio"/>
     *             &lt;enumeration value="sec"/>
     *             &lt;enumeration value="rsec"/>
     *             &lt;enumeration value="min"/>
     *             &lt;enumeration value="rmin"/>
     *             &lt;enumeration value="day"/>
     *             &lt;enumeration value="rday"/>
     *             &lt;enumeration value="ml-min-kg"/>
     *             &lt;enumeration value="l-kg"/>
     *             &lt;enumeration value="hr-ng-ml"/>
     *             &lt;enumeration value="cm-sec"/>
     *             &lt;enumeration value="mg-kg"/>
     *             &lt;enumeration value="none"/>
     *             &lt;enumeration value="unspecified"/>
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
    public static class PCResultType_Unit {

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
