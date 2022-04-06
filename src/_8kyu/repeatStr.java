package _8kyu;

public class repeatStr {
    public static String repeatStr(final int repeat, final String string) {
        String text = "";
        for(int i = 0; i<repeat;i++){
            text = text + string;
        }
        return text;
    }
}
