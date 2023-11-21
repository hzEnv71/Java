package study0常用类;
//append（）（添加并返回对象本身）
//reverse（）（返回相反的字符序列）
public class StringBuilderDemo1 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();
        sb.append("hello");

        System.out.println("sb:"+sb);

        StringBuilder sb2=sb.append("world");//前面已经添加"hello"

        System.out.println("sb2:"+sb2);
//            链式编程
        StringBuilder sb3=new StringBuilder();
        sb3.append("李");
        sb3.append("恒");
        sb3.append("泽");
        sb3.append("li").append("heng").append("ze");
        System.out.println("sb3:"+sb3);
//        返回相反的字符序列
        sb3.reverse();
        System.out.println("sb3:"+sb3);
        System.out.println();
    }
}
