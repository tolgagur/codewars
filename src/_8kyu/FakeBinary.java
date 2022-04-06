package _8kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        if (numberString.length()==0)
            return "";
        return Arrays.stream(numberString.split(""))
                .map(s -> Integer.valueOf(s)<5?"0":"1")
                .collect(Collectors.joining(""));
    }
}
