package _7kyu;

public class maxRot {
    public static long maxRot (long n) {
        String num = String.valueOf(n);
        for (int i = 0; i < num.length() - 1; i++) {
            num = num.substring(0, i) +
                    num.substring(i + 1) +
                    num.charAt(i);

            if (Long.parseLong(num) > n) {
                n = Long.parseLong(num);
            }
        }
        return n;
    }
}
