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
 *         &lt;element name="PC-AssayDescription_aid">
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
 *         &lt;element name="PC-AssayDescription_aid-source" minOccurs="0">
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
 *         &lt;element name="PC-AssayDescription_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-AssayDescription_description" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayDescription_description_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_protocol" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayDescription_protocol_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayDescription_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_xref" minOccurs="0">
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
 *         &lt;element name="PC-AssayDescription_results" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ResultType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_pub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Pub"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_revision" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PC-AssayDescription_target" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayTargetInfo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_activity-outcome-method" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="other"/>
 *                       &lt;enumeration value="screening"/>
 *                       &lt;enumeration value="confirmatory"/>
 *                       &lt;enumeration value="summary"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_dr" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayDRAttr"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_substance-type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="small-molecule"/>
 *                       &lt;enumeration value="nucleotide"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_grant-number" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayDescription_grant-number_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_project-category" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="mlscn"/>
 *                       &lt;enumeration value="mlpcn"/>
 *                       &lt;enumeration value="mlscn-ap"/>
 *                       &lt;enumeration value="mlpcn-ap"/>
 *                       &lt;enumeration value="journal-article"/>
 *                       &lt;enumeration value="assay-vendor"/>
 *                       &lt;enumeration value="literature-extracted"/>
 *                       &lt;enumeration value="literature-author"/>
 *                       &lt;enumeration value="literature-publisher"/>
 *                       &lt;enumeration value="rnaigi"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_is-panel" minOccurs="0">
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
 *         &lt;element name="PC-AssayDescription_assay-group" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayDescription_assay-group_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_panel-info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayDescription_is-mlp-late-stage" minOccurs="0">
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
 *         &lt;element name="PC-AssayDescription_categorized-comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CategorizedComment"/>
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
        "pcAssayDescription_Aid",
        "pcAssayDescription_AidSource",
        "pcAssayDescription_Name",
        "pcAssayDescription_Description",
        "pcAssayDescription_Protocol",
        "pcAssayDescription_Comment",
        "pcAssayDescription_Xref",
        "pcAssayDescription_Results",
        "pcAssayDescription_Pub",
        "pcAssayDescription_Revision",
        "pcAssayDescription_Target",
        "pcAssayDescription_ActivityOutcomeMethod",
        "pcAssayDescription_Dr",
        "pcAssayDescription_SubstanceType",
        "pcAssayDescription_GrantNumber",
        "pcAssayDescription_ProjectCategory",
        "pcAssayDescription_IsPanel",
        "pcAssayDescription_AssayGroup",
        "pcAssayDescription_PanelInfo",
        "pcAssayDescription_IsMlpLateStage",
        "pcAssayDescription_CategorizedComment"
})
@XmlRootElement(name = "PC-AssayDescription")
public class PCAssayDescription {

    @XmlElement(name = "PC-AssayDescription_aid", required = true)
    protected PCAssayDescription.PCAssayDescription_Aid pcAssayDescription_Aid;
    @XmlElement(name = "PC-AssayDescription_aid-source")
    protected PCAssayDescription.PCAssayDescription_AidSource pcAssayDescription_AidSource;
    @XmlElement(name = "PC-AssayDescription_name", required = true)
    protected String pcAssayDescription_Name;
    @XmlElement(name = "PC-AssayDescription_description")
    protected PCAssayDescription.PCAssayDescription_Description pcAssayDescription_Description;
    @XmlElement(name = "PC-AssayDescription_protocol")
    protected PCAssayDescription.PCAssayDescription_Protocol pcAssayDescription_Protocol;
    @XmlElement(name = "PC-AssayDescription_comment")
    protected PCAssayDescription.PCAssayDescription_Comment pcAssayDescription_Comment;
    @XmlElement(name = "PC-AssayDescription_xref")
    protected PCAssayDescription.PCAssayDescription_Xref pcAssayDescription_Xref;
    @XmlElement(name = "PC-AssayDescription_results")
    protected PCAssayDescription.PCAssayDescription_Results pcAssayDescription_Results;
    @XmlElement(name = "PC-AssayDescription_pub")
    protected PCAssayDescription.PCAssayDescription_Pub pcAssayDescription_Pub;
    @XmlElement(name = "PC-AssayDescription_revision")
    protected BigInteger pcAssayDescription_Revision;
    @XmlElement(name = "PC-AssayDescription_target")
    protected PCAssayDescription.PCAssayDescription_Target pcAssayDescription_Target;
    @XmlElement(name = "PC-AssayDescription_activity-outcome-method")
    protected PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod pcAssayDescription_ActivityOutcomeMethod;
    @XmlElement(name = "PC-AssayDescription_dr")
    protected PCAssayDescription.PCAssayDescription_Dr pcAssayDescription_Dr;
    @XmlElement(name = "PC-AssayDescription_substance-type")
    protected PCAssayDescription.PCAssayDescription_SubstanceType pcAssayDescription_SubstanceType;
    @XmlElement(name = "PC-AssayDescription_grant-number")
    protected PCAssayDescription.PCAssayDescription_GrantNumber pcAssayDescription_GrantNumber;
    @XmlElement(name = "PC-AssayDescription_project-category")
    protected PCAssayDescription.PCAssayDescription_ProjectCategory pcAssayDescription_ProjectCategory;
    @XmlElement(name = "PC-AssayDescription_is-panel")
    protected PCAssayDescription.PCAssayDescription_IsPanel pcAssayDescription_IsPanel;
    @XmlElement(name = "PC-AssayDescription_assay-group")
    protected PCAssayDescription.PCAssayDescription_AssayGroup pcAssayDescription_AssayGroup;
    @XmlElement(name = "PC-AssayDescription_panel-info")
    protected PCAssayDescription.PCAssayDescription_PanelInfo pcAssayDescription_PanelInfo;
    @XmlElement(name = "PC-AssayDescription_is-mlp-late-stage")
    protected PCAssayDescription.PCAssayDescription_IsMlpLateStage pcAssayDescription_IsMlpLateStage;
    @XmlElement(name = "PC-AssayDescription_categorized-comment")
    protected PCAssayDescription.PCAssayDescription_CategorizedComment pcAssayDescription_CategorizedComment;

    /**
     * ��ȡpcAssayDescription_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Aid }
     */
    public PCAssayDescription.PCAssayDescription_Aid getPCAssayDescription_Aid() {
        return pcAssayDescription_Aid;
    }

    /**
     * ����pcAssayDescription_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Aid }
     */
    public void setPCAssayDescription_Aid(PCAssayDescription.PCAssayDescription_Aid value) {
        this.pcAssayDescription_Aid = value;
    }

    /**
     * ��ȡpcAssayDescription_AidSource���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_AidSource }
     */
    public PCAssayDescription.PCAssayDescription_AidSource getPCAssayDescription_AidSource() {
        return pcAssayDescription_AidSource;
    }

    /**
     * ����pcAssayDescription_AidSource���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_AidSource }
     */
    public void setPCAssayDescription_AidSource(PCAssayDescription.PCAssayDescription_AidSource value) {
        this.pcAssayDescription_AidSource = value;
    }

    /**
     * ��ȡpcAssayDescription_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayDescription_Name() {
        return pcAssayDescription_Name;
    }

    /**
     * ����pcAssayDescription_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayDescription_Name(String value) {
        this.pcAssayDescription_Name = value;
    }

    /**
     * ��ȡpcAssayDescription_Description���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Description }
     */
    public PCAssayDescription.PCAssayDescription_Description getPCAssayDescription_Description() {
        return pcAssayDescription_Description;
    }

    /**
     * ����pcAssayDescription_Description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Description }
     */
    public void setPCAssayDescription_Description(PCAssayDescription.PCAssayDescription_Description value) {
        this.pcAssayDescription_Description = value;
    }

    /**
     * ��ȡpcAssayDescription_Protocol���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Protocol }
     */
    public PCAssayDescription.PCAssayDescription_Protocol getPCAssayDescription_Protocol() {
        return pcAssayDescription_Protocol;
    }

    /**
     * ����pcAssayDescription_Protocol���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Protocol }
     */
    public void setPCAssayDescription_Protocol(PCAssayDescription.PCAssayDescription_Protocol value) {
        this.pcAssayDescription_Protocol = value;
    }

    /**
     * ��ȡpcAssayDescription_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Comment }
     */
    public PCAssayDescription.PCAssayDescription_Comment getPCAssayDescription_Comment() {
        return pcAssayDescription_Comment;
    }

    /**
     * ����pcAssayDescription_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Comment }
     */
    public void setPCAssayDescription_Comment(PCAssayDescription.PCAssayDescription_Comment value) {
        this.pcAssayDescription_Comment = value;
    }

    /**
     * ��ȡpcAssayDescription_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Xref }
     */
    public PCAssayDescription.PCAssayDescription_Xref getPCAssayDescription_Xref() {
        return pcAssayDescription_Xref;
    }

    /**
     * ����pcAssayDescription_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Xref }
     */
    public void setPCAssayDescription_Xref(PCAssayDescription.PCAssayDescription_Xref value) {
        this.pcAssayDescription_Xref = value;
    }

    /**
     * ��ȡpcAssayDescription_Results���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Results }
     */
    public PCAssayDescription.PCAssayDescription_Results getPCAssayDescription_Results() {
        return pcAssayDescription_Results;
    }

    /**
     * ����pcAssayDescription_Results���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Results }
     */
    public void setPCAssayDescription_Results(PCAssayDescription.PCAssayDescription_Results value) {
        this.pcAssayDescription_Results = value;
    }

    /**
     * ��ȡpcAssayDescription_Pub���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Pub }
     */
    public PCAssayDescription.PCAssayDescription_Pub getPCAssayDescription_Pub() {
        return pcAssayDescription_Pub;
    }

    /**
     * ����pcAssayDescription_Pub���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Pub }
     */
    public void setPCAssayDescription_Pub(PCAssayDescription.PCAssayDescription_Pub value) {
        this.pcAssayDescription_Pub = value;
    }

    /**
     * ��ȡpcAssayDescription_Revision���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayDescription_Revision() {
        return pcAssayDescription_Revision;
    }

    /**
     * ����pcAssayDescription_Revision���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayDescription_Revision(BigInteger value) {
        this.pcAssayDescription_Revision = value;
    }

    /**
     * ��ȡpcAssayDescription_Target���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Target }
     */
    public PCAssayDescription.PCAssayDescription_Target getPCAssayDescription_Target() {
        return pcAssayDescription_Target;
    }

    /**
     * ����pcAssayDescription_Target���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Target }
     */
    public void setPCAssayDescription_Target(PCAssayDescription.PCAssayDescription_Target value) {
        this.pcAssayDescription_Target = value;
    }

    /**
     * ��ȡpcAssayDescription_ActivityOutcomeMethod���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod }
     */
    public PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod getPCAssayDescription_ActivityOutcomeMethod() {
        return pcAssayDescription_ActivityOutcomeMethod;
    }

    /**
     * ����pcAssayDescription_ActivityOutcomeMethod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod }
     */
    public void setPCAssayDescription_ActivityOutcomeMethod(PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod value) {
        this.pcAssayDescription_ActivityOutcomeMethod = value;
    }

    /**
     * ��ȡpcAssayDescription_Dr���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_Dr }
     */
    public PCAssayDescription.PCAssayDescription_Dr getPCAssayDescription_Dr() {
        return pcAssayDescription_Dr;
    }

    /**
     * ����pcAssayDescription_Dr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_Dr }
     */
    public void setPCAssayDescription_Dr(PCAssayDescription.PCAssayDescription_Dr value) {
        this.pcAssayDescription_Dr = value;
    }

    /**
     * ��ȡpcAssayDescription_SubstanceType���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_SubstanceType }
     */
    public PCAssayDescription.PCAssayDescription_SubstanceType getPCAssayDescription_SubstanceType() {
        return pcAssayDescription_SubstanceType;
    }

    /**
     * ����pcAssayDescription_SubstanceType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_SubstanceType }
     */
    public void setPCAssayDescription_SubstanceType(PCAssayDescription.PCAssayDescription_SubstanceType value) {
        this.pcAssayDescription_SubstanceType = value;
    }

    /**
     * ��ȡpcAssayDescription_GrantNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_GrantNumber }
     */
    public PCAssayDescription.PCAssayDescription_GrantNumber getPCAssayDescription_GrantNumber() {
        return pcAssayDescription_GrantNumber;
    }

    /**
     * ����pcAssayDescription_GrantNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_GrantNumber }
     */
    public void setPCAssayDescription_GrantNumber(PCAssayDescription.PCAssayDescription_GrantNumber value) {
        this.pcAssayDescription_GrantNumber = value;
    }

    /**
     * ��ȡpcAssayDescription_ProjectCategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_ProjectCategory }
     */
    public PCAssayDescription.PCAssayDescription_ProjectCategory getPCAssayDescription_ProjectCategory() {
        return pcAssayDescription_ProjectCategory;
    }

    /**
     * ����pcAssayDescription_ProjectCategory���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_ProjectCategory }
     */
    public void setPCAssayDescription_ProjectCategory(PCAssayDescription.PCAssayDescription_ProjectCategory value) {
        this.pcAssayDescription_ProjectCategory = value;
    }

    /**
     * ��ȡpcAssayDescription_IsPanel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_IsPanel }
     */
    public PCAssayDescription.PCAssayDescription_IsPanel getPCAssayDescription_IsPanel() {
        return pcAssayDescription_IsPanel;
    }

    /**
     * ����pcAssayDescription_IsPanel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_IsPanel }
     */
    public void setPCAssayDescription_IsPanel(PCAssayDescription.PCAssayDescription_IsPanel value) {
        this.pcAssayDescription_IsPanel = value;
    }

    /**
     * ��ȡpcAssayDescription_AssayGroup���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_AssayGroup }
     */
    public PCAssayDescription.PCAssayDescription_AssayGroup getPCAssayDescription_AssayGroup() {
        return pcAssayDescription_AssayGroup;
    }

    /**
     * ����pcAssayDescription_AssayGroup���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_AssayGroup }
     */
    public void setPCAssayDescription_AssayGroup(PCAssayDescription.PCAssayDescription_AssayGroup value) {
        this.pcAssayDescription_AssayGroup = value;
    }

    /**
     * ��ȡpcAssayDescription_PanelInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_PanelInfo }
     */
    public PCAssayDescription.PCAssayDescription_PanelInfo getPCAssayDescription_PanelInfo() {
        return pcAssayDescription_PanelInfo;
    }

    /**
     * ����pcAssayDescription_PanelInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_PanelInfo }
     */
    public void setPCAssayDescription_PanelInfo(PCAssayDescription.PCAssayDescription_PanelInfo value) {
        this.pcAssayDescription_PanelInfo = value;
    }

    /**
     * ��ȡpcAssayDescription_IsMlpLateStage���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_IsMlpLateStage }
     */
    public PCAssayDescription.PCAssayDescription_IsMlpLateStage getPCAssayDescription_IsMlpLateStage() {
        return pcAssayDescription_IsMlpLateStage;
    }

    /**
     * ����pcAssayDescription_IsMlpLateStage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_IsMlpLateStage }
     */
    public void setPCAssayDescription_IsMlpLateStage(PCAssayDescription.PCAssayDescription_IsMlpLateStage value) {
        this.pcAssayDescription_IsMlpLateStage = value;
    }

    /**
     * ��ȡpcAssayDescription_CategorizedComment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayDescription.PCAssayDescription_CategorizedComment }
     */
    public PCAssayDescription.PCAssayDescription_CategorizedComment getPCAssayDescription_CategorizedComment() {
        return pcAssayDescription_CategorizedComment;
    }

    /**
     * ����pcAssayDescription_CategorizedComment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayDescription.PCAssayDescription_CategorizedComment }
     */
    public void setPCAssayDescription_CategorizedComment(PCAssayDescription.PCAssayDescription_CategorizedComment value) {
        this.pcAssayDescription_CategorizedComment = value;
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
     *             &lt;enumeration value="other"/>
     *             &lt;enumeration value="screening"/>
     *             &lt;enumeration value="confirmatory"/>
     *             &lt;enumeration value="summary"/>
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
    public static class PCAssayDescription_ActivityOutcomeMethod {

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
    public static class PCAssayDescription_Aid {

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
    public static class PCAssayDescription_AidSource {

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
     *         &lt;element name="PC-AssayDescription_assay-group_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDescription_AssayGroup_E"
    })
    public static class PCAssayDescription_AssayGroup {

        @XmlElement(name = "PC-AssayDescription_assay-group_E")
        protected List<String> pcAssayDescription_AssayGroup_E;

        /**
         * Gets the value of the pcAssayDescriptionAssayGroupE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDescriptionAssayGroupE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDescription_AssayGroup_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayDescription_AssayGroup_E() {
            if (pcAssayDescription_AssayGroup_E == null) {
                pcAssayDescription_AssayGroup_E = new ArrayList<String>();
            }
            return this.pcAssayDescription_AssayGroup_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-CategorizedComment"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCategorizedComment"
    })
    public static class PCAssayDescription_CategorizedComment {

        @XmlElement(name = "PC-CategorizedComment")
        protected List<PCCategorizedComment> pcCategorizedComment;

        /**
         * Gets the value of the pcCategorizedComment property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcCategorizedComment property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCCategorizedComment().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCCategorizedComment }
         */
        public List<PCCategorizedComment> getPCCategorizedComment() {
            if (pcCategorizedComment == null) {
                pcCategorizedComment = new ArrayList<PCCategorizedComment>();
            }
            return this.pcCategorizedComment;
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
     *         &lt;element name="PC-AssayDescription_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDescription_Comment_E"
    })
    public static class PCAssayDescription_Comment {

        @XmlElement(name = "PC-AssayDescription_comment_E")
        protected List<String> pcAssayDescription_Comment_E;

        /**
         * Gets the value of the pcAssayDescriptionCommentE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDescriptionCommentE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDescription_Comment_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayDescription_Comment_E() {
            if (pcAssayDescription_Comment_E == null) {
                pcAssayDescription_Comment_E = new ArrayList<String>();
            }
            return this.pcAssayDescription_Comment_E;
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
     *         &lt;element name="PC-AssayDescription_description_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDescription_Description_E"
    })
    public static class PCAssayDescription_Description {

        @XmlElement(name = "PC-AssayDescription_description_E")
        protected List<String> pcAssayDescription_Description_E;

        /**
         * Gets the value of the pcAssayDescriptionDescriptionE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDescriptionDescriptionE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDescription_Description_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayDescription_Description_E() {
            if (pcAssayDescription_Description_E == null) {
                pcAssayDescription_Description_E = new ArrayList<String>();
            }
            return this.pcAssayDescription_Description_E;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayDRAttr"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDRAttr"
    })
    public static class PCAssayDescription_Dr {

        @XmlElement(name = "PC-AssayDRAttr")
        protected List<PCAssayDRAttr> pcAssayDRAttr;

        /**
         * Gets the value of the pcAssayDRAttr property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDRAttr property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDRAttr().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAssayDRAttr }
         */
        public List<PCAssayDRAttr> getPCAssayDRAttr() {
            if (pcAssayDRAttr == null) {
                pcAssayDRAttr = new ArrayList<PCAssayDRAttr>();
            }
            return this.pcAssayDRAttr;
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
     *         &lt;element name="PC-AssayDescription_grant-number_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDescription_GrantNumber_E"
    })
    public static class PCAssayDescription_GrantNumber {

        @XmlElement(name = "PC-AssayDescription_grant-number_E")
        protected List<String> pcAssayDescription_GrantNumber_E;

        /**
         * Gets the value of the pcAssayDescriptionGrantNumberE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDescriptionGrantNumberE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDescription_GrantNumber_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayDescription_GrantNumber_E() {
            if (pcAssayDescription_GrantNumber_E == null) {
                pcAssayDescription_GrantNumber_E = new ArrayList<String>();
            }
            return this.pcAssayDescription_GrantNumber_E;
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
    public static class PCAssayDescription_IsMlpLateStage {

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
    public static class PCAssayDescription_IsPanel {

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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanel"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayPanel"
    })
    public static class PCAssayDescription_PanelInfo {

        @XmlElement(name = "PC-AssayPanel", required = true)
        protected PCAssayPanel pcAssayPanel;

        /**
         * ��ȡpcAssayPanel���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssayPanel }
         */
        public PCAssayPanel getPCAssayPanel() {
            return pcAssayPanel;
        }

        /**
         * ����pcAssayPanel���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssayPanel }
         */
        public void setPCAssayPanel(PCAssayPanel value) {
            this.pcAssayPanel = value;
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
     *             &lt;enumeration value="mlscn"/>
     *             &lt;enumeration value="mlpcn"/>
     *             &lt;enumeration value="mlscn-ap"/>
     *             &lt;enumeration value="mlpcn-ap"/>
     *             &lt;enumeration value="journal-article"/>
     *             &lt;enumeration value="assay-vendor"/>
     *             &lt;enumeration value="literature-extracted"/>
     *             &lt;enumeration value="literature-author"/>
     *             &lt;enumeration value="literature-publisher"/>
     *             &lt;enumeration value="rnaigi"/>
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
    public static class PCAssayDescription_ProjectCategory {

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
     *         &lt;element name="PC-AssayDescription_protocol_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayDescription_Protocol_E"
    })
    public static class PCAssayDescription_Protocol {

        @XmlElement(name = "PC-AssayDescription_protocol_E")
        protected List<String> pcAssayDescription_Protocol_E;

        /**
         * Gets the value of the pcAssayDescriptionProtocolE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayDescriptionProtocolE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayDescription_Protocol_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayDescription_Protocol_E() {
            if (pcAssayDescription_Protocol_E == null) {
                pcAssayDescription_Protocol_E = new ArrayList<String>();
            }
            return this.pcAssayDescription_Protocol_E;
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
    public static class PCAssayDescription_Pub {

        @XmlElement(name = "Pub")
        protected List<Pub> pub;

        /**
         * Gets the value of the pub property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pub property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPub().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pub }
         */
        public List<Pub> getPub() {
            if (pub == null) {
                pub = new ArrayList<Pub>();
            }
            return this.pub;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-ResultType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcResultType"
    })
    public static class PCAssayDescription_Results {

        @XmlElement(name = "PC-ResultType")
        protected List<PCResultType> pcResultType;

        /**
         * Gets the value of the pcResultType property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcResultType property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCResultType().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCResultType }
         */
        public List<PCResultType> getPCResultType() {
            if (pcResultType == null) {
                pcResultType = new ArrayList<PCResultType>();
            }
            return this.pcResultType;
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
     *             &lt;enumeration value="small-molecule"/>
     *             &lt;enumeration value="nucleotide"/>
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
    public static class PCAssayDescription_SubstanceType {

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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayTargetInfo"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayTargetInfo"
    })
    public static class PCAssayDescription_Target {

        @XmlElement(name = "PC-AssayTargetInfo")
        protected List<PCAssayTargetInfo> pcAssayTargetInfo;

        /**
         * Gets the value of the pcAssayTargetInfo property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayTargetInfo property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayTargetInfo().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAssayTargetInfo }
         */
        public List<PCAssayTargetInfo> getPCAssayTargetInfo() {
            if (pcAssayTargetInfo == null) {
                pcAssayTargetInfo = new ArrayList<PCAssayTargetInfo>();
            }
            return this.pcAssayTargetInfo;
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
    public static class PCAssayDescription_Xref {

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
