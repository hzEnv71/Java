package study32线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* void lock() 获得锁。
        void unlock() 释放锁。
                创建一个 ReentrantLock的实例。
*/
public class SellTickets0 implements Runnable{
    private static int ticket = 100;
    private Lock lock=new ReentrantLock();


    public void run() {

        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                    ticket--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
