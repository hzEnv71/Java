package study7类名作为形参和返回值;

public class OperatorDemo {
    public static void main(String[] args) {
        Operator o=new Operator();
        Fish f=new Fish();
        o.useFish(f);

        Fish f2=o.getFish();//new Fish();
        f2.eat();

    }
}
