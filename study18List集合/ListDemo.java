package study18List集合;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("javase");
        l.add("javaee");
        l.add("javame");

        l.add(2,"hello");//在指定位置添加元素
        System.out.println(l);

        l.remove(2);//返回被删除的元素
        System.out.println(l.remove(2));
        System.out.println(l);

        l.set(1,"world");//返回被修改的元素
        System.out.println(l.set(1,"world"));
        System.out.println(l);

        l.get(1);
        System.out.println(l.get(1));
        System.out.println(l);

        for(int i=0;i< l.size();i++){
            String s=l.get(i);
            System.out.println(s);
        }


    }
}
