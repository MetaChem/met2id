package metaboEntity

/**
 * Created by Thin123 on 2017/3/7.
 */
class Spectrum {
    HashMap<String, PeakPair> peakPairGroup //ID(RT_mz), peakPair

    Spectrum(){
        peakPairGroup = new HashMap<String, PeakPair>()
    }
}
