package study3多态;
//操作类
public class AnimalsDemo {
    public static void main(String[] args) {
//        Animals a=new Cat();
//        a.setName("李恒泽");
//        a.setAge(18);
//        System.out.println(a.getName()+","+a.getAge());

//        创建动物类操作对象，调用方法
        AnimalsOperator ao=new AnimalsOperator();

        Cat c=new Cat();
        ao.useAnimal(c);

        Dog d=new Dog();
        ao.useAnimal(d);

//     编译看左边，执行看右边
       /*
       Animals a= new Cat();//向上转型，把Cat（子类）转换成Animals(父类）
        a.eat();
//        a.play();//解决办法下三行

//        Cat cc=new Cat();
//        cc.eat();
//        cc.play();

        Cat cc=(Cat)a;//向下转型，把Animals（父类）转换成Cat（子类）
        cc.eat();
        cc.play();
       */
    }
}
