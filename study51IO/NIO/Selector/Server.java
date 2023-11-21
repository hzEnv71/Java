package study51IO.NIO.Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.获取通道
        ServerSocketChannel ssChannel=ServerSocketChannel.open();
        //2.切换为非阻塞模式
        ssChannel.configureBlocking(false);
        //3.绑定连接的端口
        ssChannel.bind(new InetSocketAddress(9999));
        //4.获取选择器
        Selector selector= Selector.open();
        //5.将通道注册到选择器上，并且开始指定监听接收时件
        ssChannel.register(selector, SelectionKey.OP_ACCEPT);//16
        //6.使用Selector轮询已经就绪的事件
        while(selector.select()>0){
            System.out.println("开始一轮事件处理-------");
            //7.获取选择器中所有注册的通道中已经就绪的事件
            Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
            //8.开始遍历这些准备好的事件
            while(iterator.hasNext()){
                //提取当前这个事件
                SelectionKey sk=iterator.next();
                //9.判断这个事件具体是什么
                if(sk.isAcceptable()) {
                    System.out.println("接收事件");
                    //10.直接获取当前接入的客户端通道
                    SocketChannel sChannel = ssChannel.accept();
                    //11.切换成非阻塞模式
                    sChannel.configureBlocking(false);
                    //12.将本客户端通道注册到选择器
                    sChannel.register(selector, SelectionKey.OP_READ);//1
                } else if (sk.isReadable()) {
                    System.out.println("读 事件");
                    //13.获取当前选择器上的 读 就绪事件
                    SocketChannel sChannel= (SocketChannel) sk.channel();
                    //14.读取数据
                    ByteBuffer buffer=ByteBuffer.allocate(1024);
                    int len=0;
                    while((len=sChannel.read(buffer))>0){
//                        System.out.println(len);
                        buffer.flip();//切换只读模式
                        System.out.println(new String(buffer.array(),0,len));
                        System.out.println(new String(buffer.array(),0,buffer.limit()));
                        buffer.clear();//清除之前的数据
                    }
                }
                iterator.remove();//处理完毕之后需要移除当前事件
            }
        }
    }
}
