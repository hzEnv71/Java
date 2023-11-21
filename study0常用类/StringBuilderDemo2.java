package study0常用类;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
//        StringBUild转化为String
        StringBuilder sb=new StringBuilder();
        sb.append("lihengze");
        System.out.println(sb);
//          toString
        String s=sb.toString();
        System.out.println(s);

//        构造方法把String转化为StringBuilder
        StringBuilder sb1=new StringBuilder(s);
        System.out.println(sb1);
    }
}
