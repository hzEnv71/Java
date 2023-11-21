package study32线程;

public class SellTickets implements Runnable {
//    private int ticket = 100;
    private static int ticket = 100;
    private Object obj=new Object();//一把锁
    private int x=0;


        @Override
        public void run () {
//            synchronized(new Object()){//三把锁
                while (true) {
                    if(x%2==0){
//                      synchronized (obj){
//                      synchronized (this){//同步方法锁，this
                        synchronized (SellTickets.class){//同步静态方法锁,类名+class
                            if (ticket > 0) {
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                            ticket--;
                            }
                        }
                    }else{
                        sellTicket();
                    }
                    x++;
                }
    }
    public synchronized static void sellTicket(){

            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                ticket--;

            }
    }
}

