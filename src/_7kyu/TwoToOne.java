package _7kyu;
import java.util.*;
import java.util.stream.Collectors;
public class TwoToOne {

    public static String longest (String s1, String s2) {
        Set<String> strings = new HashSet<>(Arrays.asList((s1+s2).split("")));
        return strings.stream().sorted().collect(Collectors.joining(""));
    }
}
