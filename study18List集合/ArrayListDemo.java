package study18List集合;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList<>();

        Student s1=new Student("第一名",12);
        Student s2=new Student("第二名",14);
        Student s3=new Student("第三名",17);
        // 向集合中添加元素
        l.add(s1);
        l.add(s2);
        l.add(s3);
//      1.迭代器遍历
        Iterator<Student> i=l.iterator();
        while(i.hasNext()){
            Student s=i.next();
            System.out.println(s.getName()+","+s.getAge());
        }
//        2.for循环遍历
        for(int n=0;n<l.size();n++){
            Student s=l.get(n);
            System.out.println(s.getName()+","+s.getAge());
        }
//        3.增强for循环遍历
        for(Student s:l){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
