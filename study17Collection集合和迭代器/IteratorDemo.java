package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) throws InterruptedException {
/*        Iterator:迭代器，集合的专用遍历方式
        Iterator<E> iterator():返回此集合中的元素的迭代器，通过Collection中的iterator();方法得到
    */
        Collection<String> c = new ArrayList<String>();
//        添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        Iterator<E> iterator():返回此集合中的元素的迭代器，通过Collection中的iterator();方法得到
        Iterator<String> i=c.iterator();
//        E next()获取迭代器中的下一个元素
//        boolean hasNext();判断是否有元素
        while(i.hasNext()){
//            System.out.println(i.next());
            String s=i.next();
            System.out.println(s);
        }
    Thread.sleep(10000000);

    }
}
