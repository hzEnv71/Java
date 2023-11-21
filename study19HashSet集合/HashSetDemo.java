package study19HashSet集合;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");//不能重复设定相同的东西
        System.out.println(hs);//不保证存储顺序与读出数据一致
//        遍历
        for(String s:hs){
            System.out.println(s);

        }
    }
}
