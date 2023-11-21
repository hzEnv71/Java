package study24File类;

import java.io.File;

public class File2Demo {
    public static void main(String[] args) {
        File f=new File("E:\\javase");
        getAll(f);

    }
    public static void getAll(File f){
        File[] fi=f.listFiles();
        if(fi!=null){
            for(File i:fi){
                if(i.isDirectory()){
                    getAll(i);
                }
                else{
                    System.out.println(i.getAbsolutePath());
                }
            }
        }
    }
}
