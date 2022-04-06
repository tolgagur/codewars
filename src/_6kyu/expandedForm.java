package _6kyu;

public class expandedForm {
    public static String expandedForm(int num)
    {
        String s = String.valueOf(num);
        String[] strings = s.split("");
        String s1 = "";
        String s2 = "";
        for (int i = s.length()-1; i >=0; i--) {

            if (!strings[i].equals("0"))
                s2 = i ==s.length()-1 ? strings[i] + s1 + s2: s2.equals("") ?strings[i] + s1 + s2:strings[i] + s1+ " + " + s2;
            s1 = s1 +"0";
        }
        return s2;
    }
}
