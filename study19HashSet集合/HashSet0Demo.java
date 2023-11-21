package study19HashSet集合;

import java.util.HashSet;

public class HashSet0Demo {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<>();
        Student s1=new Student("第一名",15);
        Student s2=new Student("第二名",17);
        Student s3=new Student("第三名",19);

        Student s4=new Student("第一名",15);//需要在学生类重写hasCode()和equals()方法

        h.add(s1);
        h.add(s2);
        h.add(s3);
        h.add(s4);

        for(Student s:h){
            System.out.println(s.getName()+","+s.getAge());
        }

    }

}
