
package function;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="pathwayName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pathwaySource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overlappingMetabolitesNum" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overlappingMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allMetabolitesNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pathwayName",
        "pathwaySource",
        "overlappingMetabolitesNum",
        "overlappingMetabolites",
        "allMetabolitesNum",
        "pMetabolites",
        "qMetabolites"
})
@XmlRootElement(name = "pathwayORAmetabolitesResponse")
public class PathwayORAmetabolitesResponse {

    protected List<String> pathwayName;
    protected List<String> pathwaySource;
    @XmlElement(type = Integer.class)
    protected List<Integer> overlappingMetabolitesNum;
    protected List<String> overlappingMetabolites;
    protected List<String> allMetabolitesNum;
    protected List<String> pMetabolites;
    protected List<String> qMetabolites;

    /**
     * Gets the value of the pathwayName property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathwayName property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathwayName().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPathwayName() {
        if (pathwayName == null) {
            pathwayName = new ArrayList<String>();
        }
        return this.pathwayName;
    }

    /**
     * Gets the value of the pathwaySource property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathwaySource property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathwaySource().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPathwaySource() {
        if (pathwaySource == null) {
            pathwaySource = new ArrayList<String>();
        }
        return this.pathwaySource;
    }

    /**
     * Gets the value of the overlappingMetabolitesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlappingMetabolitesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlappingMetabolitesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getOverlappingMetabolitesNum() {
        if (overlappingMetabolitesNum == null) {
            overlappingMetabolitesNum = new ArrayList<Integer>();
        }
        return this.overlappingMetabolitesNum;
    }

    /**
     * Gets the value of the overlappingMetabolites property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlappingMetabolites property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlappingMetabolites().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getOverlappingMetabolites() {
        if (overlappingMetabolites == null) {
            overlappingMetabolites = new ArrayList<String>();
        }
        return this.overlappingMetabolites;
    }

    /**
     * Gets the value of the allMetabolitesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allMetabolitesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllMetabolitesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAllMetabolitesNum() {
        if (allMetabolitesNum == null) {
            allMetabolitesNum = new ArrayList<String>();
        }
        return this.allMetabolitesNum;
    }

    /**
     * Gets the value of the pMetabolites property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pMetabolites property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMetabolites().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPMetabolites() {
        if (pMetabolites == null) {
            pMetabolites = new ArrayList<String>();
        }
        return this.pMetabolites;
    }

    /**
     * Gets the value of the qMetabolites property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qMetabolites property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQMetabolites().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getQMetabolites() {
        if (qMetabolites == null) {
            qMetabolites = new ArrayList<String>();
        }
        return this.qMetabolites;
    }

}
