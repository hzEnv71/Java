package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c=Class.forName("study42反射.Student");
        //public Student(String name,int age,String address)
//        Constructor<T> getConstructor(类<?>... parameterTypes)
        //对应Student类有参构造方法
        Constructor<?> con1=c.getConstructor(String.class,int.class,String.class);
//        T newInstance(Object... initargs)
        //对应Student类有参构造方法
        Object obj1=con1.newInstance("赵云",20,"广州");
        System.out.println(obj1);


        //private Student(String name)
//        Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
        Constructor<?> con2=c.getDeclaredConstructor(String.class);
        //暴力反射
        //public void setAccessile (boolean flag):值为true，取消访问检查
        con2.setAccessible(true);

        Object obj2=con2.newInstance("张飞");
        System.out.println(obj2);
    }
}
