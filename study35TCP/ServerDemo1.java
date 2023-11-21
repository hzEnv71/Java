package study35TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象
//        ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(1000);
        //        Socket accept() 侦听要连接到此套接字并接受它
        Socket s = ss.accept();
        /*//6.为每一个客户端开启一个线程
        new Thread(new ServerThread(s)).start();*/
        //获取输入流，读数据
        /*
        InputStream is=s.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //在控制台输出
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        /*
        //3.把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("fos.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            *//*
            //   5.自定义结束标记
            if("886".equals(line)){
                break;
            }*//*
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //5.反馈客户端
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw1.write("文件上传成功");
        bw1.newLine();
        bw1.flush();
        //释放资源
        ss.close();
        bw.close();
        */
    }
}
