package study6综合案例;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
//        super.eat();
        System.out.println("乒乓球运动员吃羊肉");

    }

    @Override
    public void study() {
//        super.study();
        System.out.println("乒乓球运动员学抽球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");

    }
}
