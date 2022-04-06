package _8kyu;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] strings = str.split(" ");
        String s = "";
        for (int i = strings.length-1; i >=0 ; i--) {
            s =s +" " + strings[i];
        }
        return s.trim();
    }
}
