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
 *       &lt;choice>
 *         &lt;element name="PC-StereoCenter_tetrahedral">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTetrahedral"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_planar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoPlanar"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_squareplanar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoSquarePlanar"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_octahedral">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoOctahedral"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_bipyramid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTrigonalBiPyramid"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_tshape">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTShape"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PC-StereoCenter_pentagonal">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoPentagonalBiPyramid"/>
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
        "pcStereoCenter_Tetrahedral",
        "pcStereoCenter_Planar",
        "pcStereoCenter_Squareplanar",
        "pcStereoCenter_Octahedral",
        "pcStereoCenter_Bipyramid",
        "pcStereoCenter_Tshape",
        "pcStereoCenter_Pentagonal"
})
@XmlRootElement(name = "PC-StereoCenter")
public class PCStereoCenter {

    @XmlElement(name = "PC-StereoCenter_tetrahedral")
    protected PCStereoCenter.PCStereoCenter_Tetrahedral pcStereoCenter_Tetrahedral;
    @XmlElement(name = "PC-StereoCenter_planar")
    protected PCStereoCenter.PCStereoCenter_Planar pcStereoCenter_Planar;
    @XmlElement(name = "PC-StereoCenter_squareplanar")
    protected PCStereoCenter.PCStereoCenter_Squareplanar pcStereoCenter_Squareplanar;
    @XmlElement(name = "PC-StereoCenter_octahedral")
    protected PCStereoCenter.PCStereoCenter_Octahedral pcStereoCenter_Octahedral;
    @XmlElement(name = "PC-StereoCenter_bipyramid")
    protected PCStereoCenter.PCStereoCenter_Bipyramid pcStereoCenter_Bipyramid;
    @XmlElement(name = "PC-StereoCenter_tshape")
    protected PCStereoCenter.PCStereoCenter_Tshape pcStereoCenter_Tshape;
    @XmlElement(name = "PC-StereoCenter_pentagonal")
    protected PCStereoCenter.PCStereoCenter_Pentagonal pcStereoCenter_Pentagonal;

    /**
     * ��ȡpcStereoCenter_Tetrahedral���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Tetrahedral }
     */
    public PCStereoCenter.PCStereoCenter_Tetrahedral getPCStereoCenter_Tetrahedral() {
        return pcStereoCenter_Tetrahedral;
    }

    /**
     * ����pcStereoCenter_Tetrahedral���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Tetrahedral }
     */
    public void setPCStereoCenter_Tetrahedral(PCStereoCenter.PCStereoCenter_Tetrahedral value) {
        this.pcStereoCenter_Tetrahedral = value;
    }

    /**
     * ��ȡpcStereoCenter_Planar���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Planar }
     */
    public PCStereoCenter.PCStereoCenter_Planar getPCStereoCenter_Planar() {
        return pcStereoCenter_Planar;
    }

    /**
     * ����pcStereoCenter_Planar���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Planar }
     */
    public void setPCStereoCenter_Planar(PCStereoCenter.PCStereoCenter_Planar value) {
        this.pcStereoCenter_Planar = value;
    }

    /**
     * ��ȡpcStereoCenter_Squareplanar���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Squareplanar }
     */
    public PCStereoCenter.PCStereoCenter_Squareplanar getPCStereoCenter_Squareplanar() {
        return pcStereoCenter_Squareplanar;
    }

    /**
     * ����pcStereoCenter_Squareplanar���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Squareplanar }
     */
    public void setPCStereoCenter_Squareplanar(PCStereoCenter.PCStereoCenter_Squareplanar value) {
        this.pcStereoCenter_Squareplanar = value;
    }

    /**
     * ��ȡpcStereoCenter_Octahedral���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Octahedral }
     */
    public PCStereoCenter.PCStereoCenter_Octahedral getPCStereoCenter_Octahedral() {
        return pcStereoCenter_Octahedral;
    }

    /**
     * ����pcStereoCenter_Octahedral���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Octahedral }
     */
    public void setPCStereoCenter_Octahedral(PCStereoCenter.PCStereoCenter_Octahedral value) {
        this.pcStereoCenter_Octahedral = value;
    }

    /**
     * ��ȡpcStereoCenter_Bipyramid���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Bipyramid }
     */
    public PCStereoCenter.PCStereoCenter_Bipyramid getPCStereoCenter_Bipyramid() {
        return pcStereoCenter_Bipyramid;
    }

    /**
     * ����pcStereoCenter_Bipyramid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Bipyramid }
     */
    public void setPCStereoCenter_Bipyramid(PCStereoCenter.PCStereoCenter_Bipyramid value) {
        this.pcStereoCenter_Bipyramid = value;
    }

    /**
     * ��ȡpcStereoCenter_Tshape���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Tshape }
     */
    public PCStereoCenter.PCStereoCenter_Tshape getPCStereoCenter_Tshape() {
        return pcStereoCenter_Tshape;
    }

    /**
     * ����pcStereoCenter_Tshape���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Tshape }
     */
    public void setPCStereoCenter_Tshape(PCStereoCenter.PCStereoCenter_Tshape value) {
        this.pcStereoCenter_Tshape = value;
    }

    /**
     * ��ȡpcStereoCenter_Pentagonal���Ե�ֵ��
     *
     * @return possible object is
     * {@link PCStereoCenter.PCStereoCenter_Pentagonal }
     */
    public PCStereoCenter.PCStereoCenter_Pentagonal getPCStereoCenter_Pentagonal() {
        return pcStereoCenter_Pentagonal;
    }

    /**
     * ����pcStereoCenter_Pentagonal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PCStereoCenter.PCStereoCenter_Pentagonal }
     */
    public void setPCStereoCenter_Pentagonal(PCStereoCenter.PCStereoCenter_Pentagonal value) {
        this.pcStereoCenter_Pentagonal = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTrigonalBiPyramid"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoTrigonalBiPyramid"
    })
    public static class PCStereoCenter_Bipyramid {

        @XmlElement(name = "PC-StereoTrigonalBiPyramid", required = true)
        protected PCStereoTrigonalBiPyramid pcStereoTrigonalBiPyramid;

        /**
         * ��ȡpcStereoTrigonalBiPyramid���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoTrigonalBiPyramid }
         */
        public PCStereoTrigonalBiPyramid getPCStereoTrigonalBiPyramid() {
            return pcStereoTrigonalBiPyramid;
        }

        /**
         * ����pcStereoTrigonalBiPyramid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoTrigonalBiPyramid }
         */
        public void setPCStereoTrigonalBiPyramid(PCStereoTrigonalBiPyramid value) {
            this.pcStereoTrigonalBiPyramid = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoOctahedral"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoOctahedral"
    })
    public static class PCStereoCenter_Octahedral {

        @XmlElement(name = "PC-StereoOctahedral", required = true)
        protected PCStereoOctahedral pcStereoOctahedral;

        /**
         * ��ȡpcStereoOctahedral���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoOctahedral }
         */
        public PCStereoOctahedral getPCStereoOctahedral() {
            return pcStereoOctahedral;
        }

        /**
         * ����pcStereoOctahedral���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoOctahedral }
         */
        public void setPCStereoOctahedral(PCStereoOctahedral value) {
            this.pcStereoOctahedral = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoPentagonalBiPyramid"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoPentagonalBiPyramid"
    })
    public static class PCStereoCenter_Pentagonal {

        @XmlElement(name = "PC-StereoPentagonalBiPyramid", required = true)
        protected PCStereoPentagonalBiPyramid pcStereoPentagonalBiPyramid;

        /**
         * ��ȡpcStereoPentagonalBiPyramid���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoPentagonalBiPyramid }
         */
        public PCStereoPentagonalBiPyramid getPCStereoPentagonalBiPyramid() {
            return pcStereoPentagonalBiPyramid;
        }

        /**
         * ����pcStereoPentagonalBiPyramid���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoPentagonalBiPyramid }
         */
        public void setPCStereoPentagonalBiPyramid(PCStereoPentagonalBiPyramid value) {
            this.pcStereoPentagonalBiPyramid = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoPlanar"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoPlanar"
    })
    public static class PCStereoCenter_Planar {

        @XmlElement(name = "PC-StereoPlanar", required = true)
        protected PCStereoPlanar pcStereoPlanar;

        /**
         * ��ȡpcStereoPlanar���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoPlanar }
         */
        public PCStereoPlanar getPCStereoPlanar() {
            return pcStereoPlanar;
        }

        /**
         * ����pcStereoPlanar���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoPlanar }
         */
        public void setPCStereoPlanar(PCStereoPlanar value) {
            this.pcStereoPlanar = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoSquarePlanar"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoSquarePlanar"
    })
    public static class PCStereoCenter_Squareplanar {

        @XmlElement(name = "PC-StereoSquarePlanar", required = true)
        protected PCStereoSquarePlanar pcStereoSquarePlanar;

        /**
         * ��ȡpcStereoSquarePlanar���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoSquarePlanar }
         */
        public PCStereoSquarePlanar getPCStereoSquarePlanar() {
            return pcStereoSquarePlanar;
        }

        /**
         * ����pcStereoSquarePlanar���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoSquarePlanar }
         */
        public void setPCStereoSquarePlanar(PCStereoSquarePlanar value) {
            this.pcStereoSquarePlanar = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTetrahedral"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoTetrahedral"
    })
    public static class PCStereoCenter_Tetrahedral {

        @XmlElement(name = "PC-StereoTetrahedral", required = true)
        protected PCStereoTetrahedral pcStereoTetrahedral;

        /**
         * ��ȡpcStereoTetrahedral���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoTetrahedral }
         */
        public PCStereoTetrahedral getPCStereoTetrahedral() {
            return pcStereoTetrahedral;
        }

        /**
         * ����pcStereoTetrahedral���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoTetrahedral }
         */
        public void setPCStereoTetrahedral(PCStereoTetrahedral value) {
            this.pcStereoTetrahedral = value;
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
     *         &lt;element ref="{http://www.ncbi.nlm.nih.gov}PC-StereoTShape"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "pcStereoTShape"
    })
    public static class PCStereoCenter_Tshape {

        @XmlElement(name = "PC-StereoTShape", required = true)
        protected PCStereoTShape pcStereoTShape;

        /**
         * ��ȡpcStereoTShape���Ե�ֵ��
         *
         * @return possible object is
         * {@link PCStereoTShape }
         */
        public PCStereoTShape getPCStereoTShape() {
            return pcStereoTShape;
        }

        /**
         * ����pcStereoTShape���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PCStereoTShape }
         */
        public void setPCStereoTShape(PCStereoTShape value) {
            this.pcStereoTShape = value;
        }

    }

}
