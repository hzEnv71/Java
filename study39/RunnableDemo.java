package study39;

public class RunnableDemo {
    public static void main(String[] args) {
        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动");
            }
        });
        //Lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));
    }
    //函数式接口作为方法的参数
    private static void startThread(Runnable r){
        Thread t=new Thread(r);
        t.start();
    }
}
