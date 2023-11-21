package study0常用类;


import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=sc.nextLine();
        String S=Reverse(s);
        System.out.println("S:"+S);
        System.out.println("s:"+s);
    }

    public static String Reverse(String s) {
//        String---StringBuilder---reverse()---toString
//        StringBuilder sb=new StringBuilder(s);
//     //   sb.append(s);
//        sb.reverse();
//        String ss=sb.toString();
//        return ss;

        return new StringBuilder(s).reverse().toString();

    }

}
