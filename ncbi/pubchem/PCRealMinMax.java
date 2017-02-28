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
 *         &lt;element name="PC-RealMinMax_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PC-RealMinMax_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcRealMinMax_Min",
        "pcRealMinMax_Max"
})
@XmlRootElement(name = "PC-RealMinMax")
public class PCRealMinMax {

    @XmlElement(name = "PC-RealMinMax_min")
    protected double pcRealMinMax_Min;
    @XmlElement(name = "PC-RealMinMax_max")
    protected double pcRealMinMax_Max;

    /**
     * ��ȡpcRealMinMax_Min���Ե�ֵ��
     */
    public double getPCRealMinMax_Min() {
        return pcRealMinMax_Min;
    }

    /**
     * ����pcRealMinMax_Min���Ե�ֵ��
     */
    public void setPCRealMinMax_Min(double value) {
        this.pcRealMinMax_Min = value;
    }

    /**
     * ��ȡpcRealMinMax_Max���Ե�ֵ��
     */
    public double getPCRealMinMax_Max() {
        return pcRealMinMax_Max;
    }

    /**
     * ����pcRealMinMax_Max���Ե�ֵ��
     */
    public void setPCRealMinMax_Max(double value) {
        this.pcRealMinMax_Max = value;
    }

}
