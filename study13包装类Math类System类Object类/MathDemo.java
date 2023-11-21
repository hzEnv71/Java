package study13包装类Math类System类Object类;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));//返回绝对值

        System.out.println(Math.ceil(12.34));//返回>=的最小整数
        System.out.println(Math.floor(12.34));//返回<=的最大整数

        System.out.println(Math.round(12.34));//四合五入取近似整数
        System.out.println(Math.round(12.78));//四合五入取近似整数

        System.out.println(Math.max(13,23));//返回较大值
        System.out.println(Math.min(22,44));//返回较小值

        System.out.println(Math.pow(2,3));//返回a的b次幂

        System.out.println(Math.random());//[0.0,1.0)中的随机数
        System.out.println(Math.random()*100);//[0.0,100.0)中的随机数
        System.out.println((int)(Math.random()*100)+1);//[0,100]中的随机数



    }
}
