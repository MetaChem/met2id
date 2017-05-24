package met2id.isotope

import de.binfalse.martin.iso2l.Operator

/**
 * Created by hahah on 2016/11/21.
 */
class IsotopeCal {
    static Double isoDiffScore(String formula, Map<Double, Double> isoDistEx, Double mzTol){
        if (isoDistEx == null) return null
        Operator operator = new Operator()
        operator.parseFormular(formula,1,null)
        // formula, the method parsing formula, the handle of one window
        operator.calcDistribution(operator.isos)
        // initiate isotopes of the iso2l
        HashMap<Double, Double> isoDistTheory = operator.peakDistribution

        filterLowIntensity(isoDistEx, 0.01)
        filterLowIntensity(isoDistTheory, 0.01)
        intensityNormalise(isoDistEx)

        ArrayList<Double> poolScore = new ArrayList<>()
        isoDistEx.keySet().each{key1 ->
            Double minMzDiff = mzTol
            Double keyMinMD = null
            isoDistTheory.keySet().each {key2 ->
                if (Math.abs(key1 - key2) < minMzDiff){
                    minMzDiff = Math.abs(key1 - key2)
                    keyMinMD = key2
                }
            }
            if (minMzDiff < mzTol){
                poolScore.push Math.abs(isoDistEx[key1] - isoDistTheory[keyMinMD])
                isoDistTheory.remove(keyMinMD)
            }else {
                poolScore.push(isoDistEx[key1])
            }
        }
        if (isoDistTheory.size() > 0){
            poolScore.addAll(isoDistTheory.values())
        }


        return 1 - poolScore.sum()/2
    }

    static void filterLowIntensity(Map<Double, Double> peakDist, Double intenTol){
        peakDist.keySet().toList().each {key ->
            if (peakDist[key] < intenTol){
                peakDist.remove(key)
            }
        }
    }

    static void intensityNormalise(Map<Double,Double> peakDist){
        Double totalIntensity = peakDist.values().sum()
        peakDist.keySet().each { peakDist[it] = peakDist[it]/totalIntensity }
    }
}
