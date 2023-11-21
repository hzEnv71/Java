package study2继承和关键字;

//extends 可多层继承（一继一）
public class Extends {
    public static void main(String[] args) {
        ExtendsFu f=new ExtendsFu();
        f.show();

        ExtendsZi z=new ExtendsZi();
        z.method();
        z.show();

    }
}
