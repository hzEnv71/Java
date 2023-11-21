package study35TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s=new Socket("192.168.1.6",1000);
        //2.数据来自键盘录入，直到输入的数据是886
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //4.封装文本文件的数据
        /*BufferedReader br=new BufferedReader(new FileReader("copy.txt"));
*/        //封装输出流对象,写数据
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){

            if("721".equals(line)){
                break;
            }
            //获取输出流对象
//            OutputStream os=s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);;
            bw.newLine();
            bw.flush();
        }
       /* // 5.自定义结束标记
        bw.write("721");
        bw.newLine();
        bw.flush();*/
//        void shutdownOutput() 5.禁用此套接字的输出流。
        s.shutdownOutput();
        //接收服务器反馈
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=br1.readLine();
        System.out.println("服务器的反馈:"+data);
        bw.flush();
        //释放资源
        s.close();
    }
}
