package study2继承和关键字;

//final可修饰类，方法，成员变量
public class  Final {
    private String name;
    private String age;

    public Final() {
    }

    public Final(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
