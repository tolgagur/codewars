package _5kyu;

public class zeros {
    public static int zeros(int n) {
        int count = 0;
        int kalan = 0;
        while (n>=5){
            kalan = n/5;
            count = count+kalan;
            n = kalan;
        }
        return count;
    }

}
