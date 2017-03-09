package rawData

import metaboEntity.PeakPair
import metaboEntity.Spectrum

/**
 * Created by Thin123 on 2017/3/8.
 */
class InputFileRead {
    static Spectrum XCMSread(String inputFile, boolean headerExist){
        BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)))
        Spectrum spectrum = new Spectrum()

        br.eachLine {
            if (headerExist){
                headerExist = false
                return
            }
            it = it.trim()
            String[] tmpline = it.split("\t")

            Integer msLevel = Integer.valueOf(tmpline[2])
            Double rt = Double.valueOf(tmpline[3])
            Double mz = Double.valueOf(tmpline[4])
            Double intensity = Double.valueOf(tmpline[5])

            String id = tmpline[0]
            String parentID = tmpline[1]

            if (msLevel == 1){
                PeakPair tmpPeak = new PeakPair(mz,id,intensity,rt)
                spectrum.peakPairGroup.put(id, tmpPeak)
            } else if (msLevel == 2){
                if (spectrum.peakPairGroup.get(parentID) == null){
                    println("Wrong format of XCMS result file, MS2 peak appear before corresponding MS1 peak")
                } else if (spectrum.peakPairGroup.get(parentID).daughterMZPair == null){
                    spectrum.peakPairGroup.get(parentID).daughterMZPair = new HashMap<Double, Double>()
                    spectrum.peakPairGroup.get(parentID).daughterMZPair.put(mz, intensity)
                } else {
                    spectrum.peakPairGroup.get(parentID).daughterMZPair.put(mz, intensity)
                }
            }
        }
        br.close()
        return spectrum
    }

    static void main(String[] args){
        XCMSread("ex-data-n", true)
    }
}
