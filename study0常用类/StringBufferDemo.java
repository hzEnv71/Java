package study0常用类;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("li");
        sb.append("heng");
        sb.append("ze");
        int i=sb.capacity();
        System.out.println(i);
        int ii=sb.length();
        System.out.println(ii);
        sb.reverse();
        //String ss=(String)sb;
        System.out.println(sb);
        String ss=sb.toString();
        System.out.println(ss);
        String sss=sb.reverse().substring(2,6);//包括2，不包括6
        System.out.println(sss);

    }
}
