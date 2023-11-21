package study23Collections和Arrays工具类;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(19);
        al.add(97);
        al.add(21);
        al.add(38);
//        升序
        Collections.sort(al);
        System.out.println(al);
//        降序
        Collections.reverse(al);
        System.out.println(al);
//        随机
        Collections.shuffle(al);
        System.out.println(al);

    }
}
