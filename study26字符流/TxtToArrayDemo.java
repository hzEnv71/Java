package study26字符流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        ArrayList<String> array=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
        for(String s:array){
            System.out.println(s);
        }

    }
}
