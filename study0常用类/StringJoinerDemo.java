package study0常用类;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public  static void main(String ag[]){
        String[] names={"A","B","C","D"};
        StringJoiner sj=new StringJoiner("-","[","]");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj);
    }
}
