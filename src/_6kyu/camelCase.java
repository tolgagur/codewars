package _6kyu;
import java.util.*;
import java.util.stream.Collectors;

public class camelCase {
    public static String camelCase(String input) {
        if (input.length()<1)
            return "";
        return Arrays.stream(input.split(""))
                .map(s1 -> Character.isUpperCase(s1.charAt(0))? " " + s1.charAt(0):s1)
                .collect(Collectors.joining(""));
    }
}
