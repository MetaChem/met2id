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

    static String inchi2Formula(String inchi){
        String[] tmpLayer = inchi.tokenize("/")
        return tmpLayer[1]
    }

    static void writeAssembleFile(String proName, Map<String, PeakIDlist> tmpList){
        File tmpDir = new File("AssembleResult_$proName")
        if (tmpDir.exists()){tmpDir.delete()}
        tmpDir.mkdir()

        File tmpOut = new File(tmpDir,"assResult_$proName")
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tmpOut))
        bufferedWriter.write("PeakInfo(ID,RT(min),MZ,Intensity,Adduct,NeutralMass)\tInChI(MainLayer)\tMetaboliteInfo(Accession,Identifier,Formula,MassInLib)\tScore(Total,MetFrag,LibSearch)\tID_Result(Method,Score,Rank,ItemTotal,q-value)\n")
        for (String tmpa : tmpList.keySet()){
            bufferedWriter.write(tmpList.get(tmpa).toString())
        }
        bufferedWriter.close()
    }

    static void main(String[] args){
        println(inchiMainLayer("1S/a/b/c/d/e"))
    }
}
