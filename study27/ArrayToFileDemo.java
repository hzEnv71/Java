package study27;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayToFileDemo {
    public static void main(String[] args) throws IOException {

        ArrayList<Student> al=new ArrayList<>();
       Student s1=new Student("赵云",17,"深圳");
       Student s2=new Student("吕布",21,"北京");
       Student s3=new Student("关羽",32,"成都");
       al.add(s1);al.add(s2);al.add(s3);
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos.txt"));
        for(Student a:al){
            StringBuilder sb=new StringBuilder();
            sb.append(a.getName()).append(",").append(a.getAge()).append(",").append(a.getAddress());
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
    }
}
