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
 *         &lt;element name="PC-StereoTShape_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTShape_top" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTShape_bottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTShape_above" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcStereoTShape_Center",
        "pcStereoTShape_Top",
        "pcStereoTShape_Bottom",
        "pcStereoTShape_Above"
})
@XmlRootElement(name = "PC-StereoTShape")
public class PCStereoTShape {

    @XmlElement(name = "PC-StereoTShape_center", required = true)
    protected BigInteger pcStereoTShape_Center;
    @XmlElement(name = "PC-StereoTShape_top", required = true)
    protected BigInteger pcStereoTShape_Top;
    @XmlElement(name = "PC-StereoTShape_bottom", required = true)
    protected BigInteger pcStereoTShape_Bottom;
    @XmlElement(name = "PC-StereoTShape_above", required = true)
    protected BigInteger pcStereoTShape_Above;

    /**
     * ��ȡpcStereoTShape_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTShape_Center() {
        return pcStereoTShape_Center;
    }

    /**
     * ����pcStereoTShape_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTShape_Center(BigInteger value) {
        this.pcStereoTShape_Center = value;
    }

    /**
     * ��ȡpcStereoTShape_Top���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTShape_Top() {
        return pcStereoTShape_Top;
    }

    /**
     * ����pcStereoTShape_Top���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTShape_Top(BigInteger value) {
        this.pcStereoTShape_Top = value;
    }

    /**
     * ��ȡpcStereoTShape_Bottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTShape_Bottom() {
        return pcStereoTShape_Bottom;
    }

    /**
     * ����pcStereoTShape_Bottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTShape_Bottom(BigInteger value) {
        this.pcStereoTShape_Bottom = value;
    }

    /**
     * ��ȡpcStereoTShape_Above���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTShape_Above() {
        return pcStereoTShape_Above;
    }

    /**
     * ����pcStereoTShape_Above���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTShape_Above(BigInteger value) {
        this.pcStereoTShape_Above = value;
    }

}
