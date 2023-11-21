package study8抽象类名作为形参和返回值;

public class OperatorDemo {
    public static void main(String[] args) {
        Operator o=new Operator();
        Animal a=new Fish();
        o.useAnimal(a);

        Animal a2=o.getAnimal();//new Fish();
        a2.eat();

    }
}
