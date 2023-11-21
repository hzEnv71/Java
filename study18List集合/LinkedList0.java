package study18List集合;

import java.util.LinkedList;

public class LinkedList0 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("hello");
        l.add("world");
        l.add("java");
//        链表特有方法
        l.addFirst("第一名");
        l.addLast("最后一名");
        System.out.println(l);

        l.getFirst();
        l.getLast();
        System.out.println(l.getFirst()+","+l.getLast());

        l.removeFirst();
        l.removeLast();
        System.out.println(l.removeFirst()+","+l.removeLast());
        System.out.println(l);
    }
}
