package study51IO.NIO.Selector;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取通道
        SocketChannel sChannel= SocketChannel.open(new InetSocketAddress("127.0.0.1",9999));
        //2.切换成非阻塞模式
        sChannel.configureBlocking(false);
        //3.分配指定缓冲区大小
        ByteBuffer buffer= ByteBuffer.allocate(1024);
        //4.发送数据给服务端
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入：");
            String msg=sc.nextLine();
            buffer.put(msg.getBytes());
            buffer.flip();
            sChannel.write(buffer);
            buffer.clear();
        }
    }
}
