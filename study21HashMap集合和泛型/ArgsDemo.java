package study21HashMap集合和泛型;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo {
    public static void main(String[] args) {
//        返回由指定数组支持的固定大小的列表，不可增加删除，  可以修改
        List<String> l= Arrays.asList("1","2","3");
//        l.add("javaee");
//        l.remove("javase");
        l.set(1,"3");
        System.out.println(l);
//        返回包含任意元素数量的不可变列表，不可增加删除修改
        List<String> i=List.of("1","2","3");
//        i.add("javase");
//        i.remove("javaee");
//        i.set(1,"3");
        System.out.println(i);
//        返回一个包含任意元素数量的不可变集合，不可增加删除
        Set<String> s=Set.of("1","2","3");
//        s.add("javase");
//        s.remove("javaee");

        System.out.println(s);


    }
}
