package study2继承和关键字;

public class StaticDemo {
    public static void main(String[] args) {
        Static s1=new Static();
        s1.name="李恒泽";
        s1.age=18;
        System.out.println(s1.name+","+s1.age);

        Static s2=new Static();
        s2.name="恒泽李";
        System.out.println(s2.name+","+s2.age);//static共享年龄


    }
}
