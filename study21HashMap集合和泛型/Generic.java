package study21HashMap集合和泛型;

//      泛型类
/*public class Generic<T> {
    public void show(String s){
        System.out.println(s);

    }
    public void show(int i){
        System.out.println(i);
    }
    public void show(boolean b){
        System.out.println(b);
    }
}*/
public class Generic{
//    泛型方法
    public <T>void show(T t){
        System.out.println(t);
    }
}