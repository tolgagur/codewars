package _6kyu;

public class hasSubpattern {
    public static boolean hasSubpattern(String str) {
        return str.matches("^(\\w+)\\1+$");
    }
}
