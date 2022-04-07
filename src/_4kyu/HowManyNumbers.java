package _4kyu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class HowManyNumbers {
    private static long count;
    private static long min;
    private static long max;

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        long count = 0;
        long min = 0;
        long max = 0;

        recursiveSearch(0L, 1, sumDigits, numDigits);

        ArrayList<Long> result = new ArrayList<>();

        if (count > 0) {
            result.add(count);
            result.add(min);
            result.add(max);
        }

        return result;
    }

    private static void recursiveSearch(Long currNum, int prevDigit, int sumLeft, int digitsLeft) {
        if (sumLeft == 0 && digitsLeft == 0) {
            if (count == 0) min = currNum;
            min = min < currNum ? min : currNum;
            max = max > currNum ? max : currNum;
            count++;
        } else if (digitsLeft != 0) {
            for (int i = prevDigit; i < 10; i++) {
                recursiveSearch(10 * currNum + i, i,sumLeft - i, digitsLeft - 1);
            }
        }
    }
}
