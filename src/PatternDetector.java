/**
 * holds the methods to be implemeneted by the detector classes
 */
public interface PatternDetector {
    //make three classes that implement it:
    // GeniusDetector
    // GastroDiseaseDetector
    // RepeaterDetector

    /**
     * loops through the sequence to look for the first index of a match
     * @param analyzer
     * @return int
     */
    int detect(GenomeAnalyzer analyzer);

    /**
     * labels the match appropriately
     * @return String
     */
    String labelString();

    /**
     * includes the additionalInfo for the match
     * @return String
     */
    String additionalInfo();
}
