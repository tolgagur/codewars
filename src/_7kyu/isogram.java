package _7kyu;

public class isogram {
    public static boolean  isIsogram(String str) {
        if(str.length()== 0)
            return true;

        String strA = str.toLowerCase();

        int n = 0;
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                if(strA.charAt(i) == strA.charAt(j)){
                    n++;
                }
            }
        }
        if(n == 0)
            return true;
        else
            return false;

    }
}
