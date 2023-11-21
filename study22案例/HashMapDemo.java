package study22案例;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class   HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<>();
        Student s1=new Student("赵云",17);
        Student s2=new Student("吕布",21);
        Student s3=new Student("关羽",32);
        hm.put("第一名",s1);
        hm.put("第二名",s2);
        hm.put("第三名",s3);
//        1.键找值
        Set<String> s=hm.keySet();
        for(String ss:s){
            Student value=hm.get(ss);//返回V值
            System.out.println(ss+","+value.getName()+","+value.getAge());
        }
//        2.键值对对象找键和值
        Set<Map.Entry<String,Student>> m=hm.entrySet();
        for(Map.Entry<String,Student> map:m){
            String key= map.getKey();
            Student value=map.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());

        }

    }
}
