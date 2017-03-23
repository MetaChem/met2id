package assemble

/**
 * Created by Thin123 on 2017/3/21.
 */
class AssTool {
    static String inchiMainLayer(String inputInchi){
        inputInchi = inputInchi.replaceAll('"','')
        String[] tmpLayer = inputInchi.tokenize("/")
        String inchiM = ""
        if (tmpLayer.size()<4){
            for (String tmpsa:tmpLayer){
                inchiM = inchiM + "/" +tmpsa
            }
        }else {
            inchiM = "/"+tmpLayer[1]+"/"+tmpLayer[2]+"/"+tmpLayer[3]
        }
        return inchiM
    }
    static String toString(Peak2InChI2IDResult tmpp2i2r) {
        String tmpS = ""

        for (String tmpa:tmpp2i2r.inchiIDlist.keySet()) {
            ArrayList<IDResult> tmpIDRarray = tmpp2i2r.inchiIDlist.get(tmpa)
            tmpS += "$tmpa\t$tmpIDRarray\n"
        }

        return tmpS
    }

    static void writeAssembleFile(String proName, Peak2InChI2IDResult tmpp2in2id){
        File tmpDir = new File("AssembleResult_$proName")
        if (tmpDir.exists()){tmpDir.delete()}
        tmpDir.mkdir()
        File tmpOut = new File(tmpDir,"assResult_$proName")
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tmpOut))
        bufferedWriter.write(AssTool.toString(tmpp2in2id))
        bufferedWriter.close()
    }

    static void main(String[] args){
        println(inchiMainLayer("1S/a/b/c/d/e"))
    }
}
