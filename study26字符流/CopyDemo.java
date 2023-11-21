package study26字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
//        字符流的子类
        FileReader fr=new FileReader("fos.txt");
        FileWriter fw=new FileWriter("java.txt");
        int len;
        while((len=fr.read())!=-1){
            fw.write(len);
        }
        fr.close();
        fw.close();
    }
}
