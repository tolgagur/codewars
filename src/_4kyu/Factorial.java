package _4kyu;

import java.math.BigInteger;

public class Factorial
{

    public static String Factorial(int n) {
        BigInteger a = new BigInteger("1");
        BigInteger f = new BigInteger("1");
        if (n<0)
            return null;

        if(n == 0)
            return "1";

        for (int i = 1; i <=n; i++) {
            f = f.multiply(a);
            a = a.add(BigInteger.ONE);
        }

        return String.valueOf(f);
    }

}