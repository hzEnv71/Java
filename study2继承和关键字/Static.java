package study2继承和关键字;

//static可修饰方法，成员变量
public class Static {
    public String name;
    public static int age;//表示共享

    public  void method1(){
//        ”static“修饰的方法”不可以“访问没有被修饰的方法
        method1();

        System.out.println("1被调用");
    }
    public static void method2(){
//        没有被修饰的方法”可以“访问”static“修饰的方法
//       method1();

        System.out.println("2被调用");
    }
    public void method3(int age,String name){

    }
    public static void method4(int age,String name){

    }
}
