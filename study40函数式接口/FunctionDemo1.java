package study40函数式接口;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        /*String ss="赵云，30";
        method(ss,(String s)->{
            return s.split(",")[1];
        },(String s)->{
            return Integer.parseInt(s);
        },(Integer i)->{
            return i+20;
        });*/
        method("赵云,30",s -> s.split(",")[1],s -> Integer.parseInt(s),i->i+20);
        //引用
        method("赵云,30",s -> s.split(",")[1],Integer::parseInt,i->i+20);

    }
    private static void method(String s, Function<String,String> fun1, Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        int i =fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }

}
