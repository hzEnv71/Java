package study21HashMap集合和泛型;

public class Arg0Demo {
    public static void main(String[] args) {
        System.out.println(method(10,20));
        System.out.println(method(10,20,30,40,50));
        System.out.println(method(20,50,80));
    }
    public static int method(int... a){//实际上是一个数组
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;

    }
}
