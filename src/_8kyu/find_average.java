package _8kyu;

import java.util.Arrays;

public class find_average {
    public static double find_average(int[] array){
        return (double) Arrays.stream(array).sum()/array.length;

    }
}
