package _6kyu;

public class removeParentheses {
    public static String removeParentheses(final String str) {


        int first=Integer.MIN_VALUE;
        int last= Integer.MAX_VALUE;
        String str1 = str;

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == '(') {
                if (first < i)
                    first = i;
            }
        }
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == ')') {
                if (last > i && first<i)
                    last = i;
            }
        }
        if (first>=0 && last<str.length()){
            str1= str.replace(str.substring(first,last+1),"");
            return removeParentheses(str1);
        }
        return str1;
    }
}