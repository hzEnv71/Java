package study16异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws  {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始");
        method();
        method2();
        System.out.println("结束");

    }

    public static void method() throws ArrayIndexOutOfBoundsException {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
    public static void method2() throws ParseException {
        String s = "2018-6-6";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
