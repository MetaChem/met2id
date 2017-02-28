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
 *         &lt;element name="Cit-sub_authors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-sub_imp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-sub_medium" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="paper"/>
 *                       &lt;enumeration value="tape"/>
 *                       &lt;enumeration value="floppy"/>
 *                       &lt;enumeration value="email"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-sub_date" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-sub_descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "citSub_Authors",
        "citSub_Imp",
        "citSub_Medium",
        "citSub_Date",
        "citSub_Descr"
})
@XmlRootElement(name = "Cit-sub")
public class CitSub {

    @XmlElement(name = "Cit-sub_authors", required = true)
    protected CitSub.CitSub_Authors citSub_Authors;
    @XmlElement(name = "Cit-sub_imp")
    protected CitSub.CitSub_Imp citSub_Imp;
    @XmlElement(name = "Cit-sub_medium")
    protected CitSub.CitSub_Medium citSub_Medium;
    @XmlElement(name = "Cit-sub_date")
    protected CitSub.CitSub_Date citSub_Date;
    @XmlElement(name = "Cit-sub_descr")
    protected String citSub_Descr;

    /**
     * ��ȡcitSub_Authors���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitSub.CitSub_Authors }
     */
    public CitSub.CitSub_Authors getCitSub_Authors() {
        return citSub_Authors;
    }

    /**
     * ����citSub_Authors���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitSub.CitSub_Authors }
     */
    public void setCitSub_Authors(CitSub.CitSub_Authors value) {
        this.citSub_Authors = value;
    }

    /**
     * ��ȡcitSub_Imp���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitSub.CitSub_Imp }
     */
    public CitSub.CitSub_Imp getCitSub_Imp() {
        return citSub_Imp;
    }

    /**
     * ����citSub_Imp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitSub.CitSub_Imp }
     */
    public void setCitSub_Imp(CitSub.CitSub_Imp value) {
        this.citSub_Imp = value;
    }

    /**
     * ��ȡcitSub_Medium���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitSub.CitSub_Medium }
     */
    public CitSub.CitSub_Medium getCitSub_Medium() {
        return citSub_Medium;
    }

    /**
     * ����citSub_Medium���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitSub.CitSub_Medium }
     */
    public void setCitSub_Medium(CitSub.CitSub_Medium value) {
        this.citSub_Medium = value;
    }

    /**
     * ��ȡcitSub_Date���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitSub.CitSub_Date }
     */
    public CitSub.CitSub_Date getCitSub_Date() {
        return citSub_Date;
    }

    /**
     * ����citSub_Date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitSub.CitSub_Date }
     */
    public void setCitSub_Date(CitSub.CitSub_Date value) {
        this.citSub_Date = value;
    }

    /**
     * ��ȡcitSub_Descr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitSub_Descr() {
        return citSub_Descr;
    }

    /**
     * ����citSub_Descr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitSub_Descr(String value) {
        this.citSub_Descr = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Auth-list"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authList"
    })
    public static class CitSub_Authors {

        @XmlElement(name = "Auth-list", required = true)
        protected AuthList authList;

        /**
         * ��ȡauthList���Ե�ֵ��
         *
         * @return possible object is
         * {@link AuthList }
         */
        public AuthList getAuthList() {
            return authList;
        }

        /**
         * ����authList���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AuthList }
         */
        public void setAuthList(AuthList value) {
            this.authList = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "date"
    })
    public static class CitSub_Date {

        @XmlElement(name = "Date", required = true)
        protected Date date;

        /**
         * ��ȡdate���Ե�ֵ��
         *
         * @return possible object is
         * {@link Date }
         */
        public Date getDate() {
            return date;
        }

        /**
         * ����date���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Date }
         */
        public void setDate(Date value) {
            this.date = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "imprint"
    })
    public static class CitSub_Imp {

        @XmlElement(name = "Imprint", required = true)
        protected Imprint imprint;

        /**
         * ��ȡimprint���Ե�ֵ��
         *
         * @return possible object is
         * {@link Imprint }
         */
        public Imprint getImprint() {
            return imprint;
        }

        /**
         * ����imprint���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Imprint }
         */
        public void setImprint(Imprint value) {
            this.imprint = value;
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
     *             &lt;enumeration value="paper"/>
     *             &lt;enumeration value="tape"/>
     *             &lt;enumeration value="floppy"/>
     *             &lt;enumeration value="email"/>
     *             &lt;enumeration value="other"/>
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
    public static class CitSub_Medium {

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
