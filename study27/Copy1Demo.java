package study27;

import java.io.*;

public class Copy1Demo {
    public static void main(String[] args) throws IOException {
//        复制单级文件夹
        File f1=new File("E:\\javase\\untitled2\\src\\study33");
        String name=f1.getName();
//        File(String parent, String child)
//        从父路径名字符串和子路径名字符串创建新的 File实例。
        File f2=new File("un",name);
        if(!f2.exists()){
//      boolean mkdirs()
//      创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
            f2.mkdirs();
        }
//        File[] listFiles()
//        返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] file=f1.listFiles();

        for(File f:file){
//            String getName()
//            返回由此抽象路径名表示的文件或目录的名称
            String names=f.getName();
            File f3=new File(f2,names);
            Copy(f,f3);
        }


    }
    public static void Copy(File f,File f3) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f3));
        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
