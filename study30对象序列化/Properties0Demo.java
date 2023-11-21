package study30对象序列化;

import java.util.Properties;
import java.util.Set;

public class Properties0Demo {
    public static void main(String[] args) {
        Properties p=new Properties();
//        设置键和值，都是String类型
        p.setProperty("赵云","广州");
        p.setProperty("张飞","厦门");
        p.setProperty("马超","长沙");
//      使用指定的键获取对应的属性
        System.out.println(p.getProperty("广州"));
        System.out.println(p.getProperty("张飞"));
//        从该属性列表获取一个不可修改的键集，对应都是字符串
//        Set<String> stringPropertyNames()
//        从此属性列表返回一组不可修改的键，其中键及其对应的值是字符串，如果尚未从主属性列表中找到相同名称的键，则包括默认属性列表中的不同键。
        Set<String> s=p.stringPropertyNames();
        for(String key:s){
           // 使用指定的键获取对应的属性
            String value=p.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}
