package study1重载和ArrayList集合;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo2 {
    public static void main(String[] args) {
        ArrayList<Student2> array=new ArrayList<>();
        addStudent(array);
        addStudent(array);
        for(int i=0;i< array.size();i++) {
            Student2 s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
    public  static void addStudent(ArrayList<Student2> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();
//        创建学生对象，把录入的信息赋值给成员变量

        Student2 s=new Student2();
        s.setName(name);
        s.setAge(age);
//        把学生变量放到集合中
        array.add(s);
    }
}
