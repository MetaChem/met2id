package met2id.assemble

import met2id.metaboEntity.PeakPair

/**
 * Created by Thin123 on 2017/7/5.
 */
class PeakPairA extends PeakPair{
    String adduct
    Double neutralMass

    PeakPairA(String id, Double retentionTime = 0, Double precursorMZ = 0,
              String adduct = "ShowInLib", Double neutralMass = 0, Double intensity = 0){
        this.precursorMZ = precursorMZ
        this.id = id
        this.retentionTime = retentionTime
        this.adduct = adduct
        this.neutralMass = neutralMass
        this.precursorIntensity = intensity
    }

    String toString(){
        return super.toString() + ",$adduct," + neutralMass.toString()
    }
}
