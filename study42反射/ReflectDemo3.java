package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c=Class.forName("study42反射.Student");
//        Field[] getFields()
//        返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。
//        Field[] getDeclaredFields()
//        返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
        Field[] fields=c.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }
//        Field getField(String name)
//        返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。
//        Field getDeclaredField(String name)
//        返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。

       Field addressField=c.getField("address");
        //获取无参构造方法创建对象
        Constructor<?> con=c.getConstructor();
        Object obj=con.newInstance();
//        void set(Object obj, Object value)
//        将指定对象参数上的此 Field对象表示的字段设置为指定的新值。

        addressField.set(obj,"广州");//给obj的成员变量赋值
        System.out.println(obj);
        /*Student s=new Student();
        s.address="广州";
        System.out.println(s.address);*/
    }

}
