package study40函数式接口;

/**供给接口，可以传入数据，作为一个容器*/
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s=getString(()->{
            return "赵云";
        });
        System.out.println(s);
    }

    private static String getString(Supplier<String> sup){
//        T get() 获得结果
        return  sup.get();
    }
}
