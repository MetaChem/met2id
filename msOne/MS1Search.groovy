package msOne

import spectraRef.MathTool
import spectraRef.MetaboliteDBRef

/**
 * Created by Thin123 on 2017/1/17.
 */
class MS1Search {
    //Each line in the database file is an entry
    //num --- serial num of the ID block
    //delimiter
    //Leave out the first line--- head of the table
    static Map loadPSVDatabase(String databaseFile, String delimiter = "\\|",Integer num = 0){
        BufferedReader br = new BufferedReader(new FileReader(databaseFile))
        Map<Double, ArrayList<MetaboliteDBRef>> databaseHash = new HashMap<>()
        br.eachLine {line, lineNum ->
            if (lineNum==1) return
            String[] infoBlock = line.split(delimiter)
            MetaboliteDBRef tmpRef = new MetaboliteDBRef()
            tmpRef.parentMass = Double.valueOf(infoBlock[0])
            tmpRef.name = infoBlock[2]
            tmpRef.inchi = infoBlock[1]
            tmpRef.formula = infoBlock[5]
            tmpRef.metInfo = line

            if (!databaseHash.containsKey(tmpRef.parentMass)){
                ArrayList<MetaboliteDBRef> tmpMetaboliteAL = new ArrayList<>()
                tmpMetaboliteAL.push(tmpRef)
                databaseHash.put(Double.valueOf(infoBlock[num]), tmpMetaboliteAL)
            }else {
                databaseHash.get(tmpRef.parentMass).push(tmpRef)
            }
        }
        br.close()
        return databaseHash
    }

    static ArrayList<MetaboliteMS1Match> searchMS1DBmass(Double queryMZ, Double tolppm, Map<Double, ArrayList<MetaboliteDBRef>> ms1DB){
        ArrayList<MetaboliteMS1Match> matchMetaSet = new ArrayList<>()
        for(Double tmpKey:ms1DB.keySet()){
            if (MathTool.wPPMtol(queryMZ, tmpKey, tolppm)) {
                ms1DB.get(tmpKey).each {
                    matchMetaSet.push(new MetaboliteMS1Match(it, ((queryMZ - tmpKey)/tmpKey) * 1000000, MathTool.massErrorScore(queryMZ, tmpKey, tolppm)))
                }
            }
        }
        return matchMetaSet
    }

    static void writeMS1Result(BufferedWriter bws, String peakInfoBar, ArrayList<MetaboliteMS1Match> matchArrayList){
        try {
            for (MetaboliteMS1Match tmpMet:matchArrayList){
                bws.write(peakInfoBar)
                bws.write("$tmpMet.massError,$tmpMet.ms1Score,$tmpMet.metaboliteRef.parentMass,\"$tmpMet.metaboliteRef.name\",\"$tmpMet.metaboliteRef.inchi\"")
                bws.write("\n")
            }
        }finally {
        }
    }

    static void main(String[] args){
        Map a = loadPSVDatabase("LocalInChI")
        a.each {key, value -> println("$key\t${value[1]}")
        value.each {println(it)}}
        println(MathTool.massErrorScore(100.0, 100.000921200445451, 10))
    }
}
