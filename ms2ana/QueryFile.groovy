package ms2ana

/**
 * Created by Thin123 on 2017/2/28.
 *
 ***REM ReadMe-how to write a query text file
 REM represents the annotation line in the query file
 REM Definition:
 REM "NEUTRAL-LOSS":the m/z difference between precursor ion and product ions
 REM "MZ-DIFFERENCE": the m/z difference between the product ions in a spectrum
 REM "PRECURSOR-ION": the m/z of the precursor ion
 REM "PRODUCT-ION": the m/z of the product ion
 REM Format:
 REM Definition  Name   Mass
 REM Please note:
 REM 1.Each query starts with a definition keyword and takes a single line. Keyword is case sensitive.
 REM 2.The separator between Definition, Name and Mass can be space(single or multiple),tab, or a combination of space and tab.
 REM 3.No space or tab is allowed inside Definition, Name and Mass.
 REM 4.For mass, both integer and decimal numbers are allowed,but comma is not allowed in the mass number.
 REM 5.Optional: separate intensity threshold of each product ion by adding a number(0.0-1.0) after mass. This will overwrite the universal threshold in GUI.
 REM 6.Optional: Any line that start with "REM" is considered as a comment.
 REM 7.If any line is written in query file without REM or keyword, MS2Analyzer will give a warning message,but it can still continue working if you click "OK" and ignore that line.
 REM Start with this file and contact yanma@ucdavis.edu if you have any question.
 REM Examples:

 MZ-DIFFERENCE	HCOOH	46.0054792
 MZ-DIFFERENCE	CH3OH	32.0262134
 MZ-DIFFERENCE	CO	27.994915
 MZ-DIFFERENCE   NO2	45.992904
 MZ-DIFFERENCE	NH3	17.0265478

 NEUTRAL-LOSS	NH3	17.0265478
 NEUTRAL-LOSS	HF	20.0062278
 NEUTRAL-LOSS    H2O     18.0105642

 PRODUCT-ION      DGTS  236.14979
 PRODUCT-ION      PC   184.07387
 PRODUCT-ION      DGTS  236.14979  0.5

 PRECURSOR-ION	PG16:0/16:0	721.50193340
 PRECURSOR-ION	PG16:0/16:1	719.48628420
 PRECURSOR-ION	PG16:0/16:3	715.45498580
 */
class QueryFile {
    ArrayList<MZ_DIff> mz_diffrenceAList
    ArrayList<MZ_DIff> neutral_lossAList
    ArrayList<MZ_DIff> product_ionAList
    ArrayList<MZ_DIff> precursor_ionAList

    QueryFile(){
        this.mz_diffrenceAList = new ArrayList<>()
        this.neutral_lossAList = new ArrayList<>()
        this.product_ionAList = new ArrayList<>()
        this.precursor_ionAList = new ArrayList<>()
    }

    void readQueryFile(String queryFName){
        File queryF = new File(queryFName)
        queryF.eachLine {
            if ( it =~ "^REM" || it == ""){
                return
            }else {
                ArrayList<String> tmpS = it.split("\t")
                if (tmpS[0] == "MZ-DIFFERENCE"){this.mz_diffrenceAList.push(new MZ_DIff(tmpS[1], Double.valueOf(tmpS[2])))}
                if (tmpS[0] == "NEUTRAL-LOSS"){this.neutral_lossAList.push(new MZ_DIff(tmpS[1], Double.valueOf(tmpS[2])))}
                if (tmpS[0] == "PRODUCT-ION"){this.product_ionAList.push(new MZ_DIff(tmpS[1], Double.valueOf(tmpS[2])))}
                if (tmpS[0] == "PRECURSOR-ION"){this.precursor_ionAList.push(new MZ_DIff(tmpS[1], Double.valueOf(tmpS[2])))}

            }
        }
    }
    String toString(){
        return "mzdiff\t" + this.mz_diffrenceAList.size() + "*neutralloss\t" + this.neutral_lossAList.size() +
                "*product-ion\t" + this.product_ionAList.size() + "*precursor-ion\t" + this.precursor_ionAList.size()
    }

    static void main(String[] args){
        QueryFile tmpQ = new QueryFile()
        tmpQ.readQueryFile("SampleQueryFile.txt")
        println(tmpQ)
    }
}
