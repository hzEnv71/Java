package study28标准输入输出流;

import java.io.*;

public class OutDemo {
    public static void main(String[] args) throws IOException {
        /*
        OutputStream os=System.out;
        OutputStreamWriter osw=new OutputStreamWriter(os);
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("zds");
        System.out.println();
        */
        PrintStream ps=System.out;
        ps.println("javase");


    }
}
