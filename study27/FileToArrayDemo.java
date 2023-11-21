package study27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        ArrayList<Student> al=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){

            String[] arr=line.split(",");

            Student s=new Student();
            s.setName(arr[0]);
            s.setAge(Integer.parseInt(arr[1]));
            s.setAddress(arr[2]);
            al.add(s);
        }
        br.close();
        for(Student i:al){
            System.out.println(i.getName()+","+i.getAge()+","+i.getAddress());
        }
    }
}
