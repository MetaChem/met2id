//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Cit-let_cit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-let_man-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cit-let_type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="manuscript"/>
 *                       &lt;enumeration value="letter"/>
 *                       &lt;enumeration value="thesis"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
        "citLet_Cit",
        "citLet_ManId",
        "citLet_Type"
})
@XmlRootElement(name = "Cit-let")
public class CitLet {

    @XmlElement(name = "Cit-let_cit", required = true)
    protected CitLet.CitLet_Cit citLet_Cit;
    @XmlElement(name = "Cit-let_man-id")
    protected String citLet_ManId;
    @XmlElement(name = "Cit-let_type")
    protected CitLet.CitLet_Type citLet_Type;

    /**
     * ��ȡcitLet_Cit���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitLet.CitLet_Cit }
     */
    public CitLet.CitLet_Cit getCitLet_Cit() {
        return citLet_Cit;
    }

    /**
     * ����citLet_Cit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitLet.CitLet_Cit }
     */
    public void setCitLet_Cit(CitLet.CitLet_Cit value) {
        this.citLet_Cit = value;
    }

    /**
     * ��ȡcitLet_ManId���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitLet_ManId() {
        return citLet_ManId;
    }

    /**
     * ����citLet_ManId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitLet_ManId(String value) {
        this.citLet_ManId = value;
    }

    /**
     * ��ȡcitLet_Type���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitLet.CitLet_Type }
     */
    public CitLet.CitLet_Type getCitLet_Type() {
        return citLet_Type;
    }

    /**
     * ����citLet_Type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitLet.CitLet_Type }
     */
    public void setCitLet_Type(CitLet.CitLet_Type value) {
        this.citLet_Type = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Cit-book"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "citBook"
    })
    public static class CitLet_Cit {

        @XmlElement(name = "Cit-book", required = true)
        protected CitBook citBook;

        /**
         * ��ȡcitBook���Ե�ֵ��
         *
         * @return possible object is
         * {@link CitBook }
         */
        public CitBook getCitBook() {
            return citBook;
        }

        /**
         * ����citBook���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CitBook }
         */
        public void setCitBook(CitBook value) {
            this.citBook = value;
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
     *             &lt;enumeration value="manuscript"/>
     *             &lt;enumeration value="letter"/>
     *             &lt;enumeration value="thesis"/>
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
    public static class CitLet_Type {

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

}
