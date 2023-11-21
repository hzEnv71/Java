package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Class对象
        Class<?> c=Class.forName("study42反射.Student");
        //Student s=new Student();
        Constructor<?> con=c.getConstructor();
        Object obj=con.newInstance();
        System.out.println(obj);
        //s.name="赵云";
//        Field name=c.getField("name");
        Field nameField=c.getDeclaredField("name");
        //暴力反射
        //public void setAccessile (boolean flag):值为true，取消访问检查
        nameField.setAccessible(true);
        nameField.set(obj,"赵云");
        System.out.println(obj);
        //s.age=22;
        Field ageField=c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,22);
        System.out.println(obj);
        //s.address="广州";
        Field addressField=c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj,"广州");
        System.out.println(obj);



    }
}
