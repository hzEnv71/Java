package study26字符流;

import java.io.*;

public class StringIODemo {
    public static void main(String[] args) throws IOException {
//        字节流->字符流
        FileOutputStream fos=new FileOutputStream("fos.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
//        OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
        osw.write("中国");
        osw.flush();
//        osw.close();
//        字节流->字符流
        FileInputStream fis=new FileInputStream("fos.txt");
        InputStreamReader isr=new InputStreamReader(fis);
//        InputStreamReader isr=new InputStreamReader(fis,"GBK");
       /* int i;
        while((i=isr.read())!=-1){
            System.out.print((char)i);
        }
        isr.close();*/
        char[] bys=new char[1024];
        int ii;
        while((ii=isr.read(bys))!=-1){
            String s=new String(bys,0,ii);
            System.out.println(s);
//            System.out.println(new String(bys,0,ii));
        }
        osw.close();
        isr.close();

    }
}
