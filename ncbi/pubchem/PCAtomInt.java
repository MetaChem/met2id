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
 *         &lt;element name="PC-AtomInt_aid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AtomInt_value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAtomInt_Aid",
        "pcAtomInt_Value"
})
@XmlRootElement(name = "PC-AtomInt")
public class PCAtomInt {

    @XmlElement(name = "PC-AtomInt_aid", required = true)
    protected BigInteger pcAtomInt_Aid;
    @XmlElement(name = "PC-AtomInt_value", required = true)
    protected BigInteger pcAtomInt_Value;

    /**
     * ��ȡpcAtomInt_Aid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAtomInt_Aid() {
        return pcAtomInt_Aid;
    }

    /**
     * ����pcAtomInt_Aid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAtomInt_Aid(BigInteger value) {
        this.pcAtomInt_Aid = value;
    }

    /**
     * ��ȡpcAtomInt_Value���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAtomInt_Value() {
        return pcAtomInt_Value;
    }

    /**
     * ����pcAtomInt_Value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAtomInt_Value(BigInteger value) {
        this.pcAtomInt_Value = value;
    }

}
