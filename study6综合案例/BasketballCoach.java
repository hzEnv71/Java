package study6综合案例;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("篮球教练吃鸡腿");
    }

    @Override
    public void teach() {
//        super.teach();
        System.out.println("篮球教练教投篮");

    }
}
