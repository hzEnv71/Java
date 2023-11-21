package study3多态;

public class Animals {
    private String name;
    private int age;

    public Animals() {//无参构造方法
    }

    public Animals(String name, int age) {//带参构造方法
        this.name = name;
        this.age = age;
    }
//成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat() {}

    void show(){};

    public void play() {}
}

