package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {

    public static void learnLocalDateTime() {
        Date date = new Date();
    }

    public static void testDate() {
        Date date = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT-8"));
        System.out.println(date);
    }

    public static void testLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }

    public static void testCalendar() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT-8");
        Calendar calendar = Calendar.getInstance(timeZone, Locale.US);
        TimeZone.setDefault(TimeZone.getTimeZone("GMT-8"));
        System.out.println(calendar.getTime());
    }

    public static void main(String[] args) {
//        testDate();
//        TimeZone.setDefault(null);
//        testLocalDateTime();
        testCalendar();

    }

}
