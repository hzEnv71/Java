package study2继承和关键字;

public class EXTeacher extends EXPerson {
//     构造老师类无参方法
    public EXTeacher(){};
//     构造老师类带参方法
    public EXTeacher(String name,int age){//一旦构造带方法，系统则不再提供无参构造方法
//        this.name=name;//private不能访问
//        this.age=age;//private不能访问
        super(name, age);//访问父类"构造"方法
    }
    public void teach() {
        System.out.println("教书育人");
        super.shool("学做真人");//访问父类“成员”方法
    }
}