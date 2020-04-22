import java.util.ArrayList;

/**
 * detects if there is genius gene in the sequence
 */
public class GeniusDetector implements PatternDetector {

//    public boolean matches(String analyzer) {
//        return analyzer.buffer.matches("GAGA");
//    }

    /**
     * loops through the sequence to look for the first index of a match
     * @param analyzer
     * @return int
     */
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        return analyzer.buffer.indexOf("GAGA");

    }

    /**
     * labels the match appropriately
     * @return String
     */
    @Override
    public String labelString() {
        return "Label: Genius Detector checks if the DNA has GAGA.";
    }

    /**
     * includes the additionalInfo for the match
     * @return String
     */
    @Override
    public String additionalInfo() {
        return "Additional Info: If there is GAGA, the martian is a genius. If not, they are not a genius.";
    }


}




//EC2: range of indexes