package study41Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
        Stream<T> distinct()
        返回由该流的不同元素（根据 Object.equals(Object) ）组成的流。
*/
public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("湖人");
        al.add("马刺队");
        al.add("勇士");
        al.add("骑士队");
        al.add("热火");
        al.add("魔术队");
        //取前4个元素组成一个流
        Stream<String> s1=al.stream().limit(4);
        //跳过3个元素组成一个流
        Stream<String> s2=al.stream().skip(3);

        //合并s1和s2流，并把结果在控制台输出
//        Stream.concat(s1,s2).forEach(System.out::println);
        //合并s1和s2流，要求字符串元素不能重复，并把结果在控制台输出
        Stream.concat(s1,s2).distinct().forEach(System.out::println);

    }
}
