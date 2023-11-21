package study40函数式接口;
        /*
        default Predicate<T> and(Predicate<? super T> other)
                返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。
        static <T> Predicate<T> isEqual(Object targetRef)
                返回根据 Objects.equals(Object, Object)测试两个参数是否相等的 谓词 。
        default Predicate<T> negate()
                返回表示此谓词的逻辑否定的谓词。
        default Predicate<T> or(Predicate<? super T> other)
                返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑或。
                boolean test(T t)
                在给定的参数上评估这个谓词。
*/
/**判断接口，传入参数，而后返回判断的结果true/false*/
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
      /*  boolean b1=check("hello",(String s)->{
            return s.length()>8;
        });*/
        boolean b1=check("hello",s -> s.length()>8);
        System.out.println(b1);
        boolean b2=check(
                "hello",s->s.length()>8,s->s.length()<15);
        System.out.println(b2);

    }
    private static boolean check(String s, Predicate<String> pre){
//        return pre.test(s);
//        default Predicate<T> negate()
//        返回表示此谓词的逻辑否定的谓词。
//        System.out.println(Predicate.isEqual(new Object()));
        return pre.negate().test(s);
    }
    private static boolean check(String s, Predicate<String> pre1,Predicate<String> pre2){
        /*boolean b1=pre1.test(s);
        boolean b2=pre2.test(s);
        boolean b=b1&&b2;
        return b;*/
//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);
    }


}
