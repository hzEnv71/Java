package study36Lambda;

public class WasDemo {
    public static void main(String[] args) {
        //匿名内部类
        useWas(new Was() {
            @Override
            public int add(int i, int ii) {
                return i*ii;
            }
        });
        //Lambda表达式
        //带参带返回值
//        useWas((i, ii)->{//可以省略数据类型
        useWas((int i,int ii)->{
//            System.out.println(i+ii);
            return i+ii;
        });
        //如果只有一条语句，可以省略大括号
        //如果有return,return也可以省略
        useWas((int i,int ii)-> i-ii);
    }
    private static void useWas(Was w){
        int sum=w.add(10,22);
        System.out.println(sum);
    }
}
