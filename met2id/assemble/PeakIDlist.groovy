package met2id.assemble

import met2id.metaboEntity.PeakPair

/**
 * Created by Thin123 on 2017/7/5.
 */
class PeakIDlist {
    PeakPairA peakPairA
    IDResultList idResultList

    PeakIDlist(String id, Double retentionTime = 0, Double precursorMZ = 0,
               String adduct = "", Double neutralMass = 0){
        this.peakPairA = new PeakPairA(id, retentionTime, precursorMZ, adduct, neutralMass)
        this.idResultList = new IDResultList()
    }

    PeakIDlist(PeakPairA peakPairA1){
        this.peakPairA = peakPairA1
        this.idResultList = new IDResultList()
    }

    String toString(){
        String tmpString = ""
        for (String tmpkey : idResultList.inchiScore.keySet()){
            // inchi is the key
            tmpString += peakPairA.toString() + "\t" + tmpkey + "\t" + idResultList.getInchiMet().get(tmpkey).toString() + "\t" +
                    idResultList.getInchiScore().get(tmpkey).toString() + "\t" + idResultList.toIDlistString(tmpkey) + "\n";
        }
        return tmpString
    }
}
