package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        boolean add(E e);
        c.add("hello");
        System.out.println(c.add("world"));
        System.out.println(c);
//        boolean remove(Object o);
        c.remove("java");
        System.out.println(c.remove("java"));
        c.remove("hello");
        System.out.println(c);
//        void clear();
        c.clear();
        System.out.println(c);
//        boolean contains(Object o);
        c.contains("world");
        System.out.println(c.contains("world"));
        System.out.println(c.contains("java"));
//        boolean isEmpty();
        System.out.println(c.isEmpty());
//        int size();
        System.out.println(c.size());


    }
}