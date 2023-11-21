package study2继承和关键字;

public class EXStudent extends EXPerson{
//    构造学生类无参方法
    public EXStudent(){};
//     构造学生类带参方法
    public EXStudent(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println("努力学习");
        super.shool("艰苦奋斗");//访问父类“成员”方法
    }
}
