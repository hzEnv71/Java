package study13包装类Math类System类Object类;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(100));
//        System.out.println(Integer.valueOf("包装"));//不能输出字符型字符串
        System.out.println(Integer.valueOf("100"));//只能输出数字型字符串

        Integer i1=new Integer(100);//创建对象已过时
        System.out.println(i1);

        Integer i2= Integer.valueOf(100);
        System.out.println(i2);

        System.out.println(Integer.MAX_VALUE);//2的31次方-1
        System.out.println(Integer.MIN_VALUE);//-2的31次方
        int i3=100086;
        System.out.println(Integer.toBinaryString(i3));
        System.out.println(Integer.toOctalString(i3));
        System.out.println(Integer.toHexString(i3));
        String s1="11000011011110110";
        System.out.println(Integer.valueOf(s1,2));
        String s2="303366";
        System.out.println(Integer.valueOf(s2,8));
    }
}
