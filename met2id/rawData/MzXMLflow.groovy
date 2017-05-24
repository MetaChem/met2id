package met2id.rawData

import met2id.adduct.AdductRaw
import de.ipbhalle.metfraglib.parameter.SettingsChecker
import de.ipbhalle.metfraglib.parameter.VariableNames
import de.ipbhalle.metfraglib.process.CombinedMetFragProcess
import de.ipbhalle.metfraglib.settings.MetFragGlobalSettings
import met2id.metFrag.MetFragGear
import met2id.metFrag.MetFragParaList
import met2id.spectraRef.SearchRefLib
import uk.ac.ebi.pride.tools.jmzreader.model.Spectrum
import uk.ac.ebi.pride.tools.mzxml_parser.MzXMLFile
import uk.ac.ebi.pride.tools.mzxml_parser.MzXMLSpectrum
import uk.ac.ebi.pride.tools.mzxml_parser.mzxml.model.Scan

/**
 * Created by hahah on 2016/11/16.
 */
class MzXMLflow {
    static void ms2idMFrag (String tmpMzXML, MetFragParaList tempParalist, String[] adductArray){
        File tempFile = new File(tmpMzXML)
        MzXMLFile tempParser = new MzXMLFile(tempFile)

        //MzXMLFile.SpectrumIterator tempIter = tempParser.getSpectrumIterator()
        Iterator tempScanIter = tempParser.getScanIterator()
        BigInteger tempi = 0

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
        CombinedMetFragProcess mp = new CombinedMetFragProcess(settings)

        while (tempScanIter.hasNext()){ //& tempi < 1000){
            //MzXMLSpectrum tempspectrum = tempIter.next()
            Scan tempScan = tempScanIter.next()
            Spectrum tempspectrum = new MzXMLSpectrum(tempScan)
            if (tempspectrum.getMsLevel() == 1) { continue }

            Map<Double, Double> tempMzList = tempspectrum.getPeakList()
            tempi++

            def tempM = tempScan.retentionTime.toString() =~ /[\d\.]+/
            BigDecimal tmpNum = new BigDecimal(Double.valueOf(tempM[0].toString())/60)
            tempParalist.RetentionTime = tmpNum.setScale(2, BigDecimal.ROUND_HALF_UP)
            tempParalist.PeakListPath = tempTest.writeMz2File(paraDir, tempMzList, tempi)
            tempParalist.ResultPath = resultDir.toString() + "/result$tempi"
            tempParalist.PrecursorMz = tempspectrum.precursorMZ
            println(tempParalist.RetentionTime + "***&&&***")

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
    }

    static void ms2idSLib (String tmpMzXML, String spectrumLib, Double tol){
        Map spLib = SearchRefLib.loadMGF(spectrumLib)

        File tempFile = new File(tmpMzXML)
        MzXMLFile tempParser = new MzXMLFile(tempFile)

        //MzXMLFile.SpectrumIterator tempIter = tempParser.getSpectrumIterator()
        Iterator tempScanIter = tempParser.getScanIterator()
        BigInteger tempi = 0

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

        while (tempScanIter.hasNext()){ //& tempi < 1000){
            //MzXMLSpectrum tempspectrum = tempIter.next()
            Scan tempScan = tempScanIter.next()
            Spectrum tempspectrum = new MzXMLSpectrum(tempScan)
            if (tempspectrum.getMsLevel() == 1) { continue }

            def tempM = tempScan.retentionTime.toString() =~ /[\d\.]+/
            BigDecimal tmpNum = new BigDecimal(Double.valueOf(tempM[0].toString())/60)
            Double retentionTime = tmpNum.setScale(2, BigDecimal.ROUND_HALF_UP)

            Double precursorMz = tempspectrum.precursorMZ
            Map<Double, Double> tempMzList = tempspectrum.getPeakList()
            TreeMap<Double, Double> treeMzList = new TreeMap<>(tempMzList)
            String peakInfo = "RetentionTime(min)=$retentionTime\nprecursorMZ=$precursorMz\nExperimental spectra peak list\n"
            String peakInfoBar = "$retentionTime,$precursorMz,"
            for (Double tmpPeak:treeMzList.keySet()){ peakInfo += tmpPeak + "\t" + treeMzList.get(tmpPeak) + "\n"}
            tempi++
            String resultPath = resultDir.toString() + "/result${tempi}_${retentionTime}_${precursorMz}_"

            ArrayList ms1Array = SearchRefLib.searchMS1mass(precursorMz, tol, spLib)
            ArrayList ms2Array = SearchRefLib.compareMGF(ms1Array, spLib, treeMzList,0) //cutoff
            SearchRefLib.writeResult(resultPath, peakInfo, ms2Array)
            SearchRefLib.writeResultSumup(bwSum, peakInfoBar, ms2Array)
        }

        bwSum.close()
    }
}
