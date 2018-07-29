package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {

    //用来保存上面的17个字段的值，其下标值对应的就是上面17个字段的值（加快索引）。
    protected int fields[];

    //表示数组fields的长度；
    public final static int FIELD_COUNT = 17;

    //表示在getDisplayName()时，显示的形式。可以取值：SHORT、LONG、NARROW_FORMAT、NARROW_STANDALONE、SHORT_FORMAT、LONG_FORMAT、SHORT_STANDALONE、LONG_STANDALONE。
    public static final int ALL_STYLES = 0;

    //
    protected boolean isSet[];

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
        Calendar calendar = null;
        calendar = Calendar.getInstance(timeZone, Locale.US);
        calendar.set(2018, 8, 5);
//        calendar.set(Calendar.DAY_OF_MONTH, 21);

        //DAY_OF_WEEK：这一周里面的天数，从周天开始算一周的起点，且周天为1，周一为2……；
        //如果set的value超过了7，那么全部除以7，取其余数值，则得到的为这周的第几天
        //如果set的value值小于1，那么|(value+1)|/7取其余数值，这时是从周六倒着数对应的天数
        //eg：   value=9, 9/7=2, 所以得到的天数就是本地时间的这一周的周一
        //      value=-3， (|-3|+1)/7 = 2, 倒着数，所以为周五
//        calendar.set(Calendar.DAY_OF_WEEK, -1);
        TimeZone.setDefault(TimeZone.getTimeZone("GMT-8"));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.getTime());

    }

    public static void main(String[] args) {
//        testDate();
//        TimeZone.setDefault(null);
//        testLocalDateTime();
        testCalendar();

    }

}
