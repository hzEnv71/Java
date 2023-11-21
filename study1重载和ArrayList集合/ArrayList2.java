package study1重载和ArrayList集合;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
//        添加元素
        array.add("li");
        array.add("heng");
        array.add("ze");
//        remove()删除指定的元素，返回boolean
        System.out.println(array.remove("heng"));

//        remove(index,element)根据索引删除，返回值为被删除元素
        System.out.println(array.remove(2));

//        set(index,element)修改指定位置元素，返回值为被修改元素
      array.set(1,"恒");

//        get(index)返回指定位置元素，不改变原集合
      array.get(2);
//        System.out.println(array.get(1));

        System.out.println("array"+array);

    }
}
