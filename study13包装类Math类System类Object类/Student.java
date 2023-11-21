package study13包装类Math类System类Object类;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

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
//重写方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
// 重写方法
    @Override
    public boolean equals(Object o) {
//        this   -----s1
//        o      -----s2
        //比较地址是否相同
        if (this == o) return true;
//        判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
//      向下转型
        Student student = (Student) o;
//      比较年龄是否相同
        if (age != student.age) return false;
//      比较内容是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }

   /* @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }*/
}
