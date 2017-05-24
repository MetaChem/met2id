package met2id.assemble

/**
 * Created by hahah on 2017/3/21.
 */
class Peak2InChI2IDResult {
    Map<String, ArrayList<String>> peak2Inchi
    Map < String, ArrayList < IDResult >> inchiIDlist
    Peak2InChI2IDResult() {
        peak2Inchi  = new HashMap<>()
        inchiIDlist = new HashMap<>()
    }
    void putIDResult(String peakID, String inchi, IDResult tmpidR){
        if (!peak2Inchi.containsKey(peakID)) {
            peak2Inchi.put(peakID, new ArrayList<String>())
            peak2Inchi.get(peakID).add(inchi)
        }else {
            peak2Inchi.get(peakID).add(inchi)
        }

        String inchibar = peakID + inchi
        if (!inchiIDlist.containsKey(inchibar)){
            inchiIDlist.put(inchibar, new ArrayList<IDResult>())
            inchiIDlist.get(inchibar).add(tmpidR)
        }else {
            inchiIDlist.get(inchibar).add(tmpidR)
        }
    }

}
