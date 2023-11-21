package study51IO.NIO.Channel;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;



public class ChannelTest {
    @Test
    public void transferTO() throws Exception {
        //1.字节输入管道
        FileInputStream fis=new FileInputStream("data01.txt");
        FileChannel isChannel=fis.getChannel();
        //2.字节输出管道
        FileOutputStream fos=new FileOutputStream("data02.txt");
        FileChannel osChannel=fos.getChannel();
        //3.复制数据
        osChannel.transferFrom(isChannel, isChannel.position(), isChannel.size());
        isChannel.transferTo(isChannel.position(), isChannel.size(), osChannel);
        isChannel.close();
        osChannel.close();
        System.out.println("复制完成");
    }
    /**
     * 分散和聚合
     * */
    @Test
    public void ScatterAndGather() throws Exception {
        //1.字节输入流管道
        FileInputStream fis=new FileInputStream("data01.txt");
        FileChannel isChannel=fis.getChannel();
        //2.字节输出流管道
        FileOutputStream fos=new FileOutputStream("data02.txt");
        FileChannel osChannel=fos.getChannel();
        //3.定义多个缓冲区做数据分散
        ByteBuffer buffer1=ByteBuffer.allocate(8);
        ByteBuffer buffer2=ByteBuffer.allocate(1024);
        ByteBuffer[] buffers={buffer1,buffer2};
        //4.从每个缓冲区读取数据分散到各个缓冲区
        isChannel.read(buffers);
        //5.从每个缓冲区中查询是否有数据读取到了
        for (ByteBuffer buffer:buffers){
            buffer.flip();//切换到读数据模式
            System.out.println(new String(buffer.array(),0,buffer.remaining()));
        }
        //6.聚集写入到通道
        osChannel.write(buffers);
        isChannel.close();
        osChannel.close();
        System.out.println("文件复制完成");
    }
    /**
     * 文件复制
     * */
    @Test
    public void fileCopy() throws Exception {
        //源文件
        File src=new File("data01.txt");
        File dest=new File("data02.txt");
        //字节输出输入流
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest);
        //得到文件通道
        FileChannel isChannel=fis.getChannel();
        FileChannel osChannel=fos.getChannel();
        //分配缓冲区
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        while(true){
            //必须先清空缓冲区然后再写入数据到缓冲区
            buffer.clear();
            //读取一次数据
            int flag=isChannel.read(buffer);
            if(flag==-1){
                break;
            }
            //已经读取了数据，把缓冲区的模式切换可读模式
            buffer.flip();
            //把数据写出到缓冲区
            osChannel.write(buffer);
        }
        isChannel.close();
        osChannel.close();
        System.out.println("复制完成");
    }
    @Test
    public void write() throws IOException {
        //1.字节输出流通向目标文件
        FileOutputStream fos=new FileOutputStream("data01.txt");
        //2.得到字节输出流对应的通道
        FileChannel fc=fos.getChannel();
        //3.分配缓冲区
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        buffer.put("hell0".getBytes());
        //4.把缓冲区数据写入
        buffer.flip();
        fc.write(buffer);
        //5.关闭通道
        fc.close();
    }
    @Test
    public void read() throws IOException {
        //1.定义字节输入流接通源文件
        FileInputStream fis=new FileInputStream("data01.txt");
        //2.得到字节输入流对应的通道
        FileChannel fc=fis.getChannel();
        //3.分配缓冲区
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        //4.读取数据到缓冲区
        fc.read(buffer);
        buffer.flip();
        //5.读取缓冲区的数据并输出
        System.out.println(new String(buffer.array(),0,buffer.remaining()));
    }


}
