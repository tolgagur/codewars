package _6kyu;

public class encryptThis {
    public static String encryptThis(String text) {
        if (text.length()<1)
            return "";
        String[] strings = text.split(" ");
        String s = "";
        String textC = "";
        for (int i= 0; i<strings.length;i++){
            if (strings[i].length()>2)
                s = ((int) strings[i].charAt(0)) +
                        strings[i].substring(strings[i].length()-1,strings[i].length())+
                        strings[i].substring(2,strings[i].length()-1)
                        +strings[i].charAt(1);
            else if (strings[i].length()==2)
                s = ((int) strings[i].charAt(0))
                        +strings[i].substring(1,strings[i].length());
            else
                s = String.valueOf((int) strings[i].charAt(0));

            if (i == strings.length-1)
                textC = textC + s;
            else
                textC = textC + s + " ";
        }

        return textC;
    }
}
