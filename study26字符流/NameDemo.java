package study26字符流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class NameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        ArrayList<String> al=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            al.add(line);
        }
        br.close();
        Random r=new Random();
        int index=r.nextInt(al.size());
        String name= al.get(index);
//        String name=al.get(0);
        System.out.println("回答问题的同学是：\r\n"+name);

    }
}
