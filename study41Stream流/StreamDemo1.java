package study41Stream流;

import java.util.ArrayList;
/*
        Stream<T> filter(Predicate<? super T> predicate)
                返回由与此给定谓词匹配的此流的元素组成的流。
         void forEach(Consumer<? super T> action)
                对此流的每个元素执行操作。
                long count()
                返回此流中的元素数。
*/

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("湖人");
        al.add("马刺队");
        al.add("勇士");
        al.add("骑士队");
        al.add("热火");
        al.add("魔术队");
        //把List集合中以”湖“开头的在控制台输出
        al.stream().filter((String s)->{
            return s.startsWith("湖");
        }).forEach(s->System.out.println(s));
        al.stream().filter(s->s.startsWith("湖")).forEach(System.out::println);
        //把List集合中长度为3的元素在控制台输出
        al.stream().filter(s->s.length()==3).forEach(System.out::println);
//        把List集合中以”勇“开头的，长度为2的元素在控制台输出
        al.stream().filter(s->s.startsWith("勇")).filter(s->s.length()==2).forEach(System.out::println);
        //把集合中元素在控制台输出
        al.stream().forEach(System.out::println);
        //统计有几个元素以“热”开头，并在控制台输出
        long count=al.stream().filter(s->s.startsWith("湖")).count();
        System.out.println(count);

    }
}
