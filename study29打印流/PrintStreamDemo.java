package study29打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("fos.txt");
//        字节输出流方法，转码输出
        ps.write(97);
//        特有方法，原样输出
        ps.println(97);
        ps.close();

    }
}
