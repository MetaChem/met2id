package met2id.msOne

import met2id.spectraRef.MetaboliteDBRef

/**
 * Created by hahah on 2017/1/17.
 */
class MetaboliteMS1Match {
    Double massError    //ppm
    Double ms1Score
    MetaboliteDBRef metaboliteRef

    MetaboliteMS1Match(MetaboliteDBRef tmpRef, Double tmpError, Double tmpScore){
        this.metaboliteRef = tmpRef
        this.massError = tmpError
        this.ms1Score = tmpScore
    }

    @Override
    String toString() {
        return this.metaboliteRef.toString() + "MS1DB_COMP_SCORE=" + ms1Score + "\n\n"
    }
}
