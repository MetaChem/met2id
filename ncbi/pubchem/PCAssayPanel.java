//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *         &lt;element name="PC-AssayPanel_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-AssayPanel_descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PC-AssayPanel_member" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanelMember"/>
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
        "pcAssayPanel_Name",
        "pcAssayPanel_Descr",
        "pcAssayPanel_Member"
})
@XmlRootElement(name = "PC-AssayPanel")
public class PCAssayPanel {

    @XmlElement(name = "PC-AssayPanel_name", required = true)
    protected String pcAssayPanel_Name;
    @XmlElement(name = "PC-AssayPanel_descr")
    protected String pcAssayPanel_Descr;
    @XmlElement(name = "PC-AssayPanel_member")
    protected PCAssayPanel.PCAssayPanel_Member pcAssayPanel_Member;

    /**
     * ��ȡpcAssayPanel_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayPanel_Name() {
        return pcAssayPanel_Name;
    }

    /**
     * ����pcAssayPanel_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayPanel_Name(String value) {
        this.pcAssayPanel_Name = value;
    }

    /**
     * ��ȡpcAssayPanel_Descr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAssayPanel_Descr() {
        return pcAssayPanel_Descr;
    }

    /**
     * ����pcAssayPanel_Descr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAssayPanel_Descr(String value) {
        this.pcAssayPanel_Descr = value;
    }

    /**
     * ��ȡpcAssayPanel_Member���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayPanel.PCAssayPanel_Member }
     */
    public PCAssayPanel.PCAssayPanel_Member getPCAssayPanel_Member() {
        return pcAssayPanel_Member;
    }

    /**
     * ����pcAssayPanel_Member���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayPanel.PCAssayPanel_Member }
     */
    public void setPCAssayPanel_Member(PCAssayPanel.PCAssayPanel_Member value) {
        this.pcAssayPanel_Member = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-AssayPanelMember"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayPanelMember"
    })
    public static class PCAssayPanel_Member {

        @XmlElement(name = "PC-AssayPanelMember")
        protected List<PCAssayPanelMember> pcAssayPanelMember;

        /**
         * Gets the value of the pcAssayPanelMember property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcAssayPanelMember property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCAssayPanelMember().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PCAssayPanelMember }
         */
        public List<PCAssayPanelMember> getPCAssayPanelMember() {
            if (pcAssayPanelMember == null) {
                pcAssayPanelMember = new ArrayList<PCAssayPanelMember>();
            }
            return this.pcAssayPanelMember;
        }

    }

}
