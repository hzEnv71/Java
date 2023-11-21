package study38引用;

public class Inter1Demo {
    public static void main(String[] args) {
        //Lambda表达式
        usemethod((s) -> Integer.parseInt(s));
        //引用类方法，其实就是引用类的静态方法
        //类名::类静态方法
        usemethod(Integer::parseInt);
        //Lambda表达式被类方法替代的时候
        //它的形式参数全部传递给静态方法作为参数;
        usemethod(String::length);
    }
    private static void usemethod(Inter1 r){
        int num=r.method("666");
        System.out.println(num);
    }
}
