import java.util.ArrayList;

/**
 * detects if there is repetition in the sequence
 */
public class RepeatDetector implements PatternDetector {

    String letter = "";

    /**
     * constructor to capture the value of letter
     * @param letter
     */
    public RepeatDetector(String letter) {
        this.letter = letter;
    }

    /**
     * In order to include a general variable that depends on the parameter
     */
    public void letterTrue() {
        System.out.print("Five " + letter + "'s at: ");

    }

    /**
     * In order to include a general variable that depends on the parameter
     */
    public void letterFalse() {
        System.out.print("Five " + letter + "'s not found: ");
    }

    /**
     * loops through the sequence to look for the first index of a match
     * @param analyzer
     * @return int
     */
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        //return super.findSimpleSequence(letter+letter+letter+letter+letter);

        return analyzer.buffer.indexOf(letter+letter+letter+letter+letter);
    }

    /**
     * labels the match appropriately
     * @return String
     */
    @Override
    public String labelString() {
        return "Label: Repeat Detector checks if the DNA has any letters that repeat 5 in a row.";
    }

    /**
     * includes the additionalInfo for the match
     * @return String
     */
    @Override
    public String additionalInfo() {
        return "Additional Info: If it does, it will return the first index of where the pattern is identified.\n" + "Match: " + letter+letter+letter+letter+letter;
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
