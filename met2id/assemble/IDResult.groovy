package met2id.assemble

/**
 * Created by hahah on 2017/3/21.
 */
class IDResult {
    String idmethod
    Double score
    String qvalueInfo
    Integer rank
    Integer totalsum

    IDResult(String idmethod, Double score, Integer rank=0, Integer totalsum=0, String qvalueInfo="NA"){
        this.idmethod = idmethod
        this.score = score
        this.rank = rank
        this.totalsum = totalsum
        this.qvalueInfo = qvalueInfo
    }

    @Override
    String toString() {
        return "|$idmethod*$score*$rank*$totalsum*$qvalueInfo"
    }
}
