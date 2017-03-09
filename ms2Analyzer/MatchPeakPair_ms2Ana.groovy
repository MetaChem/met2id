package ms2Analyzer

import metaboEntity.PeakPair
import spectraRef.MathTool

/**
 * Created by Thin123 on 2017/3/7.
 */
class MatchPeakPair_ms2Ana extends PeakPair{
    ArrayList<MZ_DIff> mz_diffrenceAnnotation
    ArrayList<MZ_DIff> neutral_lossAnnotation
    ArrayList<MZ_DIff> product_ionAnnotation
    ArrayList<MZ_DIff> precursor_ionAnnotation

    MatchPeakPair_ms2Ana(PeakPair peakPair){
        super(peakPair.precursorMZ)
        this.id = peakPair.id
        this.precursorIntensity = peakPair.precursorIntensity
        this.retentionTime = peakPair.retentionTime
        this.daughterMZPair = peakPair.daughterMZPair

        mz_diffrenceAnnotation = new ArrayList<MZ_DIff>()
        neutral_lossAnnotation = new ArrayList<MZ_DIff>()
        product_ionAnnotation = new ArrayList<MZ_DIff>()
        precursor_ionAnnotation = new ArrayList<MZ_DIff>()
    }

    void ms2analyzer(QueryFile tmpQueryFile, Double tol){

        for (MZ_DIff tmpPreIon : tmpQueryFile.precursor_ionAList) {
            if (MathTool.wPPMtol(tmpPreIon.mzDiff, precursorMZ, tol)) {
                precursor_ionAnnotation.add(tmpPreIon)
            }
        }
        if (daughterMZPair != null) {
            for (MZ_DIff tmpProIon : tmpQueryFile.product_ionAList){
                for (Double tmpDaughterMZ : daughterMZPair.keySet()){
                    if (MathTool.wPPMtol(tmpDaughterMZ, tmpProIon.mzDiff,tol)){
                        product_ionAnnotation.add(tmpProIon)
                    }
                }
            }
            for (MZ_DIff tmpNeuLoss : tmpQueryFile.neutral_lossAList) {
                for (Double tmpDaughterMZ : daughterMZPair.keySet()) {
                    if (MathTool.wPPMtol(tmpNeuLoss.mzDiff, (precursorMZ - tmpDaughterMZ), tol)) {
                        neutral_lossAnnotation.add(tmpNeuLoss)
                    }
                }
            }
            for (MZ_DIff tmpMZ_Diff : tmpQueryFile.mz_diffrenceAList) {
                if (MZ_Diff_Comp(daughterMZPair, tmpMZ_Diff.mzDiff, tol)) {
                    mz_diffrenceAnnotation.add(tmpMZ_Diff)
                }
            }
        }
    }

    static boolean MZ_Diff_Comp(HashMap<Double, Double> peakList, Double mz_diff, Double tol){
        HashMap<Double, Double> peakList2 = new HashMap<Double, Double>(peakList)
        for (Double tmpMZ:peakList.keySet()){
            peakList2.remove(tmpMZ)
            for (Double tmpMZ2:peakList2.keySet()){
                if (MathTool.wPPMtol(Math.abs(tmpMZ-tmpMZ2), mz_diff, tol)){
                    return true
                }
            }
        }
        return false
    }

    String toString(){
        String tmpS = ""
        for (MZ_DIff tmpMZDiff:mz_diffrenceAnnotation){ tmpS += super.toString()+",MZ_DIFFERENCE,"+tmpMZDiff.toString()+"\n"}
        for (MZ_DIff tmpNeuL:neutral_lossAnnotation){ tmpS += super.toString()+",NEUTRAL_LOSS,"+tmpNeuL.toString()+"\n"}
        for (MZ_DIff tmpProIon:product_ionAnnotation){ tmpS += super.toString()+",PRODUCTOR_ION,"+tmpProIon.toString()+"\n"}
        for (MZ_DIff tmpPreIon:precursor_ionAnnotation){ tmpS += super.toString()+",PRECURSOR_ION,"+tmpPreIon.toString()+"\n"}
        return tmpS
    }

    static void main(String[] args){
        HashMap<Double, Double> tmpHashM = new HashMap<>()
        tmpHashM.put(1,2)
        tmpHashM.put(2,2)
        tmpHashM.put(7,2)
        tmpHashM.put(12,2)
        tmpHashM.put(127,2)

        if (MZ_Diff_Comp(tmpHashM, 7, 10)){ println("True 7")}
        if (MZ_Diff_Comp(tmpHashM, 5, 10)){ println("True 5")}
        if (MZ_Diff_Comp(tmpHashM, 115, 10)){ println("True 115")}

        MatchPeakPair_ms2Ana tmpTest = new MatchPeakPair_ms2Ana(new PeakPair(33))
        MZ_DIff tmp_mzdiff = new MZ_DIff("ala", 3)
        tmpTest.mz_diffrenceAnnotation.add(tmp_mzdiff)
        println(tmpTest)
    }
}
