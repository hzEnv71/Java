package study21HashMap集合和泛型;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap0Demo {
    public static void main(String[] args) {

        Map<String, Integer> mm = new HashMap<>();
        mm.put("第一名", 22);
        mm.put("第二名", 51);
        mm.put("第三名", 27);
//        Set<K> KeySet():获取所有键的集合
        Set<String> ss = mm.keySet();
        for (String key : ss) {
            int value = mm.get(key);
            System.out.println(key + "," + value);
        }
        Map<String, Integer> m = new HashMap<>();
        m.put("第一名", 22);
        m.put("第二名", 51);
        m.put("第三名", 27);
//      Set<Map.Entry<K,V>> entrySet():获取所有 键值对 对象的集合
        Set<Map.Entry<String, Integer>> s = m.entrySet();
        for (Map.Entry<String, Integer> map : s) {
            System.out.println(map);
            String key = map.getKey();//获取键,Map.Entry中的方法
            int value = map.getValue();//获取值，Map.Entry中的方法
            System.out.println(key + "," + value);

        }
    }
}
