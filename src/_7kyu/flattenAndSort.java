package _7kyu;

import java.util.Arrays;

public class flattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
