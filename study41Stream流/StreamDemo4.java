package study41Stream流;

import java.util.ArrayList;

/*      Stream<T> sorted()
        返回由此流的元素组成的流，根据自然顺序排序。
        Stream<T> sorted(Comparator<? super T> comparator)
        返回由该流的元素组成的流，根据提供的 Comparator进行排序。
*/
public class StreamDemo4 {
     public static void main(String[] args) {
          ArrayList<String> al=new ArrayList<>();
          al.add("d湖人");
          al.add("c马刺队");
          al.add("g勇士");
          al.add("s骑士队");
          al.add("r热火");
          al.add("h魔术队");
          //按照字母顺序进行排序，并在控制台输出
          al.stream().sorted().forEach(System.out::println);
          //按照字符串长度把数据在控制台输出
//          al.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
          al.stream().sorted((s1,s2)->
          {
               int num1=s1.length()-s2.length();
               int num2=num1==0?s1.compareTo(s2):num1;
               return num2;
          }).forEach(System.out::println);

     }
}
