package study1重载和ArrayList集合;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> array=new ArrayList<>();
//        add();将指定的元素追加到集合的末尾//返回值为boolean
        System.out.println(array.add("lihengze"));//0位置

        array.add("李");//1位置
        array.add("恒");//2位置
        array.add("泽");
//    add(index,element)将插入指定位置的元素
    array.add(2,"heng");
        System.out.println("array"+ array);
    }
}
