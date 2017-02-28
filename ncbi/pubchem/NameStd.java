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
 *         &lt;element name="Name-std_last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name-std_first" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name-std_middle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name-std_full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name-std_initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name-std_suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name-std_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nameStd_Last",
        "nameStd_First",
        "nameStd_Middle",
        "nameStd_Full",
        "nameStd_Initials",
        "nameStd_Suffix",
        "nameStd_Title"
})
@XmlRootElement(name = "Name-std")
public class NameStd {

    @XmlElement(name = "Name-std_last", required = true)
    protected String nameStd_Last;
    @XmlElement(name = "Name-std_first")
    protected String nameStd_First;
    @XmlElement(name = "Name-std_middle")
    protected String nameStd_Middle;
    @XmlElement(name = "Name-std_full")
    protected String nameStd_Full;
    @XmlElement(name = "Name-std_initials")
    protected String nameStd_Initials;
    @XmlElement(name = "Name-std_suffix")
    protected String nameStd_Suffix;
    @XmlElement(name = "Name-std_title")
    protected String nameStd_Title;

    /**
     * ��ȡnameStd_Last���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Last() {
        return nameStd_Last;
    }

    /**
     * ����nameStd_Last���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Last(String value) {
        this.nameStd_Last = value;
    }

    /**
     * ��ȡnameStd_First���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_First() {
        return nameStd_First;
    }

    /**
     * ����nameStd_First���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_First(String value) {
        this.nameStd_First = value;
    }

    /**
     * ��ȡnameStd_Middle���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Middle() {
        return nameStd_Middle;
    }

    /**
     * ����nameStd_Middle���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Middle(String value) {
        this.nameStd_Middle = value;
    }

    /**
     * ��ȡnameStd_Full���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Full() {
        return nameStd_Full;
    }

    /**
     * ����nameStd_Full���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Full(String value) {
        this.nameStd_Full = value;
    }

    /**
     * ��ȡnameStd_Initials���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Initials() {
        return nameStd_Initials;
    }

    /**
     * ����nameStd_Initials���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Initials(String value) {
        this.nameStd_Initials = value;
    }

    /**
     * ��ȡnameStd_Suffix���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Suffix() {
        return nameStd_Suffix;
    }

    /**
     * ����nameStd_Suffix���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Suffix(String value) {
        this.nameStd_Suffix = value;
    }

    /**
     * ��ȡnameStd_Title���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameStd_Title() {
        return nameStd_Title;
    }

    /**
     * ����nameStd_Title���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameStd_Title(String value) {
        this.nameStd_Title = value;
    }

}
