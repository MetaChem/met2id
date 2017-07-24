package met2id.spectraRef

import met2id.metaboEntity.MetaboliteDB

/**
 * Created by hahah on 2016/12/5.
 */
class MetaboliteDBRef extends MetaboliteDB {
    Double parentMass   //with adducts
    String name
    String formula
    Integer charge
    Integer msLevel
    String instrumentInfo
    String ionMode
    String organism
    String smiles
    String inchi
    String inchiKey
    TreeMap<Double, Double> spectrum    //default mzlist is from low to high
    String metInfo

    MetaboliteDBRef(){}
    String extractName(String oriName){
        String[] item = oriName.split(" ")
        return item[1]
    }

    @Override
    String toString() {
        return this.metInfo
    }
}
