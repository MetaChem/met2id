//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *       &lt;choice>
 *         &lt;element name="Person-id_dbtag">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Person-id_name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Name-std"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Person-id_ml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Person-id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Person-id_consortium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "personId_Dbtag",
        "personId_Name",
        "personId_Ml",
        "personId_Str",
        "personId_Consortium"
})
@XmlRootElement(name = "Person-id")
public class PersonId {

    @XmlElement(name = "Person-id_dbtag")
    protected PersonId.PersonId_Dbtag personId_Dbtag;
    @XmlElement(name = "Person-id_name")
    protected PersonId.PersonId_Name personId_Name;
    @XmlElement(name = "Person-id_ml")
    protected String personId_Ml;
    @XmlElement(name = "Person-id_str")
    protected String personId_Str;
    @XmlElement(name = "Person-id_consortium")
    protected String personId_Consortium;

    /**
     * ��ȡpersonId_Dbtag���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonId.PersonId_Dbtag }
     */
    public PersonId.PersonId_Dbtag getPersonId_Dbtag() {
        return personId_Dbtag;
    }

    /**
     * ����personId_Dbtag���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonId.PersonId_Dbtag }
     */
    public void setPersonId_Dbtag(PersonId.PersonId_Dbtag value) {
        this.personId_Dbtag = value;
    }

    /**
     * ��ȡpersonId_Name���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonId.PersonId_Name }
     */
    public PersonId.PersonId_Name getPersonId_Name() {
        return personId_Name;
    }

    /**
     * ����personId_Name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonId.PersonId_Name }
     */
    public void setPersonId_Name(PersonId.PersonId_Name value) {
        this.personId_Name = value;
    }

    /**
     * ��ȡpersonId_Ml���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPersonId_Ml() {
        return personId_Ml;
    }

    /**
     * ����personId_Ml���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPersonId_Ml(String value) {
        this.personId_Ml = value;
    }

    /**
     * ��ȡpersonId_Str���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPersonId_Str() {
        return personId_Str;
    }

    /**
     * ����personId_Str���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPersonId_Str(String value) {
        this.personId_Str = value;
    }

    /**
     * ��ȡpersonId_Consortium���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPersonId_Consortium() {
        return personId_Consortium;
    }

    /**
     * ����personId_Consortium���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPersonId_Consortium(String value) {
        this.personId_Consortium = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Dbtag"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dbtag"
    })
    public static class PersonId_Dbtag {

        @XmlElement(name = "Dbtag", required = true)
        protected Dbtag dbtag;

        /**
         * ��ȡdbtag���Ե�ֵ��
         *
         * @return possible object is
         * {@link Dbtag }
         */
        public Dbtag getDbtag() {
            return dbtag;
        }

        /**
         * ����dbtag���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Dbtag }
         */
        public void setDbtag(Dbtag value) {
            this.dbtag = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Name-std"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "nameStd"
    })
    public static class PersonId_Name {

        @XmlElement(name = "Name-std", required = true)
        protected NameStd nameStd;

        /**
         * ��ȡnameStd���Ե�ֵ��
         *
         * @return possible object is
         * {@link NameStd }
         */
        public NameStd getNameStd() {
            return nameStd;
        }

        /**
         * ����nameStd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link NameStd }
         */
        public void setNameStd(NameStd value) {
            this.nameStd = value;
        }

    }

}
