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
 *         &lt;element name="PC-StereoPentagonalBiPyramid_center" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_top" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_bottom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_left" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_labove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_lbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_rabove" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-StereoPentagonalBiPyramid_rbelow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcStereoPentagonalBiPyramid_Center",
        "pcStereoPentagonalBiPyramid_Top",
        "pcStereoPentagonalBiPyramid_Bottom",
        "pcStereoPentagonalBiPyramid_Left",
        "pcStereoPentagonalBiPyramid_Labove",
        "pcStereoPentagonalBiPyramid_Lbelow",
        "pcStereoPentagonalBiPyramid_Rabove",
        "pcStereoPentagonalBiPyramid_Rbelow"
})
@XmlRootElement(name = "PC-StereoPentagonalBiPyramid")
public class PCStereoPentagonalBiPyramid {

    @XmlElement(name = "PC-StereoPentagonalBiPyramid_center", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Center;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_top", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Top;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_bottom", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Bottom;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_left", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Left;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_labove", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Labove;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_lbelow", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Lbelow;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_rabove", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Rabove;
    @XmlElement(name = "PC-StereoPentagonalBiPyramid_rbelow", required = true)
    protected BigInteger pcStereoPentagonalBiPyramid_Rbelow;

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Center���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Center() {
        return pcStereoPentagonalBiPyramid_Center;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Center���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Center(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Center = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Top���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Top() {
        return pcStereoPentagonalBiPyramid_Top;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Top���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Top(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Top = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Bottom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Bottom() {
        return pcStereoPentagonalBiPyramid_Bottom;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Bottom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Bottom(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Bottom = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Left���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Left() {
        return pcStereoPentagonalBiPyramid_Left;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Left���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Left(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Left = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Labove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Labove() {
        return pcStereoPentagonalBiPyramid_Labove;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Labove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Labove(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Labove = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Lbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Lbelow() {
        return pcStereoPentagonalBiPyramid_Lbelow;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Lbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Lbelow(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Lbelow = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Rabove���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Rabove() {
        return pcStereoPentagonalBiPyramid_Rabove;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Rabove���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Rabove(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Rabove = value;
    }

    /**
     * ��ȡpcStereoPentagonalBiPyramid_Rbelow���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Rbelow() {
        return pcStereoPentagonalBiPyramid_Rbelow;
    }

    /**
     * ����pcStereoPentagonalBiPyramid_Rbelow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Rbelow(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Rbelow = value;
    }

}
