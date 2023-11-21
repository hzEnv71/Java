package study21HashMap集合和泛型;

public class GenericImpl<T> implements Generic0<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
