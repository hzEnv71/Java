package study25字节流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\Java\\JavaSE\\copy.txt");
        int by= fis.read();
        System.out.println(by);
//      一次读一个字节
        int i;
        while((i= fis.read())!=-1){
            System.out.print(i);
            System.out.print((char)i);
        }
//        一次读一个字节数组
        byte[] bys=new byte[1024];
        int len;
        while((len=fis.read())!=-1){//数据的下一个字节，如果达到文件的末尾， -1 。
            System.out.println(new String(bys,0,len));
        }
//        释放资源
        fis.close();
        List<List<Integer>> list= new ArrayList<>();
    }
}
