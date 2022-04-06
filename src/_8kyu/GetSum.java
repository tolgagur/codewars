package _8kyu;

public class GetSum {
    public int GetSum(int a, int b)
    {
        if (a==b)
            return a;
        int sum = 0;
        for (int i = a>b?b:a;i<=(a>b?a:b);i++){
            sum = sum+i;
        }
        return sum;
    }
}
