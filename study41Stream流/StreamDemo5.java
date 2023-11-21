package study41Stream流;

import java.util.ArrayList;
import java.util.stream.IntStream;

/*       <R> Stream<R> map(Function<? super T,? extends R> mapper)
        返回由给定函数应用于此流的元素的结果组成的流。
        IntStream mapToInt(ToIntFunction<? super T> mapper)
        返回一个 IntStream ，其中包含将给定函数应用于此流的元素的结果。*/
public class StreamDemo5 {
     public static void main(String[] args) {
         ArrayList<String> al=new ArrayList<>();
         al.add("3443");
         al.add("3443");
         al.add("12321");
         al.add("6756");
         al.add("435");
         al.add("1212");
         //把集合中的字符串元素转化为整数，并在控制台输出
         al.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
         al.stream().map(Integer::parseInt).forEach(System.out::println);
         al.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
         //int sum() 返回流中元素的总和
         // IntStream中有，Stream中没有

         int sum=al.stream().mapToInt(Integer::parseInt).sum();
         System.out.println(sum);
         al.stream().mapToInt(Integer::parseInt).distinct().forEach(System.out::println);
         long count=al.stream().mapToInt(Integer::parseInt).distinct().count();
         System.out.println(count);
     }
}
