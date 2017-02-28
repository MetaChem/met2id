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
 *         &lt;element name="PC-StereoTrigonalBiPyramid_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTrigonalBiPyramid_above" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTrigonalBiPyramid_below" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTrigonalBiPyramid_top" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTrigonalBiPyramid_bottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoTrigonalBiPyramid_right" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcStereoTrigonalBiPyramid_Center",
        "pcStereoTrigonalBiPyramid_Above",
        "pcStereoTrigonalBiPyramid_Below",
        "pcStereoTrigonalBiPyramid_Top",
        "pcStereoTrigonalBiPyramid_Bottom",
        "pcStereoTrigonalBiPyramid_Right"
})
@XmlRootElement(name = "PC-StereoTrigonalBiPyramid")
public class PCStereoTrigonalBiPyramid {

    @XmlElement(name = "PC-StereoTrigonalBiPyramid_center", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Center;
    @XmlElement(name = "PC-StereoTrigonalBiPyramid_above", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Above;
    @XmlElement(name = "PC-StereoTrigonalBiPyramid_below", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Below;
    @XmlElement(name = "PC-StereoTrigonalBiPyramid_top", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Top;
    @XmlElement(name = "PC-StereoTrigonalBiPyramid_bottom", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Bottom;
    @XmlElement(name = "PC-StereoTrigonalBiPyramid_right", required = true)
    protected BigInteger pcStereoTrigonalBiPyramid_Right;

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Center() {
        return pcStereoTrigonalBiPyramid_Center;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Center(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Center = value;
    }

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Above���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Above() {
        return pcStereoTrigonalBiPyramid_Above;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Above���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Above(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Above = value;
    }

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Below���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Below() {
        return pcStereoTrigonalBiPyramid_Below;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Below���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Below(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Below = value;
    }

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Top���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Top() {
        return pcStereoTrigonalBiPyramid_Top;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Top���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Top(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Top = value;
    }

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Bottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Bottom() {
        return pcStereoTrigonalBiPyramid_Bottom;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Bottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Bottom(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Bottom = value;
    }

    /**
     * ��ȡpcStereoTrigonalBiPyramid_Right���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Right() {
        return pcStereoTrigonalBiPyramid_Right;
    }

    /**
     * ����pcStereoTrigonalBiPyramid_Right���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Right(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Right = value;
    }

}
