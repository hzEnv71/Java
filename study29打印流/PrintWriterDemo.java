package study29打印流;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("fos.txt");
        pw.write(97);
        pw.flush();
        pw.println(99);
        pw.flush();
        //---一创建下一个对象调用方法写入时文本先自动清空
//        字符打印流 ，true自动刷新
        PrintWriter p=new PrintWriter(new FileWriter("fos.txt"),true);
        p.println(98);
        p.println(999);
        p.close();

    }
}
