package met2id.assemble

import met2id.metaboEntity.PeakPair
import met2id.property.PropertyName
import met2id.property.SoftwareProperties

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
        ArrayList<String> nKeyList = idResultList.inchiScore.keySet()
        nKeyList.sort(new Comparator<String>() {
            @Override
            int compare(String o1, String o2) {
                if (idResultList.getInchiScore().get(o1) - idResultList.getInchiScore().get(o2) > 0){
                    return 1
                } else { return -1 }
            }
        })

        for (String tmpkey : nKeyList){
            // inchi is the key
            if (SoftwareProperties.propertiesPair.get(PropertyName.TOTAL_SCORE_PARAMETER)) {
                String tmpa = SoftwareProperties.propertiesPair.get(PropertyName.TOTAL_SCORE_PARAMETER)
                idResultList.calTotalScore(tmpkey, Double.valueOf(tmpa))
            } else {
                idResultList.calTotalScore(tmpkey)
            }

            tmpString += peakPairA.toString() + "\t" + tmpkey + "\t" +
                    idResultList.getInchiMet().get(tmpkey).toString() + "\t" +
                    idResultList.getScoreString(tmpkey) + "\t" +
                    idResultList.toIDlistString(tmpkey) + "\n";
        }
        return tmpString
    }
}
