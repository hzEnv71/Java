package study9接口名作为形参和返回值;

public class Operator {
    public void useShow(Show s){//Show s=new Dog();
        s.show();
    }
    public Show getShow() {
        Show s = new Dog();
        return s;
    }
}
