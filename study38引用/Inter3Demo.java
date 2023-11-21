package study38引用;

public class Inter3Demo {
    public static void main(String[] args) {
        //Lambda表达式
        usemethod((String s,int x,int y)->
//                        s.substring(x,y)
        {
//            System.out.println(s.substring(x, y));
            return s.substring(x, y);
        });
        //引用类中的实例方法，其实就是引用类中的成员方法
        //类名::成员方法
        usemethod(String::substring);
        //Lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数

    }
    public static void usemethod(Inter3 r){
        System.out.println(r.method("hello",1,3));
//        r.method("hello",1,3);
    }

}
