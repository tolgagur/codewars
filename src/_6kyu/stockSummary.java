package _6kyu;

public class stockSummary {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        String s = "";
        for (int i=0;i<lstOf1stLetter.length;i++){
            int sum = 0;

            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)){
                    String[] strings = lstOfArt[j].split(" ");
                    sum= Integer.parseInt(strings[1]) + sum;
                }
            }
            s = lstOf1stLetter.length-1 ==i? s + "(" + lstOf1stLetter[i] +" : "+sum+ ")":
                    s + "(" + lstOf1stLetter[i] +" : "+sum+ ") - ";

        }
        if (lstOfArt.length<1)
            return "";
        return s;
    }
}
