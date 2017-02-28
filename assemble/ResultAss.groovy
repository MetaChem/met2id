package assemble

/**
 * Created by Thin123 on 2017/1/5.
 */
class ResultAss {

    void MetFragResultAss(){
        File workDir = new File("")
        def resultDir = workDir.getAbsolutePath() + "/result-mfrag-tmp"
        def dirs = new File(resultDir).list()
        //resultDir.eachDir { dirs << it.name }
        File cResultFile = new File(resultDir + "/0-result-mfrag")
        if (cResultFile.exists()){cResultFile.delete()}
        cResultFile.createNewFile()
        BufferedWriter bw = new BufferedWriter(new FileWriter(cResultFile))
        bw << "RT(min),precursorMZ,Adduct,NeutralMass,Score,InChI,FragmenterScore_Values,MaximumTreeDepth,MonoisotopicMass,Identifier,MolecularFormula,FormulasOfExplPeaks,InChIKey2,InChIKey1,FragmenterScore,ExplPeaks,NoExplPeaks,NumberPeaksUsed\n"

        for (def tmpFileName : dirs){
            if (tmpFileName == "0-result-mfrag"||tmpFileName == "0-result-ms1") continue
            println(tmpFileName)
            File tmpF =  new File(resultDir + "/" +tmpFileName)
            String[] info_bar = tmpFileName.tokenize(/_/)
            tmpF.eachLine {line, lineNum -> if (line != "" && lineNum > 1) { bw << info_bar[1] << "," << info_bar[2] <<
                    ","<< info_bar[3] << "," << info_bar[4] << "," << line << "\n" }}
        }
        bw.close()

    }

}
