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
 *       &lt;sequence>
 *         &lt;element name="PC-AssayData_tid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PC-AssayData_value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PC-AssayData_value_ival" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PC-AssayData_value_fval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="PC-AssayData_value_bval">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="true"/>
 *                                 &lt;enumeration value="false"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PC-AssayData_value_sval" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pcAssayData_Tid",
        "pcAssayData_Value"
})
@XmlRootElement(name = "PC-AssayData")
public class PCAssayData {

    @XmlElement(name = "PC-AssayData_tid", required = true)
    protected BigInteger pcAssayData_Tid;
    @XmlElement(name = "PC-AssayData_value", required = true)
    protected PCAssayData.PCAssayData_Value pcAssayData_Value;

    /**
     * ��ȡpcAssayData_Tid���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPCAssayData_Tid() {
        return pcAssayData_Tid;
    }

    /**
     * ����pcAssayData_Tid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPCAssayData_Tid(BigInteger value) {
        this.pcAssayData_Tid = value;
    }

    /**
     * ��ȡpcAssayData_Value���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCAssayData.PCAssayData_Value }
     */
    public PCAssayData.PCAssayData_Value getPCAssayData_Value() {
        return pcAssayData_Value;
    }

    /**
     * ����pcAssayData_Value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCAssayData.PCAssayData_Value }
     */
    public void setPCAssayData_Value(PCAssayData.PCAssayData_Value value) {
        this.pcAssayData_Value = value;
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
     *       &lt;choice>
     *         &lt;element name="PC-AssayData_value_ival" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PC-AssayData_value_fval" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="PC-AssayData_value_bval">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="value" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="true"/>
     *                       &lt;enumeration value="false"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PC-AssayData_value_sval" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcAssayData_Value_Ival",
            "pcAssayData_Value_Fval",
            "pcAssayData_Value_Bval",
            "pcAssayData_Value_Sval"
    })
    public static class PCAssayData_Value {

        @XmlElement(name = "PC-AssayData_value_ival")
        protected BigInteger pcAssayData_Value_Ival;
        @XmlElement(name = "PC-AssayData_value_fval")
        protected Double pcAssayData_Value_Fval;
        @XmlElement(name = "PC-AssayData_value_bval")
        protected PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval pcAssayData_Value_Bval;
        @XmlElement(name = "PC-AssayData_value_sval")
        protected String pcAssayData_Value_Sval;

        /**
         * ��ȡpcAssayData_Value_Ival���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPCAssayData_Value_Ival() {
            return pcAssayData_Value_Ival;
        }

        /**
         * ����pcAssayData_Value_Ival���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPCAssayData_Value_Ival(BigInteger value) {
            this.pcAssayData_Value_Ival = value;
        }

        /**
         * ��ȡpcAssayData_Value_Fval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Double }
         */
        public Double getPCAssayData_Value_Fval() {
            return pcAssayData_Value_Fval;
        }

        /**
         * ����pcAssayData_Value_Fval���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Double }
         */
        public void setPCAssayData_Value_Fval(Double value) {
            this.pcAssayData_Value_Fval = value;
        }

        /**
         * ��ȡpcAssayData_Value_Bval���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval }
         */
        public PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval getPCAssayData_Value_Bval() {
            return pcAssayData_Value_Bval;
        }

        /**
         * ����pcAssayData_Value_Bval���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval }
         */
        public void setPCAssayData_Value_Bval(PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval value) {
            this.pcAssayData_Value_Bval = value;
        }

        /**
         * ��ȡpcAssayData_Value_Sval���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPCAssayData_Value_Sval() {
            return pcAssayData_Value_Sval;
        }

        /**
         * ����pcAssayData_Value_Sval���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPCAssayData_Value_Sval(String value) {
            this.pcAssayData_Value_Sval = value;
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
         *             &lt;enumeration value="true"/>
         *             &lt;enumeration value="false"/>
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
        public static class PCAssayData_Value_Bval {

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

    }

}
