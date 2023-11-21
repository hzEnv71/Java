package study20TreeSet集合;

import java.util.Comparator;
import java.util.TreeSet;
//         TreeSet()带参构造,Comparator比较器排序
public class TreeSet0Demo {
    public static void main(String[] args) {
        TreeSet<Student0> ts=new TreeSet<>(new Comparator<Student0>() {
            @Override
            public int compare(Student0 o1, Student0 o2) {
//                return 0;
                int num1=o1.getAge()-o2.getAge();//升序排列
                int num2=num1==0?o1.getName().compareTo(o2.getName()):num1;//年龄相同时比较首字母
                return  num2;
            }
        });

        Student0 s1=new Student0("diyiming",22);
        Student0 s2=new Student0("chiyiming",25);
        Student0 s3=new Student0("aiyiming",27);
        Student0 s4=new Student0("jiyiming",27);
        Student0 s5=new Student0("jiyiming",27);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student0 s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
