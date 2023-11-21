package study6综合案例;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");

    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("乒乓球教练吃鸭脖");
    }

    @Override
    public void teach() {
//        super.teach();
        System.out.println("乒乓球教练教抽球");
    }

}
