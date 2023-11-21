package study19HashSet集合;

public class Student {
    private String name;
    private int age;
    public Student(){}
    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        //true表示相同，则不添加
        //false表示不相同，则添加
        if (this == o) return true;//相等，舍弃该对象
        if (o == null || this.getClass() != o.getClass()) return false;//不相等，添加该对象

        Student student = (Student) o;

        if (age != student.age) return false;//不相等，添加该对象
        return name != null ? name.equals(student.name) : student.name == null;//相等，舍弃该对象

    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;//获取对象的哈希值
        result = 31 * result + age;
        return result;
    }
}
