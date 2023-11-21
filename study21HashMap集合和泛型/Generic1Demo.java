package study21HashMap集合和泛型;

import java.util.ArrayList;
import java.util.List;

public class Generic1Demo {
    public static void main(String[] args) {
//        List<?>类型通配符
        List<?> l1=new ArrayList<Object>();
        List<?> l2=new ArrayList<Number>();
        List<?> l3=new ArrayList<Integer>();

//        类型通配符上限
//        List<?extends Number> l4=new ArrayList<Object>();//范围不能超过Number
        List<?extends Number> l5=new ArrayList<Number>();
        List<?extends Number> l6=new ArrayList<Integer>();

//        类型通配符下限
        List<?super Number> l7=new ArrayList<Object>();//
        List<?super Number> l8=new ArrayList<Number>();
//        List<?super Number> l9=new ArrayList<Integer>();//范围不能低于Number


    }
}
