package _4kyu;

import java.util.Arrays;
import java.util.HashSet;

public class Interval {

    public static void main(String[] args) {
        System.out.println(new int[][]{{1, 2}, {6, 10}, {11, 15}});
    }
    public static int sumIntervals(int[][] intervals) {
        if (intervals==null)
            return 0;
        HashSet<Integer> integers = new HashSet<>();
        for (int[] integer:intervals) {
            int num = integer[0];
            for (int i = 0; i < (integer[integer.length-1]-integer[0]); i++) {

                integers.add(num);
                num++;
            }
        }
        int count = integers.size();
        return count;
    }
}