package study6综合案例;
/*
测试类
*/

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer p1=new PingPangPlayer();
        p1.setName("小乒");
        p1.setAge(15);
        p1=new PingPangPlayer("小乒",15);
        System.out.println(p1.getName()+","+p1.getAge());
        p1.eat();
        p1.study();
        p1.speak();
        System.out.println("-----------");

//        ........

    }
}
