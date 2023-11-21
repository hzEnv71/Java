package study14日期时间类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
//    格式化 Date------->String
        Date d1=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat();//无参，默认格式
        String s1=sdf1.format(d1);
        System.out.println(s1);


        Date d2=new Date();
//        SimpleDateFormat sdf2= new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf2= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//带参
        String s2=sdf2.format(d2);
        System.out.println(s2);

//       解析  String------>Date
        String s3="2020/11/11 上午11:11" ;//必须与默认格式一致
        SimpleDateFormat sdf3=new SimpleDateFormat();//无参
        Date d3=sdf3.parse(s3);
        System.out.println(d3);

        String s4="2020-11-11 11:11:11";
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//带参，格式必须与String一致
        Date d4=sdf4.parse(s4);
        System.out.println(d4);

    }
}
