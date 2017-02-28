//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取pcStereoPentagonalBiPyramid_Center属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Center() {
        return pcStereoPentagonalBiPyramid_Center;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Center属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Center(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Center = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Top属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Top() {
        return pcStereoPentagonalBiPyramid_Top;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Top属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Top(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Top = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Bottom属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Bottom() {
        return pcStereoPentagonalBiPyramid_Bottom;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Bottom属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Bottom(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Bottom = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Left属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Left() {
        return pcStereoPentagonalBiPyramid_Left;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Left属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Left(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Left = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Labove属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Labove() {
        return pcStereoPentagonalBiPyramid_Labove;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Labove属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Labove(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Labove = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Lbelow属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Lbelow() {
        return pcStereoPentagonalBiPyramid_Lbelow;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Lbelow属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Lbelow(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Lbelow = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Rabove属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Rabove() {
        return pcStereoPentagonalBiPyramid_Rabove;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Rabove属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Rabove(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Rabove = value;
    }

    /**
     * 获取pcStereoPentagonalBiPyramid_Rbelow属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoPentagonalBiPyramid_Rbelow() {
        return pcStereoPentagonalBiPyramid_Rbelow;
    }

    /**
     * 设置pcStereoPentagonalBiPyramid_Rbelow属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoPentagonalBiPyramid_Rbelow(BigInteger value) {
        this.pcStereoPentagonalBiPyramid_Rbelow = value;
    }

}
