package met2id.assemble

import met2id.metaboEntity.MetaboliteDB

/**
 * Created by hahah on 2017/3/21.
 */
class IDResultList {
    Map<String, Double> inchiScore    // inchi    Identification result score
    Map<String, MetaboliteDB> inchiMet    // inchi    Metabolite information in the database
    Map<String, ArrayList<IDResult>> inchiIDlist    // inchi    Identification result

    IDResultList() {
        inchiIDlist = new HashMap<>()
        inchiScore = new HashMap<>()
        inchiMet = new HashMap<>()
    }

    void putInfo(String inchi, Double score = 0, MetaboliteDB metaboliteDB = null, IDResult idResult = null){
        inchiScore.put(inchi, score)
        inchiMet.put(inchi, metaboliteDB)
        putIDResult(inchi, idResult)
    }

    void putIDResult(String inchi, IDResult tmpidR){
        if (!tmpidR) { return }
        if (!inchiIDlist.containsKey(inchi)){
            inchiIDlist.put(inchi, new ArrayList<IDResult>())
            inchiIDlist.get(inchi).add(tmpidR)
        }else {
            inchiIDlist.get(inchi).add(tmpidR)
        }
    }

    String toIDlistString(String tmpS){
        String tmpOutput = ""
        for (IDResult tmpid : inchiIDlist.get(tmpS)){
            tmpOutput += tmpid.toString() + ","
        }
        return tmpOutput
    }
}
