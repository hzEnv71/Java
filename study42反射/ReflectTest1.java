package study42反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;


//      越过泛型检查
//      往ArrayList<Integer>集合添加一个字符串数据
public class  ReflectTest1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
//        al.add("hello");
//        类<?> getClass() 返回此 Object的运行时类。
        Class<? extends ArrayList> c=al.getClass();
//        方法 getMethod(String name, 类<?>... parameterTypes)
//        返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
        Method m = c.getMethod("add", Object.class);
//        Object invoke(Object obj, Object... args)
//        在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        m.invoke(al,"hello");
        m.invoke(al,"java");
        System.out.println(al);

    }
}
