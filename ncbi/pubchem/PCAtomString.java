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
 *       &lt;sequence>
 *         &lt;element name="PC-AtomString_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AtomString_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAtomString_Aid",
        "pcAtomString_Value"
})
@XmlRootElement(name = "PC-AtomString")
public class PCAtomString {

    @XmlElement(name = "PC-AtomString_aid", required = true)
    protected BigInteger pcAtomString_Aid;
    @XmlElement(name = "PC-AtomString_value", required = true)
    protected String pcAtomString_Value;

    /**
     * ��ȡpcAtomString_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAtomString_Aid() {
        return pcAtomString_Aid;
    }

    /**
     * ����pcAtomString_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAtomString_Aid(BigInteger value) {
        this.pcAtomString_Aid = value;
    }

    /**
     * ��ȡpcAtomString_Value���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPCAtomString_Value() {
        return pcAtomString_Value;
    }

    /**
     * ����pcAtomString_Value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPCAtomString_Value(String value) {
        this.pcAtomString_Value = value;
    }

}
