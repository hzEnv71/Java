package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student0Demo {
    public static void main(String[] args) {
        Collection<Student> c=new ArrayList<Student>();

        Student s1=new Student("第一名",12);
        Student s2=new Student("第二名",15);
        Student s3=new Student("第三名",18);
//      添加对象到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);

//        遍历集合
        Iterator<Student> i=c.iterator();
        while(i.hasNext()){
            Student s=i.next();//s指向集合中的地址s1,i的地址不变//s-->s1//s-->s2//s-->s3
//            Student s=s1; Student s=s2;   Student s=s3;

            System.out.println(s.getName()+","+s.getAge());
//            System.out.println(i.next().getName()+","+i.next().getAge());
//            System.out.println(i.next()+","+i.next());
//            System.out.println(s1.getName()+","+s1.getAge());
        }

    }
}
