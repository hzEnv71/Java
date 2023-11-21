package study28标准输入输出流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inDemo {
    public static void main(String[] args) throws IOException {
//        标准输入流
        /*
        InputStream is=System.in;
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String s=br.readLine();
        System.out.println(s);
        System.out.println("请输入一个整数：");
        int i=Integer.parseInt(br.readLine());
        System.out.println(i);
    }
}
