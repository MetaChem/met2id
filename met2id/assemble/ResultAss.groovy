package met2id.assemble

import met2id.metaboEntity.MetaboliteDB

/**
 * Created by hahah on 2017/1/5.
 */
class ResultAss {

    static Map<String, PeakIDlist> MetFragResultAss(String proName){
        Map<String, PeakIDlist> tmpPeak2inchi2id = new HashMap<>()  // ID, peaks & metabolites & scores & results

        File workDir = new File("")
        def resultDir = workDir.getAbsolutePath() + "/result-mfrag-$proName"
        File tmpfile = new File(resultDir)
        if (!tmpfile.exists()) { return tmpPeak2inchi2id }

        def dirs = new File(resultDir).list()
        //resultDir.eachDir { dirs << it.name }
        File cResultFile = new File(resultDir + "/0-result-mfrag")
        if (cResultFile.exists()){cResultFile.delete()}
        cResultFile.createNewFile()
        BufferedWriter bw = new BufferedWriter(new FileWriter(cResultFile))
        bw << "ParentPeakID,RT(min),precursorMZ,Adduct,NeutralMass,Score,InChI,FragmenterScore_Values,MaximumTreeDepth,MonoisotopicMass,Identifier,MolecularFormula,FormulasOfExplPeaks,InChIKey2,InChIKey1,FragmenterScore,ExplPeaks,NoExplPeaks,NumberPeaksUsed\n"

        for (def tmpFileName : dirs){
            if (tmpFileName == "0-result-mfrag"||tmpFileName == "0-result-ms1_woms2") continue
            File tmpF =  new File(resultDir + "/" +tmpFileName)
            String[] info_bar = tmpFileName.tokenize(/_/)
            ArrayList<String> inchiResultSum = new ArrayList<>()

            tmpF.eachLine {line, lineNum ->
                if (line != "" && lineNum > 1) {
                    bw << info_bar[1] << "," << info_bar[2] <<
                    ","<< info_bar[3] << "," << info_bar[4] << "," << info_bar[5] << "," << line << "\n"
                    tmpPeak2inchi2id.put(info_bar[1], new PeakIDlist(info_bar[1], Double.valueOf(info_bar[2]), Double.valueOf(info_bar[3]), info_bar[4], Double.valueOf(info_bar[5])))
                    inchiResultSum.add(line)
                }
            }

            if (inchiResultSum.size()>0){
                Integer tmpi = 0;
                for (String tmps: inchiResultSum){
                    tmpi++

                    String[] tmpPart1 = tmps.split(/",/,2)
                    String[] tmpSepPart1 = tmpPart1[0].split(/,"/) // Score, Inchi
                    if (tmpSepPart1.size() < 2){ continue }
                    String[] tmpSepPart2 = tmpPart1[1].split(/,/,6) // Total 6 parts, [2] mono-isotopic mass, [3] identifier, [4] formula

                    MetaboliteDB tmpMet = new MetaboliteDB(tmpSepPart2[3], tmpSepPart2[3], tmpSepPart2[4], Double.valueOf(tmpSepPart2[2]))
                    IDResult tmpidRe = new IDResult("MetFrag", Double.valueOf(tmpSepPart1[0]),tmpi,inchiResultSum.size())
                    String tmpa = AssTool.inchiMainLayer(tmpSepPart1[1])
                    tmpPeak2inchi2id.get(info_bar[1]).getIdResultList().putInfo(tmpa,0,tmpMet,tmpidRe)
                    tmpPeak2inchi2id.get(info_bar[1]).getIdResultList().putMetFragScore(tmpa, tmpSepPart1[0])
                }
                inchiResultSum.clear()
            }
        }
        bw.close()

        return tmpPeak2inchi2id
    }

    static Map<String, PeakIDlist> SearchLibResultAss (String proName, Map<String, PeakIDlist> tmpP2in2ID){
        File slibResultFile = new File("result-slib-$proName","0-result-slib-o_q")
        BufferedReader br = new BufferedReader(new FileReader(slibResultFile))
        String line
        Integer lineNum = 0

        while ((line=br.readLine()) != null) {
            if (lineNum==0){
                lineNum++
                continue
            }
            String[] linePart = line.split(/\t/,9)
            linePart[5].replaceAll("\"","")
            linePart[6].replaceAll("\"","")

            String peakID = linePart[0]
            Double rt = Double.valueOf(linePart[1])
            Double mass_ex = Double.valueOf(linePart[2])
            String db = linePart[3]

            Double mass_lib = Double.valueOf(linePart[4])
            String name = linePart[5]
            String inchi = linePart[6]

            Double score = Double.valueOf(linePart[7])
            String qvalueInfo = ""
            if (linePart[8]) {
                qvalueInfo = linePart[8]
            }else {
                qvalueInfo = "NA"
            }

            PeakPairA tmpPeak = new PeakPairA(peakID, rt, mass_ex)
            MetaboliteDB tmpMet = new MetaboliteDB(db, name, "ShownInINCHI", mass_lib)
            IDResult tmpIDr = new IDResult("LibSearch",score,0,0,qvalueInfo)   // Not set rank and the total met2id.id num

            if (!tmpP2in2ID.containsKey(peakID)){
                tmpP2in2ID.put(peakID, new PeakIDlist(tmpPeak))
            }

            String tmpa = AssTool.inchiMainLayer(inchi)
            tmpP2in2ID.get(peakID).getIdResultList().putInfo(tmpa,0,tmpMet,tmpIDr)
            tmpP2in2ID.get(peakID).getIdResultList().putLibSearchScore(tmpa, score)
        }

        return tmpP2in2ID
    }

    static void main(String[] args){
        SearchLibResultAss("tmp", null)
    }

}
