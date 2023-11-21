package study1重载和ArrayList集合;

public class Student2 {
    private String name;
    private String age;
    public Student2(){};
    public Student2(String name,String age)
    {
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
