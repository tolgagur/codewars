package _6kyu;

class Updown {

    public static String arrange(String strng) {
        String[] strings = strng.split(" ");
        String s = "";

        for (int i = 0; i < strings.length-1; i++) {
            String s1 = "";
            if (i%2 == 1 && strings[i].length() < strings[i+1].length() ){
                s1 = strings[i];
                strings[i] = strings[i+1];
                strings[i+1] = s1;
            }
            if (i%2 == 0 && strings[i].length() > strings[i+1].length() ){
                s1 = strings[i];
                strings[i] = strings[i+1];
                strings[i+1] = s1;
            }
        }
        for (int i = 0; i <strings.length; i++) {
            if (i%2 == 0)
                s = s + (i == strings.length-1 ? strings[i].toLowerCase():strings[i].toLowerCase() + " ");
            else
                s= s + (i == strings.length-1 ? strings[i].toUpperCase():strings[i].toUpperCase() + " ");
        }
        return s;
    }
}
