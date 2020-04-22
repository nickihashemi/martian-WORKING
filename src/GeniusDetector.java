import java.util.ArrayList;

public class GeniusDetector implements PatternDetector {

//    public boolean matches(String analyzer) {
//        return analyzer.buffer.matches("GAGA");
//    }

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        return analyzer.buffer.indexOf("GAGA");

    }

    @Override
    public String labelString() {
        return "Label: Genius Detector checks if the DNA has GAGA.";
    }

    @Override
    public String additionalInfo() {
        return "Additional Info: If there is GAGA, the martian is a genius. If not, they are not a genius.";
    }


}




//EC2: range of indexes