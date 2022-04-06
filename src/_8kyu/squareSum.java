package _8kyu;

import java.util.Arrays;

public class squareSum {
    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(i -> i*i).sum();
    }
}
