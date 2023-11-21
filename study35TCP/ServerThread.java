package study35TCP;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
//            把数据写入文本文件
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("fos.txt"));
            //解决名称冲突问题
            int num=0;
            File f=new File("copy"+num+".txt");
            while (f.exists()){
                num++;
                f=new File("copy"+num+".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));


            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
//            反馈客户端
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw1.write("文件上传成功");
            bw1.newLine();
            bw1.flush();
//            释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
