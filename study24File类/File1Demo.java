package study24File类;

import java.io.File;

public class File1Demo {
    public static void main(String[] args) {
        File f=new File("E:\\test\\javase");
        System.out.println(f.isDirectory());//判断是否是目录
        System.out.println(f.isFile());//判断是否是文件
        System.out.println(f.exists());//判断是否存在

        System.out.println(f.getAbsolutePath());//绝对路径名字符串
        System.out.println(f.getPath());//路径名字符串
        System.out.println(f.getName());//名称
        System.out.println(f.delete());//如果目录下有内容则删除失败
        System.out.println("======");

        File f1=new File("E:\\javase");

//        String[] list()
//        返回一个字符串数组，命名由此抽象路径名表示的目录中的  文件和目录。

        String[] s=f1.list();//名称字符数组
        for(String i:s){
            System.out.println(i);
        }
        System.out.println("-----------");
//        File[] listFiles()
//        返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的  文件。
        File[] fi=f1.listFiles();//File对象数组
        for(File i:fi){
          /*  System.out.println(i);
            System.out.println(i.getName());*/
            if(i.isFile()){
                System.out.println(i);
            }
        }
    }
}
