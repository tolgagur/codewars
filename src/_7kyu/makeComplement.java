package _7kyu;

public class makeComplement {
    public static String makeComplement(String dna) {
        String s = "";
        for (int i = 0; i < dna.length(); i++) {

            if (dna.charAt(i)=='A')
                s = s + 'T';
            else if (dna.charAt(i) == 'T')
                s = s + 'A';
            else if (dna.charAt(i) == 'G')
                s = s + 'C';
            else
                s = s + 'G';
        }
        return s;
    }
}
