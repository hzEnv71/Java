package study4抽象类;

public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println("鱼儿游");
    }
}
