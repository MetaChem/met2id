//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.17 时间 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *         &lt;element name="BinomialOrgName_genus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BinomialOrgName_species" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinomialOrgName_subspecies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "binomialOrgName_Genus",
        "binomialOrgName_Species",
        "binomialOrgName_Subspecies"
})
@XmlRootElement(name = "BinomialOrgName")
public class BinomialOrgName {

    @XmlElement(name = "BinomialOrgName_genus", required = true)
    protected String binomialOrgName_Genus;
    @XmlElement(name = "BinomialOrgName_species")
    protected String binomialOrgName_Species;
    @XmlElement(name = "BinomialOrgName_subspecies")
    protected String binomialOrgName_Subspecies;

    /**
     * 获取binomialOrgName_Genus属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Genus() {
        return binomialOrgName_Genus;
    }

    /**
     * 设置binomialOrgName_Genus属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Genus(String value) {
        this.binomialOrgName_Genus = value;
    }

    /**
     * 获取binomialOrgName_Species属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Species() {
        return binomialOrgName_Species;
    }

    /**
     * 设置binomialOrgName_Species属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Species(String value) {
        this.binomialOrgName_Species = value;
    }

    /**
     * 获取binomialOrgName_Subspecies属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBinomialOrgName_Subspecies() {
        return binomialOrgName_Subspecies;
    }

    /**
     * 设置binomialOrgName_Subspecies属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBinomialOrgName_Subspecies(String value) {
        this.binomialOrgName_Subspecies = value;
    }

}
