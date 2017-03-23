package assemble

/**
 * Created by Thin123 on 2017/3/21.
 */
class IDResult {
    String idmethod
    Double score
    Integer rank
    Integer totalsum

    IDResult(String idmethod, Double score, Integer rank=0, Integer totalsum=0){
        this.idmethod = idmethod
        this.score = score
        this.rank = rank
        this.totalsum = totalsum
    }

    @Override
    String toString() {
        return "|$idmethod*$score*$rank*$totalsum"
    }
}
