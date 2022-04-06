package _4kyu;

public class nextSmaller {
    public static long nextSmaller(long n){
        final char[] chars = Long.toString(n).toCharArray();

        for (int i = chars.length; 0 < i; i--) {
            char digit = chars[i-1];

            for (int j = i; j < chars.length; j++) {
                if (chars[j] < digit) {
                    chars[i-1] = chars[j];
                    chars[j] = digit;
                    return (chars[0] == '0') ? -1 : Long.parseLong(new String(chars));
                }
            }

            System.arraycopy(chars, i, chars, i-1, chars.length - i);
            chars[chars.length-1] = digit;
        }

        return -1;
    }
}
