package _main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class StringUtils {
    public static boolean isPalindrome(String string) {
        if (string == null  || string.length() < 2) {
            return false;
        }

        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
class StringTests {

    @ParameterizedTest
    @ValueSource(strings = {"rotator", "Stats", "(radar)", "level", "race car"})
    void testPalindrome(String str) {
        assertTrue(StringUtils.isPalindrome(str));
    }
}
