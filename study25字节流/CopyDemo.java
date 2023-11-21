package study25字节流;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
//        字节流FileInputStream、FileOutputStream
//        字节缓冲流BufferedInputStream、BufferedOutputStream
        FileInputStream fis=new FileInputStream("E:\\javase\\java.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("E:\\javase\\untitled2\\java.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        //关闭流
        fis.close();
        fos.close();
    }
}
