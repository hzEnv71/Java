package study20TreeSet集合;

import java.util.TreeSet;
//      TreeSet()无参构造,Comparable自然排序
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        Student s1=new Student("diyiming",22);
        Student s2=new Student("chiyiming",25);
        Student s3=new Student("aiyiming",27);
        Student s4=new Student("jiyiming",27);
        Student s5=new Student("jiyiming",27);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
