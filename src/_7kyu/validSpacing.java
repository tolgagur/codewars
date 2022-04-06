package _7kyu;

public class validSpacing {
    public static boolean validSpacing(String s) {
        return s.trim().replaceAll("[(  )]+"," ").equals(s)?true : false;
    }
}
