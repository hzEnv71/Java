package study15日期时间类;

import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        String s1=DateUtils.DateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2=DateUtils.DateToString(d,"yyyy年MM月dd日");
        System.out.println(s2);
        String s3=DateUtils.DateToString(d,"HH:mm:ss");
        System.out.println(s3);


        String s="2020-11-11 11:11:11" ;
        Date d1=DateUtils.StringToDate(s,"yyyy-MM-dd hh:mm:ss");
        System.out.println(d1);
        s="2020-11-11 " ;
        Date d2=DateUtils.StringToDate(s,"yyyy-MM-dd");
        System.out.println(d2);
        s=" 11:11:11" ;
        Date d3=DateUtils.StringToDate(s," hh:mm:ss");
        System.out.println(d3);


    }
}
