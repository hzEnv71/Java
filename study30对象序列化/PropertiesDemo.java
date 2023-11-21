package study30对象序列化;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
//        Propertise没有泛型，默认Object类型
        Properties p=new Properties();
        p.put("赵云",82);
        p.put("张飞",12);
        p.put("马超",32);
//      遍历集合
//        Set<K> keySet() 返回此映射中包含的键的Set视图。
        Set<Object> s=p.keySet();
        for(Object o:s){
            Object value=p.get(o);
            System.out.println(o+","+value);
        }
    }
}
