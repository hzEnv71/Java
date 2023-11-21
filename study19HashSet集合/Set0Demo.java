package study19HashSet集合;

import java.util.HashSet;
import java.util.Set;

public class Set0Demo {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();//不能添加相同的东西
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add("java");
        System.out.println(s);
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("种地".hashCode());
        String s1=new String();

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
    }
}
