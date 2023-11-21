package study26字符流;

import java.io.*;
import java.util.ArrayList;

public class ArrayToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array =new ArrayList<>();
        for(int i=0;i<5;i++){
            array.add("hello"+i);
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos.txt"));
        for(String s:array){
            bw.write(s);
            bw.newLine();//写一行换行符
        }
        bw.flush();
        bw.close();
    }
}
