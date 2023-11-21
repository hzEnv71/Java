package study20TreeSet集合;

import java.util.*;

public class RandomDemo {
    public static void main(String[] args) {
//        无序排列
        Set<Integer> hs=new HashSet<>();
//        顺序排列
//        Set<Integer> hs=new TreeSet<Integer>();

        Random r=new Random();

        while(hs.size()<10){
            int num=r.nextInt(20)+1;//返回1-20之间的随机数
            hs.add(num);
        }
        for(Integer i:hs){
            System.out.println(i);
        }
    }
}
