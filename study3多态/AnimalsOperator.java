package study3多态;
//测试类
public class AnimalsOperator {
//    public void useAnimal(Cat c){//相当于Cat c=new Cat();
//        c.eat();
//    }
//    public void useAnimal(Dog d){//相当于Dog d=new Dog();
//        d.eat();
//    }
    public void useAnimal(Animals a){//相当于Animal a=new Cat();编译看左边，运行看右边
        a.eat();
        a.play();
        a.show();
    }
}
