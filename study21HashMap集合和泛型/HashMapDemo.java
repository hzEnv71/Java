package study21HashMap集合和泛型;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
//       HashMap（key,value)
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("第一名",18);
        hm.put("第二名",21);
        hm.put("第二名",26);//如果key重复，就会替代之前的value
        System.out.println(hm);
        hm.remove("第一名");//返回key对应的value
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.containsKey("第一名"));
        System.out.println(hm.containsValue(18));
        System.out.println(hm.isEmpty());

        hm.put("第一名",18);
        hm.put("第二名",21);
        hm.put("第二名",26);

//      V get(Object K):根据键获取值
        System.out.println(hm.get("第一名"));
//        Set<K> KeySet():获取所有键的集合
        Set<String> s=hm.keySet();
        for(String ss:s){
            System.out.println(ss);
        }
//        Collections<V> Values():获取所有值的集合
        Collection<Integer> c=hm.values();
        for(Integer ii:c){
            System.out.println(ii);
        }
    }
}
