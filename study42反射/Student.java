package study42反射;

public class Student {
    //成员变量
    private String name;
    int age;
    public String address;
    //构造方法
    public Student(){}

    private Student(String name) {
        this.name = name;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //成员方法
    private void function(){
        System.out.println("function");
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(String s){
        System.out.println("method2"+s);
    }
    public String method3(String s,int i){
        return s+","+i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
