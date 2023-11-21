package study2继承和关键字;

public class FinalDemo {
    public static void main(String[] args) {
        Final1 f1=new Final1();
//        f1=new Final1();
        f1.setName("李恒泽");
        f1.setAge("18");
        System.out.println(f1.getName()+","+f1.getAge());


        Final2 f2=new Final2("泽恒李","81");
        System.out.println(f2.getName()+","+f2.getAge());





    }
}
