package study33;

public class Box {
    private int milk;
    //    定义奶箱状态
    private boolean state = false;

    public synchronized void put(int milk) {
        //如果有牛奶，等待消费
        if (state) {
            try {
                wait();//导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶牛奶放入奶箱");
        //生产完牛奶，修改奶箱状态
        state = true;
        //唤醒其他等待的线程
        notify();
//        notifyAll();
    }

    public synchronized void get() {
        //如果没有牛奶，等待生产牛奶
        if (!state) {
            try {
                wait();//导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //如果有牛奶，就消费牛奶
            System.out.println("用户拿到第" + this.milk + "瓶牛奶");
            //消费完之后，修改奶箱状态
            state=false;
            //唤醒其他等待的线程
            notify();
//            notifyAll();
        }
    }
}
