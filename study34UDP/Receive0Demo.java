package study34UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive0Demo {
    public static void main(String[] args) throws IOException {
        //        DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket(110);
//        DatagramPacket(byte[] buf, int length)
        while (true) {
//        构造一个 DatagramPacket用于接收长度的数据包 length 。
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);
//        解析数据包
//        byte[] getData 返回数据缓冲区
            byte[] b = dp.getData();
//        int getLength() 返回要发送的数据的长度或接收到的数据的长度
            int length = dp.getLength();
//        转换成指定长度的字符串
            String s = new String(b, 0, length);
            System.out.println("接受到的数据是:" + s);
//        关闭接收端
//            ds.close();

        }
    }
}
