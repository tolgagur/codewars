package _7kyu;

import java.util.*;
import java.util.stream.Collectors;
public class highAndLow {
    public static String highAndLow(String numbers) {
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(s -> Integer.parseInt(s)).min().getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(s -> Integer.parseInt(s)).max().getAsInt();

        return max + " " + min;
    }
}