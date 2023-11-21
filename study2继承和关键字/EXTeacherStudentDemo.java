package study2继承和关键字;

public class EXTeacherStudentDemo {
    public static void main(String[] args) {
//        创建老师类对象，对应无参方法
        EXTeacher t1=new EXTeacher();
        t1.setName("李恒泽老师");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        System.out.println("----------");
//        创建老师类对象，对应带参方法
        EXTeacher t2=new EXTeacher("泽恒李老师",81);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
        System.out.println("----------");

//        创建学生类对象，对应无参方法
        EXStudent s1=new EXStudent();
        s1.setName("李恒泽学生");
        s1.setAge(18);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();
        System.out.println("----------");
//       创建学生类对象，对应带参方法
        EXStudent s2=new EXStudent("泽恒李学生",81);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();

    }
}
