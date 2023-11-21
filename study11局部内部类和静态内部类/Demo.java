package study11局部内部类和静态内部类;

public class Demo {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();
        Outer.Inter i=new Outer.Inter();
        i.show();

    }
}
