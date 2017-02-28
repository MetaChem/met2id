//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

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
 *         &lt;element name="Cit-jour_title">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cit-jour_imp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
 *                 &lt;/sequence>
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
        "citJour_Title",
        "citJour_Imp"
})
@XmlRootElement(name = "Cit-jour")
public class CitJour {

    @XmlElement(name = "Cit-jour_title", required = true)
    protected CitJour.CitJour_Title citJour_Title;
    @XmlElement(name = "Cit-jour_imp", required = true)
    protected CitJour.CitJour_Imp citJour_Imp;

    /**
     * ��ȡcitJour_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitJour.CitJour_Title }
     */
    public CitJour.CitJour_Title getCitJour_Title() {
        return citJour_Title;
    }

    /**
     * ����citJour_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitJour.CitJour_Title }
     */
    public void setCitJour_Title(CitJour.CitJour_Title value) {
        this.citJour_Title = value;
    }

    /**
     * ��ȡcitJour_Imp���Ե�ֵ��
     *
     * @return possible object is
     * {@link CitJour.CitJour_Imp }
     */
    public CitJour.CitJour_Imp getCitJour_Imp() {
        return citJour_Imp;
    }

    /**
     * ����citJour_Imp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CitJour.CitJour_Imp }
     */
    public void setCitJour_Imp(CitJour.CitJour_Imp value) {
        this.citJour_Imp = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Imprint"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "imprint"
    })
    public static class CitJour_Imp {

        @XmlElement(name = "Imprint", required = true)
        protected Imprint imprint;

        /**
         * ��ȡimprint���Ե�ֵ��
         *
         * @return possible object is
         * {@link Imprint }
         */
        public Imprint getImprint() {
            return imprint;
        }

        /**
         * ����imprint���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Imprint }
         */
        public void setImprint(Imprint value) {
            this.imprint = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}Title"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "title"
    })
    public static class CitJour_Title {

        @XmlElement(name = "Title", required = true)
        protected Title title;

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link Title }
         */
        public Title getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Title }
         */
        public void setTitle(Title value) {
            this.title = value;
        }

    }

}
