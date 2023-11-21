package study41Stream流;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法Stream()生成流
        List<String> l=new ArrayList<>();
        Stream<String> ls=l.stream();
        Set<String> s=new HashSet<>();
        Stream<String> ss=s.stream();

        //Mao体系的集合可以间接生成流
        Map<String,Integer> m=new HashMap<String, Integer>();
        Stream<String> ks = m.keySet().stream();
        Stream<Integer> vs=m.values().stream();
        Stream<Map.Entry<String,Integer>> es=m.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T...values）生成流
        String[] str={"赵云","张飞","关羽"};
        Stream<String> strs1=Stream.of(str);
        Stream<String> strs2=Stream.of("赵云","张飞","关羽");
        Stream<Integer> ints=Stream.of(10,30,50);

    }
}
