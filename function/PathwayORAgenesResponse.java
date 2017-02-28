
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
 *         &lt;element name="overlappingGenesNum" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overlappingGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allGenesNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "overlappingGenesNum",
        "overlappingGenes",
        "allGenesNum",
        "pGenes",
        "qGenes"
})
@XmlRootElement(name = "pathwayORAgenesResponse")
public class PathwayORAgenesResponse {

    protected List<String> pathwayName;
    protected List<String> pathwaySource;
    @XmlElement(type = Integer.class)
    protected List<Integer> overlappingGenesNum;
    protected List<String> overlappingGenes;
    protected List<String> allGenesNum;
    protected List<String> pGenes;
    protected List<String> qGenes;

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
     * Gets the value of the overlappingGenesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlappingGenesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlappingGenesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getOverlappingGenesNum() {
        if (overlappingGenesNum == null) {
            overlappingGenesNum = new ArrayList<Integer>();
        }
        return this.overlappingGenesNum;
    }

    /**
     * Gets the value of the overlappingGenes property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlappingGenes property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlappingGenes().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getOverlappingGenes() {
        if (overlappingGenes == null) {
            overlappingGenes = new ArrayList<String>();
        }
        return this.overlappingGenes;
    }

    /**
     * Gets the value of the allGenesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allGenesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllGenesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAllGenesNum() {
        if (allGenesNum == null) {
            allGenesNum = new ArrayList<String>();
        }
        return this.allGenesNum;
    }

    /**
     * Gets the value of the pGenes property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pGenes property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGenes().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPGenes() {
        if (pGenes == null) {
            pGenes = new ArrayList<String>();
        }
        return this.pGenes;
    }

    /**
     * Gets the value of the qGenes property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qGenes property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQGenes().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getQGenes() {
        if (qGenes == null) {
            qGenes = new ArrayList<String>();
        }
        return this.qGenes;
    }

}
