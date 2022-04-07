package test;

import _main.Kata;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class KataTest {
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