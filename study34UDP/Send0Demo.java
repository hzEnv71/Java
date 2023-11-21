package study34UDP;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send0Demo {
    public static void main(String[] args) throws IOException {
//        DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds=new DatagramSocket();
//        自己封装键盘录入数据
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null) {
            if ("886".equals(line)) {
                break;
            }
//        DatagramPacket(byte[] buf, int length, InetAddress address, int port)
//        构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。10.104.85.202
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("10.105.169.74"), 110);
            ds.send(dp);
        }
//        关闭发送端
        ds.close();
    }
}
