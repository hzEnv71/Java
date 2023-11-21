package study20TreeSet集合;

public class Student implements Comparable<Student>{//实现接口
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
//      重写compareTo()方法
    @Override
    public int compareTo(Student s) {
//        return 0;

//        return 1;//按年龄升序排序
//        return this.age-s.age;

//        return -1;//按年龄降序排序
//        return s.age-this.age;
        int num1=this.age-s.age;//后创建的对象-先创建的对象
        int num2=num1==0?this.name.compareTo(s.name):num1;//年龄相同时比较首字母

        return  num2;

    }



}
