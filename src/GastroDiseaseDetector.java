import java.util.ArrayList;

/**
 * detects if there is gastro disease in the sequence
 */
public class GastroDiseaseDetector implements PatternDetector {

    String gastroPattern = "";

    /**
     * loops through the sequence to look for the first index of a match
     * @param analyzer
     * @return int
     */
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        String s = ""; //data member = s

        for (int i=0; i<analyzer.buffer.length();i++) {
            char ch = analyzer.buffer.charAt(i);
            if (ch == 'G') {
                i++;
                if (i>analyzer.buffer.length()) {
                    return -1;
                }
                ch = analyzer.buffer.charAt(i);

                if (ch == 'T') {
                    s = s + 'G';
                    while (ch == 'T') {
                        s = s + ch;
                        i++;

                        if (i > analyzer.buffer.length()) {
                            return -1;
                        }

                        ch = analyzer.buffer.charAt(i);
                    }
                    if (ch == 'G') {
                        s = s + ch;

                    } else {
                        return -1;
                    }
                }
            }
        }

        //System.out.println(s);
        gastroPattern = s;

        return analyzer.buffer.indexOf(s);

    }

    /**
     * labels the match appropriately
     * @return String
     */
    @Override
    public String labelString() {
        return "Label: Gastro Disease Detector checks if the DNA has GT..TG.";
    }

    /**
     * includes the additionalInfo for the match
     * @return String
     */
    @Override
    public String additionalInfo() {
        return "Additional Info: If there is a sequence of G followed by T's and ends with G's, the martian has Gastro Disease. If not, they don't have Gastro Disease.\n" + "Match: " + gastroPattern;
    }


    // detectAll -- //EC2: range of indexes
    // new array list for each detector
    // return array list

    /*
    “ArrayList<Integer> detectAll()” to the PattenDetector,
    and implement that method for each of PatternDetector implementers.
    The function will return a list of the starting indexes for the matches found, or null.
    The new detect methods should call the original one multiple times to do its job
    */
}
