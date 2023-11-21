package study32线程;

public class MyThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        m1.setName("湖人");
        m2.setName("马刺");


//        带参
        MyThread m3=new MyThread("公牛");
        MyThread m4=new MyThread("太阳");
//        启动线程
        m1.start();
//        等m1执行完后再继续执行下面的内容
//        void join() 等待这个线程死亡。
        m1.join();
//        设置守护线程
        m2.setDaemon(true);
        m3.setDaemon(true);

        m2.start();
        m3.start();
        m4.start();
//        static Thread currentThread()
//        返回对当前正在执行的线程对象的引用。
        System.out.println(Thread.currentThread().getName());
//        设置线程优先级
        m1.setPriority(10);
        m2.setPriority(5);
        m3.setPriority(1);
//       返回线程的优先级，默认为5
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
        System.out.println(m3.getPriority());
        System.out.println(m4.getPriority());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
//      设置主线程
        Thread.currentThread().setName("湖人");

    }
}
