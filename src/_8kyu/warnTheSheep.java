package _8kyu;

public class warnTheSheep {
    public static String warnTheSheep(String[] array) {
        for (int i = 0; i < array.length-1; i++) {

            if (array[i].equals("wolf"))
                return "Oi! Sheep number "
                        + (array.length -1-i)
                        +"! You are about to be eaten by a wolf!";

        }
        return "Pls go away and stop eating my sheep";
    }
}
