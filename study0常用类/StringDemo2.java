package study0常用类;


import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {

        String username = "81308680";
        String password = "Li20031202";
        for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String psw = sc.nextLine();
            if (name.equals(username) && psw.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账户已被锁定,请与李恒泽联系");
                } else {
                    System.out.println("登录失败,你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}


