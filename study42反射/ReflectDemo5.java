package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c=Class.forName("study42反射.Student");
//        方法[] getMethods()
//        返回包含一个数组 方法对象反射由此表示的类或接口的所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。
//        方法[] getDeclaredMethods()
//        返回包含一个数组 方法对象反射的类或接口的所有声明的方法，通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
//        Method[] methods=c.getMethods();//包括继承和父类
        Method[] methods=c.getDeclaredMethods();//不包括继承和父类
        for(Method method:methods){
            System.out.println(method);
        }
//        方法 getMethod(String name, 类<?>... parameterTypes)
//        返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
//        方法 getDeclaredMethod(String name, 类<?>... parameterTypes)
//        返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。
        Method m1=c.getMethod("method1");
        //获取无参构造方法创建对象
        Constructor<?> con=c.getConstructor();
        Object obj=con.newInstance();
        //obj.m1();
        //方法提供有关类和接口上单一方法的信息和访问权限。

//        Object invoke(Object obj, Object... args)
//        在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        m1.invoke(obj);
    }
}
