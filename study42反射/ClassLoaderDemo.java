package study42反射;
        /*static ClassLoader getSystemClassLoader()
                返回用于委派的系统类加载器。
                ClassLoader getParent()
                返回父类加载器进行委派。*/
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c1=ClassLoader.getSystemClassLoader();
        System.out.println(c1);//AppClassLoader系统类加载器
        ClassLoader c2=c1.getParent();
        System.out.println(c2);//PlatformClassLoader平台类加载器
        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null

    }
}
