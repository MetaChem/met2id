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
 *         &lt;element name="Dbtag_db" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dbtag_tag">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
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
        "dbtag_Db",
        "dbtag_Tag"
})
@XmlRootElement(name = "Dbtag")
public class Dbtag {

    @XmlElement(name = "Dbtag_db", required = true)
    protected String dbtag_Db;
    @XmlElement(name = "Dbtag_tag", required = true)
    protected Dbtag.Dbtag_Tag dbtag_Tag;

    /**
     * ��ȡdbtag_Db���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDbtag_Db() {
        return dbtag_Db;
    }

    /**
     * ����dbtag_Db���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDbtag_Db(String value) {
        this.dbtag_Db = value;
    }

    /**
     * ��ȡdbtag_Tag���Ե�ֵ��
     *
     * @return possible object is
     * {@link Dbtag.Dbtag_Tag }
     */
    public Dbtag.Dbtag_Tag getDbtag_Tag() {
        return dbtag_Tag;
    }

    /**
     * ����dbtag_Tag���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Dbtag.Dbtag_Tag }
     */
    public void setDbtag_Tag(Dbtag.Dbtag_Tag value) {
        this.dbtag_Tag = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Object-id"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "objectId"
    })
    public static class Dbtag_Tag {

        @XmlElement(name = "Object-id", required = true)
        protected ObjectId objectId;

        /**
         * ��ȡobjectId���Ե�ֵ��
         *
         * @return possible object is
         * {@link ObjectId }
         */
        public ObjectId getObjectId() {
            return objectId;
        }

        /**
         * ����objectId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ObjectId }
         */
        public void setObjectId(ObjectId value) {
            this.objectId = value;
        }

    }

}
