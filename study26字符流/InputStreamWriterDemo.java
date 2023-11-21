package study26字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class  InputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //转换流：字节流——>字符流
        InputStreamReader isr=new InputStreamReader(new FileInputStream("fos.txt"));
      /*  int c;
        while((c=isr.read())!=-1){
            System.out.print((char)c);
        }*/
        char[] ch=new char[1024];
        int len;
        while((len= isr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        isr.close();

    }
}
