package _8kyu;

public class setAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        boolean b = true;
        if (employed == true && vacation==true)
            b = false;
        else if (employed==false)
            b = false;
        else if (employed==true&&vacation==false)
            b = true;
        return b;
    }
}
