package _6kyu;

import java.util.Arrays;

public class sortArray {


    public static int[] sortArray(int[] array) {
        int number = Integer.MAX_VALUE;
        int[] ints = new int[array.length];

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[j]%2==1 &&array[i]%2==1 && array[j]>array[i]){
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                }
            }
        }
/*
    // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }
*/
        return Arrays.stream(array).toArray();

    }
}
