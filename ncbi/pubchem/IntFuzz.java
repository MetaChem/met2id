//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice>
 *         &lt;element name="Int-fuzz_p-m" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Int-fuzz_range">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Int-fuzz_range_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Int-fuzz_range_min" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int-fuzz_pct" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Int-fuzz_lim">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="unk"/>
 *                       &lt;enumeration value="gt"/>
 *                       &lt;enumeration value="lt"/>
 *                       &lt;enumeration value="tr"/>
 *                       &lt;enumeration value="tl"/>
 *                       &lt;enumeration value="circle"/>
 *                       &lt;enumeration value="other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int-fuzz_alt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Int-fuzz_alt_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "intFuzz_PM",
        "intFuzz_Range",
        "intFuzz_Pct",
        "intFuzz_Lim",
        "intFuzz_Alt"
})
@XmlRootElement(name = "Int-fuzz")
public class IntFuzz {

    @XmlElement(name = "Int-fuzz_p-m")
    protected BigInteger intFuzz_PM;
    @XmlElement(name = "Int-fuzz_range")
    protected IntFuzz.IntFuzz_Range intFuzz_Range;
    @XmlElement(name = "Int-fuzz_pct")
    protected BigInteger intFuzz_Pct;
    @XmlElement(name = "Int-fuzz_lim")
    protected IntFuzz.IntFuzz_Lim intFuzz_Lim;
    @XmlElement(name = "Int-fuzz_alt")
    protected IntFuzz.IntFuzz_Alt intFuzz_Alt;

    /**
     * ��ȡintFuzz_PM���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getIntFuzz_PM() {
        return intFuzz_PM;
    }

    /**
     * ����intFuzz_PM���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setIntFuzz_PM(BigInteger value) {
        this.intFuzz_PM = value;
    }

    /**
     * ��ȡintFuzz_Range���Ե�ֵ��
     *
     * @return possible object is
     * {@link IntFuzz.IntFuzz_Range }
     */
    public IntFuzz.IntFuzz_Range getIntFuzz_Range() {
        return intFuzz_Range;
    }

    /**
     * ����intFuzz_Range���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link IntFuzz.IntFuzz_Range }
     */
    public void setIntFuzz_Range(IntFuzz.IntFuzz_Range value) {
        this.intFuzz_Range = value;
    }

    /**
     * ��ȡintFuzz_Pct���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getIntFuzz_Pct() {
        return intFuzz_Pct;
    }

    /**
     * ����intFuzz_Pct���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setIntFuzz_Pct(BigInteger value) {
        this.intFuzz_Pct = value;
    }

    /**
     * ��ȡintFuzz_Lim���Ե�ֵ��
     *
     * @return possible object is
     * {@link IntFuzz.IntFuzz_Lim }
     */
    public IntFuzz.IntFuzz_Lim getIntFuzz_Lim() {
        return intFuzz_Lim;
    }

    /**
     * ����intFuzz_Lim���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link IntFuzz.IntFuzz_Lim }
     */
    public void setIntFuzz_Lim(IntFuzz.IntFuzz_Lim value) {
        this.intFuzz_Lim = value;
    }

    /**
     * ��ȡintFuzz_Alt���Ե�ֵ��
     *
     * @return possible object is
     * {@link IntFuzz.IntFuzz_Alt }
     */
    public IntFuzz.IntFuzz_Alt getIntFuzz_Alt() {
        return intFuzz_Alt;
    }

    /**
     * ����intFuzz_Alt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link IntFuzz.IntFuzz_Alt }
     */
    public void setIntFuzz_Alt(IntFuzz.IntFuzz_Alt value) {
        this.intFuzz_Alt = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Int-fuzz_alt_E" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "intFuzz_Alt_E"
    })
    public static class IntFuzz_Alt {

        @XmlElement(name = "Int-fuzz_alt_E")
        protected List<BigInteger> intFuzz_Alt_E;

        /**
         * Gets the value of the intFuzzAltE property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intFuzzAltE property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntFuzz_Alt_E().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         */
        public List<BigInteger> getIntFuzz_Alt_E() {
            if (intFuzz_Alt_E == null) {
                intFuzz_Alt_E = new ArrayList<BigInteger>();
            }
            return this.intFuzz_Alt_E;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="value" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="unk"/>
     *             &lt;enumeration value="gt"/>
     *             &lt;enumeration value="lt"/>
     *             &lt;enumeration value="tr"/>
     *             &lt;enumeration value="tl"/>
     *             &lt;enumeration value="circle"/>
     *             &lt;enumeration value="other"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IntFuzz_Lim {

        @XmlAttribute(name = "value", required = true)
        protected String value;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


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
     *         &lt;element name="Int-fuzz_range_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Int-fuzz_range_min" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "intFuzz_Range_Max",
            "intFuzz_Range_Min"
    })
    public static class IntFuzz_Range {

        @XmlElement(name = "Int-fuzz_range_max", required = true)
        protected BigInteger intFuzz_Range_Max;
        @XmlElement(name = "Int-fuzz_range_min", required = true)
        protected BigInteger intFuzz_Range_Min;

        /**
         * ��ȡintFuzz_Range_Max���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getIntFuzz_Range_Max() {
            return intFuzz_Range_Max;
        }

        /**
         * ����intFuzz_Range_Max���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setIntFuzz_Range_Max(BigInteger value) {
            this.intFuzz_Range_Max = value;
        }

        /**
         * ��ȡintFuzz_Range_Min���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getIntFuzz_Range_Min() {
            return intFuzz_Range_Min;
        }

        /**
         * ����intFuzz_Range_Min���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setIntFuzz_Range_Min(BigInteger value) {
            this.intFuzz_Range_Min = value;
        }

    }

}
