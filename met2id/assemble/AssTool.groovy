package met2id.assemble

/**
 * Created by hahah on 2017/3/21.
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

    static void writeAssembleFile(String proName, Map<String, PeakIDlist> tmpList){
        File tmpDir = new File("AssembleResult_$proName")
        if (tmpDir.exists()){tmpDir.delete()}
        tmpDir.mkdir()

        File tmpOut = new File(tmpDir,"assResult_$proName")
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tmpOut))
        bufferedWriter.write("PeakInfo\tInChI\tMetaboliteInfo\tScore(total,MetFrag,LibSearch)\tID_Result\n")
        for (String tmpa : tmpList.keySet()){
            bufferedWriter.write(tmpList.get(tmpa).toString())
        }
        bufferedWriter.close()
    }

    static void main(String[] args){
        println(inchiMainLayer("1S/a/b/c/d/e"))
    }
}
