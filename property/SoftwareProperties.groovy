package property

/**
 * Created by Thin123 on 2017/3/1.
 */
class SoftwareProperties {
    static HashMap<String, String> propertiesPair = new HashMap<>()

    static void propInistial(){
        propertiesPair.put(PropertyName.PROJECT_NAME,null)
        propertiesPair.put(PropertyName.INPUT_PATH,null)
        propertiesPair.put(PropertyName.TOL,null)
        propertiesPair.put(PropertyName.ADDUCT_TYPE,null)
        propertiesPair.put(PropertyName.PRECURSOR_ION_MODE,null)
        propertiesPair.put(PropertyName.ID_WORKFLOW,null)

        propertiesPair.put(PropertyName.MS1_DB_PATH,null)

        propertiesPair.put(PropertyName.SPECTRA_LIB_PATH,null)

        propertiesPair.put(PropertyName.METFRAG_DB_TYPE,null)
        propertiesPair.put(PropertyName.METFRAG_DB_PATH,null)

        propertiesPair.put(PropertyName.MS2ANALYZER_Q_PATH,null)
    }

    static HashMap<String, String> readPropFromFile(String propFile){
        propInistial()
        println("Reading the property file...")
        File tmpFile = new File(propFile)
        tmpFile.eachLine {
            if (it =~ "#" || it=="") return
            println(it)
            ArrayList<String> tmpS = it.split("=")
            if (propertiesPair.containsKey(tmpS[0].trim())){
                propertiesPair.put(tmpS[0].trim(), tmpS[1].trim())
            }else {
                println("Unrecognized Properties---${tmpS[0]}")
            }
        }
        println("#==========\n")
        return propertiesPair

    }
}
