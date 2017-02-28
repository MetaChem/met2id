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
 *         &lt;element name="PC-Count_heavy-atom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_atom-chiral" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_atom-chiral-def" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_atom-chiral-undef" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_bond-chiral" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_bond-chiral-def" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_bond-chiral-undef" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_isotope-atom" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_covalent-unit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-Count_tautomers" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcCount_HeavyAtom",
        "pcCount_AtomChiral",
        "pcCount_AtomChiralDef",
        "pcCount_AtomChiralUndef",
        "pcCount_BondChiral",
        "pcCount_BondChiralDef",
        "pcCount_BondChiralUndef",
        "pcCount_IsotopeAtom",
        "pcCount_CovalentUnit",
        "pcCount_Tautomers"
})
@XmlRootElement(name = "PC-Count")
public class PCCount {

    @XmlElement(name = "PC-Count_heavy-atom", required = true)
    protected BigInteger pcCount_HeavyAtom;
    @XmlElement(name = "PC-Count_atom-chiral", required = true)
    protected BigInteger pcCount_AtomChiral;
    @XmlElement(name = "PC-Count_atom-chiral-def", required = true)
    protected BigInteger pcCount_AtomChiralDef;
    @XmlElement(name = "PC-Count_atom-chiral-undef", required = true)
    protected BigInteger pcCount_AtomChiralUndef;
    @XmlElement(name = "PC-Count_bond-chiral", required = true)
    protected BigInteger pcCount_BondChiral;
    @XmlElement(name = "PC-Count_bond-chiral-def", required = true)
    protected BigInteger pcCount_BondChiralDef;
    @XmlElement(name = "PC-Count_bond-chiral-undef", required = true)
    protected BigInteger pcCount_BondChiralUndef;
    @XmlElement(name = "PC-Count_isotope-atom", required = true)
    protected BigInteger pcCount_IsotopeAtom;
    @XmlElement(name = "PC-Count_covalent-unit", required = true)
    protected BigInteger pcCount_CovalentUnit;
    @XmlElement(name = "PC-Count_tautomers", required = true)
    protected BigInteger pcCount_Tautomers;

    /**
     * ��ȡpcCount_HeavyAtom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_HeavyAtom() {
        return pcCount_HeavyAtom;
    }

    /**
     * ����pcCount_HeavyAtom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_HeavyAtom(BigInteger value) {
        this.pcCount_HeavyAtom = value;
    }

    /**
     * ��ȡpcCount_AtomChiral���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_AtomChiral() {
        return pcCount_AtomChiral;
    }

    /**
     * ����pcCount_AtomChiral���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_AtomChiral(BigInteger value) {
        this.pcCount_AtomChiral = value;
    }

    /**
     * ��ȡpcCount_AtomChiralDef���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_AtomChiralDef() {
        return pcCount_AtomChiralDef;
    }

    /**
     * ����pcCount_AtomChiralDef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_AtomChiralDef(BigInteger value) {
        this.pcCount_AtomChiralDef = value;
    }

    /**
     * ��ȡpcCount_AtomChiralUndef���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_AtomChiralUndef() {
        return pcCount_AtomChiralUndef;
    }

    /**
     * ����pcCount_AtomChiralUndef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_AtomChiralUndef(BigInteger value) {
        this.pcCount_AtomChiralUndef = value;
    }

    /**
     * ��ȡpcCount_BondChiral���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_BondChiral() {
        return pcCount_BondChiral;
    }

    /**
     * ����pcCount_BondChiral���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_BondChiral(BigInteger value) {
        this.pcCount_BondChiral = value;
    }

    /**
     * ��ȡpcCount_BondChiralDef���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_BondChiralDef() {
        return pcCount_BondChiralDef;
    }

    /**
     * ����pcCount_BondChiralDef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_BondChiralDef(BigInteger value) {
        this.pcCount_BondChiralDef = value;
    }

    /**
     * ��ȡpcCount_BondChiralUndef���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_BondChiralUndef() {
        return pcCount_BondChiralUndef;
    }

    /**
     * ����pcCount_BondChiralUndef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_BondChiralUndef(BigInteger value) {
        this.pcCount_BondChiralUndef = value;
    }

    /**
     * ��ȡpcCount_IsotopeAtom���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_IsotopeAtom() {
        return pcCount_IsotopeAtom;
    }

    /**
     * ����pcCount_IsotopeAtom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_IsotopeAtom(BigInteger value) {
        this.pcCount_IsotopeAtom = value;
    }

    /**
     * ��ȡpcCount_CovalentUnit���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_CovalentUnit() {
        return pcCount_CovalentUnit;
    }

    /**
     * ����pcCount_CovalentUnit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_CovalentUnit(BigInteger value) {
        this.pcCount_CovalentUnit = value;
    }

    /**
     * ��ȡpcCount_Tautomers���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCCount_Tautomers() {
        return pcCount_Tautomers;
    }

    /**
     * ����pcCount_Tautomers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCCount_Tautomers(BigInteger value) {
        this.pcCount_Tautomers = value;
    }

}
