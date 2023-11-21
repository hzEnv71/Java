package study23Collections和Arrays工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        Student s1=new Student("赵云",17);
        Student s2=new Student("吕布",21);
        Student s3=new Student("关羽",32);
        Student s4=new Student("刘备",32);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                o1----s2  o2-----s1
//                o1----s3  o2-----s2
//                o1----s4  o2-----s3
                int num1=o1.getAge()-o2.getAge();//升序,num1>0
//                System.out.println(num1);
//                System.out.println(o1.getAge()+"_"+o2.getAge());
                int num2=num1==0?o1.getName().compareTo(o2.getName()):num1;//升序 num2>0
                return num2;
            }
        });
        for(Student s:al){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
