package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
//        Collection<String> l=new ArrayList<String>();
        List<String> l=new ArrayList<>();
        l.add("第一名");
        l.add("第二名");
        l.add("第三名");
//      通过List集合的ListIterator()方法得到
        ListIterator<String> li=l.listIterator();
        System.out.println(l.lastIndexOf("第二名"));
        System.out.println(l.listIterator(2));
//        System.out.println(l.addAll(li));
      /*  while(li.hasPrevious()){
            String s=li.previous();
            System.out.println(s);
        }*/
        while(li.hasNext()) {
            String s = li.next();

            if(s.equals("第二名")){
                li.add("第二名");//通过列表迭代器添加
            }
            System.out.println(s);

        }System.out.println(l);
        //boolean hasPrevious()
        //返回 true如果遍历反向列表，列表迭代器有多个元素。
        while(li.hasPrevious()){
            String s=li.previous();
            System.out.println(s);
        }

    }
}
