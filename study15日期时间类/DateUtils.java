package study15日期时间类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){};

    public static String DateToString(Date d1,String format){
        SimpleDateFormat sdf1=new SimpleDateFormat(format);
        String s1=sdf1.format(d1);
        return s1;
    }
    public static Date StringToDate(String s1,String format) throws ParseException {
        SimpleDateFormat sdf2=new SimpleDateFormat(format);
        Date d1=sdf2.parse(s1);
        return d1;
    }
}
