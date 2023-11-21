package study16异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throwable {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        method2();
        System.out.println("结束");
    }
//          运行时异常
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
//            public String getMessage()
            System.out.println(e.getMessage());//返回此throwable的详细信息字符串
//            public String ToString()
            System.out.println(e.toString());//返回此可抛出的简短描述

            e.printStackTrace();//把异常错误的信息输出在控制台
        }
    }
//          编译时异常
    public static void method2(){
        try {
            String s = "2018-6-6";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException p){
            p.printStackTrace();
        }

    }
}
