import java.util.ArrayList;

/**
 * detects any matches
 */

public class MartianGenomeSeriesAnalyzer extends GenomeAnalyzer {

    ArrayList<PatternDetector> patternList = new ArrayList<>();

    /**
     * constructor
     * @param fileName
     */
    public MartianGenomeSeriesAnalyzer(String fileName) {
        super(fileName);
    }

    /**
     * adding the detector into an array list
     * @param patternDetector
     */
    public void addDetector(PatternDetector patternDetector) {
        patternList.add(patternDetector);
    }

    /**
     * runs through all the detectors that get added into the array list
     * @param martianGenomeSeriesAnalyzer
     */
    public void runAll(MartianGenomeSeriesAnalyzer martianGenomeSeriesAnalyzer) {
        for (PatternDetector pD: patternList) {
            int index;
            index = pD.detect(martianGenomeSeriesAnalyzer);
            String x = pD.labelString();
            if (x.contains("Genius")) {
                System.out.println(x);
                System.out.println(pD.additionalInfo());
                if (index!=-1) {
                    System.out.println("GAGA at: " + index);
                    System.out.println("");
                } else {
                    System.out.println("GAGA not found: -1");
                    System.out.println("");
                }
            } else if (x.contains("Repeat")){
                System.out.println(x);
                System.out.println(pD.additionalInfo());
                RepeatDetector rD = (RepeatDetector) pD;
                if (index!=-1) {
                    rD.letterTrue();
                    System.out.println(index);
                    System.out.println("");
                } else {
                    rD.letterFalse();
                    System.out.println(index);
                    System.out.println("");
                }
            } else if (x.contains("Gastro")) {
                System.out.println(x);
                System.out.println(pD.additionalInfo());
                if (index!=-1) {
                    System.out.println("Gastro Disease at: " + index);
                    System.out.println("");
                } else {
                    System.out.println("Gastro Disease not found: -1");
                    System.out.println("");
                }
            }
        }

    }

    /**
     * test code for the methods
     * @param args
     */
    public static void main(String args[]){
        MartianGenomeSeriesAnalyzer seriesAnalyzer = new MartianGenomeSeriesAnalyzer("test.txt");
        seriesAnalyzer.addDetector(new GeniusDetector());
        seriesAnalyzer.addDetector(new GastroDiseaseDetector());
        seriesAnalyzer.addDetector(new RepeatDetector("A"));
        seriesAnalyzer.runAll(seriesAnalyzer);

        System.out.println("--------------------------------------\n");

        MartianGenomeSeriesAnalyzer seriesAnalyzer1 = new MartianGenomeSeriesAnalyzer("false.txt");
        seriesAnalyzer1.addDetector(new GeniusDetector());
        seriesAnalyzer1.addDetector(new GastroDiseaseDetector());
        seriesAnalyzer1.addDetector(new RepeatDetector("A"));
        seriesAnalyzer1.runAll(seriesAnalyzer1);

    }

}
