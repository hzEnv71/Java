package study5接口;


public class ImplementsDemo {
    public static void main(String[] args) {
        Implements i=new Fish();//多态实例化接口
        i.show();

        Animal a=new Fish();//创建无参对象，需要在Fish类中先添加无参构建方法
        a.setName("鱼一岁");
        a.setAge(1);

        a=new Fish("鱼一岁",1);//创建带参对象，需要在Fish类中先添加带参构建方法

        System.out.println(a.getName()+","+a.getAge());
        a.eat();


        Implements ii=new Bird();//多态实例化接口
        ii.show();

        Animal aa=new Bird();//创建无参对象，需要在Bird类中先添加无参构造方法
        aa.setName("鸟二岁");
        aa.setAge(2);

        aa=new Bird("鸟二岁",2);//创建带参对象，需要在Bird类中先添加带参构造方法

        System.out.println(aa.getName()+","+aa.getAge());
        aa.eat();

    }
}
