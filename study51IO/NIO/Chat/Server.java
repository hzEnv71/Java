package study51IO.NIO.Chat;

import java.io.IOException;
import java.net.InetSocketAddress;

import java.nio.ByteBuffer;
import java.nio.channels.*;

import java.util.Iterator;

/**
* 服务端群聊系统
* */
public class Server {
    //定义属性
    private Selector selector;
    private ServerSocketChannel ssChannel;
    private static final int PORT=9999;
    //构造器初始化
    public Server(){
        try{
            //1.创建选择器
            selector=Selector.open();
            //2.获取通道
            ssChannel=ServerSocketChannel.open();
            //3.切换为非阻塞模式
            ssChannel.configureBlocking(false);
            //4.绑定连接的端口
            ssChannel.bind(new InetSocketAddress(PORT));
            //5，将通道注册到选择器上，并且开始指定监听接收事件
            ssChannel.register(selector, SelectionKey.OP_ACCEPT);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //创建服务端对象
        Server server=new Server();
        //开始监听客户端的各种消息事件，连接群聊消息，离线消息
        server.listen();
    }
    //监听
    private void listen() {
        System.out.println("监听线程"+Thread.currentThread().getName());
        try{
            while(selector.select()>0){
                //获取选择器中所有注册通道的就绪事件
                Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
                //开始遍历这个事件
                while(iterator.hasNext()){
                    //提取这个事件
                    SelectionKey sk=iterator.next();
                    //判断这个事件
                    if(sk.isAcceptable()){
                        //客户端接入请求
                        //获取当前客户端通道
                        SocketChannel sChannel=ssChannel.accept();
                        //注册成非阻塞模式
                        sChannel.configureBlocking(false);
                        //注册给选择器，监听 读 数据的事件
                        sChannel.register(selector,SelectionKey.OP_READ);
                    }else if(sk.isReadable()){
                        //处理这个客户端的消息，接收它，然后实现逻辑转发
                        readClientData(sk);
                    }
                    iterator.remove();//移除当前事件
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //接收当前客户端的信息，转发给其他客户端通道
    private void readClientData(SelectionKey sk) {
        SocketChannel sChannel=null;
        try{
            //直接得到当前客户端通道
            sChannel= (SocketChannel) sk.channel();
            //创建缓冲区对象，开始接收客户端通道数据
            ByteBuffer buffer= ByteBuffer.allocate(1024);
            int count=sChannel.read(buffer);
            if(count>0){
                buffer.flip();//切换只读模式
                //提取读到的消息
                String msg=new String(buffer.array(),0, buffer.remaining());
                System.out.println("接收到客户端发来的消息：  "+msg);
                //把消息推送给所有客户端
                sendMsgToAllClient(msg,sChannel);
            }

        }catch (Exception e){
            try{
                System.out.println("有人离线了："+sChannel.getRemoteAddress());
                //当前客户端离线
                sk.cancel();//取消注册
                sChannel.close();//关闭当前客户端通道
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    //把消息推送给所有在线客户端
    private void sendMsgToAllClient(String msg, SocketChannel sChannel) throws IOException {
        System.out.println("服务端开始转发这个消息，当前处理的线程"+Thread.currentThread().getName());
        for(SelectionKey key: selector.keys()){
            Channel channel=key.channel();
            //不能把消息发给自己
            if(channel instanceof SocketChannel&& channel!=sChannel){
                ByteBuffer buffer=ByteBuffer.wrap(msg.getBytes());
                ((SocketChannel) channel).write(buffer);
            }
        }
    }
}
