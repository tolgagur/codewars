package _6kyu;

public class PiApprox {
    public static String iterPi2String(double epsilon) {
        double pi = 0;
        int count = 1;
        while ((Math.abs(Math.PI - 4 * (pi += ((count % 2 == 0 ? -1. : 1.) / (2 * count - 1)))) > epsilon)) {
            count++;
        }
        return "[" + count + ", " + Math.round(40e9 * pi) / 10e9 + "]";
    }
}
