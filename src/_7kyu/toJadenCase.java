package _7kyu;

public class toJadenCase {
    public String toJadenCase(String phrase) {

        if(phrase==null)
            return null;
        if (phrase.length()<1)
            return null;
        String[] s= phrase.split(" ");
        String text = "";
        for (int i = 0; i < s.length; i++) {
            if(i==0)
                text =s[i].substring(0,1).toUpperCase()+s[i].substring(1,s[i].length());
            else
                text = text + " " + s[i].substring(0,1).toUpperCase()+s[i].substring(1,s[i].length());

        }
        return text;
    }
}
