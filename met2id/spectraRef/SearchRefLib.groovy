package met2id.spectraRef

import java.lang.reflect.Method


/**
 * Created by hahah on 2016/12/5.
 */
class SearchRefLib {

    static void writeResult(String resultPath, String peakInfo, ArrayList<MetaboliteSpectralMatch> matchArrayList){
        File slibResult = new File(resultPath)
        BufferedWriter bw = new BufferedWriter(new FileWriter(slibResult))
        try {
            bw.write(peakInfo)
            bw.write("\n*****\n")
            for (MetaboliteSpectralMatch tmpMet:matchArrayList){
                bw.write(tmpMet.toString())
            }
        }finally {
            bw.close()
        }
    }

    static void writeResultSumupOrder(BufferedWriter bws, Map<String, Double> sumItem){
        ArrayList<String> tmpArray = sumItem.keySet().sort({ a, b->
            sumItem.get(a) > sumItem.get(b) ? -1:1
        })
        for (String tmpa:tmpArray){
            bws.write("$tmpa\t")
            bws.write(sumItem.get(tmpa).toString())
            bws.write("\n")
        }
    }

    static Map<String, Double> writeResultSumup(BufferedWriter bws, String peakInfoBar, ArrayList<MetaboliteSpectralMatch> matchArrayList, Map<String, Double> sumItem){
        try {
            for (MetaboliteSpectralMatch tmpMet:matchArrayList){
                String tmp1 = peakInfoBar + "$tmpMet.ms2LibScore\t$tmpMet.metaboliteRef.organism\t$tmpMet.metaboliteRef.parentMass\t\"$tmpMet.metaboliteRef.name\"\t\"$tmpMet.metaboliteRef.inchi\""
                String tmpName = tmpMet.metaboliteRef.extractName(tmpMet.metaboliteRef.name)
                String tmp2 = peakInfoBar + "$tmpMet.metaboliteRef.organism\t$tmpMet.metaboliteRef.parentMass\t\"$tmpName\"\t\"$tmpMet.metaboliteRef.inchi\""
                bws.write(tmp1)
                bws.write("\n")

                if (sumItem.get(tmp2)){
                    if (tmpMet.ms2LibScore>sumItem.get(tmp2)){
                        sumItem.put(tmp2, tmpMet.ms2LibScore)
                    }
                } else {
                    sumItem.put(tmp2, tmpMet.ms2LibScore)
                }
            }

            return sumItem
        }finally {
        }
    }

    static void fdrCal(String fileTarget){
        String fileOutput = fileTarget + "_q"

        //Class fooClass = Class.forName("FooBar");
        //Method fooMethod = fooClass.getMethod("fooMethod", String.class);
        //String fooReturned = (String)fooMethod.invoke(fooClass.newInstance(), "I did it");
        Class.forName("QValueEstimator").main("-target",fileTarget,"-out",
                fileOutput,"-method","EBA")
    }

    static void fdrCal(File file){
        fdrCal(file.toString())
    }

    static ArrayList<MetaboliteSpectralMatch> compareMGF(ArrayList<Double> matchKeySet, Map<Double, ArrayList<MetaboliteDBRef>> spectrumLib,
                                                         Map<Double, Double> querySpectra, Double cutoffScore = 0, Double cutoffMZdiff = 0.3){
        ArrayList<MetaboliteSpectralMatch> matchMet = new ArrayList<>()
        for (Double tmpKey:matchKeySet){
            for (MetaboliteDBRef tmpMet: spectrumLib.get(tmpKey)){
                Double tmpMS2Score = MathTool.similirityScore(querySpectra, tmpMet.spectrum, cutoffMZdiff)   //the mz dff tolerance of same peak in diff spectrum
                if (tmpMS2Score > cutoffScore) {
                    matchMet.push(new MetaboliteSpectralMatch(tmpMet, tmpMS2Score))
                }
            }
        }
        return matchMet
    }

    static ArrayList<Double> searchMS1mass(Double queryMZ, Double tolppm, Map<Double, ArrayList<MetaboliteDBRef>> spectrumLib){
        ArrayList<Double> matchKeySet = new ArrayList<>()
        for(Double tmpKey:spectrumLib.keySet()){
            if (MathTool.wPPMtol(queryMZ, tmpKey, tolppm)) { matchKeySet.push(tmpKey) }
        }
        return matchKeySet
    }

    static Map loadMGF(String mgfFile){
        BufferedReader br = new BufferedReader(new FileReader(mgfFile))
        String tmpS = ""
        String tmpInfo = ""
        Map<Double, ArrayList<MetaboliteDBRef>> spectrumLib = new HashMap<>()
        Double parantIonMZ = 0
        String tmpname = ""
        String tmpInchi = ""
        String tmpOrganism = ""
        Map<Double, Double> tmpSpectra = new TreeMap<>()

        try {
            while ( (tmpS = br.readLine()) != null ){
                tmpInfo = tmpInfo + tmpS + "\n"
                tmpS.trim()

                if (tmpS == "BEGIN IONS"){
                }

                def matchInfo1 = tmpS =~ /(?i)^PEPMASS=(.+)/
                if (matchInfo1.find()){ parantIonMZ = Double.valueOf(matchInfo1[0][1])}
                def matchInfo1m = tmpS =~ /(?i)^PRECURSORMZ=(.+)/
                if (matchInfo1m.find()){ parantIonMZ = Double.valueOf(matchInfo1m[0][1])}
                def matchInfo2 = tmpS =~ /^([\d\.]+)\s+([\d\.]+)/
                if (matchInfo2.find()){
                    tmpSpectra.put(Double.valueOf(matchInfo2[0][1]), Double.valueOf(matchInfo2[0][2]))
                }
                def matchInfo3 = tmpS =~ /(?i)^NAME=(.+)/
                if (matchInfo3.find()) { tmpname = matchInfo3[0][1] }
                def matchInfo4 = tmpS =~ /(?i)^INCHI=(.+)/
                if (matchInfo4.find()) { tmpInchi = matchInfo4[0][1] }
                def matchInfo5 = tmpS =~ /(?i)^ORGANISM=(.+)/
                if (matchInfo5.find()) { tmpOrganism = matchInfo5[0][1] }

                if (tmpS == "END IONS" && parantIonMZ > 0) {
                    MetaboliteDBRef metaboliteRef = new MetaboliteDBRef()
                    metaboliteRef.parentMass = parantIonMZ
                    metaboliteRef.name = tmpname
                    metaboliteRef.inchi = tmpInchi
                    metaboliteRef.organism = tmpOrganism
                    metaboliteRef.spectrum = tmpSpectra.clone()
                    metaboliteRef.metInfo = tmpInfo

                    if (spectrumLib.get(metaboliteRef.parentMass) == null){
                        ArrayList<MetaboliteDBRef> tmp = new ArrayList<>()
                        tmp.push(metaboliteRef)
                        spectrumLib.put(metaboliteRef.parentMass, tmp)
                    } else {
                        spectrumLib.get(metaboliteRef.parentMass).push(metaboliteRef)
                    }

                    tmpInfo = ""
                    parantIonMZ = 0
                    tmpSpectra.clear()
                }
            }
        }finally {
            br.close()
        }

        return spectrumLib
    }

    static void main(String[] args){
        println(loadMGF("test.mgf"))
        println(searchMS1mass(223, 1, loadMGF("test.mgf")))
    }
}
