package study5接口;

public class Bird extends Animal implements Implements {//类实现接口


    public Bird() {//添加无参构建方法,在测试类创建无参对象
    }

    public Bird(String name, int age) {//添加带参构建方法,在测试类创建带参对象
        super(name, age);
    }
//添加成员方法
    public void eat(){                  //重写父类中的方法
        System.out.println("鸟吃虫子");
    }
    public void show(){                 //重写接口中的方法
        System.out.println("鸟可以游了");
    };

}
