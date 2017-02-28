package msOne

import spectralref.MetaboliteRef

/**
 * Created by Thin123 on 2017/1/17.
 */
class MetaboliteMS1Match {
    Double massError
    Double ms1Score
    MetaboliteRef metaboliteRef

    MetaboliteMS1Match(MetaboliteRef tmpRef, Double tmpError, Double tmpScore){
        this.metaboliteRef = tmpRef
        this.massError = tmpError
        this.ms1Score = tmpScore
    }

    @Override
    String toString() {
        return this.metaboliteRef.toString() + "MS1DB_COMP_SCORE=" + ms1Score + "\n\n"
    }
}
