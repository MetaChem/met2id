package spectraRef

/**
 * Created by Thin123 on 2016/12/5.
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

    static void writeResultSumup(BufferedWriter bws, String peakInfoBar, ArrayList<MetaboliteSpectralMatch> matchArrayList){
        try {
            for (MetaboliteSpectralMatch tmpMet:matchArrayList){
                bws.write(peakInfoBar)
                bws.write("$tmpMet.ms2LibScore,$tmpMet.metaboliteRef.organism,$tmpMet.metaboliteRef.parentMass,\"$tmpMet.metaboliteRef.name\",\"$tmpMet.metaboliteRef.inchi\"")
                bws.write("\n")
            }
        }finally {
        }
    }

    static ArrayList<MetaboliteSpectralMatch> compareMGF(ArrayList<Double> matchKeySet, Map<Double, ArrayList<MetaboliteDBRef>> spectrumLib,
                                                         Map<Double, Double> querySpectra, Double cutoff){
        ArrayList<MetaboliteSpectralMatch> matchMet = new ArrayList<>()
        for (Double tmpKey:matchKeySet){
            for (MetaboliteDBRef tmpMet: spectrumLib.get(tmpKey)){
                Double tmpMS2Score = MathTool.similirityScore(querySpectra, tmpMet.spectrum, 0.3)   //tolerance
                if (tmpMS2Score > cutoff) {
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
                def matchInfo2 = tmpS =~ /^([\d\.]+)\s+([\d\.]+)$/
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
