package study51IO.NIO.Chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 客户端群聊系统
 * */
public class Client {
    //定义属性
    private Selector selector;
    private SocketChannel socketChannel;
    private static final int PORT=9999;
    //构造器初始化
    public Client(){
        try{
            //1.创建选择器
            selector=Selector.open();
            //2.连接服务器
            socketChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",PORT));
            //3.切换为非阻塞模式
            socketChannel.configureBlocking(false);
            //5，将通道注册到选择器上，并且开始指定监听接收事件
            socketChannel.register(selector, SelectionKey.OP_READ);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //创建客户端对象
        Client client=new Client();
        //定义一个线程，专门负责监听服务端发送过来的消息事件
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    client.readInfo();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //发消息
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println("已发送");
            String s=sc.nextLine();
            client.sendToServer(s);
        }
    }

    private void sendToServer(String s) {
        try{
            socketChannel.write(ByteBuffer.wrap(("客户说："+s).getBytes()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //遍历客户端，读取服务端发来的消息
    private void readInfo() throws IOException {
        while(selector.select()>0){
            Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
            while(iterator.hasNext()){
                SelectionKey key= iterator.next();
                if(key.isReadable()){
                    SocketChannel sChannel= (SocketChannel) key.channel();
                    ByteBuffer buffer=ByteBuffer.allocate(1024);
                    sChannel.read(buffer);
                    System.out.println("服务端发来消息"+new String(buffer.array()).trim());

                }
                iterator.remove();
            }
        }
    }
}
