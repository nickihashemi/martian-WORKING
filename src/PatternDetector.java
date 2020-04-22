public interface PatternDetector {
    //make three classes that implement it:
    // GeniusDetector
    // GastroDiseaseDetector
    // RepeaterDetector

    int detect(GenomeAnalyzer analyzer);

    String labelString();

    String additionalInfo();
}
