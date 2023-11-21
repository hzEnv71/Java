package study30对象序列化;

import java.io.Serializable;

public class Student implements Serializable {//对象序列化必须实现接口，该接口是标识接口，不需要重写方法
    //变量的作用：标识java类的序列化版本
    private static final long serialVersionUID=88L;//当序列化运行时出问题的解决方法
    private String name;
    private int age;
//    private transient int age;//transient修饰后不被序列化


    public  Student(){}
    public  Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
