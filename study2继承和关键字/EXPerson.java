package study2继承和关键字;

public class EXPerson {
    private String name;
    private int age;

    public EXPerson() {
    }

    public EXPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void shool(String st){
        System.out.println("口号："+st);
    }
}
