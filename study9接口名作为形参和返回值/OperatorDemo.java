package study9接口名作为形参和返回值;

public class OperatorDemo {
    public static void main(String[] args) {
        Operator o=new Operator();
        Show s=new Dog();
        o.useShow(s);

        Show s2=o.getShow();
        s2.show();


    }
}
