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
 *         &lt;element name="PC-AssayPanelMember_mid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayPanelMember_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayPanelMember_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayPanelMember_protocol" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayPanelMember_protocol_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayPanelMember_comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-AssayPanelMember_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-AssayPanelMember_target" minOccurs="0">
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
 *         &lt;element name="PC-AssayPanelMember_xref" minOccurs="0">
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
 *         &lt;element name="PC-AssayPanelMember_activity-outcome-method" minOccurs="0">
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
 *         &lt;element name="PC-AssayPanelMember_dr" minOccurs="0">
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
 *         &lt;element name="PC-AssayPanelMember_categorized-comment" minOccurs="0">
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
        "pcAssayPanelMember_Mid",
        "pcAssayPanelMember_Name",
        "pcAssayPanelMember_Description",
        "pcAssayPanelMember_Protocol",
        "pcAssayPanelMember_Comment",
        "pcAssayPanelMember_Target",
        "pcAssayPanelMember_Xref",
        "pcAssayPanelMember_ActivityOutcomeMethod",
        "pcAssayPanelMember_Dr",
        "pcAssayPanelMember_CategorizedComment"
})
@XmlRootElement(name = "PC-AssayPanelMember")
public class PCAssayPanelMember {

    @XmlElement(name = "PC-AssayPanelMember_mid", required = true)
    protected BigInteger pcAssayPanelMember_Mid;
    @XmlElement(name = "PC-AssayPanelMember_name")
    protected String pcAssayPanelMember_Name;
    @XmlElement(name = "PC-AssayPanelMember_description")
    protected String pcAssayPanelMember_Description;
    @XmlElement(name = "PC-AssayPanelMember_protocol")
    protected PCAssayPanelMember.PCAssayPanelMember_Protocol pcAssayPanelMember_Protocol;
    @XmlElement(name = "PC-AssayPanelMember_comment")
    protected PCAssayPanelMember.PCAssayPanelMember_Comment pcAssayPanelMember_Comment;
    @XmlElement(name = "PC-AssayPanelMember_target")
    protected PCAssayPanelMember.PCAssayPanelMember_Target pcAssayPanelMember_Target;
    @XmlElement(name = "PC-AssayPanelMember_xref")
    protected PCAssayPanelMember.PCAssayPanelMember_Xref pcAssayPanelMember_Xref;
    @XmlElement(name = "PC-AssayPanelMember_activity-outcome-method")
    protected PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod pcAssayPanelMember_ActivityOutcomeMethod;
    @XmlElement(name = "PC-AssayPanelMember_dr")
    protected PCAssayPanelMember.PCAssayPanelMember_Dr pcAssayPanelMember_Dr;
    @XmlElement(name = "PC-AssayPanelMember_categorized-comment")
    protected PCAssayPanelMember.PCAssayPanelMember_CategorizedComment pcAssayPanelMember_CategorizedComment;

    /**
     * ��ȡpcAssayPanelMember_Mid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayPanelMember_Mid() {
        return pcAssayPanelMember_Mid;
    }

    /**
     * ����pcAssayPanelMember_Mid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayPanelMember_Mid(BigInteger value) {
        this.pcAssayPanelMember_Mid = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayPanelMember_Name() {
        return pcAssayPanelMember_Name;
    }

    /**
     * ����pcAssayPanelMember_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayPanelMember_Name(String value) {
        this.pcAssayPanelMember_Name = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Description���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayPanelMember_Description() {
        return pcAssayPanelMember_Description;
    }

    /**
     * ����pcAssayPanelMember_Description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayPanelMember_Description(String value) {
        this.pcAssayPanelMember_Description = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Protocol���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_Protocol }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Protocol getPCAssayPanelMember_Protocol() {
        return pcAssayPanelMember_Protocol;
    }

    /**
     * ����pcAssayPanelMember_Protocol���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_Protocol }
     */
    public void setPCAssayPanelMember_Protocol(PCAssayPanelMember.PCAssayPanelMember_Protocol value) {
        this.pcAssayPanelMember_Protocol = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_Comment }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Comment getPCAssayPanelMember_Comment() {
        return pcAssayPanelMember_Comment;
    }

    /**
     * ����pcAssayPanelMember_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_Comment }
     */
    public void setPCAssayPanelMember_Comment(PCAssayPanelMember.PCAssayPanelMember_Comment value) {
        this.pcAssayPanelMember_Comment = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Target���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_Target }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Target getPCAssayPanelMember_Target() {
        return pcAssayPanelMember_Target;
    }

    /**
     * ����pcAssayPanelMember_Target���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_Target }
     */
    public void setPCAssayPanelMember_Target(PCAssayPanelMember.PCAssayPanelMember_Target value) {
        this.pcAssayPanelMember_Target = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Xref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_Xref }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Xref getPCAssayPanelMember_Xref() {
        return pcAssayPanelMember_Xref;
    }

    /**
     * ����pcAssayPanelMember_Xref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_Xref }
     */
    public void setPCAssayPanelMember_Xref(PCAssayPanelMember.PCAssayPanelMember_Xref value) {
        this.pcAssayPanelMember_Xref = value;
    }

    /**
     * ��ȡpcAssayPanelMember_ActivityOutcomeMethod���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod }
     */
    public PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod getPCAssayPanelMember_ActivityOutcomeMethod() {
        return pcAssayPanelMember_ActivityOutcomeMethod;
    }

    /**
     * ����pcAssayPanelMember_ActivityOutcomeMethod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod }
     */
    public void setPCAssayPanelMember_ActivityOutcomeMethod(PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod value) {
        this.pcAssayPanelMember_ActivityOutcomeMethod = value;
    }

    /**
     * ��ȡpcAssayPanelMember_Dr���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_Dr }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Dr getPCAssayPanelMember_Dr() {
        return pcAssayPanelMember_Dr;
    }

    /**
     * ����pcAssayPanelMember_Dr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_Dr }
     */
    public void setPCAssayPanelMember_Dr(PCAssayPanelMember.PCAssayPanelMember_Dr value) {
        this.pcAssayPanelMember_Dr = value;
    }

    /**
     * ��ȡpcAssayPanelMember_CategorizedComment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanelMember.PCAssayPanelMember_CategorizedComment }
     */
    public PCAssayPanelMember.PCAssayPanelMember_CategorizedComment getPCAssayPanelMember_CategorizedComment() {
        return pcAssayPanelMember_CategorizedComment;
    }

    /**
     * ����pcAssayPanelMember_CategorizedComment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanelMember.PCAssayPanelMember_CategorizedComment }
     */
    public void setPCAssayPanelMember_CategorizedComment(PCAssayPanelMember.PCAssayPanelMember_CategorizedComment value) {
        this.pcAssayPanelMember_CategorizedComment = value;
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
    public static class PCAssayPanelMember_ActivityOutcomeMethod {

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
    public static class PCAssayPanelMember_CategorizedComment {

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
     *         &lt;element name="PC-AssayPanelMember_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayPanelMember_Comment_E"
    })
    public static class PCAssayPanelMember_Comment {

        @XmlElement(name = "PC-AssayPanelMember_comment_E")
        protected List<String> pcAssayPanelMember_Comment_E;

        /**
         * Gets the value of the pcAssayPanelMemberCommentE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayPanelMemberCommentE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayPanelMember_Comment_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayPanelMember_Comment_E() {
            if (pcAssayPanelMember_Comment_E == null) {
                pcAssayPanelMember_Comment_E = new ArrayList<String>();
            }
            return this.pcAssayPanelMember_Comment_E;
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
    public static class PCAssayPanelMember_Dr {

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
     *         &lt;element name="PC-AssayPanelMember_protocol_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayPanelMember_Protocol_E"
    })
    public static class PCAssayPanelMember_Protocol {

        @XmlElement(name = "PC-AssayPanelMember_protocol_E")
        protected List<String> pcAssayPanelMember_Protocol_E;

        /**
         * Gets the value of the pcAssayPanelMemberProtocolE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayPanelMemberProtocolE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayPanelMember_Protocol_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCAssayPanelMember_Protocol_E() {
            if (pcAssayPanelMember_Protocol_E == null) {
                pcAssayPanelMember_Protocol_E = new ArrayList<String>();
            }
            return this.pcAssayPanelMember_Protocol_E;
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
    public static class PCAssayPanelMember_Target {

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
    public static class PCAssayPanelMember_Xref {

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
