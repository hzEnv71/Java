package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c1=Class.forName("study42反射.Student");
//        Constructor<?>[] getConstructors()
//        返回包含一个数组 Constructor对象反射由此表示的类的所有“公共”构造 类对象。
//        Constructor<?>[] cons=c1.getConstructors();
//        Constructor<?>[] getDeclaredConstructors()
//        返回一个反映 Constructor对象表示的类声明的“所有” Constructor对象的数组 类 。
        Constructor<?>[] cons=c1.getDeclaredConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }
//        Constructor<T> getConstructor(类<?>... parameterTypes)
//        返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的"公共" 类函数。
        Constructor<?> con= c1.getConstructor();
//        Constructor提供了一个类的单个构造函数的信息和访问。
//        T newInstance(Object... initargs)
//        使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object obj=con.newInstance();
        System.out.println(obj);
//        Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
//        返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的"指定" 类函数。
        Student student=new Student();
        System.out.println(student);
    }
}
