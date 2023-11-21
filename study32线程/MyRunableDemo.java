package study32线程;
public class MyRunableDemo {
    public static void main(String[] args) {
        Myrunable ma=new Myrunable();
        /*Thread t1=new Thread(ma);
        Thread t2=new Thread(ma);*/
//        Thread(Runnable target, String name) 分配一个新的 Thread对象
        Thread t1=new Thread(ma,"线程1");
        Thread t2=new Thread(ma,"线程2");
        Thread t3=new Thread(ma,"线程3");
//        启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
