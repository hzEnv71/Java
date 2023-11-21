package study15日期时间类;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar是抽象类，不可以被实例化，需要调用其静态方法来得到对象
        Calendar c= Calendar.getInstance();
        System.out.println(c);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;//MONTH从0开始计数
        int date=c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

        c.add(Calendar.YEAR,10);
        c.add(Calendar.MONTH,-22);
        c.add(Calendar.DATE,-18);
        int year1=c.get(Calendar.YEAR);
        int month1=c.get(Calendar.MONTH)+1;//MONTH从0开始计数
        int date1=c.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+date1+"日");

        c.set(2020,0,1);
        int year2=c.get(Calendar.YEAR);
        int month2=c.get(Calendar.MONTH)+1;//MONTH从0开始计数
        int date2=c.get(Calendar.DATE);
        System.out.println(year2+"年"+month2+"月"+date2+"日");
    }

  }
