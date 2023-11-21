package study22案例;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListDemo {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();

        ArrayList<Integer> al = new ArrayList<>();
        al.add(76);
        al.add(81);
        hm.put("第一名", al);
        ArrayList<Integer> al0 = new ArrayList<>();
        al0.add(25);
        al0.add(53);
        hm.put("第二名", al0);
        Set<String> s = hm.keySet();
        for (String i : s) {
            System.out.println(i);//输出键
            ArrayList<Integer> value = hm.get(i);
            for (Integer ii : value) {
                System.out.println(ii);//输出值
            }
        }
    }
}
