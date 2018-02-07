class RnaTranscription {

    String transcribe(String dnaStrand) {
        String RNATranscription = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            RNATranscription += Character.toString(getRNA(dnaStrand.charAt(i)));
        }
        return RNATranscription;
    }

    char getRNA(char x) {
        char letter;
        switch (x) {
            case 'G':
                letter = 'C';
            break;
            case 'C':
                letter = 'G';
            break;
            case 'T':
                letter = 'A';
            break;
            case 'A':
                letter = 'U';
            break;
            default:
                letter = 'X';
        }
        return letter;
    }

}
