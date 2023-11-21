package study38引用;

public class StudentDemo {
    public static void main(String[] args) {
        //Lambdabiaodas
       /* usemethod((name,age)->{
            Student s=new Student(name,age);
            return s;
        });*/
        usemethod((name, age) -> new Student(name,age));
        //引用构造器
        //类名::new
        usemethod(Student::new);
        //Lambda表达式被类的实例方法替代的时候
        //它的形式参数参数全部传递给构造器作为参数


    }
    private static void usemethod(StudentInter si){
        Student s=si.method("赵云",18);
        System.out.println(s.getName()+","+s.getAge());
    }
}
