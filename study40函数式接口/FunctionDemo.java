package study40函数式接口;
/*
        default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
                返回一个组合函数，首先将该函数应用于其输入，然后将 after函数应用于结果。
        R apply(T t)
                将此函数应用于给定的参数。
        default <V> Function<V,R> compose(Function<? super V,? extends T> before)
                返回一个组合函数，首先将 before函数应用于其输入，然后将此函数应用于结果。
        static <T> Function<T,T> identity()
                返回一个总是返回其输入参数的函数。
*/

/**方法接口，主要是用作数据类型之间的转换*/
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Lambda表达式
        /*method("100",(String s)->{
            return Integer.parseInt(s);
        });*/
        method("100",s-> Integer.parseInt(s));
        //引用
//        method("100",Integer::parseInt);
        method(100,i-> String.valueOf(i+55));
        method("100",s->Integer.parseInt(s),i->String.valueOf(i+57));
        method(100,i->String.valueOf(i+57),s->Integer.parseInt(s));
    }
    private static void method(String s, Function<String,Integer> fun){
        int i=fun.apply(s);
        System.out.println(i);
    }
    private static void method(int i, Function<Integer,String> fun){
        String s=fun.apply(i);
        System.out.println(s);
    }
    private static void method(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
        /*Integer i=fun1.apply(s);
        String ss=fun2.apply(i);*/
        String ss=fun1.andThen(fun2).apply(s);
        System.out.println(ss);

    }
    private static void method(int i,Function<Integer,String> fun1,Function<String,Integer> fun2){
        /*Integer i=fun1.apply(s);
        String ss=fun2.apply(i);*/
        Integer ii=fun2.compose(fun1).apply(i);
        System.out.println(ii);

    }

}
