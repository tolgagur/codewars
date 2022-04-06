package _8kyu;

public class ReversedStrings {
    public static String solution(String str) {
        String s = "";
        for (int i = str.length()-1; i >= 0; i--) {
            s = s+str.charAt(i);
        }
        return s;
    }
}
