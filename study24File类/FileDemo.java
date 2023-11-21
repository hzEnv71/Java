package study24File类;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\test\\javase");
        System.out.println(f);
//        boolean createNewFile()
//        当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        System.out.println(f.createNewFile());//创建文件
        System.out.println("=========");
        File f1=new File("E:\\test\\javasee");
        System.out.println(f1);
//        boolean mkdir()
//        创建由此抽象路径名命名的目录。
        System.out.println(f1.mkdir());
        System.out.println("=========");
        File f2=new File("E:\\tset\\javame");
//        boolean mkdirs()
//        创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
        System.out.println(f2.mkdirs());//可以多级创建目录
    }
}
