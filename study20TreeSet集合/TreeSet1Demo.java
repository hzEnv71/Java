package study20TreeSet集合;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1Demo {
    public static void main(String[] args) {
        TreeSet<Student1> ts=new TreeSet<Student1>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
//                return 0;
//                升序排序
                int num1=(o1.getChinese()+o1.getMath())-(o2.getChinese()+o2.getMath());
                int num2=(o1.getChinese())-(o2.getChinese());
                int num3=(o1.getMath())-(o2.getMath());
                int num4=(num1==0||num2==0||num3==0)?o1.getName().compareTo(o2.getName()):num1;
                return num4;
            }

        });
        Student1 s1=new Student1("第一名",88,98);
        Student1 s2=new Student1("第四名",98,78);
        Student1 s3=new Student1("第三名",58,78);
        Student1 s4=new Student1("第二名",88,68);
        Student1 s5=new Student1("第五名",88,68);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Student1 s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.sum());
        }

    }
}
