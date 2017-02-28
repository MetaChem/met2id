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
 *         &lt;element name="PC-StereoOctahedral_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_top" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_bottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_labove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_lbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_rabove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoOctahedral_rbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcStereoOctahedral_Center",
        "pcStereoOctahedral_Top",
        "pcStereoOctahedral_Bottom",
        "pcStereoOctahedral_Labove",
        "pcStereoOctahedral_Lbelow",
        "pcStereoOctahedral_Rabove",
        "pcStereoOctahedral_Rbelow"
})
@XmlRootElement(name = "PC-StereoOctahedral")
public class PCStereoOctahedral {

    @XmlElement(name = "PC-StereoOctahedral_center", required = true)
    protected BigInteger pcStereoOctahedral_Center;
    @XmlElement(name = "PC-StereoOctahedral_top", required = true)
    protected BigInteger pcStereoOctahedral_Top;
    @XmlElement(name = "PC-StereoOctahedral_bottom", required = true)
    protected BigInteger pcStereoOctahedral_Bottom;
    @XmlElement(name = "PC-StereoOctahedral_labove", required = true)
    protected BigInteger pcStereoOctahedral_Labove;
    @XmlElement(name = "PC-StereoOctahedral_lbelow", required = true)
    protected BigInteger pcStereoOctahedral_Lbelow;
    @XmlElement(name = "PC-StereoOctahedral_rabove", required = true)
    protected BigInteger pcStereoOctahedral_Rabove;
    @XmlElement(name = "PC-StereoOctahedral_rbelow", required = true)
    protected BigInteger pcStereoOctahedral_Rbelow;

    /**
     * ��ȡpcStereoOctahedral_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Center() {
        return pcStereoOctahedral_Center;
    }

    /**
     * ����pcStereoOctahedral_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Center(BigInteger value) {
        this.pcStereoOctahedral_Center = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Top���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Top() {
        return pcStereoOctahedral_Top;
    }

    /**
     * ����pcStereoOctahedral_Top���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Top(BigInteger value) {
        this.pcStereoOctahedral_Top = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Bottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Bottom() {
        return pcStereoOctahedral_Bottom;
    }

    /**
     * ����pcStereoOctahedral_Bottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Bottom(BigInteger value) {
        this.pcStereoOctahedral_Bottom = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Labove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Labove() {
        return pcStereoOctahedral_Labove;
    }

    /**
     * ����pcStereoOctahedral_Labove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Labove(BigInteger value) {
        this.pcStereoOctahedral_Labove = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Lbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Lbelow() {
        return pcStereoOctahedral_Lbelow;
    }

    /**
     * ����pcStereoOctahedral_Lbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Lbelow(BigInteger value) {
        this.pcStereoOctahedral_Lbelow = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Rabove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Rabove() {
        return pcStereoOctahedral_Rabove;
    }

    /**
     * ����pcStereoOctahedral_Rabove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Rabove(BigInteger value) {
        this.pcStereoOctahedral_Rabove = value;
    }

    /**
     * ��ȡpcStereoOctahedral_Rbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoOctahedral_Rbelow() {
        return pcStereoOctahedral_Rbelow;
    }

    /**
     * ����pcStereoOctahedral_Rbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoOctahedral_Rbelow(BigInteger value) {
        this.pcStereoOctahedral_Rbelow = value;
    }

}
