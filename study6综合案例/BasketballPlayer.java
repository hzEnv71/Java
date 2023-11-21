package study6综合案例;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("篮球运动员吃牛肉");
    }

    @Override
    public void study() {
//        super.study();
        System.out.println("篮球运动员学投篮");
    }
}
