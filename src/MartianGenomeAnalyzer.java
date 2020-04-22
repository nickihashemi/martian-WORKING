public class MartianGenomeAnalyzer extends GenomeAnalyzer {

    /**
     * check that all letters in buffer are valid (GUAC)
     * @return true if valid
     */
    private boolean validCode() {
        for (int i=0;i<buffer.length();i++) {
            char c = buffer.charAt(i);
            if (genCodeLetters.indexOf(c)== -1)
                return false;
        }
        return true;
    }

    /**
     * constructor
     * @param fileName
     */
    public MartianGenomeAnalyzer(String fileName) {
        super(fileName);
    }

    /**
     * loops through the sequence to look for the first index of a match
     * @return int
     */
    int detectGenius() {
        return super.findSimpleSequence("GAGA");
    }

    /**
     * loops through the sequence to look for the first index of a match
     * @return int
     */
    int detectRepeater(String letter) {
        return super.findSimpleSequence(letter+letter+letter+letter+letter);

    }

    /**
     * loops through the sequence to look for the first index of a match
     * @return int
     */
    int detectGastroDisease () {
        String s = "";

        for (int i=0; i<buffer.length();i++) {
            char ch = buffer.charAt(i);
            if (ch == 'G') {
                i++;
                if (i>buffer.length()) {
                    return -1;
                }
                ch = buffer.charAt(i);

                if (ch == 'T') {
                    s = s + 'G';
                    while (ch == 'T') {
                        s = s + ch;
                        i++;

                        if (i > buffer.length()) {
                            return -1;
                        }

                        ch = buffer.charAt(i);
                    }
                    if (ch == 'G') {
                        s = s + ch;

                    } else {
                        return -1;
                    }
                }
            }
        }


        return super.findSimpleSequence(s);
    }


    /**
     * test code for the methods
     * @param args
     */
    public static void main (String args[]) {
        MartianGenomeAnalyzer martianSequence = new MartianGenomeAnalyzer("test.txt");

        if (martianSequence.validCode()) {
            System.out.println("Valid DNA");
        } else {
            System.out.println("Code not valid DNA");
        }

        //detectGenius()
        int pos = martianSequence.detectGenius();
        if (pos!=-1) {
            System.out.println("GAGA at: " + pos);
        } else {
            System.out.println("GAGA not found: -1");
        }

        //detectGastroDisease()
        int pos3 = martianSequence.detectGastroDisease();
        if (pos3!=-1) {
            System.out.println("Gastro Disease at: " + pos3);
        } else {
            System.out.println("Gastro Disease not found: -1");
        }

        //detectRepeater()
        int pos1 = martianSequence.detectRepeater("A");
        if (pos1!=-1) {
            System.out.println("Five A's at: " + pos1);
        } else {
            System.out.println("Five A's not found: -1\n");
        }

//        //detectRepeater()
//        int pos2 = martianSequence.detectRepeater("G");
//        if (pos2!=-1) {
//            System.out.println("Five G's at: " + pos2);
//        } else {
//            System.out.println("Five G's not found: -1");
//        }

        System.out.println("--------------------------------------\n");

        MartianGenomeAnalyzer martianSequence1 = new MartianGenomeAnalyzer("false.txt");

        if (martianSequence1.validCode()) {
            System.out.println("Valid DNA");
        } else {
            System.out.println("Code not valid DNA");
        }

        //detectGenius()
        int pos4 = martianSequence1.detectGenius();
        if (pos!=-1) {
            System.out.println("GAGA at: " + pos4);
        } else {
            System.out.println("GAGA not found: -1");
        }

        //detectGastroDisease()
        int pos5 = martianSequence1.detectGastroDisease();
        if (pos3!=-1) {
            System.out.println("Gastro Disease at: " + pos5);
        } else {
            System.out.println("Gastro Disease not found: -1");
        }

        //detectRepeater()
        int pos6 = martianSequence1.detectRepeater("A");
        if (pos1!=-1) {
            System.out.println("Five A's at: " + pos6);
        } else {
            System.out.println("Five A's not found: -1");
        }

//        //detectRepeater()
//        int pos2 = martianSequence.detectRepeater("G");
//        if (pos2!=-1) {
//            System.out.println("Five G's at: " + pos2);
//        } else {
//            System.out.println("Five G's not found: -1");
//        }


    }

}
