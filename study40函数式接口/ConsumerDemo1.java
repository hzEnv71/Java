package study40函数式接口;

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        String[] str={"赵云,30","张飞,21","关羽,37"};
       /* operatorString(str,
                s->{
            String name=s.split(",")[0];
            System.out.print("姓名:"+name);
        },
                s->{
            int age=Integer.parseInt(s.split(",")[1]);
            System.out.println(",年龄:"+age);
        });*/
        operatorString(str,s-> System.out.print("姓名:"+s.split(",")[0]),s-> System.out.println(",年龄:"+s.split(",")[1]));

    }
    private static void operatorString(String[] str, Consumer<String> con1,Consumer<String> con2){
        for(String s:str){
            con1.andThen(con2).accept(s);
        }
    }
}
