package study36Lambda;

public class EatableDemo {
    public static void main(String[] args) {
        /*Eatable e=new EatableImpl();//多态
        useEatable(e);*/

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃。。。");
            }
        });
        //Lambda表达式
        //无参无返回值
        useEatable(()->{
            System.out.println("吃吃吃。。。..");
        });
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
