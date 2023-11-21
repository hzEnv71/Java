package study25字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\textc");
            fos.write("javaee在继续".getBytes());
        } catch (IOException io) {
            io.printStackTrace();

        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }
    }
}
