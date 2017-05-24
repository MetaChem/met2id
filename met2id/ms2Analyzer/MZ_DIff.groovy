package met2id.ms2Analyzer

/**
 * Created by hahah on 2017/2/28.
 */
class MZ_DIff {
    String name
    Double mzDiff

    MZ_DIff(String name, Double mzDiff){
        this.name = name
        this.mzDiff = mzDiff
    }

    String toString(){
        return "\"${name}\",$mzDiff"
    }

    static void main(String[] args){
        MZ_DIff tmp = new MZ_DIff("aaa", 3930)
        println(tmp)
    }
}
