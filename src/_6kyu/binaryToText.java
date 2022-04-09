package _6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class binaryToText {
    public static String binaryToText(String binary) {
        String s2 = "";
        char nextChar;

        for(int i = 0; i <= binary.length()-8; i += 8)
        {
            nextChar = (char)Integer.parseInt(binary.substring(i, i+8), 2);
            s2 += nextChar;
        }
        return s2;
    }

    @Test
    public void testHello() {
        assertEquals(
                "Hello",
                binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(
                "",
                binaryToText(""));
    }

}
