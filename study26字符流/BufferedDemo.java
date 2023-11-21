package study26字符流;


import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        //字符缓冲流
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos.txt"));
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        bw.write("zg");
        bw.flush();
        bw.write("zh");
        bw.flush();
        /*int c;
        while((c=br.read())!=-1){
            System.out.println((char)c);
        }*/
        System.out.println("==================");
        int len;
        char[] ch=new char[1024];
        while((len=br.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        System.out.println("==================");
        for(int i=0;i<10;i++){
            bw.write("class"+i);
//            bw.write("\r\n");//换行
//            字符缓冲流特有功能
            bw.newLine();//换行
        }
        bw.flush();
        System.out.println("==================");
//        字符缓冲流特有功能，一次读一行
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        bw.close();
        br.close();
    }
}
