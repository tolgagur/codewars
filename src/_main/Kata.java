package _main;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata {
    public static void main(String[] args) {
        System.out.println(getNumbers(Arrays.asList(1,2,3,4,5,6,2,7,5,0,10),1));
        System.out.println(getNumbers(Arrays.asList(15,10,11,12,20,0,11,7),21));
        System.out.println(getNumbers(Arrays.asList(1,2,3,4,4,12,3,41,23,123,4,34,342,41,31,5,34,64,234,4,234,5,23,7,5,0,10),11));
        System.out.println(getNumbers(Arrays.asList(1,1,10),11));
        System.out.println(getNumbers(Arrays.asList(1,12,31,2,3,4,12,4,45,12,10),17));
        System.out.println(getNumbers(Arrays.asList(1,6,1,6,1,6,1,6),7));
        System.out.println(getNumbers(Arrays.asList(7,0,7,0,7,0,7,0,7,7,7,7),7));



    }

    public static List<Integer> getNumbers(List<Integer> numbers,int n){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (Integer integer:numbers)
            map.put(integer,n-integer);

        for (Integer integer:map.values())
            if (!(numbers.indexOf(integer)==-1))
                list.add(integer);

        list.stream().sorted();
        return list;
    }

    @Test
    public void exampleTests() {
        assertEquals(Arrays.asList(10, 7, 6, 5, 4, 1), Kata.getNumbers(Arrays.asList(1,2,3,4,5,6,2,7,5,0,10),11));
        assertEquals(Arrays.asList(), Kata.getNumbers(Arrays.asList(1,2,3,4,5,6,2,7,5,0,10),21));
        assertEquals(Arrays.asList(11,10),Kata.getNumbers(Arrays.asList(15,10,11,12,20,0,11,7),21));
        assertEquals(Arrays.asList(),Kata.getNumbers(Arrays.asList(),21));
        assertEquals(Arrays.asList(10, 7, 6, 5, 4, 1), Kata.getNumbers(Arrays.asList(1,2,3,4,5,6,2,7,5,0,10),11));
        assertEquals(Arrays.asList(), Kata.getNumbers(Arrays.asList(1,2,3,4,5,6,2,7,5,0,10),21));
        assertEquals(Arrays.asList(11,10),Kata.getNumbers(Arrays.asList(15,10,11,12,20,0,11,7),21));
        assertEquals(Arrays.asList(),Kata.getNumbers(Arrays.asList(),21));
        assertEquals(Arrays.asList(10,1),Kata.getNumbers(Arrays.asList(1,1,10),11));
        assertEquals(Arrays.asList(),Kata.getNumbers(Arrays.asList(1,12,31,2,3,4,12,4,45,12,10),17));
        assertEquals(Arrays.asList(6,1),Kata.getNumbers(Arrays.asList(1,6,1,6,1,6,1,6),7));
        assertEquals(Arrays.asList(7,0),Kata.getNumbers(Arrays.asList(7,0,7,0,7,0,7,0,7,7,7,7),7));



    }
}
