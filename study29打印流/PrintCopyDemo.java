package study29打印流;

import java.io.*;

public class PrintCopyDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("java.txt"));
        PrintWriter pw=new PrintWriter(new FileWriter("fos.txt"),true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
