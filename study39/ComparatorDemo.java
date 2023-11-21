package study39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("ddd");
        al.add("qqqqqqq");
        al.add("w");
        System.out.println("排序前:"+al);
        Collections.sort(al,getComparator());
        System.out.println("排序后:"+al);

    }
    //函数式接口作为方法的返回值
    private static Comparator<String> getComparator(){

       /* //匿名内部类
        Comparator<String> c=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        return c;*/
        //Lambda表达式
        return (o1, o2) -> o1.length()-o2.length();
    }
}
