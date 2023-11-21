package study13包装类Math类System类Object类;

public class Integer1Demo {
    public static void main(String[] args) {
//        装箱，把基本数据类型转化成包装类数据类型
        Integer i1=Integer.valueOf(100);
        Integer i2=100;//自动装箱，省略了Integer.valueOf();

//        拆箱，把包装类数据类型转化成基本数据类型
        i1=i1.intValue()+200;
        i2+=i2;//自动拆箱，省略了intValue();

        Integer i3=0;
        i3+=100;
//        Integer i4=null;//先判断是否为null
//        i4+=100;
        System.out.println(i3);
//        System.out.println(i4);
    }
}
