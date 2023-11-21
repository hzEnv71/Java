package study31游戏次数;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileReader fr=new FileReader("game.txt");
        p.load(fr);
        fr.close();

        String 游戏次数 = p.getProperty("游戏次数");
//        int number=Integer.valueOf(游戏次数)//返回Integer
        int number= Integer.parseInt(游戏次数);//返回int

        if(number>3){
            System.out.println("游戏试玩已结束，如果继续请充值");
        }else{
                GuessNumber.start();
                number++;
                p.setProperty("游戏次数",String.valueOf(number));
                FileWriter fw=new FileWriter("game.txt");
                p.store(fw,"good");
                fw.close();
        }
    }
}
