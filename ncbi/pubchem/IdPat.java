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
 *       &lt;sequence>
 *         &lt;element name="Id-pat_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id-pat_id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Id-pat_id_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Id-pat_id_app-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Id-pat_doc-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "idPat_Country",
        "idPat_Id",
        "idPat_DocType"
})
@XmlRootElement(name = "Id-pat")
public class IdPat {

    @XmlElement(name = "Id-pat_country", required = true)
    protected String idPat_Country;
    @XmlElement(name = "Id-pat_id", required = true)
    protected IdPat.IdPat_Id idPat_Id;
    @XmlElement(name = "Id-pat_doc-type")
    protected String idPat_DocType;

    /**
     * ��ȡidPat_Country���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdPat_Country() {
        return idPat_Country;
    }

    /**
     * ����idPat_Country���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdPat_Country(String value) {
        this.idPat_Country = value;
    }

    /**
     * ��ȡidPat_Id���Ե�ֵ��
     *
     * @return possible object is
     * {@link IdPat.IdPat_Id }
     */
    public IdPat.IdPat_Id getIdPat_Id() {
        return idPat_Id;
    }

    /**
     * ����idPat_Id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link IdPat.IdPat_Id }
     */
    public void setIdPat_Id(IdPat.IdPat_Id value) {
        this.idPat_Id = value;
    }

    /**
     * ��ȡidPat_DocType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdPat_DocType() {
        return idPat_DocType;
    }

    /**
     * ����idPat_DocType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdPat_DocType(String value) {
        this.idPat_DocType = value;
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
     *         &lt;element name="Id-pat_id_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Id-pat_id_app-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "idPat_Id_Number",
            "idPat_Id_AppNumber"
    })
    public static class IdPat_Id {

        @XmlElement(name = "Id-pat_id_number")
        protected String idPat_Id_Number;
        @XmlElement(name = "Id-pat_id_app-number")
        protected String idPat_Id_AppNumber;

        /**
         * ��ȡidPat_Id_Number���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIdPat_Id_Number() {
            return idPat_Id_Number;
        }

        /**
         * ����idPat_Id_Number���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIdPat_Id_Number(String value) {
            this.idPat_Id_Number = value;
        }

        /**
         * ��ȡidPat_Id_AppNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIdPat_Id_AppNumber() {
            return idPat_Id_AppNumber;
        }

        /**
         * ����idPat_Id_AppNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIdPat_Id_AppNumber(String value) {
            this.idPat_Id_AppNumber = value;
        }

    }

}
