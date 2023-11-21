package study1重载和ArrayList集合;

import java.util.ArrayList;

public class StudentDemo1 {
    public static void main(String[] args) {
//创建集合对象
        ArrayList<Student01> array=new ArrayList<Student01>();
//        创建学生对象
        Student01 s1=new Student01("李",6);
        Student01 s2=new Student01("恒",7);

//        添加到集合中去
        array.add(s1);
        array.add(s2);

        for(int i=0;i< array.size();i++)
        {
            Student01 s=array.get(i);
//            System.out.println(s);s为地址值
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
