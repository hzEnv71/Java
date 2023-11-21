package study11局部内部类和静态内部类;

public class Outer {
    private static int num=20;

//    局部内部类

    public void show() {
        int num2 = 18;
        class Inter{
            void method() {
                System.out.println(num);
                System.out.println("局部内部类");
            }
        }
        Inter i=new Inter();
        i.method();
    }
        //静态内部类
        static class Inter{
             void show(){
                 System.out.println("静态内部类");
             }
        }
}
