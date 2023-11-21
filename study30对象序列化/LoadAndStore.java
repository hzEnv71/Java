package study30对象序列化;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//      Properties和IO流相结合
public class LoadAndStore {
    public static void main(String[] args) throws IOException {
//        创建集合Properties的对象p
        Properties p=new Properties();
        p.setProperty("赵云","广州");
        p.setProperty("张飞","厦门");
        p.setProperty("马超","长沙");
        FileWriter fw=new FileWriter("fos.txt");
//        把集合中的数据保存到文件
//        void store(Writer writer, String comments)
//        将此 Properties表中的此属性列表（键和元素对）以适合使用 load(Reader)方法的格式写入输出字符流。
        p.store(fw,"goods");
        fw.close();


        FileReader fr=new FileReader("fos.txt");
//        把文件中的数据加载到集合
//        void load(Reader reader) 以简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
        p.load(fr);
        fr.close();

        System.out.println(p);


    }
}
