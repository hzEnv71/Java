package study41Stream流;

import java.util.ArrayList;
       /*     Stream<T> limit(long maxSize)
            返回由此流的元素组成的流，截短长度不能超过 maxSize 。
            Stream<T> skip(long n)
            在丢弃流的第一个 n元素后，返回由该流的 n元素组成的流。*/
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("湖人");
        al.add("马刺队");
        al.add("勇士");
        al.add("骑士队");
        al.add("热火");
        al.add("魔术队");
        //取前3个元素在控制台输出
        al.stream().limit(3).forEach(System.out::println);
        //跳过4个元素，其余的元素在控制台输出
        al.stream().skip(4).forEach(System.out::println);
        //跳过2个元素，其余的前2个元素在控制台输出
        al.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
