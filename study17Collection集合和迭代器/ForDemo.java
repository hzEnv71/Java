package study17Collection集合和迭代器;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
//        增强for循环实际上就是一个Iterator()迭代器
        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
        String[] s={"第一名","第二名","第三名"};
        for(String i:s){
            System.out.println(i);
        }
        List<String> l=new ArrayList<String>();
        l.add("第一名");
        l.add("第二名");
        l.add("第三名");
        for(String i:l){
            System.out.println(i);
        }
    }
}
