package study24File类;

import java.util.ArrayList;
import java.util.Collections;

public class PokeDemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        String[] color={"♥️","♠️","♦️","♣️"};
        String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String col:color){
            for(String num:number){
                al.add(col+num);
            }
        }
        al.add("大王");
        al.add("小王");
        //随机排列
        Collections.shuffle(al);

        ArrayList<String> q=new ArrayList<>();
        ArrayList<String> w=new ArrayList<>();
        ArrayList<String> e=new ArrayList<>();
//        底牌
        ArrayList<String> dp=new ArrayList<>();

        for(int i=0;i<al.size();i++){
            String poke=al.get(i);
            if(i>=al.size()-3){
                dp.add(poke);
            }else if(i%3==0){
                q.add(poke);
            }else if(i%3==1){
                w.add(poke);
            }else if(i%3==2){
                e.add(poke);
            }
        }
        LookPoker("玩家q",q);
        LookPoker("玩家w",w);
        LookPoker("玩家e",e);
        LookPoker("剩下",dp);


    }
    public static void LookPoker(String name,ArrayList<String> al){
        System.out.println(name+"的牌是: ");
        for(String s:al){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
