package met2id.metFrag

import de.ipbhalle.metfraglib.parameter.ParameterDataTypes

import java.awt.image.RenderedImage
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;

import de.ipbhalle.metfraglib.fragment.DefaultBitArrayFragment;
import de.ipbhalle.metfraglib.interfaces.IImageGenerator;
import de.ipbhalle.metfraglib.interfaces.IWriter;
import de.ipbhalle.metfraglib.list.CandidateList;
import de.ipbhalle.metfraglib.list.DefaultList;
import de.ipbhalle.metfraglib.list.MatchList;
import de.ipbhalle.metfraglib.parameter.ClassNames
import de.ipbhalle.metfraglib.parameter.VariableNames;
import de.ipbhalle.metfraglib.process.CombinedMetFragProcess;
import de.ipbhalle.metfraglib.settings.MetFragGlobalSettings;

public class MetFragGear {
    File writeParaFile(File outputDir, MetFragParaList tempParaList, BigInteger fileOrder){
        InputStream inParaModel = getClass().getResourceAsStream("/source/ex-para-n")
        BufferedReader inBRParaModel = new BufferedReader(new InputStreamReader(inParaModel))
        def tmpPara = []
        inBRParaModel.eachLine { tmpPara << it }

        tmpPara << "PeakListPath = ${tempParaList.PeakListPath}\n"
        tmpPara << "MetFragDatabaseType = ${tempParaList.MetFragDatabaseType}\n"
        tmpPara << "LocalDatabasePath = ${tempParaList.LocalDatabasePath}\n"
        tmpPara << "SampleName = ${tempParaList.ResultPath}\n"
        tmpPara << "IonizedPrecursorMass = ${tempParaList.PrecursorMz}\n"

        File outputFile = new File(outputDir,"tmp-para$fileOrder")
        outputFile.write(tmpPara.join('\n'))
        return outputFile
    }

    MetFragGlobalSettings setMetFragGloabalSettings(MetFragParaList tempParaList){
        MetFragGlobalSettings settings = new MetFragGlobalSettings();
        InputStream inParaModel = getClass().getResourceAsStream("/source/ex-para-n")
        BufferedReader inBRParaModel = new BufferedReader(new InputStreamReader(inParaModel))
        inBRParaModel.eachLine {
            it.trim()
            if (it.startsWith('#') || it.length() == 0) return
            if (it.contains('=')) {
                def tmp = it.split('=')

                String valueString = tmp[1].trim();
                for (int i = 2; i < tmp.length; i++)
                    valueString += "=" + tmp[i];
                settings.set(tmp[0].trim(), ParameterDataTypes.getParameter(valueString.trim(), tmp[0].trim()));
            }
        }

        settings.set("MetFragDatabaseType", tempParaList.MetFragDatabaseType);
        settings.set("LocalDatabasePath", tempParaList.LocalDatabasePath);

        return settings;
    }


    File writeMz2File(File outputDir, Map<Double, Double> mzList, Integer fileOrder){
        File outputFile = new File(outputDir,"tmp-mzlist$fileOrder")
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        mzList.each { key, value ->
            bw.append("$key\t$value\n")
        }
        bw.close()

        return outputFile
    }

    void singleMetFrag(MetFragGlobalSettings settings, CombinedMetFragProcess mp) {
        Logger logger = Logger.getLogger(MetFragGear.class);

        /*
        if(!parameterFile.exists()) {
            logger.error("Parameter file " + parameterFile.getAbsolutePath() + " not found!");
            return;
        }
        if(!parameterFile.canRead()) {
            logger.error("Parameter file " + parameterFile.getAbsolutePath() + " has no read permissions!");
            return;
        }
        if(!parameterFile.isFile()) {
            logger.error("Parameter file " + parameterFile.getAbsolutePath() + " is no regular file!");
            return;
        }
       */
        //MetFragGlobalSettings settings = null;
        /*
         * read settings
         */
        /*
        try {
            settings = MetFragGlobalSettings.readSettings(parameterFile, logger);
        }
        catch(Exception e) {
            logger.error("Error reading parameter file " + parameterFile);
            System.exit(1);
        }
        */
        //check settings with SettingsChecker
        //SettingsChecker settingsChecker = new SettingsChecker();
        //if(!settingsChecker.check(settings)) return;
        //init the MetFrag process
        //CombinedMetFragProcess mp = new CombinedMetFragProcess(settings);

        //retrieve candidates from database
        try {
            boolean candidatesRetrieved = mp.retrieveCompounds();
            if(!candidatesRetrieved) throw new Exception();
        } catch (Exception e1) {
            e1.printStackTrace();
            logger.error("Error when retrieving compounds.");
//            System.exit(2);
            return
        }
        //run the MetFrag process -> in silico fragmentation, fragment-peak-assignment, scoring
        try {
            mp.run();
        } catch (Exception e1) {
            e1.printStackTrace();
            logger.error("Error when processing compounds.");
            System.exit(3);
        }
        //fetch the scored candidate list
        CandidateList scoredCandidateList = mp.getCandidateList();
        /*
         * store the results
         */
        try {
            /*
             * store candidates in your specified format
             */
            if(settings.get(VariableNames.METFRAG_CANDIDATE_WRITER_NAME) != null) {
                String[] candidateWriterNames = (String[])settings.get(VariableNames.METFRAG_CANDIDATE_WRITER_NAME);
                for(int k = 0; k < candidateWriterNames.length; k++) {
                    IWriter candidateWriter = (IWriter) Class.forName(ClassNames.getClassNameOfCandidateListWriter(candidateWriterNames[k])).getConstructor().newInstance();
                    try {
                        candidateWriter.write(scoredCandidateList, (String)settings.get(VariableNames.SAMPLE_NAME), (String)settings.get(VariableNames.STORE_RESULTS_PATH_NAME));
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error("Error: Could not write candidate file.");
                        System.exit(4);
                    }
                }
            }
            /*
             * store candidates fragments in your specified format
             */
            if(settings.get(VariableNames.METFRAG_CANDIDATE_FRAGMENT_WRITER_NAME) != null) {
                IWriter candidateWriter = (IWriter) Class.forName(ClassNames.getClassNameOfFragmentListWriter((String)settings.get(VariableNames.METFRAG_CANDIDATE_FRAGMENT_WRITER_NAME))).getConstructor().newInstance();
                try {
                    candidateWriter.write(scoredCandidateList, (String)settings.get(VariableNames.SAMPLE_NAME), (String)settings.get(VariableNames.STORE_RESULTS_PATH_NAME));
                } catch (Exception e) {
                    logger.error("Error: Could not write fragment files.");
                    System.exit(5);
                }
            }
            /*
             * store candidates in your specified image format
             */
            if(settings.get(VariableNames.METFRAG_CANDIDATE_IMAGE_GENERATOR_NAME) != null) {
                IWriter imageWriter = (IWriter) Class.forName((String)settings.get(VariableNames.METFRAG_IMAGE_WRITER_NAME)).getConstructor().newInstance();
                IImageGenerator imageGenerator = (IImageGenerator) Class.forName((String)settings.get(VariableNames.METFRAG_CANDIDATE_IMAGE_GENERATOR_NAME)).getConstructor().newInstance();
                for(int i = 0; i < scoredCandidateList.getNumberElements(); i++) {
                    try {
                        RenderedImage renderedImage = imageGenerator.generateImage(scoredCandidateList.getElement(i));
                        DefaultList imageList = new DefaultList();
                        imageList.addElement(renderedImage);
                        imageWriter.write(imageList, (String)settings.get(VariableNames.SAMPLE_NAME) + "_" + scoredCandidateList.getElement(i).getIdentifier(), (String)settings.get(VariableNames.STORE_RESULTS_PATH_NAME));
                    } catch (Exception e) {
                        logger.error("Error: Could not write candidate image files.");
                        System.exit(5);
                    }
                }
            }
            /*
             * store candidate fragments in your specified image format
             */
            if(settings.get(VariableNames.METFRAG_FRAGMENT_IMAGE_GENERATOR_NAME) != null) {
                IWriter imageWriter = (IWriter) Class.forName((String)settings.get(VariableNames.METFRAG_IMAGE_WRITER_NAME)).getConstructor().newInstance();
                IImageGenerator imageGenerator = (IImageGenerator) Class.forName((String)settings.get(VariableNames.METFRAG_FRAGMENT_IMAGE_GENERATOR_NAME)).getConstructor().newInstance();
                for(int i = 0; i < scoredCandidateList.getNumberElements(); i++) {
                    MatchList matchList = scoredCandidateList.getElement(i).getMatchList();
                    for(int j = 0; j < matchList.getNumberElements(); j++) {
                        try {
                            RenderedImage renderedImage = imageGenerator.generateImage((DefaultBitArrayFragment)matchList.getElement(j).getBestMatchedFragment());
                            DefaultList imageList = new DefaultList();
                            imageList.addElement(renderedImage);
                            imageWriter.write(imageList, (String)settings.get(VariableNames.SAMPLE_NAME) + "_" + scoredCandidateList.getElement(i).getIdentifier() + "_fragment_id" + (j+1), (String)settings.get(VariableNames.STORE_RESULTS_PATH_NAME));
                        } catch (Exception e) {
                            logger.error("Error: Could not write fragment image files.");
                            System.exit(6);
                        }
                    }
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
