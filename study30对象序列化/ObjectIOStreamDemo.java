package study30对象序列化;

import java.io.*;

public class ObjectIOStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        对象序列化流 Serializable
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("fos.txt"));
        Student s1=new Student("张飞",88);
        oos.writeObject(s1);
        oos.close();
//        对象反序列化流 Deserialize
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fos.txt"));
        Object o=ois.readObject();
        Student s=(Student)o;//向下转型
        System.out.println(s.getName()+","+s.getAge());
        ois.close();

    }

}
