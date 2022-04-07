package test;


import _4kyu.HowManyNumbers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HowManyNumbersTest {
    @Test
    public void exampleTests() {
        assertEquals(Arrays.asList(8L, 118L, 334L),         HowManyNumbers.findAll(10, 3));
        assertEquals(Arrays.asList(1L, 999L, 999L),         HowManyNumbers.findAll(27, 3));
        assertEquals(new ArrayList<Long>(),                 HowManyNumbers.findAll(84, 4));
        assertEquals(Arrays.asList(123L, 116999L, 566666L), HowManyNumbers.findAll(35, 6));
    }
}


