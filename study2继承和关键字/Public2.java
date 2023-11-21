package study2继承和关键字;

import study3多态.Public3;

public class Public2 {
    public static void show2(){
        Public1 p1=new Public1();
//        p1.show4();//private只能在同类下访问
      Public3 p3=new Public3();
//      p3.show3();//protected不能在不同包无关类访问,若是不同包子父类（extends）可访问
//      p3.show3();//默认不能在不同包子父类（extends）访问
        p3.show3();
    }
}
