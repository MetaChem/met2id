
package function;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="geneAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geneAccs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metaboliteAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaboliteAccs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "geneAccType",
        "geneAccs",
        "metaboliteAccType",
        "metaboliteAccs"
})
@XmlRootElement(name = "pathwayWEAjoint")
public class PathwayWEAjoint {

    protected String geneAccType;
    protected List<String> geneAccs;
    protected String metaboliteAccType;
    protected List<String> metaboliteAccs;

    /**
     * ��ȡgeneAccType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGeneAccType() {
        return geneAccType;
    }

    /**
     * ����geneAccType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGeneAccType(String value) {
        this.geneAccType = value;
    }

    /**
     * Gets the value of the geneAccs property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geneAccs property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneAccs().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getGeneAccs() {
        if (geneAccs == null) {
            geneAccs = new ArrayList<String>();
        }
        return this.geneAccs;
    }

    /**
     * ��ȡmetaboliteAccType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMetaboliteAccType() {
        return metaboliteAccType;
    }

    /**
     * ����metaboliteAccType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMetaboliteAccType(String value) {
        this.metaboliteAccType = value;
    }

    /**
     * Gets the value of the metaboliteAccs property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaboliteAccs property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaboliteAccs().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMetaboliteAccs() {
        if (metaboliteAccs == null) {
            metaboliteAccs = new ArrayList<String>();
        }
        return this.metaboliteAccs;
    }

}
