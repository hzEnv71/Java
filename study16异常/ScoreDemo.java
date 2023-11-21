package study16异常;

import java.util.Scanner;

public class ScoreDemo {
    public static void main(String[] args) throws ScoreException {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入分数:");
        int score=sc.nextInt();

        Score s=new Score();
        s.setScore(score);

    }
}
