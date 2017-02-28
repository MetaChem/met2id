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
     * 获取pcStereoTrigonalBiPyramid_Center属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Center() {
        return pcStereoTrigonalBiPyramid_Center;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Center属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Center(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Center = value;
    }

    /**
     * 获取pcStereoTrigonalBiPyramid_Above属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Above() {
        return pcStereoTrigonalBiPyramid_Above;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Above属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Above(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Above = value;
    }

    /**
     * 获取pcStereoTrigonalBiPyramid_Below属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Below() {
        return pcStereoTrigonalBiPyramid_Below;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Below属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Below(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Below = value;
    }

    /**
     * 获取pcStereoTrigonalBiPyramid_Top属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Top() {
        return pcStereoTrigonalBiPyramid_Top;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Top属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Top(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Top = value;
    }

    /**
     * 获取pcStereoTrigonalBiPyramid_Bottom属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Bottom() {
        return pcStereoTrigonalBiPyramid_Bottom;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Bottom属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Bottom(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Bottom = value;
    }

    /**
     * 获取pcStereoTrigonalBiPyramid_Right属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCStereoTrigonalBiPyramid_Right() {
        return pcStereoTrigonalBiPyramid_Right;
    }

    /**
     * 设置pcStereoTrigonalBiPyramid_Right属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCStereoTrigonalBiPyramid_Right(BigInteger value) {
        this.pcStereoTrigonalBiPyramid_Right = value;
    }

}
