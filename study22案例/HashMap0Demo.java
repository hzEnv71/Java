package study22案例;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap0Demo {
    public static void main(String[] args) {
        HashMap<Student,String> hm=new HashMap<>();
        Student s1=new Student("赵云",17);
        Student s2=new Student("吕布",21);
        Student s3=new Student("关羽",32);


        hm.put(s1,"深圳");
        hm.put(s2,"成都");
        hm.put(s3,"北京");
        Set<Student>  s=hm.keySet();
        for(Student key:s){
            String value=hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);

        }
        Set<Map.Entry<Student,String>> me=hm.entrySet();
        for(Map.Entry<Student,String> map:me){
            Student key=map.getKey();
            String value=map.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }

    }
}
