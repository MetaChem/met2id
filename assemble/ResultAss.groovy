package assemble

/**
 * Created by Thin123 on 2017/1/5.
 */
class ResultAss {

    static Peak2InChI2IDResult MetFragResultAss(String proName){
        Peak2InChI2IDResult tmpPeak2inchi2id = new Peak2InChI2IDResult()

        File workDir = new File("")
        def resultDir = workDir.getAbsolutePath() + "/result-mfrag-$proName"
        File tmpfile = new File(resultDir)
        if (!tmpfile.exists()){return tmpPeak2inchi2id}

        def dirs = new File(resultDir).list()
        //resultDir.eachDir { dirs << it.name }
        File cResultFile = new File(resultDir + "/0-result-mfrag")
        if (cResultFile.exists()){cResultFile.delete()}
        cResultFile.createNewFile()
        BufferedWriter bw = new BufferedWriter(new FileWriter(cResultFile))
        bw << "ParentPeakID,RT(min),precursorMZ,Adduct,NeutralMass,Score,InChI,FragmenterScore_Values,MaximumTreeDepth,MonoisotopicMass,Identifier,MolecularFormula,FormulasOfExplPeaks,InChIKey2,InChIKey1,FragmenterScore,ExplPeaks,NoExplPeaks,NumberPeaksUsed\n"

        for (def tmpFileName : dirs){
            if (tmpFileName == "0-result-mfrag"||tmpFileName == "0-result-ms1_woms2") continue
            println(tmpFileName)
            File tmpF =  new File(resultDir + "/" +tmpFileName)
            String[] info_bar = tmpFileName.tokenize(/_/)
            ArrayList<String> inchiResultSum = new ArrayList<>()

            tmpF.eachLine {line, lineNum -> if (line != "" && lineNum > 1) { bw << info_bar[1] << "," << info_bar[2] <<
                    ","<< info_bar[3] << "," << info_bar[4] << "," << info_bar[5] << "," << line << "\n"

                String[] linePart = line.split(/",/,2)
                inchiResultSum.add(linePart[0])
            } }

            if (inchiResultSum.size()>0){
                Integer tmpi = 0;
                for (String tmps: inchiResultSum){
                    tmpi++
                    String[] tmpLinePart = tmps.split(/,"/)
                    if (tmpLinePart.size() < 2){continue}
                    IDResult tmpidRe = new IDResult("MetFrag", Double.valueOf(tmpLinePart[0]),tmpi,inchiResultSum.size())
                    tmpPeak2inchi2id.putIDResult(info_bar[1], AssTool.inchiMainLayer(tmpLinePart[1]),tmpidRe)
                }
                inchiResultSum.clear()
            }
        }
        bw.close()

        return tmpPeak2inchi2id
    }

    static Peak2InChI2IDResult SearchLibResultAss (Peak2InChI2IDResult tmpP2in2ID, String proName){
        File slibResultFile = new File("result-slib-$proName","0-result-slib")
        BufferedReader br = new BufferedReader(new FileReader(slibResultFile))
        String line
        Integer lineNum = 0

        while ((line=br.readLine()) != null) {
            lineNum++
            if (lineNum==1){continue}
            String[] linePart1 = line.split(/,/,5);
            String[] linePart2 = line.split(/,"/,3);
            String peakID = linePart1[0]
            String score = linePart1[3]
            String inchi = linePart2[2]
            IDResult tmpIDr = new IDResult("LibSearch",Double.valueOf(score))   // Not set rank and the total id num
            tmpP2in2ID.putIDResult(peakID,AssTool.inchiMainLayer(inchi),tmpIDr)
        }

        return tmpP2in2ID
    }

    static void main(String[] args){
        SearchLibResultAss(null, "tmp")
    }

}
