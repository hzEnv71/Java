package study24File类;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        String[] color = {"❤️", "♣️", "♦️", "♠️"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//      添加编号和牌到集合中，同时添加编号到ArrayList集合中
        int index = 0;
        for (String col : color) {
            for (String num : number) {
                hm.put(index, col + num);
                al.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        al.add(index);
        index++;
        hm.put(index, "大王");
        al.add(index);
//      洗编号
        Collections.shuffle(al);
//      发编号
        TreeSet<Integer> q = new TreeSet<>();
        TreeSet<Integer> w = new TreeSet<>();
        TreeSet<Integer> e = new TreeSet<>();
//        底牌
        TreeSet<Integer> dp = new TreeSet<>();
//        发编号
        for (int i = 0; i < al.size(); i++) {
            int poke = al.get(i);
            if (i >= al.size() - 3) {
                dp.add(poke);
            } else if (i % 3 == 0) {
                q.add(poke);
            } else if (i % 3 == 1) {
                w.add(poke);
            } else if (i % 3 == 2) {
                e.add(poke);
            }

        }
        LookPoker("玩家q",q,hm);
        LookPoker("玩家w",w,hm);
        LookPoker("玩家e",e,hm);
//       底牌
        LookPoker("剩下",dp,hm);
    }
//    看牌方法
//    遍历TreeSet集合，到HashMap集合中找编号对应的牌
    public static void LookPoker(String name, TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name+"的牌是:");
        for(Integer key:ts){
            String poker=hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();

    }

}
