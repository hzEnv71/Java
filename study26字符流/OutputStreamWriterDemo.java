package study26字符流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //转换流：字节流——>字符流
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("fos.txt"));
        osw.write('a');
        osw.flush();//刷新流
        osw.write(98);
        osw.flush();
        char[] c={'a',99,'d'};
        osw.write(c);
        osw.flush();
        char[] ch={'d','e','f'};
        osw.write(ch,1,2);
        osw.flush();
        osw.write("assaads");
        osw.flush();
        osw.write("sfadf",1,3);
        osw.flush();
        osw.close();//先刷新，后关闭

    }
}
