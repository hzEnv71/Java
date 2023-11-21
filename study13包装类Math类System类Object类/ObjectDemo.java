package study13包装类Math类System类Object类;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("李恒泽");
        s1.setAge(18);
        System.out.println(s1);

        Student s2 = new Student();
        s2.setName("李恒泽");
        s2.setAge(18);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

    }
}
