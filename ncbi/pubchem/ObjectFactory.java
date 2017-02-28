//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.17 ʱ�� 10:14:38 AM CST 
//


package ncbi.pubchem;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the ncbi.pubchem package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DOI_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "DOI");
    private final static QName _PmcID_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "PmcID");
    private final static QName _PubMedId_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
    private final static QName _PmcPid_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "PmcPid");
    private final static QName _PmPid_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "PmPid");
    private final static QName _MedlineUID_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "MedlineUID");
    private final static QName _PII_QNAME = new QName("http://www.ncbi.nlm.nih.gov", "PII");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ncbi.pubchem
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MedlineEntry }
     */
    public MedlineEntry createMedlineEntry() {
        return new MedlineEntry();
    }

    /**
     * Create an instance of {@link DocRef }
     */
    public DocRef createDocRef() {
        return new DocRef();
    }

    /**
     * Create an instance of {@link OrgName }
     */
    public OrgName createOrgName() {
        return new OrgName();
    }

    /**
     * Create an instance of {@link PCInfoData }
     */
    public PCInfoData createPCInfoData() {
        return new PCInfoData();
    }

    /**
     * Create an instance of {@link ArticleId }
     */
    public ArticleId createArticleId() {
        return new ArticleId();
    }

    /**
     * Create an instance of {@link MedlineRn }
     */
    public MedlineRn createMedlineRn() {
        return new MedlineRn();
    }

    /**
     * Create an instance of {@link CitArt }
     */
    public CitArt createCitArt() {
        return new CitArt();
    }

    /**
     * Create an instance of {@link PCAssayTargetInfo }
     */
    public PCAssayTargetInfo createPCAssayTargetInfo() {
        return new PCAssayTargetInfo();
    }

    /**
     * Create an instance of {@link PCAssayDRAttr }
     */
    public PCAssayDRAttr createPCAssayDRAttr() {
        return new PCAssayDRAttr();
    }

    /**
     * Create an instance of {@link PCDBTracking }
     */
    public PCDBTracking createPCDBTracking() {
        return new PCDBTracking();
    }

    /**
     * Create an instance of {@link IntFuzz }
     */
    public IntFuzz createIntFuzz() {
        return new IntFuzz();
    }

    /**
     * Create an instance of {@link PCStereoCenter }
     */
    public PCStereoCenter createPCStereoCenter() {
        return new PCStereoCenter();
    }

    /**
     * Create an instance of {@link MedlineSi }
     */
    public MedlineSi createMedlineSi() {
        return new MedlineSi();
    }

    /**
     * Create an instance of {@link PCCategorizedComment }
     */
    public PCCategorizedComment createPCCategorizedComment() {
        return new PCCategorizedComment();
    }

    /**
     * Create an instance of {@link PersonId }
     */
    public PersonId createPersonId() {
        return new PersonId();
    }

    /**
     * Create an instance of {@link IdPat }
     */
    public IdPat createIdPat() {
        return new IdPat();
    }

    /**
     * Create an instance of {@link Author }
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link PubStatusDate }
     */
    public PubStatusDate createPubStatusDate() {
        return new PubStatusDate();
    }

    /**
     * Create an instance of {@link PCUrn }
     */
    public PCUrn createPCUrn() {
        return new PCUrn();
    }

    /**
     * Create an instance of {@link PCAssayPanel }
     */
    public PCAssayPanel createPCAssayPanel() {
        return new PCAssayPanel();
    }

    /**
     * Create an instance of {@link AuthList }
     */
    public AuthList createAuthList() {
        return new AuthList();
    }

    /**
     * Create an instance of {@link Meeting }
     */
    public Meeting createMeeting() {
        return new Meeting();
    }

    /**
     * Create an instance of {@link CitSub }
     */
    public CitSub createCitSub() {
        return new CitSub();
    }

    /**
     * Create an instance of {@link PCDrawAnnotations }
     */
    public PCDrawAnnotations createPCDrawAnnotations() {
        return new PCDrawAnnotations();
    }

    /**
     * Create an instance of {@link PCResultType }
     */
    public PCResultType createPCResultType() {
        return new PCResultType();
    }

    /**
     * Create an instance of {@link PCStereoSquarePlanar }
     */
    public PCStereoSquarePlanar createPCStereoSquarePlanar() {
        return new PCStereoSquarePlanar();
    }

    /**
     * Create an instance of {@link CitGen }
     */
    public CitGen createCitGen() {
        return new CitGen();
    }

    /**
     * Create an instance of {@link PCAnnotatedXRef }
     */
    public PCAnnotatedXRef createPCAnnotatedXRef() {
        return new PCAnnotatedXRef();
    }

    /**
     * Create an instance of {@link OrgRef }
     */
    public OrgRef createOrgRef() {
        return new OrgRef();
    }

    /**
     * Create an instance of {@link PCAssaySubmit }
     */
    public PCAssaySubmit createPCAssaySubmit() {
        return new PCAssaySubmit();
    }

    /**
     * Create an instance of {@link TaxElement }
     */
    public TaxElement createTaxElement() {
        return new TaxElement();
    }

    /**
     * Create an instance of {@link CitBook }
     */
    public CitBook createCitBook() {
        return new CitBook();
    }

    /**
     * Create an instance of {@link PatentPriority }
     */
    public PatentPriority createPatentPriority() {
        return new PatentPriority();
    }

    /**
     * Create an instance of {@link PubSet }
     */
    public PubSet createPubSet() {
        return new PubSet();
    }

    /**
     * Create an instance of {@link Affil }
     */
    public Affil createAffil() {
        return new Affil();
    }

    /**
     * Create an instance of {@link SubSource }
     */
    public SubSource createSubSource() {
        return new SubSource();
    }

    /**
     * Create an instance of {@link PCConcentrationAttr }
     */
    public PCConcentrationAttr createPCConcentrationAttr() {
        return new PCConcentrationAttr();
    }

    /**
     * Create an instance of {@link CitRetract }
     */
    public CitRetract createCitRetract() {
        return new CitRetract();
    }

    /**
     * Create an instance of {@link PCConformer }
     */
    public PCConformer createPCConformer() {
        return new PCConformer();
    }

    /**
     * Create an instance of {@link PCStereoPlanar }
     */
    public PCStereoPlanar createPCStereoPlanar() {
        return new PCStereoPlanar();
    }

    /**
     * Create an instance of {@link MedlineMesh }
     */
    public MedlineMesh createMedlineMesh() {
        return new MedlineMesh();
    }

    /**
     * Create an instance of {@link PCAtomRadical }
     */
    public PCAtomRadical createPCAtomRadical() {
        return new PCAtomRadical();
    }

    /**
     * Create an instance of {@link PCMMDBSource }
     */
    public PCMMDBSource createPCMMDBSource() {
        return new PCMMDBSource();
    }

    /**
     * Create an instance of {@link PCStereoGroup }
     */
    public PCStereoGroup createPCStereoGroup() {
        return new PCStereoGroup();
    }

    /**
     * Create an instance of {@link PCAssayResults }
     */
    public PCAssayResults createPCAssayResults() {
        return new PCAssayResults();
    }

    /**
     * Create an instance of {@link UserField }
     */
    public UserField createUserField() {
        return new UserField();
    }

    /**
     * Create an instance of {@link CitJour }
     */
    public CitJour createCitJour() {
        return new CitJour();
    }

    /**
     * Create an instance of {@link CitLet }
     */
    public CitLet createCitLet() {
        return new CitLet();
    }

    /**
     * Create an instance of {@link MedlineField }
     */
    public MedlineField createMedlineField() {
        return new MedlineField();
    }

    /**
     * Create an instance of {@link PCSubstance }
     */
    public PCSubstance createPCSubstance() {
        return new PCSubstance();
    }

    /**
     * Create an instance of {@link PCBonds }
     */
    public PCBonds createPCBonds() {
        return new PCBonds();
    }

    /**
     * Create an instance of {@link Pub }
     */
    public Pub createPub() {
        return new Pub();
    }

    /**
     * Create an instance of {@link PCCompound }
     */
    public PCCompound createPCCompound() {
        return new PCCompound();
    }

    /**
     * Create an instance of {@link PCAssayDescription }
     */
    public PCAssayDescription createPCAssayDescription() {
        return new PCAssayDescription();
    }

    /**
     * Create an instance of {@link PCAssayData }
     */
    public PCAssayData createPCAssayData() {
        return new PCAssayData();
    }

    /**
     * Create an instance of {@link UserObject }
     */
    public UserObject createUserObject() {
        return new UserObject();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember }
     */
    public PCAssayPanelMember createPCAssayPanelMember() {
        return new PCAssayPanelMember();
    }

    /**
     * Create an instance of {@link Dbtag }
     */
    public Dbtag createDbtag() {
        return new Dbtag();
    }

    /**
     * Create an instance of {@link PCCoordinates }
     */
    public PCCoordinates createPCCoordinates() {
        return new PCCoordinates();
    }

    /**
     * Create an instance of {@link MedlineQual }
     */
    public MedlineQual createMedlineQual() {
        return new MedlineQual();
    }

    /**
     * Create an instance of {@link OrgMod }
     */
    public OrgMod createOrgMod() {
        return new OrgMod();
    }

    /**
     * Create an instance of {@link CitPat }
     */
    public CitPat createCitPat() {
        return new CitPat();
    }

    /**
     * Create an instance of {@link CitProc }
     */
    public CitProc createCitProc() {
        return new CitProc();
    }

    /**
     * Create an instance of {@link Title }
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link BioSource }
     */
    public BioSource createBioSource() {
        return new BioSource();
    }

    /**
     * Create an instance of {@link PCSource }
     */
    public PCSource createPCSource() {
        return new PCSource();
    }

    /**
     * Create an instance of {@link PCAtomSource }
     */
    public PCAtomSource createPCAtomSource() {
        return new PCAtomSource();
    }

    /**
     * Create an instance of {@link Date }
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link PCAssayPanelTestResult }
     */
    public PCAssayPanelTestResult createPCAssayPanelTestResult() {
        return new PCAssayPanelTestResult();
    }

    /**
     * Create an instance of {@link Imprint }
     */
    public Imprint createImprint() {
        return new Imprint();
    }

    /**
     * Create an instance of {@link PCStereoTetrahedral }
     */
    public PCStereoTetrahedral createPCStereoTetrahedral() {
        return new PCStereoTetrahedral();
    }

    /**
     * Create an instance of {@link PCAtoms }
     */
    public PCAtoms createPCAtoms() {
        return new PCAtoms();
    }

    /**
     * Create an instance of {@link PCAssayData.PCAssayData_Value }
     */
    public PCAssayData.PCAssayData_Value createPCAssayDataPCAssayData_Value() {
        return new PCAssayData.PCAssayData_Value();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data }
     */
    public UserField.UserField_Data createUserFieldUserField_Data() {
        return new UserField.UserField_Data();
    }

    /**
     * Create an instance of {@link PCCompoundTypeClass }
     */
    public PCCompoundTypeClass createPCCompoundTypeClass() {
        return new PCCompoundTypeClass();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Assay }
     */
    public PCAssaySubmit.PCAssaySubmit_Assay createPCAssaySubmitPCAssaySubmit_Assay() {
        return new PCAssaySubmit.PCAssaySubmit_Assay();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints }
     */
    public PCResultType.PCResultType_Constraints createPCResultTypePCResultType_Constraints() {
        return new PCResultType.PCResultType_Constraints();
    }

    /**
     * Create an instance of {@link AuthList.AuthList_Names }
     */
    public AuthList.AuthList_Names createAuthListAuthList_Names() {
        return new AuthList.AuthList_Names();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_From }
     */
    public CitArt.CitArt_From createCitArtCitArt_From() {
        return new CitArt.CitArt_From();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value }
     */
    public PCInfoData.PCInfoData_Value createPCInfoDataPCInfoData_Value() {
        return new PCInfoData.PCInfoData_Value();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec createPCInfoDataPCInfoData_ValuePCInfoData_Value_Bvec() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Name }
     */
    public OrgName.OrgName_Name createOrgNameOrgName_Name() {
        return new OrgName.OrgName_Name();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Em }
     */
    public MedlineEntry.MedlineEntry_Em createMedlineEntryMedlineEntry_Em() {
        return new MedlineEntry.MedlineEntry_Em();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Cit }
     */
    public MedlineEntry.MedlineEntry_Cit createMedlineEntryMedlineEntry_Cit() {
        return new MedlineEntry.MedlineEntry_Cit();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Mesh }
     */
    public MedlineEntry.MedlineEntry_Mesh createMedlineEntryMedlineEntry_Mesh() {
        return new MedlineEntry.MedlineEntry_Mesh();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Substance }
     */
    public MedlineEntry.MedlineEntry_Substance createMedlineEntryMedlineEntry_Substance() {
        return new MedlineEntry.MedlineEntry_Substance();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Xref }
     */
    public MedlineEntry.MedlineEntry_Xref createMedlineEntryMedlineEntry_Xref() {
        return new MedlineEntry.MedlineEntry_Xref();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Idnum }
     */
    public MedlineEntry.MedlineEntry_Idnum createMedlineEntryMedlineEntry_Idnum() {
        return new MedlineEntry.MedlineEntry_Idnum();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Gene }
     */
    public MedlineEntry.MedlineEntry_Gene createMedlineEntryMedlineEntry_Gene() {
        return new MedlineEntry.MedlineEntry_Gene();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Pmid }
     */
    public MedlineEntry.MedlineEntry_Pmid createMedlineEntryMedlineEntry_Pmid() {
        return new MedlineEntry.MedlineEntry_Pmid();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_PubType }
     */
    public MedlineEntry.MedlineEntry_PubType createMedlineEntryMedlineEntry_PubType() {
        return new MedlineEntry.MedlineEntry_PubType();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Mlfield }
     */
    public MedlineEntry.MedlineEntry_Mlfield createMedlineEntryMedlineEntry_Mlfield() {
        return new MedlineEntry.MedlineEntry_Mlfield();
    }

    /**
     * Create an instance of {@link MedlineEntry.MedlineEntry_Status }
     */
    public MedlineEntry.MedlineEntry_Status createMedlineEntryMedlineEntry_Status() {
        return new MedlineEntry.MedlineEntry_Status();
    }

    /**
     * Create an instance of {@link DateStd }
     */
    public DateStd createDateStd() {
        return new DateStd();
    }

    /**
     * Create an instance of {@link DocRef.DocRef_Type }
     */
    public DocRef.DocRef_Type createDocRefDocRef_Type() {
        return new DocRef.DocRef_Type();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Mod }
     */
    public OrgName.OrgName_Mod createOrgNameOrgName_Mod() {
        return new OrgName.OrgName_Mod();
    }

    /**
     * Create an instance of {@link PCXRefData }
     */
    public PCXRefData createPCXRefData() {
        return new PCXRefData();
    }

    /**
     * Create an instance of {@link PCBondAnnotation }
     */
    public PCBondAnnotation createPCBondAnnotation() {
        return new PCBondAnnotation();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Urn }
     */
    public PCInfoData.PCInfoData_Urn createPCInfoDataPCInfoData_Urn() {
        return new PCInfoData.PCInfoData_Urn();
    }

    /**
     * Create an instance of {@link ArticleIdSet }
     */
    public ArticleIdSet createArticleIdSet() {
        return new ArticleIdSet();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Pubmed }
     */
    public ArticleId.ArticleId_Pubmed createArticleIdArticleId_Pubmed() {
        return new ArticleId.ArticleId_Pubmed();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Medline }
     */
    public ArticleId.ArticleId_Medline createArticleIdArticleId_Medline() {
        return new ArticleId.ArticleId_Medline();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Doi }
     */
    public ArticleId.ArticleId_Doi createArticleIdArticleId_Doi() {
        return new ArticleId.ArticleId_Doi();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Pii }
     */
    public ArticleId.ArticleId_Pii createArticleIdArticleId_Pii() {
        return new ArticleId.ArticleId_Pii();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Pmcid }
     */
    public ArticleId.ArticleId_Pmcid createArticleIdArticleId_Pmcid() {
        return new ArticleId.ArticleId_Pmcid();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Pmcpid }
     */
    public ArticleId.ArticleId_Pmcpid createArticleIdArticleId_Pmcpid() {
        return new ArticleId.ArticleId_Pmcpid();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Pmpid }
     */
    public ArticleId.ArticleId_Pmpid createArticleIdArticleId_Pmpid() {
        return new ArticleId.ArticleId_Pmpid();
    }

    /**
     * Create an instance of {@link ArticleId.ArticleId_Other }
     */
    public ArticleId.ArticleId_Other createArticleIdArticleId_Other() {
        return new ArticleId.ArticleId_Other();
    }

    /**
     * Create an instance of {@link MedlineRn.MedlineRn_Type }
     */
    public MedlineRn.MedlineRn_Type createMedlineRnMedlineRn_Type() {
        return new MedlineRn.MedlineRn_Type();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_Title }
     */
    public CitArt.CitArt_Title createCitArtCitArt_Title() {
        return new CitArt.CitArt_Title();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_Authors }
     */
    public CitArt.CitArt_Authors createCitArtCitArt_Authors() {
        return new CitArt.CitArt_Authors();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_Ids }
     */
    public CitArt.CitArt_Ids createCitArtCitArt_Ids() {
        return new CitArt.CitArt_Ids();
    }

    /**
     * Create an instance of {@link PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType createPCAssayTargetInfoPCAssayTargetInfo_MoleculeType() {
        return new PCAssayTargetInfo.PCAssayTargetInfo_MoleculeType();
    }

    /**
     * Create an instance of {@link PCAssayTargetInfo.PCAssayTargetInfo_Organism }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_Organism createPCAssayTargetInfoPCAssayTargetInfo_Organism() {
        return new PCAssayTargetInfo.PCAssayTargetInfo_Organism();
    }

    /**
     * Create an instance of {@link PCAssayTargetInfo.PCAssayTargetInfo_Comment }
     */
    public PCAssayTargetInfo.PCAssayTargetInfo_Comment createPCAssayTargetInfoPCAssayTargetInfo_Comment() {
        return new PCAssayTargetInfo.PCAssayTargetInfo_Comment();
    }

    /**
     * Create an instance of {@link PCAssayDRAttr.PCAssayDRAttr_Type }
     */
    public PCAssayDRAttr.PCAssayDRAttr_Type createPCAssayDRAttrPCAssayDRAttr_Type() {
        return new PCAssayDRAttr.PCAssayDRAttr_Type();
    }

    /**
     * Create an instance of {@link PCDBTracking.PCDBTracking_SourceId }
     */
    public PCDBTracking.PCDBTracking_SourceId createPCDBTrackingPCDBTracking_SourceId() {
        return new PCDBTracking.PCDBTracking_SourceId();
    }

    /**
     * Create an instance of {@link PCDBTracking.PCDBTracking_Date }
     */
    public PCDBTracking.PCDBTracking_Date createPCDBTrackingPCDBTracking_Date() {
        return new PCDBTracking.PCDBTracking_Date();
    }

    /**
     * Create an instance of {@link PCDBTracking.PCDBTracking_Pub }
     */
    public PCDBTracking.PCDBTracking_Pub createPCDBTrackingPCDBTracking_Pub() {
        return new PCDBTracking.PCDBTracking_Pub();
    }

    /**
     * Create an instance of {@link IntFuzz.IntFuzz_Range }
     */
    public IntFuzz.IntFuzz_Range createIntFuzzIntFuzz_Range() {
        return new IntFuzz.IntFuzz_Range();
    }

    /**
     * Create an instance of {@link IntFuzz.IntFuzz_Lim }
     */
    public IntFuzz.IntFuzz_Lim createIntFuzzIntFuzz_Lim() {
        return new IntFuzz.IntFuzz_Lim();
    }

    /**
     * Create an instance of {@link IntFuzz.IntFuzz_Alt }
     */
    public IntFuzz.IntFuzz_Alt createIntFuzzIntFuzz_Alt() {
        return new IntFuzz.IntFuzz_Alt();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Tetrahedral }
     */
    public PCStereoCenter.PCStereoCenter_Tetrahedral createPCStereoCenterPCStereoCenter_Tetrahedral() {
        return new PCStereoCenter.PCStereoCenter_Tetrahedral();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Planar }
     */
    public PCStereoCenter.PCStereoCenter_Planar createPCStereoCenterPCStereoCenter_Planar() {
        return new PCStereoCenter.PCStereoCenter_Planar();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Squareplanar }
     */
    public PCStereoCenter.PCStereoCenter_Squareplanar createPCStereoCenterPCStereoCenter_Squareplanar() {
        return new PCStereoCenter.PCStereoCenter_Squareplanar();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Octahedral }
     */
    public PCStereoCenter.PCStereoCenter_Octahedral createPCStereoCenterPCStereoCenter_Octahedral() {
        return new PCStereoCenter.PCStereoCenter_Octahedral();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Bipyramid }
     */
    public PCStereoCenter.PCStereoCenter_Bipyramid createPCStereoCenterPCStereoCenter_Bipyramid() {
        return new PCStereoCenter.PCStereoCenter_Bipyramid();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Tshape }
     */
    public PCStereoCenter.PCStereoCenter_Tshape createPCStereoCenterPCStereoCenter_Tshape() {
        return new PCStereoCenter.PCStereoCenter_Tshape();
    }

    /**
     * Create an instance of {@link PCStereoCenter.PCStereoCenter_Pentagonal }
     */
    public PCStereoCenter.PCStereoCenter_Pentagonal createPCStereoCenterPCStereoCenter_Pentagonal() {
        return new PCStereoCenter.PCStereoCenter_Pentagonal();
    }

    /**
     * Create an instance of {@link MedlineSi.MedlineSi_Type }
     */
    public MedlineSi.MedlineSi_Type createMedlineSiMedlineSi_Type() {
        return new MedlineSi.MedlineSi_Type();
    }

    /**
     * Create an instance of {@link PCCategorizedComment.PCCategorizedComment_Comment }
     */
    public PCCategorizedComment.PCCategorizedComment_Comment createPCCategorizedCommentPCCategorizedComment_Comment() {
        return new PCCategorizedComment.PCCategorizedComment_Comment();
    }

    /**
     * Create an instance of {@link PersonId.PersonId_Dbtag }
     */
    public PersonId.PersonId_Dbtag createPersonIdPersonId_Dbtag() {
        return new PersonId.PersonId_Dbtag();
    }

    /**
     * Create an instance of {@link PersonId.PersonId_Name }
     */
    public PersonId.PersonId_Name createPersonIdPersonId_Name() {
        return new PersonId.PersonId_Name();
    }

    /**
     * Create an instance of {@link IdPat.IdPat_Id }
     */
    public IdPat.IdPat_Id createIdPatIdPat_Id() {
        return new IdPat.IdPat_Id();
    }

    /**
     * Create an instance of {@link Author.Author_Name }
     */
    public Author.Author_Name createAuthorAuthor_Name() {
        return new Author.Author_Name();
    }

    /**
     * Create an instance of {@link Author.Author_Level }
     */
    public Author.Author_Level createAuthorAuthor_Level() {
        return new Author.Author_Level();
    }

    /**
     * Create an instance of {@link Author.Author_Role }
     */
    public Author.Author_Role createAuthorAuthor_Role() {
        return new Author.Author_Role();
    }

    /**
     * Create an instance of {@link Author.Author_Affil }
     */
    public Author.Author_Affil createAuthorAuthor_Affil() {
        return new Author.Author_Affil();
    }

    /**
     * Create an instance of {@link Author.Author_IsCorr }
     */
    public Author.Author_IsCorr createAuthorAuthor_IsCorr() {
        return new Author.Author_IsCorr();
    }

    /**
     * Create an instance of {@link PubStatusDate.PubStatusDate_Pubstatus }
     */
    public PubStatusDate.PubStatusDate_Pubstatus createPubStatusDatePubStatusDate_Pubstatus() {
        return new PubStatusDate.PubStatusDate_Pubstatus();
    }

    /**
     * Create an instance of {@link PubStatusDate.PubStatusDate_Date }
     */
    public PubStatusDate.PubStatusDate_Date createPubStatusDatePubStatusDate_Date() {
        return new PubStatusDate.PubStatusDate_Date();
    }

    /**
     * Create an instance of {@link PCUrn.PCUrn_Datatype }
     */
    public PCUrn.PCUrn_Datatype createPCUrnPCUrn_Datatype() {
        return new PCUrn.PCUrn_Datatype();
    }

    /**
     * Create an instance of {@link PCAssayPanel.PCAssayPanel_Member }
     */
    public PCAssayPanel.PCAssayPanel_Member createPCAssayPanelPCAssayPanel_Member() {
        return new PCAssayPanel.PCAssayPanel_Member();
    }

    /**
     * Create an instance of {@link AuthList.AuthList_Affil }
     */
    public AuthList.AuthList_Affil createAuthListAuthList_Affil() {
        return new AuthList.AuthList_Affil();
    }

    /**
     * Create an instance of {@link Meeting.Meeting_Date }
     */
    public Meeting.Meeting_Date createMeetingMeeting_Date() {
        return new Meeting.Meeting_Date();
    }

    /**
     * Create an instance of {@link Meeting.Meeting_Place }
     */
    public Meeting.Meeting_Place createMeetingMeeting_Place() {
        return new Meeting.Meeting_Place();
    }

    /**
     * Create an instance of {@link CitSub.CitSub_Authors }
     */
    public CitSub.CitSub_Authors createCitSubCitSub_Authors() {
        return new CitSub.CitSub_Authors();
    }

    /**
     * Create an instance of {@link CitSub.CitSub_Imp }
     */
    public CitSub.CitSub_Imp createCitSubCitSub_Imp() {
        return new CitSub.CitSub_Imp();
    }

    /**
     * Create an instance of {@link CitSub.CitSub_Medium }
     */
    public CitSub.CitSub_Medium createCitSubCitSub_Medium() {
        return new CitSub.CitSub_Medium();
    }

    /**
     * Create an instance of {@link CitSub.CitSub_Date }
     */
    public CitSub.CitSub_Date createCitSubCitSub_Date() {
        return new CitSub.CitSub_Date();
    }

    /**
     * Create an instance of {@link PCDrawAnnotations.PCDrawAnnotations_Annotation }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Annotation createPCDrawAnnotationsPCDrawAnnotations_Annotation() {
        return new PCDrawAnnotations.PCDrawAnnotations_Annotation();
    }

    /**
     * Create an instance of {@link PCDrawAnnotations.PCDrawAnnotations_Aid1 }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Aid1 createPCDrawAnnotationsPCDrawAnnotations_Aid1() {
        return new PCDrawAnnotations.PCDrawAnnotations_Aid1();
    }

    /**
     * Create an instance of {@link PCDrawAnnotations.PCDrawAnnotations_Aid2 }
     */
    public PCDrawAnnotations.PCDrawAnnotations_Aid2 createPCDrawAnnotationsPCDrawAnnotations_Aid2() {
        return new PCDrawAnnotations.PCDrawAnnotations_Aid2();
    }

    /**
     * Create an instance of {@link PCStereoTShape }
     */
    public PCStereoTShape createPCStereoTShape() {
        return new PCStereoTShape();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Description }
     */
    public PCResultType.PCResultType_Description createPCResultTypePCResultType_Description() {
        return new PCResultType.PCResultType_Description();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Type }
     */
    public PCResultType.PCResultType_Type createPCResultTypePCResultType_Type() {
        return new PCResultType.PCResultType_Type();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Unit }
     */
    public PCResultType.PCResultType_Unit createPCResultTypePCResultType_Unit() {
        return new PCResultType.PCResultType_Unit();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Transform }
     */
    public PCResultType.PCResultType_Transform createPCResultTypePCResultType_Transform() {
        return new PCResultType.PCResultType_Transform();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Tc }
     */
    public PCResultType.PCResultType_Tc createPCResultTypePCResultType_Tc() {
        return new PCResultType.PCResultType_Tc();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Ac }
     */
    public PCResultType.PCResultType_Ac createPCResultTypePCResultType_Ac() {
        return new PCResultType.PCResultType_Ac();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_PanelInfo }
     */
    public PCResultType.PCResultType_PanelInfo createPCResultTypePCResultType_PanelInfo() {
        return new PCResultType.PCResultType_PanelInfo();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Annot }
     */
    public PCResultType.PCResultType_Annot createPCResultTypePCResultType_Annot() {
        return new PCResultType.PCResultType_Annot();
    }

    /**
     * Create an instance of {@link PCStereoSquarePlanar.PCStereoSquarePlanar_Parity }
     */
    public PCStereoSquarePlanar.PCStereoSquarePlanar_Parity createPCStereoSquarePlanarPCStereoSquarePlanar_Parity() {
        return new PCStereoSquarePlanar.PCStereoSquarePlanar_Parity();
    }

    /**
     * Create an instance of {@link CitGen.CitGen_Authors }
     */
    public CitGen.CitGen_Authors createCitGenCitGen_Authors() {
        return new CitGen.CitGen_Authors();
    }

    /**
     * Create an instance of {@link CitGen.CitGen_Journal }
     */
    public CitGen.CitGen_Journal createCitGenCitGen_Journal() {
        return new CitGen.CitGen_Journal();
    }

    /**
     * Create an instance of {@link CitGen.CitGen_Date }
     */
    public CitGen.CitGen_Date createCitGenCitGen_Date() {
        return new CitGen.CitGen_Date();
    }

    /**
     * Create an instance of {@link CitGen.CitGen_Pmid }
     */
    public CitGen.CitGen_Pmid createCitGenCitGen_Pmid() {
        return new CitGen.CitGen_Pmid();
    }

    /**
     * Create an instance of {@link PCAnnotatedXRef.PCAnnotatedXRef_Xref }
     */
    public PCAnnotatedXRef.PCAnnotatedXRef_Xref createPCAnnotatedXRefPCAnnotatedXRef_Xref() {
        return new PCAnnotatedXRef.PCAnnotatedXRef_Xref();
    }

    /**
     * Create an instance of {@link PCAnnotatedXRef.PCAnnotatedXRef_Type }
     */
    public PCAnnotatedXRef.PCAnnotatedXRef_Type createPCAnnotatedXRefPCAnnotatedXRef_Type() {
        return new PCAnnotatedXRef.PCAnnotatedXRef_Type();
    }

    /**
     * Create an instance of {@link OrgRef.OrgRef_Mod }
     */
    public OrgRef.OrgRef_Mod createOrgRefOrgRef_Mod() {
        return new OrgRef.OrgRef_Mod();
    }

    /**
     * Create an instance of {@link OrgRef.OrgRef_Db }
     */
    public OrgRef.OrgRef_Db createOrgRefOrgRef_Db() {
        return new OrgRef.OrgRef_Db();
    }

    /**
     * Create an instance of {@link OrgRef.OrgRef_Syn }
     */
    public OrgRef.OrgRef_Syn createOrgRefOrgRef_Syn() {
        return new OrgRef.OrgRef_Syn();
    }

    /**
     * Create an instance of {@link OrgRef.OrgRef_Orgname }
     */
    public OrgRef.OrgRef_Orgname createOrgRefOrgRef_Orgname() {
        return new OrgRef.OrgRef_Orgname();
    }

    /**
     * Create an instance of {@link PCAssayContainer }
     */
    public PCAssayContainer createPCAssayContainer() {
        return new PCAssayContainer();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Data }
     */
    public PCAssaySubmit.PCAssaySubmit_Data createPCAssaySubmitPCAssaySubmit_Data() {
        return new PCAssaySubmit.PCAssaySubmit_Data();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Revoke }
     */
    public PCAssaySubmit.PCAssaySubmit_Revoke createPCAssaySubmitPCAssaySubmit_Revoke() {
        return new PCAssaySubmit.PCAssaySubmit_Revoke();
    }

    /**
     * Create an instance of {@link TaxElement.TaxElement_FixedLevel }
     */
    public TaxElement.TaxElement_FixedLevel createTaxElementTaxElement_FixedLevel() {
        return new TaxElement.TaxElement_FixedLevel();
    }

    /**
     * Create an instance of {@link CitBook.CitBook_Title }
     */
    public CitBook.CitBook_Title createCitBookCitBook_Title() {
        return new CitBook.CitBook_Title();
    }

    /**
     * Create an instance of {@link CitBook.CitBook_Coll }
     */
    public CitBook.CitBook_Coll createCitBookCitBook_Coll() {
        return new CitBook.CitBook_Coll();
    }

    /**
     * Create an instance of {@link CitBook.CitBook_Authors }
     */
    public CitBook.CitBook_Authors createCitBookCitBook_Authors() {
        return new CitBook.CitBook_Authors();
    }

    /**
     * Create an instance of {@link CitBook.CitBook_Imp }
     */
    public CitBook.CitBook_Imp createCitBookCitBook_Imp() {
        return new CitBook.CitBook_Imp();
    }

    /**
     * Create an instance of {@link PatentPriority.PatentPriority_Date }
     */
    public PatentPriority.PatentPriority_Date createPatentPriorityPatentPriority_Date() {
        return new PatentPriority.PatentPriority_Date();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Pub }
     */
    public PubSet.PubSet_Pub createPubSetPubSet_Pub() {
        return new PubSet.PubSet_Pub();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Medline }
     */
    public PubSet.PubSet_Medline createPubSetPubSet_Medline() {
        return new PubSet.PubSet_Medline();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Article }
     */
    public PubSet.PubSet_Article createPubSetPubSet_Article() {
        return new PubSet.PubSet_Article();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Journal }
     */
    public PubSet.PubSet_Journal createPubSetPubSet_Journal() {
        return new PubSet.PubSet_Journal();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Book }
     */
    public PubSet.PubSet_Book createPubSetPubSet_Book() {
        return new PubSet.PubSet_Book();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Proc }
     */
    public PubSet.PubSet_Proc createPubSetPubSet_Proc() {
        return new PubSet.PubSet_Proc();
    }

    /**
     * Create an instance of {@link PubSet.PubSet_Patent }
     */
    public PubSet.PubSet_Patent createPubSetPubSet_Patent() {
        return new PubSet.PubSet_Patent();
    }

    /**
     * Create an instance of {@link Affil.Affil_Std }
     */
    public Affil.Affil_Std createAffilAffil_Std() {
        return new Affil.Affil_Std();
    }

    /**
     * Create an instance of {@link SubSource.SubSource_Subtype }
     */
    public SubSource.SubSource_Subtype createSubSourceSubSource_Subtype() {
        return new SubSource.SubSource_Subtype();
    }

    /**
     * Create an instance of {@link PCConcentrationAttr.PCConcentrationAttr_Unit }
     */
    public PCConcentrationAttr.PCConcentrationAttr_Unit createPCConcentrationAttrPCConcentrationAttr_Unit() {
        return new PCConcentrationAttr.PCConcentrationAttr_Unit();
    }

    /**
     * Create an instance of {@link CitRetract.CitRetract_Type }
     */
    public CitRetract.CitRetract_Type createCitRetractCitRetract_Type() {
        return new CitRetract.CitRetract_Type();
    }

    /**
     * Create an instance of {@link PCConformers }
     */
    public PCConformers createPCConformers() {
        return new PCConformers();
    }

    /**
     * Create an instance of {@link PCConformer.PCConformer_X }
     */
    public PCConformer.PCConformer_X createPCConformerPCConformer_X() {
        return new PCConformer.PCConformer_X();
    }

    /**
     * Create an instance of {@link PCConformer.PCConformer_Y }
     */
    public PCConformer.PCConformer_Y createPCConformerPCConformer_Y() {
        return new PCConformer.PCConformer_Y();
    }

    /**
     * Create an instance of {@link PCConformer.PCConformer_Z }
     */
    public PCConformer.PCConformer_Z createPCConformerPCConformer_Z() {
        return new PCConformer.PCConformer_Z();
    }

    /**
     * Create an instance of {@link PCConformer.PCConformer_Style }
     */
    public PCConformer.PCConformer_Style createPCConformerPCConformer_Style() {
        return new PCConformer.PCConformer_Style();
    }

    /**
     * Create an instance of {@link PCConformer.PCConformer_Data }
     */
    public PCConformer.PCConformer_Data createPCConformerPCConformer_Data() {
        return new PCConformer.PCConformer_Data();
    }

    /**
     * Create an instance of {@link PCStereoPlanar.PCStereoPlanar_Parity }
     */
    public PCStereoPlanar.PCStereoPlanar_Parity createPCStereoPlanarPCStereoPlanar_Parity() {
        return new PCStereoPlanar.PCStereoPlanar_Parity();
    }

    /**
     * Create an instance of {@link PCStereoPlanar.PCStereoPlanar_Type }
     */
    public PCStereoPlanar.PCStereoPlanar_Type createPCStereoPlanarPCStereoPlanar_Type() {
        return new PCStereoPlanar.PCStereoPlanar_Type();
    }

    /**
     * Create an instance of {@link NameStd }
     */
    public NameStd createNameStd() {
        return new NameStd();
    }

    /**
     * Create an instance of {@link MedlineMesh.MedlineMesh_Mp }
     */
    public MedlineMesh.MedlineMesh_Mp createMedlineMeshMedlineMesh_Mp() {
        return new MedlineMesh.MedlineMesh_Mp();
    }

    /**
     * Create an instance of {@link MedlineMesh.MedlineMesh_Qual }
     */
    public MedlineMesh.MedlineMesh_Qual createMedlineMeshMedlineMesh_Qual() {
        return new MedlineMesh.MedlineMesh_Qual();
    }

    /**
     * Create an instance of {@link PCAtomRadical.PCAtomRadical_Type }
     */
    public PCAtomRadical.PCAtomRadical_Type createPCAtomRadicalPCAtomRadical_Type() {
        return new PCAtomRadical.PCAtomRadical_Type();
    }

    /**
     * Create an instance of {@link PCMMDBSource.PCMMDBSource_MoleculeName }
     */
    public PCMMDBSource.PCMMDBSource_MoleculeName createPCMMDBSourcePCMMDBSource_MoleculeName() {
        return new PCMMDBSource.PCMMDBSource_MoleculeName();
    }

    /**
     * Create an instance of {@link MultiOrgName }
     */
    public MultiOrgName createMultiOrgName() {
        return new MultiOrgName();
    }

    /**
     * Create an instance of {@link PCIntegerMinMax }
     */
    public PCIntegerMinMax createPCIntegerMinMax() {
        return new PCIntegerMinMax();
    }

    /**
     * Create an instance of {@link PCStereoGroup.PCStereoGroup_Type }
     */
    public PCStereoGroup.PCStereoGroup_Type createPCStereoGroupPCStereoGroup_Type() {
        return new PCStereoGroup.PCStereoGroup_Type();
    }

    /**
     * Create an instance of {@link PCStereoGroup.PCStereoGroup_Aid }
     */
    public PCStereoGroup.PCStereoGroup_Aid createPCStereoGroupPCStereoGroup_Aid() {
        return new PCStereoGroup.PCStereoGroup_Aid();
    }

    /**
     * Create an instance of {@link PCAssayResults.PCAssayResults_SidSource }
     */
    public PCAssayResults.PCAssayResults_SidSource createPCAssayResultsPCAssayResults_SidSource() {
        return new PCAssayResults.PCAssayResults_SidSource();
    }

    /**
     * Create an instance of {@link PCAssayResults.PCAssayResults_Outcome }
     */
    public PCAssayResults.PCAssayResults_Outcome createPCAssayResultsPCAssayResults_Outcome() {
        return new PCAssayResults.PCAssayResults_Outcome();
    }

    /**
     * Create an instance of {@link PCAssayResults.PCAssayResults_Data }
     */
    public PCAssayResults.PCAssayResults_Data createPCAssayResultsPCAssayResults_Data() {
        return new PCAssayResults.PCAssayResults_Data();
    }

    /**
     * Create an instance of {@link PCAssayResults.PCAssayResults_Xref }
     */
    public PCAssayResults.PCAssayResults_Xref createPCAssayResultsPCAssayResults_Xref() {
        return new PCAssayResults.PCAssayResults_Xref();
    }

    /**
     * Create an instance of {@link PCAssayResults.PCAssayResults_Date }
     */
    public PCAssayResults.PCAssayResults_Date createPCAssayResultsPCAssayResults_Date() {
        return new PCAssayResults.PCAssayResults_Date();
    }

    /**
     * Create an instance of {@link UserField.UserField_Label }
     */
    public UserField.UserField_Label createUserFieldUserField_Label() {
        return new UserField.UserField_Label();
    }

    /**
     * Create an instance of {@link PubStatus }
     */
    public PubStatus createPubStatus() {
        return new PubStatus();
    }

    /**
     * Create an instance of {@link PCElement }
     */
    public PCElement createPCElement() {
        return new PCElement();
    }

    /**
     * Create an instance of {@link CitJour.CitJour_Title }
     */
    public CitJour.CitJour_Title createCitJourCitJour_Title() {
        return new CitJour.CitJour_Title();
    }

    /**
     * Create an instance of {@link CitJour.CitJour_Imp }
     */
    public CitJour.CitJour_Imp createCitJourCitJour_Imp() {
        return new CitJour.CitJour_Imp();
    }

    /**
     * Create an instance of {@link CitLet.CitLet_Cit }
     */
    public CitLet.CitLet_Cit createCitLetCitLet_Cit() {
        return new CitLet.CitLet_Cit();
    }

    /**
     * Create an instance of {@link CitLet.CitLet_Type }
     */
    public CitLet.CitLet_Type createCitLetCitLet_Type() {
        return new CitLet.CitLet_Type();
    }

    /**
     * Create an instance of {@link MedlineField.MedlineField_Type }
     */
    public MedlineField.MedlineField_Type createMedlineFieldMedlineField_Type() {
        return new MedlineField.MedlineField_Type();
    }

    /**
     * Create an instance of {@link MedlineField.MedlineField_Ids }
     */
    public MedlineField.MedlineField_Ids createMedlineFieldMedlineField_Ids() {
        return new MedlineField.MedlineField_Ids();
    }

    /**
     * Create an instance of {@link PCBondType }
     */
    public PCBondType createPCBondType() {
        return new PCBondType();
    }

    /**
     * Create an instance of {@link PCStereoPentagonalBiPyramid }
     */
    public PCStereoPentagonalBiPyramid createPCStereoPentagonalBiPyramid() {
        return new PCStereoPentagonalBiPyramid();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Sid }
     */
    public PCSubstance.PCSubstance_Sid createPCSubstancePCSubstance_Sid() {
        return new PCSubstance.PCSubstance_Sid();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Source }
     */
    public PCSubstance.PCSubstance_Source createPCSubstancePCSubstance_Source() {
        return new PCSubstance.PCSubstance_Source();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Pub }
     */
    public PCSubstance.PCSubstance_Pub createPCSubstancePCSubstance_Pub() {
        return new PCSubstance.PCSubstance_Pub();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Synonyms }
     */
    public PCSubstance.PCSubstance_Synonyms createPCSubstancePCSubstance_Synonyms() {
        return new PCSubstance.PCSubstance_Synonyms();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Comment }
     */
    public PCSubstance.PCSubstance_Comment createPCSubstancePCSubstance_Comment() {
        return new PCSubstance.PCSubstance_Comment();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Xref }
     */
    public PCSubstance.PCSubstance_Xref createPCSubstancePCSubstance_Xref() {
        return new PCSubstance.PCSubstance_Xref();
    }

    /**
     * Create an instance of {@link PCSubstance.PCSubstance_Compound }
     */
    public PCSubstance.PCSubstance_Compound createPCSubstancePCSubstance_Compound() {
        return new PCSubstance.PCSubstance_Compound();
    }

    /**
     * Create an instance of {@link PCBonds.PCBonds_Aid1 }
     */
    public PCBonds.PCBonds_Aid1 createPCBondsPCBonds_Aid1() {
        return new PCBonds.PCBonds_Aid1();
    }

    /**
     * Create an instance of {@link PCBonds.PCBonds_Aid2 }
     */
    public PCBonds.PCBonds_Aid2 createPCBondsPCBonds_Aid2() {
        return new PCBonds.PCBonds_Aid2();
    }

    /**
     * Create an instance of {@link PCBonds.PCBonds_Order }
     */
    public PCBonds.PCBonds_Order createPCBondsPCBonds_Order() {
        return new PCBonds.PCBonds_Order();
    }

    /**
     * Create an instance of {@link PCID }
     */
    public PCID createPCID() {
        return new PCID();
    }

    /**
     * Create an instance of {@link PubEquiv }
     */
    public PubEquiv createPubEquiv() {
        return new PubEquiv();
    }

    /**
     * Create an instance of {@link Pub.Pub_Gen }
     */
    public Pub.Pub_Gen createPubPub_Gen() {
        return new Pub.Pub_Gen();
    }

    /**
     * Create an instance of {@link Pub.Pub_Sub }
     */
    public Pub.Pub_Sub createPubPub_Sub() {
        return new Pub.Pub_Sub();
    }

    /**
     * Create an instance of {@link Pub.Pub_Medline }
     */
    public Pub.Pub_Medline createPubPub_Medline() {
        return new Pub.Pub_Medline();
    }

    /**
     * Create an instance of {@link Pub.Pub_Article }
     */
    public Pub.Pub_Article createPubPub_Article() {
        return new Pub.Pub_Article();
    }

    /**
     * Create an instance of {@link Pub.Pub_Journal }
     */
    public Pub.Pub_Journal createPubPub_Journal() {
        return new Pub.Pub_Journal();
    }

    /**
     * Create an instance of {@link Pub.Pub_Book }
     */
    public Pub.Pub_Book createPubPub_Book() {
        return new Pub.Pub_Book();
    }

    /**
     * Create an instance of {@link Pub.Pub_Proc }
     */
    public Pub.Pub_Proc createPubPub_Proc() {
        return new Pub.Pub_Proc();
    }

    /**
     * Create an instance of {@link Pub.Pub_Patent }
     */
    public Pub.Pub_Patent createPubPub_Patent() {
        return new Pub.Pub_Patent();
    }

    /**
     * Create an instance of {@link Pub.Pub_PatId }
     */
    public Pub.Pub_PatId createPubPub_PatId() {
        return new Pub.Pub_PatId();
    }

    /**
     * Create an instance of {@link Pub.Pub_Man }
     */
    public Pub.Pub_Man createPubPub_Man() {
        return new Pub.Pub_Man();
    }

    /**
     * Create an instance of {@link Pub.Pub_Equiv }
     */
    public Pub.Pub_Equiv createPubPub_Equiv() {
        return new Pub.Pub_Equiv();
    }

    /**
     * Create an instance of {@link Pub.Pub_Pmid }
     */
    public Pub.Pub_Pmid createPubPub_Pmid() {
        return new Pub.Pub_Pmid();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Id }
     */
    public PCCompound.PCCompound_Id createPCCompoundPCCompound_Id() {
        return new PCCompound.PCCompound_Id();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Atoms }
     */
    public PCCompound.PCCompound_Atoms createPCCompoundPCCompound_Atoms() {
        return new PCCompound.PCCompound_Atoms();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Bonds }
     */
    public PCCompound.PCCompound_Bonds createPCCompoundPCCompound_Bonds() {
        return new PCCompound.PCCompound_Bonds();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Stereo }
     */
    public PCCompound.PCCompound_Stereo createPCCompoundPCCompound_Stereo() {
        return new PCCompound.PCCompound_Stereo();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Coords }
     */
    public PCCompound.PCCompound_Coords createPCCompoundPCCompound_Coords() {
        return new PCCompound.PCCompound_Coords();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Props }
     */
    public PCCompound.PCCompound_Props createPCCompoundPCCompound_Props() {
        return new PCCompound.PCCompound_Props();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Stereogroups }
     */
    public PCCompound.PCCompound_Stereogroups createPCCompoundPCCompound_Stereogroups() {
        return new PCCompound.PCCompound_Stereogroups();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Count }
     */
    public PCCompound.PCCompound_Count createPCCompoundPCCompound_Count() {
        return new PCCompound.PCCompound_Count();
    }

    /**
     * Create an instance of {@link PCCompound.PCCompound_Vbalt }
     */
    public PCCompound.PCCompound_Vbalt createPCCompoundPCCompound_Vbalt() {
        return new PCCompound.PCCompound_Vbalt();
    }

    /**
     * Create an instance of {@link PCStereoOctahedral }
     */
    public PCStereoOctahedral createPCStereoOctahedral() {
        return new PCStereoOctahedral();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Aid }
     */
    public PCAssayDescription.PCAssayDescription_Aid createPCAssayDescriptionPCAssayDescription_Aid() {
        return new PCAssayDescription.PCAssayDescription_Aid();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_AidSource }
     */
    public PCAssayDescription.PCAssayDescription_AidSource createPCAssayDescriptionPCAssayDescription_AidSource() {
        return new PCAssayDescription.PCAssayDescription_AidSource();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Description }
     */
    public PCAssayDescription.PCAssayDescription_Description createPCAssayDescriptionPCAssayDescription_Description() {
        return new PCAssayDescription.PCAssayDescription_Description();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Protocol }
     */
    public PCAssayDescription.PCAssayDescription_Protocol createPCAssayDescriptionPCAssayDescription_Protocol() {
        return new PCAssayDescription.PCAssayDescription_Protocol();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Comment }
     */
    public PCAssayDescription.PCAssayDescription_Comment createPCAssayDescriptionPCAssayDescription_Comment() {
        return new PCAssayDescription.PCAssayDescription_Comment();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Xref }
     */
    public PCAssayDescription.PCAssayDescription_Xref createPCAssayDescriptionPCAssayDescription_Xref() {
        return new PCAssayDescription.PCAssayDescription_Xref();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Results }
     */
    public PCAssayDescription.PCAssayDescription_Results createPCAssayDescriptionPCAssayDescription_Results() {
        return new PCAssayDescription.PCAssayDescription_Results();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Pub }
     */
    public PCAssayDescription.PCAssayDescription_Pub createPCAssayDescriptionPCAssayDescription_Pub() {
        return new PCAssayDescription.PCAssayDescription_Pub();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Target }
     */
    public PCAssayDescription.PCAssayDescription_Target createPCAssayDescriptionPCAssayDescription_Target() {
        return new PCAssayDescription.PCAssayDescription_Target();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod }
     */
    public PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod createPCAssayDescriptionPCAssayDescription_ActivityOutcomeMethod() {
        return new PCAssayDescription.PCAssayDescription_ActivityOutcomeMethod();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_Dr }
     */
    public PCAssayDescription.PCAssayDescription_Dr createPCAssayDescriptionPCAssayDescription_Dr() {
        return new PCAssayDescription.PCAssayDescription_Dr();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_SubstanceType }
     */
    public PCAssayDescription.PCAssayDescription_SubstanceType createPCAssayDescriptionPCAssayDescription_SubstanceType() {
        return new PCAssayDescription.PCAssayDescription_SubstanceType();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_GrantNumber }
     */
    public PCAssayDescription.PCAssayDescription_GrantNumber createPCAssayDescriptionPCAssayDescription_GrantNumber() {
        return new PCAssayDescription.PCAssayDescription_GrantNumber();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_ProjectCategory }
     */
    public PCAssayDescription.PCAssayDescription_ProjectCategory createPCAssayDescriptionPCAssayDescription_ProjectCategory() {
        return new PCAssayDescription.PCAssayDescription_ProjectCategory();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_IsPanel }
     */
    public PCAssayDescription.PCAssayDescription_IsPanel createPCAssayDescriptionPCAssayDescription_IsPanel() {
        return new PCAssayDescription.PCAssayDescription_IsPanel();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_AssayGroup }
     */
    public PCAssayDescription.PCAssayDescription_AssayGroup createPCAssayDescriptionPCAssayDescription_AssayGroup() {
        return new PCAssayDescription.PCAssayDescription_AssayGroup();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_PanelInfo }
     */
    public PCAssayDescription.PCAssayDescription_PanelInfo createPCAssayDescriptionPCAssayDescription_PanelInfo() {
        return new PCAssayDescription.PCAssayDescription_PanelInfo();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_IsMlpLateStage }
     */
    public PCAssayDescription.PCAssayDescription_IsMlpLateStage createPCAssayDescriptionPCAssayDescription_IsMlpLateStage() {
        return new PCAssayDescription.PCAssayDescription_IsMlpLateStage();
    }

    /**
     * Create an instance of {@link PCAssayDescription.PCAssayDescription_CategorizedComment }
     */
    public PCAssayDescription.PCAssayDescription_CategorizedComment createPCAssayDescriptionPCAssayDescription_CategorizedComment() {
        return new PCAssayDescription.PCAssayDescription_CategorizedComment();
    }

    /**
     * Create an instance of {@link PCAtomInt }
     */
    public PCAtomInt createPCAtomInt() {
        return new PCAtomInt();
    }

    /**
     * Create an instance of {@link PCUrnDataType }
     */
    public PCUrnDataType createPCUrnDataType() {
        return new PCUrnDataType();
    }

    /**
     * Create an instance of {@link UserObject.UserObject_Type }
     */
    public UserObject.UserObject_Type createUserObjectUserObject_Type() {
        return new UserObject.UserObject_Type();
    }

    /**
     * Create an instance of {@link UserObject.UserObject_Data }
     */
    public UserObject.UserObject_Data createUserObjectUserObject_Data() {
        return new UserObject.UserObject_Data();
    }

    /**
     * Create an instance of {@link PCStereoTrigonalBiPyramid }
     */
    public PCStereoTrigonalBiPyramid createPCStereoTrigonalBiPyramid() {
        return new PCStereoTrigonalBiPyramid();
    }

    /**
     * Create an instance of {@link PartialOrgName }
     */
    public PartialOrgName createPartialOrgName() {
        return new PartialOrgName();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_Protocol }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Protocol createPCAssayPanelMemberPCAssayPanelMember_Protocol() {
        return new PCAssayPanelMember.PCAssayPanelMember_Protocol();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_Comment }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Comment createPCAssayPanelMemberPCAssayPanelMember_Comment() {
        return new PCAssayPanelMember.PCAssayPanelMember_Comment();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_Target }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Target createPCAssayPanelMemberPCAssayPanelMember_Target() {
        return new PCAssayPanelMember.PCAssayPanelMember_Target();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_Xref }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Xref createPCAssayPanelMemberPCAssayPanelMember_Xref() {
        return new PCAssayPanelMember.PCAssayPanelMember_Xref();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod }
     */
    public PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod createPCAssayPanelMemberPCAssayPanelMember_ActivityOutcomeMethod() {
        return new PCAssayPanelMember.PCAssayPanelMember_ActivityOutcomeMethod();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_Dr }
     */
    public PCAssayPanelMember.PCAssayPanelMember_Dr createPCAssayPanelMemberPCAssayPanelMember_Dr() {
        return new PCAssayPanelMember.PCAssayPanelMember_Dr();
    }

    /**
     * Create an instance of {@link PCAssayPanelMember.PCAssayPanelMember_CategorizedComment }
     */
    public PCAssayPanelMember.PCAssayPanelMember_CategorizedComment createPCAssayPanelMemberPCAssayPanelMember_CategorizedComment() {
        return new PCAssayPanelMember.PCAssayPanelMember_CategorizedComment();
    }

    /**
     * Create an instance of {@link BinomialOrgName }
     */
    public BinomialOrgName createBinomialOrgName() {
        return new BinomialOrgName();
    }

    /**
     * Create an instance of {@link Dbtag.Dbtag_Tag }
     */
    public Dbtag.Dbtag_Tag createDbtagDbtag_Tag() {
        return new Dbtag.Dbtag_Tag();
    }

    /**
     * Create an instance of {@link PCCoordinates.PCCoordinates_Type }
     */
    public PCCoordinates.PCCoordinates_Type createPCCoordinatesPCCoordinates_Type() {
        return new PCCoordinates.PCCoordinates_Type();
    }

    /**
     * Create an instance of {@link PCCoordinates.PCCoordinates_Aid }
     */
    public PCCoordinates.PCCoordinates_Aid createPCCoordinatesPCCoordinates_Aid() {
        return new PCCoordinates.PCCoordinates_Aid();
    }

    /**
     * Create an instance of {@link PCCoordinates.PCCoordinates_Conformers }
     */
    public PCCoordinates.PCCoordinates_Conformers createPCCoordinatesPCCoordinates_Conformers() {
        return new PCCoordinates.PCCoordinates_Conformers();
    }

    /**
     * Create an instance of {@link PCCoordinates.PCCoordinates_Atomlabels }
     */
    public PCCoordinates.PCCoordinates_Atomlabels createPCCoordinatesPCCoordinates_Atomlabels() {
        return new PCCoordinates.PCCoordinates_Atomlabels();
    }

    /**
     * Create an instance of {@link PCCoordinates.PCCoordinates_Data }
     */
    public PCCoordinates.PCCoordinates_Data createPCCoordinatesPCCoordinates_Data() {
        return new PCCoordinates.PCCoordinates_Data();
    }

    /**
     * Create an instance of {@link PCAtomString }
     */
    public PCAtomString createPCAtomString() {
        return new PCAtomString();
    }

    /**
     * Create an instance of {@link MedlineQual.MedlineQual_Mp }
     */
    public MedlineQual.MedlineQual_Mp createMedlineQualMedlineQual_Mp() {
        return new MedlineQual.MedlineQual_Mp();
    }

    /**
     * Create an instance of {@link PCRealMinMax }
     */
    public PCRealMinMax createPCRealMinMax() {
        return new PCRealMinMax();
    }

    /**
     * Create an instance of {@link PCCount }
     */
    public PCCount createPCCount() {
        return new PCCount();
    }

    /**
     * Create an instance of {@link OrgMod.OrgMod_Subtype }
     */
    public OrgMod.OrgMod_Subtype createOrgModOrgMod_Subtype() {
        return new OrgMod.OrgMod_Subtype();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_Authors }
     */
    public CitPat.CitPat_Authors createCitPatCitPat_Authors() {
        return new CitPat.CitPat_Authors();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_DateIssue }
     */
    public CitPat.CitPat_DateIssue createCitPatCitPat_DateIssue() {
        return new CitPat.CitPat_DateIssue();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_Class }
     */
    public CitPat.CitPat_Class createCitPatCitPat_Class() {
        return new CitPat.CitPat_Class();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_AppDate }
     */
    public CitPat.CitPat_AppDate createCitPatCitPat_AppDate() {
        return new CitPat.CitPat_AppDate();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_Applicants }
     */
    public CitPat.CitPat_Applicants createCitPatCitPat_Applicants() {
        return new CitPat.CitPat_Applicants();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_Assignees }
     */
    public CitPat.CitPat_Assignees createCitPatCitPat_Assignees() {
        return new CitPat.CitPat_Assignees();
    }

    /**
     * Create an instance of {@link CitPat.CitPat_Priority }
     */
    public CitPat.CitPat_Priority createCitPatCitPat_Priority() {
        return new CitPat.CitPat_Priority();
    }

    /**
     * Create an instance of {@link PCCompounds }
     */
    public PCCompounds createPCCompounds() {
        return new PCCompounds();
    }

    /**
     * Create an instance of {@link CitProc.CitProc_Book }
     */
    public CitProc.CitProc_Book createCitProcCitProc_Book() {
        return new CitProc.CitProc_Book();
    }

    /**
     * Create an instance of {@link CitProc.CitProc_Meet }
     */
    public CitProc.CitProc_Meet createCitProcCitProc_Meet() {
        return new CitProc.CitProc_Meet();
    }

    /**
     * Create an instance of {@link Title.Title_E }
     */
    public Title.Title_E createTitleTitle_E() {
        return new Title.Title_E();
    }

    /**
     * Create an instance of {@link BioSource.BioSource_Genome }
     */
    public BioSource.BioSource_Genome createBioSourceBioSource_Genome() {
        return new BioSource.BioSource_Genome();
    }

    /**
     * Create an instance of {@link BioSource.BioSource_Origin }
     */
    public BioSource.BioSource_Origin createBioSourceBioSource_Origin() {
        return new BioSource.BioSource_Origin();
    }

    /**
     * Create an instance of {@link BioSource.BioSource_Org }
     */
    public BioSource.BioSource_Org createBioSourceBioSource_Org() {
        return new BioSource.BioSource_Org();
    }

    /**
     * Create an instance of {@link BioSource.BioSource_Subtype }
     */
    public BioSource.BioSource_Subtype createBioSourceBioSource_Subtype() {
        return new BioSource.BioSource_Subtype();
    }

    /**
     * Create an instance of {@link BioSource.BioSource_IsFocus }
     */
    public BioSource.BioSource_IsFocus createBioSourceBioSource_IsFocus() {
        return new BioSource.BioSource_IsFocus();
    }

    /**
     * Create an instance of {@link PCSource.PCSource_Individual }
     */
    public PCSource.PCSource_Individual createPCSourcePCSource_Individual() {
        return new PCSource.PCSource_Individual();
    }

    /**
     * Create an instance of {@link PCSource.PCSource_Db }
     */
    public PCSource.PCSource_Db createPCSourcePCSource_Db() {
        return new PCSource.PCSource_Db();
    }

    /**
     * Create an instance of {@link PCSource.PCSource_Mmdb }
     */
    public PCSource.PCSource_Mmdb createPCSourcePCSource_Mmdb() {
        return new PCSource.PCSource_Mmdb();
    }

    /**
     * Create an instance of {@link PCSubstances }
     */
    public PCSubstances createPCSubstances() {
        return new PCSubstances();
    }

    /**
     * Create an instance of {@link PCAtomSource.PCAtomSource_Source }
     */
    public PCAtomSource.PCAtomSource_Source createPCAtomSourcePCAtomSource_Source() {
        return new PCAtomSource.PCAtomSource_Source();
    }

    /**
     * Create an instance of {@link Date.Date_Std }
     */
    public Date.Date_Std createDateDate_Std() {
        return new Date.Date_Std();
    }

    /**
     * Create an instance of {@link ObjectId }
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot }
     */
    public PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot createPCAssayPanelTestResultPCAssayPanelTestResult_ReadoutAnnot() {
        return new PCAssayPanelTestResult.PCAssayPanelTestResult_ReadoutAnnot();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Date }
     */
    public Imprint.Imprint_Date createImprintImprint_Date() {
        return new Imprint.Imprint_Date();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Pub }
     */
    public Imprint.Imprint_Pub createImprintImprint_Pub() {
        return new Imprint.Imprint_Pub();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Cprt }
     */
    public Imprint.Imprint_Cprt createImprintImprint_Cprt() {
        return new Imprint.Imprint_Cprt();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Prepub }
     */
    public Imprint.Imprint_Prepub createImprintImprint_Prepub() {
        return new Imprint.Imprint_Prepub();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Retract }
     */
    public Imprint.Imprint_Retract createImprintImprint_Retract() {
        return new Imprint.Imprint_Retract();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_Pubstatus }
     */
    public Imprint.Imprint_Pubstatus createImprintImprint_Pubstatus() {
        return new Imprint.Imprint_Pubstatus();
    }

    /**
     * Create an instance of {@link Imprint.Imprint_History }
     */
    public Imprint.Imprint_History createImprintImprint_History() {
        return new Imprint.Imprint_History();
    }

    /**
     * Create an instance of {@link PCStereoTetrahedral.PCStereoTetrahedral_Parity }
     */
    public PCStereoTetrahedral.PCStereoTetrahedral_Parity createPCStereoTetrahedralPCStereoTetrahedral_Parity() {
        return new PCStereoTetrahedral.PCStereoTetrahedral_Parity();
    }

    /**
     * Create an instance of {@link PCStereoTetrahedral.PCStereoTetrahedral_Type }
     */
    public PCStereoTetrahedral.PCStereoTetrahedral_Type createPCStereoTetrahedralPCStereoTetrahedral_Type() {
        return new PCStereoTetrahedral.PCStereoTetrahedral_Type();
    }

    /**
     * Create an instance of {@link PCCoordinateType }
     */
    public PCCoordinateType createPCCoordinateType() {
        return new PCCoordinateType();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Aid }
     */
    public PCAtoms.PCAtoms_Aid createPCAtomsPCAtoms_Aid() {
        return new PCAtoms.PCAtoms_Aid();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Element }
     */
    public PCAtoms.PCAtoms_Element createPCAtomsPCAtoms_Element() {
        return new PCAtoms.PCAtoms_Element();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Label }
     */
    public PCAtoms.PCAtoms_Label createPCAtomsPCAtoms_Label() {
        return new PCAtoms.PCAtoms_Label();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Isotope }
     */
    public PCAtoms.PCAtoms_Isotope createPCAtomsPCAtoms_Isotope() {
        return new PCAtoms.PCAtoms_Isotope();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Charge }
     */
    public PCAtoms.PCAtoms_Charge createPCAtomsPCAtoms_Charge() {
        return new PCAtoms.PCAtoms_Charge();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Radical }
     */
    public PCAtoms.PCAtoms_Radical createPCAtomsPCAtoms_Radical() {
        return new PCAtoms.PCAtoms_Radical();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Source }
     */
    public PCAtoms.PCAtoms_Source createPCAtomsPCAtoms_Source() {
        return new PCAtoms.PCAtoms_Source();
    }

    /**
     * Create an instance of {@link PCAtoms.PCAtoms_Comment }
     */
    public PCAtoms.PCAtoms_Comment createPCAtomsPCAtoms_Comment() {
        return new PCAtoms.PCAtoms_Comment();
    }

    /**
     * Create an instance of {@link PubStatusDateSet }
     */
    public PubStatusDateSet createPubStatusDateSet() {
        return new PubStatusDateSet();
    }

    /**
     * Create an instance of {@link PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval }
     */
    public PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval createPCAssayDataPCAssayData_ValuePCAssayData_Value_Bval() {
        return new PCAssayData.PCAssayData_Value.PCAssayData_Value_Bval();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Bool }
     */
    public UserField.UserField_Data.UserField_Data_Bool createUserFieldUserField_DataUserField_Data_Bool() {
        return new UserField.UserField_Data.UserField_Data_Bool();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Object }
     */
    public UserField.UserField_Data.UserField_Data_Object createUserFieldUserField_DataUserField_Data_Object() {
        return new UserField.UserField_Data.UserField_Data_Object();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Strs }
     */
    public UserField.UserField_Data.UserField_Data_Strs createUserFieldUserField_DataUserField_Data_Strs() {
        return new UserField.UserField_Data.UserField_Data_Strs();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Ints }
     */
    public UserField.UserField_Data.UserField_Data_Ints createUserFieldUserField_DataUserField_Data_Ints() {
        return new UserField.UserField_Data.UserField_Data_Ints();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Reals }
     */
    public UserField.UserField_Data.UserField_Data_Reals createUserFieldUserField_DataUserField_Data_Reals() {
        return new UserField.UserField_Data.UserField_Data_Reals();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Oss }
     */
    public UserField.UserField_Data.UserField_Data_Oss createUserFieldUserField_DataUserField_Data_Oss() {
        return new UserField.UserField_Data.UserField_Data_Oss();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Fields }
     */
    public UserField.UserField_Data.UserField_Data_Fields createUserFieldUserField_DataUserField_Data_Fields() {
        return new UserField.UserField_Data.UserField_Data_Fields();
    }

    /**
     * Create an instance of {@link UserField.UserField_Data.UserField_Data_Objects }
     */
    public UserField.UserField_Data.UserField_Data_Objects createUserFieldUserField_DataUserField_Data_Objects() {
        return new UserField.UserField_Data.UserField_Data_Objects();
    }

    /**
     * Create an instance of {@link PCCompoundTypeClass.PCCompoundType_Type }
     */
    public PCCompoundTypeClass.PCCompoundType_Type createPCCompoundTypeClassPCCompoundType_Type() {
        return new PCCompoundTypeClass.PCCompoundType_Type();
    }

    /**
     * Create an instance of {@link PCCompoundTypeClass.PCCompoundType_Id }
     */
    public PCCompoundTypeClass.PCCompoundType_Id createPCCompoundTypeClassPCCompoundType_Id() {
        return new PCCompoundTypeClass.PCCompoundType_Id();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource }
     */
    public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource createPCAssaySubmitPCAssaySubmit_AssayPCAssaySubmit_Assay_AidSource() {
        return new PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_AidSource();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr }
     */
    public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr createPCAssaySubmitPCAssaySubmit_AssayPCAssaySubmit_Assay_Descr() {
        return new PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Descr();
    }

    /**
     * Create an instance of {@link PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver }
     */
    public PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver createPCAssaySubmitPCAssaySubmit_AssayPCAssaySubmit_Assay_Aidver() {
        return new PCAssaySubmit.PCAssaySubmit_Assay.PCAssaySubmit_Assay_Aidver();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset }
     */
    public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset createPCResultTypePCResultType_ConstraintsPCResultType_Constraints_Fset() {
        return new PCResultType.PCResultType_Constraints.PCResultType_Constraints_Fset();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange }
     */
    public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange createPCResultTypePCResultType_ConstraintsPCResultType_Constraints_Frange() {
        return new PCResultType.PCResultType_Constraints.PCResultType_Constraints_Frange();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset }
     */
    public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset createPCResultTypePCResultType_ConstraintsPCResultType_Constraints_Iset() {
        return new PCResultType.PCResultType_Constraints.PCResultType_Constraints_Iset();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange }
     */
    public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange createPCResultTypePCResultType_ConstraintsPCResultType_Constraints_Irange() {
        return new PCResultType.PCResultType_Constraints.PCResultType_Constraints_Irange();
    }

    /**
     * Create an instance of {@link PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset }
     */
    public PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset createPCResultTypePCResultType_ConstraintsPCResultType_Constraints_Sset() {
        return new PCResultType.PCResultType_Constraints.PCResultType_Constraints_Sset();
    }

    /**
     * Create an instance of {@link AuthList.AuthList_Names.AuthList_Names_Std }
     */
    public AuthList.AuthList_Names.AuthList_Names_Std createAuthListAuthList_NamesAuthList_Names_Std() {
        return new AuthList.AuthList_Names.AuthList_Names_Std();
    }

    /**
     * Create an instance of {@link AuthList.AuthList_Names.AuthList_Names_Ml }
     */
    public AuthList.AuthList_Names.AuthList_Names_Ml createAuthListAuthList_NamesAuthList_Names_Ml() {
        return new AuthList.AuthList_Names.AuthList_Names_Ml();
    }

    /**
     * Create an instance of {@link AuthList.AuthList_Names.AuthList_Names_Str }
     */
    public AuthList.AuthList_Names.AuthList_Names_Str createAuthListAuthList_NamesAuthList_Names_Str() {
        return new AuthList.AuthList_Names.AuthList_Names_Str();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_From.CitArt_From_Journal }
     */
    public CitArt.CitArt_From.CitArt_From_Journal createCitArtCitArt_FromCitArt_From_Journal() {
        return new CitArt.CitArt_From.CitArt_From_Journal();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_From.CitArt_From_Book }
     */
    public CitArt.CitArt_From.CitArt_From_Book createCitArtCitArt_FromCitArt_From_Book() {
        return new CitArt.CitArt_From.CitArt_From_Book();
    }

    /**
     * Create an instance of {@link CitArt.CitArt_From.CitArt_From_Proc }
     */
    public CitArt.CitArt_From.CitArt_From_Proc createCitArtCitArt_FromCitArt_From_Proc() {
        return new CitArt.CitArt_From.CitArt_From_Proc();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval createPCInfoDataPCInfoData_ValuePCInfoData_Value_Bval() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Bval();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec createPCInfoDataPCInfoData_ValuePCInfoData_Value_Ivec() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Ivec();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec createPCInfoDataPCInfoData_ValuePCInfoData_Value_Fvec() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Fvec();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist createPCInfoDataPCInfoData_ValuePCInfoData_Value_Slist() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Slist();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Date }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Date createPCInfoDataPCInfoData_ValuePCInfoData_Value_Date() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Date();
    }

    /**
     * Create an instance of {@link PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E }
     */
    public PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E createPCInfoDataPCInfoData_ValuePCInfoData_Value_BvecPCInfoData_Value_Bvec_E() {
        return new PCInfoData.PCInfoData_Value.PCInfoData_Value_Bvec.PCInfoData_Value_Bvec_E();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Name.OrgName_Name_Binomial }
     */
    public OrgName.OrgName_Name.OrgName_Name_Binomial createOrgNameOrgName_NameOrgName_Name_Binomial() {
        return new OrgName.OrgName_Name.OrgName_Name_Binomial();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Name.OrgName_Name_Hybrid }
     */
    public OrgName.OrgName_Name.OrgName_Name_Hybrid createOrgNameOrgName_NameOrgName_Name_Hybrid() {
        return new OrgName.OrgName_Name.OrgName_Name_Hybrid();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Name.OrgName_Name_Namedhybrid }
     */
    public OrgName.OrgName_Name.OrgName_Name_Namedhybrid createOrgNameOrgName_NameOrgName_Name_Namedhybrid() {
        return new OrgName.OrgName_Name.OrgName_Name_Namedhybrid();
    }

    /**
     * Create an instance of {@link OrgName.OrgName_Name.OrgName_Name_Partial }
     */
    public OrgName.OrgName_Name.OrgName_Name_Partial createOrgNameOrgName_NameOrgName_Name_Partial() {
        return new OrgName.OrgName_Name.OrgName_Name_Partial();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "PmcID")
    public JAXBElement<BigInteger> createPmcID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PmcID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "PubMedId")
    public JAXBElement<BigInteger> createPubMedId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PubMedId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "PmcPid")
    public JAXBElement<String> createPmcPid(String value) {
        return new JAXBElement<String>(_PmcPid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "PmPid")
    public JAXBElement<String> createPmPid(String value) {
        return new JAXBElement<String>(_PmPid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "MedlineUID")
    public JAXBElement<BigInteger> createMedlineUID(BigInteger value) {
        return new JAXBElement<BigInteger>(_MedlineUID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ncbi.nlm.nih.gov", name = "PII")
    public JAXBElement<String> createPII(String value) {
        return new JAXBElement<String>(_PII_QNAME, String.class, null, value);
    }

}
