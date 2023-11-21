package study4抽象类;

public class Bird extends Animal {
    public Bird() {

    }

    public Bird(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println("鸟儿飞");
    }
}
