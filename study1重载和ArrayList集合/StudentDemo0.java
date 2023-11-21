package study1重载和ArrayList集合;

import java.util.Scanner;

public class StudentDemo0 {
    public static void main(String[] args) {
//        无构造方法创建对象后使用setXxx（）赋值
//        Student s1=new Student();
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        name=sc.nextLine();
        age=sc.nextInt();

//        s1.setName(name);
//        s1.setAge(age);
//

//        使用带参构造方法直接创建带有属性值的对象
        Student01 s2=new Student01("李恒泽",18);

    }
}
