package study42反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentTest {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {

        Class<Student> c = Student.class;
        Class<?> c1=new Student().getClass();
        Class<?> c2=Class.forName("study42反射.student");
        Constructor studentObj = c.getDeclaredConstructor();
        Constructor studentObj1 = c.getDeclaredConstructor(String.class);
        Constructor studentObj2=c.getDeclaredConstructor(String.class,int.class);
        Constructor studentObj3=c.getDeclaredConstructor(String.class,int.class,String.class);
        Field studentField=c.getDeclaredField("name");
        Field studentField1=c.getDeclaredField("age");
        Field studentField2=c.getDeclaredField("address");
        Method studentMethod=c.getDeclaredMethod("function");
        Method studentMethod1=c.getDeclaredMethod("method1");
        Method studentMethod2=c.getDeclaredMethod("method2",String.class);
        Method studentMethod3=c.getDeclaredMethod("method3", String.class, int.class);
        studentObj.setAccessible(true);
        studentObj1.setAccessible(true);
        studentObj2.setAccessible(true);
        studentObj3.setAccessible(true);
        Object obj=studentObj.newInstance();
        Object obj1=studentObj1.newInstance("赵云");
        Object obj2=studentObj2.newInstance("张飞",22);
        Object obj3=studentObj3.newInstance("关羽",30,"海南");
        //当传递的参数个数与接收参数个数不符时或类中变量或方法权限符修饰，则暴力反射
        //public void setAccessile (boolean flag):值为true，取消访问检查
        studentField.setAccessible(true);
        studentField.setAccessible(true);
        studentField.setAccessible(true);

        studentField1.set(obj1,6);
        studentField2.set(obj2,"2号");

        studentMethod.setAccessible(true);
        studentMethod1.setAccessible(true);
        studentMethod2.setAccessible(true);
        studentMethod3.setAccessible(true);

        studentMethod.invoke(obj);
        studentMethod1.invoke(obj1);
        studentMethod2.invoke(obj2,"方法2");
        studentMethod3.invoke(obj3,"方法3",77);


    }
}
