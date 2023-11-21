package study2继承和关键字;

public class ExtendsZi extends ExtendsFu {

//    int height=175;
    int age=20;


    public void method(){
        int age=30;
        System.out.println(age);//age为距离最近的age，局部变量
        System.out.println(this.age);//this.age为成员变量
        System.out.println(super.age);//为父/基/强类中的age

//        System.out.println(height);
    }
}
