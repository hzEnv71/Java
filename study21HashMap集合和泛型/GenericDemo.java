package study21HashMap集合和泛型;

public class GenericDemo {
    public static void main(String[] args) {
//        泛型类创建对象
       /* Generic<String> g1=new Generic<>();
        g1.show("第一名");
        Generic<Integer> g2=new Generic<>();
        g2.show(75);
        Generic<Boolean> g3=new Generic<>();
        g3.show(true);*/
//        泛型方法调用
        Generic g=new Generic();
        g.show("第一名");
        g.show(656);
        g.show(true);

    }
}
