package db

/**
 * Created by Thin123 on 2016/11/24.
 */
class TransformSDF {
    //Regular SDF format is different with that used in the MetFrag
    //InChIKey vs InChIKey1 InChIKey2
    static void main(String[] args){
        println(breakInChIKey("ChEBI_ex2.sdf").toString())
    }

    static File breakInChIKey(String oriSDFdb){
        File oriDB = new File(oriSDFdb)
        File newDB = new File(oriSDFdb + "newDB")
        if (newDB.exists()){
            return newDB
        }
        boolean inchiFlag = false

        BufferedReader br = new BufferedReader(new FileReader(oriDB))
        BufferedWriter wr = new BufferedWriter(new FileWriter(newDB))
        String tmpS

        while ( (tmpS = br.readLine()) != null ){
            if (tmpS == "> <INCHI_IDENTIFIER>"){tmpS = "> <InChI>"}
            wr.write(tmpS+"\n")

            if (inchiFlag){
                println("Transforming the SDF Database ...")
                def matchInchiKey = tmpS =~ /^\s*(\w+)-(\w+)/
                wr.write("\n> <InChIKey2>\n${matchInchiKey[0][2]}\n\n> <InChIKey1>\n${matchInchiKey[0][1]}\n")

                inchiFlag = false
            }

            if (tmpS =~ /(?i)<InChIKey1>/) {
                newDB.delete()
                break
            }
            if (tmpS =~ /(?i)<InChI(.*)Key>/){
                inchiFlag = true
            }

        }

        br.close()
        wr.close()

        if (newDB.exists()){
            return newDB
        }else {
            return oriDB
        }

    }
}
