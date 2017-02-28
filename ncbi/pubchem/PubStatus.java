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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *       &lt;attribute name="value">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="received"/>
 *             &lt;enumeration value="accepted"/>
 *             &lt;enumeration value="epublish"/>
 *             &lt;enumeration value="ppublish"/>
 *             &lt;enumeration value="revised"/>
 *             &lt;enumeration value="pmc"/>
 *             &lt;enumeration value="pmcr"/>
 *             &lt;enumeration value="pubmed"/>
 *             &lt;enumeration value="pubmedr"/>
 *             &lt;enumeration value="aheadofprint"/>
 *             &lt;enumeration value="premedline"/>
 *             &lt;enumeration value="medline"/>
 *             &lt;enumeration value="other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "PubStatus")
public class PubStatus {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "value")
    protected String stringValue;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * ��ȡstringValue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * ����stringValue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

}
