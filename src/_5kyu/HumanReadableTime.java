package _5kyu;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int second = 1;
        int minute = 60;
        int hour = 60*60;
        String text = "";
        if (seconds>=hour){
            int sum = seconds/hour;
            text = sum<10? "0"+sum+":":sum+":";
            seconds = seconds - hour*sum;
        }else {
            text = "00:";
        }
        if (seconds>=minute){
            int sum = seconds/minute;
            text = text +  (sum<10? "0"+sum+":":sum+":");
            seconds = seconds - minute*sum;
        }else {
            text = text + "00:";
        }
        if (seconds>=second){
            int sum = seconds/second;
            text = text + (sum<10? "0"+sum+"":sum+"");
            seconds = seconds - second*sum;
        }else {
            text = text + "00";
        }
        return text;
    }
}