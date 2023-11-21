package study22案例;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMapDemo {
    public static void main(String[] args) {

        ArrayList<HashMap<String, Integer>> al = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("第一名", 66);
        hm.put("第二名", 87);
        al.add(hm);
        HashMap<String, Integer> hm0 = new HashMap<>();
        hm0.put("第三名", 52);
        hm0.put("第四名", 97);
        al.add(hm0);
        for(HashMap<String,Integer> h:al){
            Set<String> key=h.keySet();
            for(String s:key){
                int value=h.get(s);
                System.out.println(s+","+value);
            }
        }

    }
}
