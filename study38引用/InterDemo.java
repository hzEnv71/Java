package study38引用;

public class InterDemo {
    public static void main(String[] args) {
        //Lambda表达式
        usemethod((int q) -> System.out.println(q));
        //方法引用
        //类名::类普通方法
        usemethod(System.out::println);

    }
    private  static void usemethod(Inter  r){
        r.method(612);
    }
}
