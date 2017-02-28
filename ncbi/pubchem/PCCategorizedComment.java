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
 *         &lt;element name="PC-CategorizedComment_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PC-CategorizedComment_comment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="PC-CategorizedComment_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "pcCategorizedComment_Title",
        "pcCategorizedComment_Comment"
})
@XmlRootElement(name = "PC-CategorizedComment")
public class PCCategorizedComment {

    @XmlElement(name = "PC-CategorizedComment_title", required = true)
    protected String pcCategorizedComment_Title;
    @XmlElement(name = "PC-CategorizedComment_comment", required = true)
    protected PCCategorizedComment.PCCategorizedComment_Comment pcCategorizedComment_Comment;

    /**
     * ��ȡpcCategorizedComment_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCCategorizedComment_Title() {
        return pcCategorizedComment_Title;
    }

    /**
     * ����pcCategorizedComment_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCCategorizedComment_Title(String value) {
        this.pcCategorizedComment_Title = value;
    }

    /**
     * ��ȡpcCategorizedComment_Comment���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCCategorizedComment.PCCategorizedComment_Comment }
     */
    public PCCategorizedComment.PCCategorizedComment_Comment getPCCategorizedComment_Comment() {
        return pcCategorizedComment_Comment;
    }

    /**
     * ����pcCategorizedComment_Comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCCategorizedComment.PCCategorizedComment_Comment }
     */
    public void setPCCategorizedComment_Comment(PCCategorizedComment.PCCategorizedComment_Comment value) {
        this.pcCategorizedComment_Comment = value;
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
     *         &lt;element name="PC-CategorizedComment_comment_E" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcCategorizedComment_Comment_E"
    })
    public static class PCCategorizedComment_Comment {

        @XmlElement(name = "PC-CategorizedComment_comment_E")
        protected List<String> pcCategorizedComment_Comment_E;

        /**
         * Gets the value of the pcCategorizedCommentCommentE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pcCategorizedCommentCommentE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPCCategorizedComment_Comment_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPCCategorizedComment_Comment_E() {
            if (pcCategorizedComment_Comment_E == null) {
                pcCategorizedComment_Comment_E = new ArrayList<String>();
            }
            return this.pcCategorizedComment_Comment_E;
        }

    }

}
