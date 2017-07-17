package met2id.assemble

import met2id.metaboEntity.MetaboliteDB
import met2id.property.PropertyName

/**
 * Created by hahah on 2017/3/21.
 */
class IDResultList {
    Map<String, Double> inchiScore    // inchi    Identification result score
    Map<String, Double> inchiScoreMetFrag    // inchi    Identification result score1
    Map<String, Double> inchiScoreLibSearch    // inchi    Identification result score2

    Map<String, MetaboliteDB> inchiMet    // inchi    Metabolite information in the database
    Map<String, ArrayList<IDResult>> inchiIDlist    // inchi    Identification result

    IDResultList() {
        inchiIDlist = new HashMap<>()
        inchiScore = new HashMap<>()
        inchiMet = new HashMap<>()
        inchiScoreMetFrag = new HashMap<>()
        inchiScoreLibSearch = new HashMap<>()
    }

    void putInfo(String inchi, Double score = 0, MetaboliteDB metaboliteDB = null, IDResult idResult = null){
        inchiScore.put(inchi, score)
        if (!inchiMet.containsKey(inchi)) {
            inchiMet.put(inchi, metaboliteDB)
        }
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

    void putMetFragScore(String inchi, Double score){
        if (!inchiScoreMetFrag.containsKey(inchi)) {inchiScoreMetFrag.put(inchi, 0)}
        inchiScoreMetFrag.put(inchi, Math.max(inchiScoreMetFrag.get(inchi), score))
    }

    void putMetFragScore(String inchi, String score){
        putMetFragScore(inchi, Double.valueOf(score))
    }

    void putLibSearchScore(String inchi, Double score){
        if (!inchiScoreLibSearch.containsKey(inchi)) {inchiScoreLibSearch.put(inchi, 0)}
        inchiScoreLibSearch.put(inchi, Math.max(inchiScoreLibSearch.get(inchi), score))
    }

    void putLibSearchScore(String inchi, String score){
        putLibSearchScore(inchi, Double.valueOf(score))
    }

    // Calculation put in the PeakIDlist toString()
    void calTotalScore(String inchi, Double alpha = 0.1){
        if (!inchiScoreLibSearch.containsKey(inchi)) {inchiScoreLibSearch.put(inchi, 0)}
        if (!inchiScoreMetFrag.containsKey(inchi)) {inchiScoreMetFrag.put(inchi, 0)}

        Double total = alpha * inchiScoreMetFrag.get(inchi) + (1 - alpha) * inchiScoreLibSearch.get(inchi)
        inchiScore.put(inchi, total)
    }

    String toIDlistString(String inchi){
        String tmpOutput = ""


        for (IDResult tmpid : inchiIDlist.get(inchi)){
            tmpOutput += tmpid.toString() + ","
        }
        return tmpOutput
    }

    String getScoreString(String inchi){
        String tmp = inchiScore.get(inchi).toString() + "," +
                inchiScoreMetFrag.get(inchi).toString() + "," +
                inchiScoreLibSearch.get(inchi).toString()
        return  tmp
    }
}
