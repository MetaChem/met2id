
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
 *         &lt;element name="measuredGenesNum" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measuredGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allGenesNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qGenes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measuredMetabolitesNum" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measuredMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allMetabolitesNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qMetabolites" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pJoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qJoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "measuredGenesNum",
        "measuredGenes",
        "allGenesNum",
        "pGenes",
        "qGenes",
        "measuredMetabolitesNum",
        "measuredMetabolites",
        "allMetabolitesNum",
        "pMetabolites",
        "qMetabolites",
        "pJoint",
        "qJoint"
})
@XmlRootElement(name = "pathwayWEAjointResponse")
public class PathwayWEAjointResponse {

    protected List<String> pathwayName;
    protected List<String> pathwaySource;
    @XmlElement(type = Integer.class)
    protected List<Integer> measuredGenesNum;
    protected List<String> measuredGenes;
    protected List<String> allGenesNum;
    protected List<String> pGenes;
    protected List<String> qGenes;
    @XmlElement(type = Integer.class)
    protected List<Integer> measuredMetabolitesNum;
    protected List<String> measuredMetabolites;
    protected List<String> allMetabolitesNum;
    protected List<String> pMetabolites;
    protected List<String> qMetabolites;
    protected List<String> pJoint;
    protected List<String> qJoint;

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
     * Gets the value of the measuredGenesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredGenesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredGenesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getMeasuredGenesNum() {
        if (measuredGenesNum == null) {
            measuredGenesNum = new ArrayList<Integer>();
        }
        return this.measuredGenesNum;
    }

    /**
     * Gets the value of the measuredGenes property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredGenes property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredGenes().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMeasuredGenes() {
        if (measuredGenes == null) {
            measuredGenes = new ArrayList<String>();
        }
        return this.measuredGenes;
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

    /**
     * Gets the value of the measuredMetabolitesNum property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredMetabolitesNum property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredMetabolitesNum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getMeasuredMetabolitesNum() {
        if (measuredMetabolitesNum == null) {
            measuredMetabolitesNum = new ArrayList<Integer>();
        }
        return this.measuredMetabolitesNum;
    }

    /**
     * Gets the value of the measuredMetabolites property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredMetabolites property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredMetabolites().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMeasuredMetabolites() {
        if (measuredMetabolites == null) {
            measuredMetabolites = new ArrayList<String>();
        }
        return this.measuredMetabolites;
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

    /**
     * Gets the value of the pJoint property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pJoint property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPJoint().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPJoint() {
        if (pJoint == null) {
            pJoint = new ArrayList<String>();
        }
        return this.pJoint;
    }

    /**
     * Gets the value of the qJoint property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qJoint property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQJoint().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getQJoint() {
        if (qJoint == null) {
            qJoint = new ArrayList<String>();
        }
        return this.qJoint;
    }

}
