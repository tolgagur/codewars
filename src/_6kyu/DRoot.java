package _6kyu;

import java.util.Arrays;

public class DRoot {
    public static int digital_root(int n) {

        int number =Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(s -> Integer.parseInt(s))
                .sum();

        return number>10?digital_root(number):number;
    }
}
