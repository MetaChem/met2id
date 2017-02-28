//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
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
 *         &lt;element name="Object-id_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Object-id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "objectId_Id",
        "objectId_Str"
})
@XmlRootElement(name = "Object-id")
public class ObjectId {

    @XmlElement(name = "Object-id_id")
    protected BigInteger objectId_Id;
    @XmlElement(name = "Object-id_str")
    protected String objectId_Str;

    /**
     * ��ȡobjectId_Id���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getObjectId_Id() {
        return objectId_Id;
    }

    /**
     * ����objectId_Id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setObjectId_Id(BigInteger value) {
        this.objectId_Id = value;
    }

    /**
     * ��ȡobjectId_Str���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjectId_Str() {
        return objectId_Str;
    }

    /**
     * ����objectId_Str���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjectId_Str(String value) {
        this.objectId_Str = value;
    }

}
