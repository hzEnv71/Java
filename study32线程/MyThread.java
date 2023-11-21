package study32线程;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<10;i++){
//            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        try {
            Thread.sleep(100);//休眠一下
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }
}
