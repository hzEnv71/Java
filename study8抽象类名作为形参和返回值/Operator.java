package study8抽象类名作为形参和返回值;

public class Operator {
    public void useAnimal(Animal a){//Animal a=new Fish//多态
        a.eat();
    }
    public Animal getAnimal(){
        Animal a=new Fish();
        return a;
    }
}
