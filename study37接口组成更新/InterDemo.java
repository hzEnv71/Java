package study37接口组成更新;

public class InterDemo {
    public static void main(String[] args) {
        Inter i1=new InterImpl1();
        i1.show1();
        i1.show2();
        //调用接口中默认方法可以使用多态方式
        i1.show3();
        //调用接口中静态方法只能使用接口调用
        Inter.show4();
    }
}
