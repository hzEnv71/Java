package study42反射;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//      通过配置文件运行类中的方法
public class ReflectTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        class。txt
        className=xxx
        methodName=xxx
        */
        //加载数据
        Properties prop=new Properties();
        FileReader fr=new FileReader("class.txt");
        prop.load(fr);
        fr.close();
        /*
        className=study42.Bird
        methodName=fly
        */
        String className=prop.getProperty("className");
        String methodName=prop.getProperty("methodName");
        //通过反射来使用
//        static 类<?> forName(String className)
//        返回与具有给定字符串名称的类或接口关联的 类对象。
        Class<?> c=Class.forName(className);
//        构造器<T> getConstructor(类<?>... parameterTypes)
//        返回一个 构造器对象，该对象反映此 类对象所表示的类的指定公共构造函数。
        Constructor<?> con=c.getConstructor();
//        T newInstance(Object... initargs)
//        使用此 构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例。
        Object obj=con.newInstance();
        //        方法 getMethod(String name, 类<?>... parameterTypes)
//        返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
        Method m=c.getMethod(methodName);
        //        Object invoke(Object obj, Object... args)
//        在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        m.invoke(obj);//调用obj--bird实例的m-fly方法

    }
}
