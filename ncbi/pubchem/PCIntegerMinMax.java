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
 *         &lt;element name="PC-IntegerMinMax_min" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-IntegerMinMax_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcIntegerMinMax_Min",
        "pcIntegerMinMax_Max"
})
@XmlRootElement(name = "PC-IntegerMinMax")
public class PCIntegerMinMax {

    @XmlElement(name = "PC-IntegerMinMax_min", required = true)
    protected BigInteger pcIntegerMinMax_Min;
    @XmlElement(name = "PC-IntegerMinMax_max", required = true)
    protected BigInteger pcIntegerMinMax_Max;

    /**
     * ��ȡpcIntegerMinMax_Min���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCIntegerMinMax_Min() {
        return pcIntegerMinMax_Min;
    }

    /**
     * ����pcIntegerMinMax_Min���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCIntegerMinMax_Min(BigInteger value) {
        this.pcIntegerMinMax_Min = value;
    }

    /**
     * ��ȡpcIntegerMinMax_Max���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCIntegerMinMax_Max() {
        return pcIntegerMinMax_Max;
    }

    /**
     * ����pcIntegerMinMax_Max���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCIntegerMinMax_Max(BigInteger value) {
        this.pcIntegerMinMax_Max = value;
    }

}
