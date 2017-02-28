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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *       &lt;attribute name="value">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="a"/>
 *             &lt;enumeration value="d"/>
 *             &lt;enumeration value="r"/>
 *             &lt;enumeration value="lp"/>
 *             &lt;enumeration value="h"/>
 *             &lt;enumeration value="he"/>
 *             &lt;enumeration value="li"/>
 *             &lt;enumeration value="be"/>
 *             &lt;enumeration value="b"/>
 *             &lt;enumeration value="c"/>
 *             &lt;enumeration value="n"/>
 *             &lt;enumeration value="o"/>
 *             &lt;enumeration value="f"/>
 *             &lt;enumeration value="ne"/>
 *             &lt;enumeration value="na"/>
 *             &lt;enumeration value="mg"/>
 *             &lt;enumeration value="al"/>
 *             &lt;enumeration value="si"/>
 *             &lt;enumeration value="p"/>
 *             &lt;enumeration value="s"/>
 *             &lt;enumeration value="cl"/>
 *             &lt;enumeration value="ar"/>
 *             &lt;enumeration value="k"/>
 *             &lt;enumeration value="ca"/>
 *             &lt;enumeration value="sc"/>
 *             &lt;enumeration value="ti"/>
 *             &lt;enumeration value="v"/>
 *             &lt;enumeration value="cr"/>
 *             &lt;enumeration value="mn"/>
 *             &lt;enumeration value="fe"/>
 *             &lt;enumeration value="co"/>
 *             &lt;enumeration value="ni"/>
 *             &lt;enumeration value="cu"/>
 *             &lt;enumeration value="zn"/>
 *             &lt;enumeration value="ga"/>
 *             &lt;enumeration value="ge"/>
 *             &lt;enumeration value="as"/>
 *             &lt;enumeration value="se"/>
 *             &lt;enumeration value="br"/>
 *             &lt;enumeration value="kr"/>
 *             &lt;enumeration value="rb"/>
 *             &lt;enumeration value="sr"/>
 *             &lt;enumeration value="y"/>
 *             &lt;enumeration value="zr"/>
 *             &lt;enumeration value="nb"/>
 *             &lt;enumeration value="mo"/>
 *             &lt;enumeration value="tc"/>
 *             &lt;enumeration value="ru"/>
 *             &lt;enumeration value="rh"/>
 *             &lt;enumeration value="pd"/>
 *             &lt;enumeration value="ag"/>
 *             &lt;enumeration value="cd"/>
 *             &lt;enumeration value="in"/>
 *             &lt;enumeration value="sn"/>
 *             &lt;enumeration value="sb"/>
 *             &lt;enumeration value="te"/>
 *             &lt;enumeration value="i"/>
 *             &lt;enumeration value="xe"/>
 *             &lt;enumeration value="cs"/>
 *             &lt;enumeration value="ba"/>
 *             &lt;enumeration value="la"/>
 *             &lt;enumeration value="ce"/>
 *             &lt;enumeration value="pr"/>
 *             &lt;enumeration value="nd"/>
 *             &lt;enumeration value="pm"/>
 *             &lt;enumeration value="sm"/>
 *             &lt;enumeration value="eu"/>
 *             &lt;enumeration value="gd"/>
 *             &lt;enumeration value="tb"/>
 *             &lt;enumeration value="dy"/>
 *             &lt;enumeration value="ho"/>
 *             &lt;enumeration value="er"/>
 *             &lt;enumeration value="tm"/>
 *             &lt;enumeration value="yb"/>
 *             &lt;enumeration value="lu"/>
 *             &lt;enumeration value="hf"/>
 *             &lt;enumeration value="ta"/>
 *             &lt;enumeration value="w"/>
 *             &lt;enumeration value="re"/>
 *             &lt;enumeration value="os"/>
 *             &lt;enumeration value="ir"/>
 *             &lt;enumeration value="pt"/>
 *             &lt;enumeration value="au"/>
 *             &lt;enumeration value="hg"/>
 *             &lt;enumeration value="tl"/>
 *             &lt;enumeration value="pb"/>
 *             &lt;enumeration value="bi"/>
 *             &lt;enumeration value="po"/>
 *             &lt;enumeration value="at"/>
 *             &lt;enumeration value="rn"/>
 *             &lt;enumeration value="fr"/>
 *             &lt;enumeration value="ra"/>
 *             &lt;enumeration value="ac"/>
 *             &lt;enumeration value="th"/>
 *             &lt;enumeration value="pa"/>
 *             &lt;enumeration value="u"/>
 *             &lt;enumeration value="np"/>
 *             &lt;enumeration value="pu"/>
 *             &lt;enumeration value="am"/>
 *             &lt;enumeration value="cm"/>
 *             &lt;enumeration value="bk"/>
 *             &lt;enumeration value="cf"/>
 *             &lt;enumeration value="es"/>
 *             &lt;enumeration value="fm"/>
 *             &lt;enumeration value="md"/>
 *             &lt;enumeration value="no"/>
 *             &lt;enumeration value="lr"/>
 *             &lt;enumeration value="rf"/>
 *             &lt;enumeration value="db"/>
 *             &lt;enumeration value="sg"/>
 *             &lt;enumeration value="bh"/>
 *             &lt;enumeration value="hs"/>
 *             &lt;enumeration value="mt"/>
 *             &lt;enumeration value="ds"/>
 *             &lt;enumeration value="rg"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "PC-Element")
public class PCElement {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "value")
    protected String stringValue;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * ��ȡstringValue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * ����stringValue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

}
