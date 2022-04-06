package _7kyu;

public class getMiddle {
    public static String getMiddle(String word) {
        if(word.length() == 1)
            return word;

        if(word.length() % 2 == 0){
            return word.substring(word.length()/2 - 1, word.length()/2 + 1);
        }
        else{
            return String.valueOf(word.charAt(word.length() / 2));
        }
    }
}
