package study1重载和ArrayList集合;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();
        array.add("li");
        array.add("heng");
        array.add("ze");
        String s="0";
        for(int i=0;i<array.size();i++)//array.size的长度可变
        {
            s=array.get(i);
            System.out.println("array:"+s);
        }
        System.out.println("array:"+s);
    }
}
