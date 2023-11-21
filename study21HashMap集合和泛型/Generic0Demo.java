package study21HashMap集合和泛型;

public class Generic0Demo {
    public static void main(String[] args) {
        Generic0<String> g1=new GenericImpl<>();
        g1.show("第一名");
        Generic0<Integer> g2=new GenericImpl<>();
        g2.show(66);
    }
}
