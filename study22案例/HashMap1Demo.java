package study22案例;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s=sc.nextLine();
//        无序
//        HashMap<Character,Integer> hm=new HashMap<>();
//        有序
        TreeMap<Character,Integer> hm=new TreeMap<>();
        //遍历字符串，得到每一个字符
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
//            拿每一个得到的字符作为键到集合中找对应值，看返回值
            Integer value=hm.get(key);
            if(value==null)//该字符在集合中不存在，把该字符作为键，1作为值存储
            {
                hm.put(key,1);
            }
            else//该字符在集合中存在，把该值+1，重新存储键和值
            {
                value++;
                hm.put(key,value);
            }
        }
//        遍历集合，获取键和值，按要求进行拼接
        StringBuilder sb=new StringBuilder();
        Set<Character> set=hm.keySet();
        for(Character cc:set){
            Integer value=hm.get(cc);
            sb.append(cc).append("(").append(value).append(")");
        }
//        转化为字符串类型输出
        String result=sb.toString();
        System.out.println(result);
    }
}
