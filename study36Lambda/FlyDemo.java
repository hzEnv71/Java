package study36Lambda;



public class FlyDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFly(new Fly() {
            @Override
            public void fly(String s) {
                System.out.println("飞啊");
                System.out.println(s);
            }
        });
        //Lambda表达式
        //带参无返回值
//        useFly((String s)->{//可以省略数据类型
//        useFly((s)->{//只有一个参数，可以省略括号
        useFly((String s)->{
            System.out.println("飞啊");
            System.out.println(s);
        });
    }
    private static void useFly(Fly f){
        f.fly("飞飞飞>>>");
    }
}
