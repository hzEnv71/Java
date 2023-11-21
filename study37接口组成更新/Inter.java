package study37接口组成更新;

public interface Inter {
    void show1();
    void show2();
//    接口中默认方法，default修饰符不用在实现类中重写方法
    default void show3(){
        System.out.println("接口中默认方法被调用了");
        show5();
    }
    private void show5(){
        System.out.println("接口中私有方法被调用了");

    }
    static void show4(){
        System.out.println("接口中静态方法被调用了");
        show6();
    }
     private static void show6(){
        System.out.println("接口中静态私有方法被调用了");
    }

}
