package _6kyu;
public class ConsonantValue {
    public static int solve(final String s) {
        String s1 = " abcdefghijklmnopqrstuvwxyz";
        String[] s12 = s1.split("");
        String[] strings = s.split("(a|e|i|o|u)");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            String[] s2 = strings[i].split("");
            int i1 = 0;
            for (int j = 0; j < s2.length; j++) {
                i1 = i1 + s1.indexOf(s2[j]);
                if (i1 >sum)
                    sum = i1;
            }
        }
        return sum;
    }
}