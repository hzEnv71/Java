package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c=Class.forName("study42反射.Student");
        //Student s=new Student();
        Constructor<?> con=c.getConstructor();
        Object obj=con.newInstance();
        //s.method1();
        Method m1=c.getMethod("method1");
        m1.invoke(obj);
        //s.method2();
        Method m2=c.getMethod("method2",String.class);
        m2.invoke(obj,"赵云");
        //s.method3();
        Method m3=c.getMethod("method3",String.class,int.class);
        Object o=m3.invoke(obj,"赵云",22);
        System.out.println(o);
        //s.function();
//        Method m4=c.getMethod("function");
        Method m4=c.getDeclaredMethod("function");
        //暴力反射
        //public void setAccessile (boolean flag):值为true，取消访问检查
        m4.setAccessible(true);//设置方法访问权限为private，取消访问权限
        m4.invoke(obj);


    }
}
