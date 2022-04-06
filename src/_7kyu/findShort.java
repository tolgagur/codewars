package _7kyu;
import java.util.*;
import java.util.stream.Collectors;
public class findShort {
    public static int findShort(String s) {

        return Arrays.stream(s.split(" "))
                .mapToInt(s1 -> s1.length())
                .min()
                .getAsInt();
    }
}
