package _8kyu;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int[] ints = new int[n];
        for (int i = 1; i <= n; i++) {
            ints[i-1]=i;
        }
        return ints;
    }
}
