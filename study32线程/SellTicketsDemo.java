package study32线程;

public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets s=new SellTickets();
        Thread t1=new Thread(s,"窗口1");
        Thread t2=new Thread(s,"窗口2");
        Thread t3=new Thread(s,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
