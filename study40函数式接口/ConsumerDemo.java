package study40函数式接口;
/*
        void accept(T t)
                对给定的参数执行此操作。
        default Consumer<T> andThen(Consumer<? super T> after)
                返回一个组合的 Consumer ，按顺序执行该操作，然后执行 after操作。
*/
/**消费接口，传入一个参数，并对其进行相应的操作*/
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
       /* operatorString("赵云",(String s)->{
            System.out.println(s);
        });*/
        operatorString("赵云",s -> System.out.println(s));
        operatorString("张飞",s -> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));

    }
    private static void operatorString(String name, Consumer<String> con){
//        void accept(T t) 对给定的参数执行此操作
        con.accept(name);
    }
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2){
//        void accept(T t) 对给定的参数执行此操作
        con1.andThen(con2).accept(name);
        /*con1.accept(name);
        con2.accept(name);*/
    }
}
