package met2id.metaboEntity

/**
 * Created by hahah on 2017/3/7.
 */
class PeakPair {
    String id
    Double retentionTime
    Double precursorMZ
    Double precursorIntensity
    HashMap<Double, Double> daughterMZPair  //daughter ions mz, intensity

    PeakPair(Double precursorMZ, String id = "", Double precursorInt = 0,
             Double retentionTime = 0, HashMap<Double, Double> daughterMZPair = null){
        this.precursorMZ = precursorMZ
        this.id = id
        this.precursorIntensity = precursorInt
        this.retentionTime = retentionTime
        this.daughterMZPair = daughterMZPair
    }

    PeakPair(){}

    String toString(){
        return "$id,$retentionTime,$precursorMZ"
    }
}
