package study7类名作为形参和返回值;

public class Operator {
    public void useFish(Fish f) {//Fish f=new Fish
        f.eat();//调方法
    }

    public Fish getFish(){
        Fish f=new Fish();
        return f;

    }
}
