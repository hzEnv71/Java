package study2继承和关键字;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();

        p.call("李恒泽");
        p.message("李恒泽");
        System.out.println("----------");

        NewPhone np=new NewPhone();

        np.wucan();

        np.call("泽恒李");
        np.message("泽恒李");


    }
}
