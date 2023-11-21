package study13包装类Math类System类Object类;

public class SystemDemo {
    public static void main(String[] args) {

//        System.exit(0);//为0表示正常退出java虚拟机
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");//以1970年1月1日开始

        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++)
        {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }
}
