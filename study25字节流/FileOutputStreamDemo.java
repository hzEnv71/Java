package study25字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\Java\\JavaSE\\copy.txt");
        fos.write(97);
        fos.write(98);
        byte[] b={98,99,100};//将指定长度的数组写入
        fos.write(b);
       byte[] bb="abcde".getBytes();//返回字符串对应的字节数组
//       fos.write(b);
       fos.write(bb,1,3);//从off位置到len位置的字节数组写入 1-bcd-3
        fos.close();//关闭输出流并释放资源
        FileOutputStream f=new FileOutputStream("E:\\javase\\untitled2\\java.txt",true);//第二个参数为true，表示追加写入
    }
}
