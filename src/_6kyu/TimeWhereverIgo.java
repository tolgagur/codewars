package _6kyu;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class TimeWhereverIgo {
    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        String s = myTime;
        String[] date = s.split(" ");
        String[] years = date[0].split("-");
        String[] time = date[1].split(":");
        int i = Integer.parseInt(years[2]);
        LocalDateTime localDateTime = LocalDateTime.of(
                Integer.parseInt(years[2]), Integer.parseInt(years[1]), Integer.parseInt(years[0]),
                Integer.parseInt(time[0]), Integer.parseInt(time[1]), 00);
        ZonedDateTime zonedDateTimeInUTC = localDateTime.atZone(ZoneId.of(myZone));
        ZonedDateTime zonedDateTimeInEST = zonedDateTimeInUTC.withZoneSameInstant(ZoneId.of(friendZone));

        String newZoned = zonedDateTimeInEST.toString();
        String[] newDate = newZoned.split("[TZ]+");
        String[] newYears = newDate[0].split("-");
        String type = "";
        type = newYears[2]+ "-" + newYears[1] + "-"+ newYears[0];
        String[] newTime = newDate[1].split("[+]+");
        type = type + " " + newDate[1].substring(0,5);

        return type;
    }
}
