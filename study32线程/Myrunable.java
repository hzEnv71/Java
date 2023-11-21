package study32线程;

public class Myrunable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
//            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
