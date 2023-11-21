package study40函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        String[] str = {"赵云,32", "张飞冲,18", "关羽怒,27"};
        ArrayList<String> al=method(str, s -> s.split(",")[0].length() < 3, s -> Integer.parseInt(s.split(",")[1]) > 26);

        for (String s :al){
            System.out.println(s);
        }
    }
        private static ArrayList<String> method(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> al = new ArrayList<>();
        for (String s : str) {
            if(pre1.and(pre2).test(s)){
                al.add(s);
            }
        }
        return al;
    }
}
