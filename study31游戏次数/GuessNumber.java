package study31游戏次数;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private GuessNumber (){}

    public static void start(){
        Random r=new Random();
        int number=r.nextInt(100)+1;//范围1-100
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字");
            int num=sc.nextInt();
            if(num>number){
                System.out.println("你猜的数太大了");
            }else if(num<number){
                System.out.println("你猜的数太小了");
            }else{
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
