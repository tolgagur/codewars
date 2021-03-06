package _5kyu;

import java.util.LinkedList;

public class RemovedNumbers {
    public static LinkedList<long[]> removNb(long n) {
        LinkedList<long[]> numbers = new LinkedList<long[]>();
        long sum = (n * n + n) / 2;
        for (long a = 1; a < n; a++) {
            double b = (sum - a) / (double) (a + 1);
            if (b <= n && b % 1 == 0) {
                numbers.add(new long[] {a, (long) b});
            }
        }
        return numbers;
    }
}
