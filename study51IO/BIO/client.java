package study51IO.BIO;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        //请求与服务端的Socket对象链接
        try {
            Socket socket = new Socket("10.104.239.184",9999);
//            Socket socket = new Socket("10.104.239.184",9999);
        //得到一个打印流
            PrintStream ps=new PrintStream(socket.getOutputStream());
            //使用循环不断的发送消息给服务端接收
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("请输入：");
                String msg=sc.nextLine();
                ps.println(msg);;
                ps.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
