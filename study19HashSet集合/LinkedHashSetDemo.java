package study19HashSet集合;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();//链表保证元素有序，哈希表保证元素唯一
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("world");
        System.out.println(lhs);
//        遍历
        for(String s:lhs){
            System.out.println(s);

        }
    }
}
