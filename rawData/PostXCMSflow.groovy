package rawData

import adduct.AdductRaw
import de.ipbhalle.metfraglib.parameter.SettingsChecker
import de.ipbhalle.metfraglib.parameter.VariableNames
import de.ipbhalle.metfraglib.process.CombinedMetFragProcess
import de.ipbhalle.metfraglib.settings.MetFragGlobalSettings
import metFrag.MetFragGear
import metFrag.MetFragParaList
import metaboEntity.PeakPair
import metaboEntity.Spectrum
import ms2Analyzer.MatchPeakPair_ms2Ana
import ms2Analyzer.QueryFile
import msOne.MS1Search
import spectraRef.MetaboliteDBRef
import spectraRef.SearchRefLib

/**
 * Created by Thin123 on 2017/1/16.
 */
class PostXCMSflow {

    //@tol  used in the ms1Search(without ms2)
    static void ms2idMFrag (String tmpXCMS, MetFragParaList tempParalist, String[] adductArray, Double tol){
        def tempTest = new MetFragGear()
        File paraDir = new File("para-tmp")
        File resultDir = new File("result-mfrag-tmp")

        if (paraDir.exists()){
            paraDir.deleteDir()
        }
        paraDir.mkdir()
        if (resultDir.exists()){
            resultDir.deleteDir()
        }
        resultDir.mkdir()

        MetFragGlobalSettings settings = tempTest.setMetFragGloabalSettings(tempParalist)
        CombinedMetFragProcess mp = new CombinedMetFragProcess(settings)    //initialise database

        BufferedReader br = new BufferedReader(new FileReader(tmpXCMS))
        Map<Integer, ArrayList<BigDecimal>> ID1Info = new HashMap<>()   //[0,1,2] RT, MZ, Intensity
        Map<Integer, Integer> ID1check = new HashMap<>()    //to see if it has been identified, 0 uncheck, 1 check
        Map<Double, Double> tempMz2List = new HashMap<>()
        String[] tmpline
        String line
        Integer lastPID = 0 // ms2 parent peak id
        Integer thisPID = 0
        BigInteger tempi = -1   //file line count
        Integer tempiR = 0  //ms1 peak count

        while ((line = br.readLine()) != null) {
            tempi++
            if (tempi.toInteger() == 0) {
                continue
            }
            tmpline = line.split(/\t/)
            println("$tempi")
            Integer tmpMSLevel = Integer.valueOf(tmpline[2])
            if (tmpMSLevel == 1) {
                def tmpInfo = [tmpline[3], tmpline[4], tmpline[5]].collect() { BigDecimal.valueOf(Double.valueOf(it)) }
                tmpInfo[0] = (tmpInfo[0] / 60).setScale(2, BigDecimal.ROUND_HALF_UP)
                ID1Info.put(Integer.valueOf(tmpline[0]), new ArrayList<BigDecimal>(tmpInfo))
                ID1check.put(Integer.valueOf(tmpline[0]), 0)
            } else if (tmpMSLevel == 2) {
                thisPID = Integer.valueOf(tmpline[1])
                if (thisPID != 0 && (lastPID == 0 || thisPID == lastPID)) {
                    tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
                }
                if (thisPID != 0 && lastPID != 0 && lastPID != thisPID) {
                    tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
                    tempiR++

                    tempParalist.RetentionTime = ID1Info.get(lastPID).get(0)
                    tempParalist.PeakListPath = tempTest.writeMz2File(paraDir, tempMz2List, tempiR)
                    tempParalist.ResultPath = resultDir.toString() + "/result$tempiR"
                    tempParalist.PrecursorMz = ID1Info.get(lastPID)[1]
                    println(tempParalist.RetentionTime + "***&&&***")
                    ID1check.put(lastPID, 1)

                    for (def tempAdduct : adductArray) {
                        settings.remove(VariableNames.PRECURSOR_NEUTRAL_MASS_NAME)
                        // delete properties set by setting checker in previous turn
                        AdductRaw adductRaw = new AdductRaw(tempParalist.PrecursorMz, tempAdduct)
                        Double tempNeutralMass = adductRaw.getNeuralMass()
                        String tempSampleN = tempParalist.ResultPath + "_" + tempParalist.RetentionTime.toString() + "_" +
                                tempParalist.PrecursorMz.toString() + "_" + tempAdduct + "_" + tempNeutralMass + "_"

                        settings.set("SampleName", tempSampleN)
                        //settings.set("IonizedPrecursorMass", tempParalist.PrecursorMz)
                        settings.set(VariableNames.PRECURSOR_NEUTRAL_MASS_NAME, tempNeutralMass)
                        settings.set("PeakListPath", tempParalist.PeakListPath)
                        println(tempParalist.ResultPath + "%%%%%%")
                        println(tempParalist.PrecursorMz + "******")

                        SettingsChecker settingsChecker = new SettingsChecker();
                        if (!settingsChecker.check(settings)) return;

                        //File tempParaFile = tempTest.writeParaFile(paraDir, tempParalist, tempi)

                        tempTest.singleMetFrag(settings, mp)
                    }
                    tempMz2List.clear()
                }
                lastPID = thisPID
            }
        }
        br.close()
        if (lastPID > 0) {
            tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
            tempiR++

            tempParalist.RetentionTime = ID1Info.get(lastPID)[0]
            tempParalist.PeakListPath = tempTest.writeMz2File(paraDir, tempMz2List, tempiR)
            tempParalist.ResultPath = resultDir.toString() + "/result$tempiR"
            tempParalist.PrecursorMz = ID1Info.get(lastPID)[1]
            println(tempParalist.RetentionTime + "***&&&***")
            ID1check.put(lastPID, 1)

            for (def tempAdduct : adductArray) {
                settings.remove(VariableNames.PRECURSOR_NEUTRAL_MASS_NAME)
                // delete properties set by setting checker in previous turn
                AdductRaw adductRaw = new AdductRaw(tempParalist.PrecursorMz, tempAdduct)
                Double tempNeutralMass = adductRaw.getNeuralMass()
                String tempSampleN = tempParalist.ResultPath + "_" + tempParalist.RetentionTime.toString() + "_" +
                        tempParalist.PrecursorMz.toString() + "_" + tempAdduct + "_" + tempNeutralMass + "_"

                settings.set("SampleName", tempSampleN)
                //settings.set("IonizedPrecursorMass", tempParalist.PrecursorMz)
                settings.set(VariableNames.PRECURSOR_NEUTRAL_MASS_NAME, tempNeutralMass)
                settings.set("PeakListPath", tempParalist.PeakListPath)
                println(tempParalist.ResultPath + "%%%%%%")
                println(tempParalist.PrecursorMz + "******")

                SettingsChecker settingsChecker = new SettingsChecker();
                if (!settingsChecker.check(settings)) return;

                //File tempParaFile = tempTest.writeParaFile(paraDir, tempParalist, tempi)

                tempTest.singleMetFrag(settings, mp)
            }
        }

        Map<Double, ArrayList<MetaboliteDBRef>> ms1DB = MS1Search.loadPSVDatabase(tempParalist.LocalDatabasePath)
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("result-mfrag-tmp","0-result-ms1_woms2")))
        bw << "RT(min),precursorMZ,Intensity,MassError(ppm),MS1Score,Lib_Mass,Lib_Name,Lib_InChI\n"
        for (Integer tmpID: ID1check.keySet()){
            if (ID1check.get(tmpID) == 0) {
                for (def tempAdduct : adductArray) {
                    String peakInfoBar = (ID1Info.get(tmpID).join(',')) + ","

                    AdductRaw adductRaw = new AdductRaw(ID1Info.get(tmpID).get(1), tempAdduct)
                    Double tempNeutralMass = adductRaw.getNeuralMass()

                    ArrayList ms1Array = MS1Search.searchMS1DBmass(tempNeutralMass, tol, ms1DB)
                    MS1Search.writeMS1Result(bw, peakInfoBar, ms1Array)
                }
            }
        }
        bw.close()
    }

    static void ms2idSLib (String tmpXCMS, String spectrumLib, Double tol){
        Map spLib = SearchRefLib.loadMGF(spectrumLib)

        File tempFile = new File(tmpXCMS)

        File resultDir = new File("result-slib-tmp")
        if (resultDir.exists()){
            resultDir.deleteDir()
        }
        resultDir.mkdir()

        File cResultFile = new File(resultDir, "/0-result-slib")    // Sum-up file
        if (cResultFile.exists()){cResultFile.delete()}
        cResultFile.createNewFile()
        BufferedWriter bwSum = new BufferedWriter(new FileWriter(cResultFile))
        bwSum << "RT(min),precursorMZ,LibComp_Score,Organism,Lib_Mass,Lib_Name,Lib_InChI\n"

        BufferedReader br = new BufferedReader(new FileReader(tempFile))
        Map<Integer, ArrayList<BigDecimal>> ID1Info = new HashMap<>()   //[0,1,2] RT, MZ, Intensity
        Map<Double, Double> tempMz2List = new HashMap<>()
        String[] tmpline
        String line
        Integer lastPID = 0 // ms2 parent peak id
        Integer thisPID = 0
        BigInteger tempi = -1
        Integer tempiR = 0

        while ((line = br.readLine()) != null){
            tempi++
            if (tempi.toInteger() == 0) {
                continue
            }
            tmpline = line.split(/\t/)
            println("$tempi")
            Integer tmpMSLevel = Integer.valueOf(tmpline[2])
            if (tmpMSLevel == 1) {
                def tmpInfo = [tmpline[3], tmpline[4], tmpline[5]].collect() { BigDecimal.valueOf(Double.valueOf(it)) }
                tmpInfo[0] = (tmpInfo[1] / 60).setScale(2, BigDecimal.ROUND_HALF_UP)
                ID1Info.put(Integer.valueOf(tmpline[0]), new ArrayList<BigDecimal>(tmpInfo))
            } else if (tmpMSLevel == 2) {
                thisPID = Integer.valueOf(tmpline[1])
                if (thisPID != 0 && (lastPID == 0 || thisPID == lastPID)) {
                    tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
                }
                if (thisPID != 0 && lastPID != 0 && lastPID != thisPID) {
                    tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
                    tempiR++

                    Double retentionTime = ID1Info.get(lastPID).get(0)
                    Double precursorMz = ID1Info.get(lastPID).get(1)
                    TreeMap<Double, Double> treeMzList = new TreeMap<>()
                    for (Double tmpKey : tempMz2List.keySet().sort()) {
                        treeMzList.put(tmpKey, tempMz2List.get(tmpKey))
                    }
                    tempMz2List.clear()
                    String peakInfo = "RetentionTime(min)=$retentionTime\nprecursorMZ=$precursorMz\nExperimental spectra peak list\n"
                    String peakInfoBar = "$retentionTime,$precursorMz,"
                    for (Double tmpPeak:treeMzList.keySet()){ peakInfo += tmpPeak + "\t" + treeMzList.get(tmpPeak) + "\n"}

                    String resultPath = resultDir.toString() + "/result${tempiR}_${retentionTime}_${precursorMz}_"

                    ArrayList ms1Array = SearchRefLib.searchMS1mass(precursorMz, tol, spLib)
                    ArrayList ms2Array = SearchRefLib.compareMGF(ms1Array, spLib, treeMzList,0) //cutoff
                    SearchRefLib.writeResult(resultPath, peakInfo, ms2Array)
                    SearchRefLib.writeResultSumup(bwSum, peakInfoBar, ms2Array)
                }
                lastPID = thisPID
            }
        }
        br.close()
        if (lastPID > 0){
            tempMz2List.put(Double.valueOf(tmpline[4]), Double.valueOf(tmpline[5]))
            tempiR++

            Double retentionTime = ID1Info.get(lastPID).get(0)
            Double precursorMz = ID1Info.get(lastPID).get(1)
            TreeMap<Double, Double> treeMzList = new TreeMap<>()
            for (Double tmpKey : tempMz2List.keySet().sort()) {
                treeMzList.put(tmpKey, tempMz2List.get(tmpKey))
            }
            String peakInfo = "RetentionTime(min)=$retentionTime\nprecursorMZ=$precursorMz\nExperimental spectra peak list\n"
            String peakInfoBar = "$retentionTime,$precursorMz,"
            for (Double tmpPeak:treeMzList.keySet()){ peakInfo += tmpPeak + "\t" + treeMzList.get(tmpPeak) + "\n"}

            String resultPath = resultDir.toString() + "/result${tempiR}_${retentionTime}_${precursorMz}_"

            ArrayList ms1Array = SearchRefLib.searchMS1mass(precursorMz, tol, spLib)
            ArrayList ms2Array = SearchRefLib.compareMGF(ms1Array, spLib, treeMzList,0) //cutoff
            SearchRefLib.writeResult(resultPath, peakInfo, ms2Array)
            SearchRefLib.writeResultSumup(bwSum, peakInfoBar, ms2Array)
        }
        bwSum.close()
    }

    //include isotope filter?
    static void ms1idSearch (String tmpXCMS, String ms1psvDB, String[] adductArray, Double tol){
        File tmpInputFile = new File(tmpXCMS)
        BufferedReader br = new BufferedReader(new FileReader(tmpInputFile))

        File resultDir = new File("result-ms1-tmp")
        if (resultDir.exists()){
            resultDir.deleteDir()
        }
        resultDir.mkdir()

        Map<Double, ArrayList<MetaboliteDBRef>> ms1DB = MS1Search.loadPSVDatabase(ms1psvDB)

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("result-ms1-tmp","0-result-ms1")))
        bw << "RT(min),precursorMZ,Intensity,MassError(ppm),MS1Score,Lib_Mass,Lib_Name,Lib_InChI\n"

        Integer tmpi = -1
        br.eachLine {
            tmpi++
            if (tmpi == 0){
                return
            }
            println("$tmpi")

            String[] tmpline = it.split("\t")
            Integer tmpMSlevel = Integer.valueOf(tmpline[2])
            if (tmpMSlevel == 1) {
                println("MS1 processing...")
                BigDecimal tmpRT = (BigDecimal.valueOf(Double.valueOf(tmpline[3])) / 60).setScale(2, BigDecimal.ROUND_HALF_UP)
                BigDecimal tmpMZ = BigDecimal.valueOf(Double.valueOf(tmpline[4]))
                BigDecimal tmpIntensity = BigDecimal.valueOf(Double.valueOf(tmpline[5]))
                for (def tempAdduct : adductArray) {
                    String peakInfoBar = "$tmpRT,$tmpMZ,$tmpIntensity,"

                    AdductRaw adductRaw = new AdductRaw(tmpMZ, tempAdduct)
                    Double tempNeutralMass = adductRaw.getNeuralMass()

                    ArrayList ms1Array = MS1Search.searchMS1DBmass(tempNeutralMass, tol, ms1DB)
                    MS1Search.writeMS1Result(bw, peakInfoBar, ms1Array)
                }
            }
        }
        br.close()
        bw.close()
    }

    static void ms2AnalyzerAnnotate(String inputFile, String queryFile, Double tol){
        QueryFile tmpQFile = new QueryFile()
        tmpQFile.readQueryFile(queryFile)

        Spectrum spectrum = InputFileRead.XCMSread(inputFile, true)
        File tmpDir = new File("result-ms2Ana-tmp")
        if (tmpDir.exists()){tmpDir.delete()}
        tmpDir.mkdir()
        File tmpFile = new File(tmpDir,"ms2AnaResult")
        tmpFile.createNewFile()
        BufferedWriter bw = new BufferedWriter(new FileWriter(tmpFile))

        bw << "ID,RT,precursorMZ,precursorIntensity,QueryType,AnnotationName,AnnotationMZ\n"
        for (PeakPair peakPair:spectrum.peakPairGroup.values()){
            MatchPeakPair_ms2Ana matchPeakPair_ms2Ana = new MatchPeakPair_ms2Ana(peakPair)
            matchPeakPair_ms2Ana.ms2analyzer(tmpQFile, tol)
            bw << matchPeakPair_ms2Ana
        }
        bw.close()
    }
}
