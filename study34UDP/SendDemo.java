package study34UDP;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
//        DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds=new DatagramSocket();
//        DatagramPacket(byte[] buf, int length, InetAddress address, int port)
//        构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        byte[] bys="hello,UDP".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("172.20.10.5"),100);
       // DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("10.104.127.41"),100);
        ds.send(dp);
//        关闭发送端
        ds.close();
    }
}
