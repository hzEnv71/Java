package study4抽象类;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Bird();//无参
        a.setName("鸟一号");
        a.setAge(15);
        a=new Bird("鸟一号",15);//带参

        System.out.println(a.getName()+","+a.getAge());
        a.show();

        Animal aa=new Fish();
        aa.setName("鱼一号");
        aa.setAge(17);
        aa=new Fish("鱼一号",17);

        System.out.println(aa.getName()+","+aa.getAge());
        aa.show();


    }
}
