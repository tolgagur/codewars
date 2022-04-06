package _6kyu;

public class Multiplesof3or5 {
    public int solution(int number) {
        if(number<1) return -1;
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i%3==0 || i%5==0)
                sum = sum+i;
        }
        return sum;
    }
}
