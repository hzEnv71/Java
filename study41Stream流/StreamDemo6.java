package study41Stream流;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
        Stream流的收集方法
        R collect(Collector collector)
        static <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
                返回一个 Collector ，它将元素累加到一个 Map ，其键和值是将所提供的映射函数应用于输入元素的结果。
        static <T> Collector<T,?,List<T>> toList()
                返回一个 Collector ，它将输入元素 List到一个新的 List 。
        static <T> Collector<T,?,Set<T>> toSet()
                返回一个 Collector ，将输入元素 Set到一个新的 Set 。
*/
public class StreamDemo6 {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("湖人");
        al.add("马刺队");
        al.add("勇士");
        al.add("骑士队");
        al.add("热火");
        al.add("魔术队");
        //得到名字为3个字的流
        Stream<String> ls=al.stream().filter(s->s.length()==3);
        //把使用Stream流操作完毕的数据收集到Lis集合并遍历
        List<String> names=ls.collect(Collectors.toList());
        for(String s:names){
            System.out.println(s);
        }

        Set<Integer> set=new HashSet<>();
        set.add(100);
        set.add(345);
        set.add(678);
        set.add(23);
        set.add(488);
        //得到值大于350的流
        Stream<Integer> sets=set.stream().filter(s->s>350);
        //把使用Stream流操作完毕的数据收集到Set集合并遍历
        Set<Integer> values=sets.collect(Collectors.toSet());
        for(Integer i:values){
            System.out.println(i);
        }

        String[] str={"赵云,30","张飞,21","关羽,37"};
        //得到字符串中年龄大于25的流
        Stream<String> ss=Stream.of(str).filter(s->Integer.parseInt(s.split(",")[1])>25);
        //把使用Stream流操作完毕的数据收集到Map集合并遍历
        Map<String,Integer> map=ss.collect(Collectors.toMap(s->s.split(",")[0], s->Integer.parseInt(s.split(",")[1])));
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            Integer value=map.get(key);
            System.out.println(key+","+value);
        }

    }
}
