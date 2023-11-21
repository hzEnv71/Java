package study0常用类;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line=sc.nextLine();

        for(int i=0;i<line.length();i++)//只有在字符串后的length+（）
        {
            System.out.println(line.charAt(i));
        }
    }
}
