package study14日期时间类;

import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {

        Date d1=new Date();
        System.out.println(d1);

        long date1=1*1000*60*60;//单位为毫秒，应为1点。在中国时间为1970.1.1 9点
        Date d2=new Date(date1);
        System.out.println(d2);

        Date d3=new Date();
        System.out.println(d3.getTime()*1.0/1000/60/60/24/365+"年");//返回1970.1.1到现在的毫秒值

        Date d4=new Date();
        long date2=1*1000*60*60;//单位为毫秒，应为1点。在中国时间为1970.1.1 9点
        d4.setTime(date2);//设定时间，给的是毫秒值
        System.out.println(d4);

        Date d5=new Date();
        long date3=System.currentTimeMillis();//设置当前系统时间
        d5.setTime(date3);
        System.out.println(d5);



    }
}
