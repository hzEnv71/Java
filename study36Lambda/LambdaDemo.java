package study36Lambda;

import java.util.concurrent.Callable;

public class LambdaDemo {
    public static void main(String[] args) {
        //使用Lambda必须有接口，并且要求接口中只有一个抽象方法
        useLambda(()-> {
            System.out.println("h");
        });
        //必须有上下文环境，才能推导出Lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        useLambda(new Lambda(){
            @Override
            public void method(){
                System.out.println("skdj");
            }
        });

         Runnable r=(()-> System.out.println("Lambda表达式"));
         new Thread(r).start();

        /* Callable<String> c=(()-> { return "s";});
         new Thread((Runnable) c).start();*/

        new Thread(()-> System.out.println("Lambda")).start();
    }
    private static void useLambda(Lambda l){
        l.method();
    }
}
