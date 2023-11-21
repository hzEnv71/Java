package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student1Demo {
    public static void main(String[] args) {

        List<Student> l=new ArrayList<Student>();

        Student s1=new Student("第一名",12);
        Student s2=new Student("第二名",14);
        Student s3=new Student("第三名",17);
//      向集合中添加元素
        l.add(s1);
        l.add(s2);
        l.add(s3);

//      迭代器
        Iterator<Student> i=l.iterator();
        while(i.hasNext()){//并发修改异常，判断之后不能再对集合进行添加删除操作
            Student s=i.next();
            System.out.println(s.getName()+","+s.getAge());
           //并发修改异常，判断之后不能再对集合进行添加删除操作
            if(s.equals(s1)){
                l.add(s1);
                l.remove(s1);
            }
        }
//      for循环
        for(int n=0;n<l.size();n++){
            Student ss=l.get(n);
            System.out.println(ss.getName()+","+ss.getAge());

        }

    }
}
