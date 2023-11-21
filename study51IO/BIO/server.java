package study51IO.BIO;

import study35TCP.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        //注册端口
        try {
            ServerSocket ss=new ServerSocket(9999);
            //定义死循环，不断接收客户端的Socket链接请求
            while(true){
                Socket socket=ss.accept();
                //创建一个独立的线程来处理与这个客户端的Socket通信请求
                new serverThreadReader(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
