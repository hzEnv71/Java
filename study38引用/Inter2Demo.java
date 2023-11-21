package study38引用;

public class Inter2Demo {
    public static void main(String[] args) {
        //Lambda表达式
        usemethod(s ->
        {System.out.println(s.toUpperCase());
        return 8;});
        //引用对象的实例方法,其实就是引用类中的成员方法
        //对象::成员方法
        Inter2String is=new Inter2String();
        usemethod(is::method);
        //Lambda表达式被对象的实例方法替代的时候
        //它的形式参数全部传递给该方法作为参数
    }

    public static void usemethod(Inter2 r) {
        r.show("hello");

    }
}
