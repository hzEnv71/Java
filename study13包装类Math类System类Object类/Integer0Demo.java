package study13包装类Math类System类Object类;

public class Integer0Demo {
    public static void main(String[] args) {
//       int------>String      //valueOf();方法，返回值为String，是String类中的方法
        int num=100;
        String s1=""+num;
        System.out.println(s1);

        String s2=String.valueOf(num);
        System.out.println(s2);

        System.out.println("------------");

//        String----->int    //parseInt();方法，返回值为int，是Integer类中的方法
        String s3="100";
        Integer i=Integer.valueOf(s3);
        int x=i.intValue();
        System.out.println(x);
        System.out.println(Integer.valueOf(s3).intValue());

        int y=Integer.parseInt(s3);
        System.out.println(y);
        System.out.println(Integer.parseInt(s3));




    }
}
