package _7kyu;

public class capitalize {
    public static String[] capitalize(String s){
        String d="";
        String e="";
        for(int i=0;i<s.length();i++){
            String a=String.valueOf(s.charAt(i));
            String b=String.valueOf(s.charAt(i));
            if(i%2==0){
                a=a.toUpperCase();}
            else{
                b=b.toUpperCase();}
            d=d+a;
            e=e+b;
        }

        return new String[]{d,e};
    }
}
