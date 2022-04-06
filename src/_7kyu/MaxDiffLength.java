package _7kyu;

import java.util.Arrays;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length==0 || a2.length ==0)
            return -1;
        int a1max = Arrays.stream(a1).mapToInt(s -> s.length()).max().getAsInt();
        int a1min = Arrays.stream(a1).mapToInt(s -> s.length()).min().getAsInt();
        int a2min = Arrays.stream(a2).mapToInt(s -> s.length()).min().getAsInt();
        int a2max = Arrays.stream(a2).mapToInt(s -> s.length()).max().getAsInt();
        return Math.abs(a1min-a2max)<=Math.abs(a1max-a2min)?Math.abs(a1max-a2min):Math.abs(a1min-a2max);
    }
}
