package _6kyu;

public class PangramChecker {
    public boolean check(String sentence){
        String[] strings = "abcdefghijklmnopqrstuvwxyz".split("");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (sentence.toLowerCase().contains(strings[i])){
                count++;
                sentence.replaceAll(strings[i],"");
            }
        }
        return count==strings.length? true:false;
    }
}
