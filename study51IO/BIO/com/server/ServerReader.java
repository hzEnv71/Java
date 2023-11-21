package study51IO.BIO.com.server;


import study51IO.BIO.com.util.Constants;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

public class ServerReader extends Thread{
    private  Socket socket;
    public ServerReader(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run(){
        DataInputStream dis=null;
        try {
            dis=new DataInputStream(socket.getInputStream());
            /**循环一直等待客户端的消息*/
            while(true) {
                /**读取当前消息类型：
                 * 1，登录
                 * 2，群发
                 * 3，私聊
                 * */
                int flag = dis.readInt();
                if (flag == 1) {
                    /**先将当前登录的客户端socket存入到在线人数的socket集合中*/
                    String name = dis.readUTF();
                    System.out.println(name + "------->" + socket.getRemoteSocketAddress());
                    ServerChat.onLineSockets.put(socket, name);
                }
                writeMsg(flag,dis);//发送消息
            }
        } catch (Exception e) {
            System.out.println("---有人下线了");
            //从在线人数中将当前socket移出去
            ServerChat.onLineSockets.remove(socket);
            try {
                //重新更新在线人数并发给所有客户端
                writeMsg(1,dis);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    /**
     * 发送消息
    * */
    private void writeMsg(int flag, DataInputStream dis) throws IOException {
        String msg=null;
        if(flag==1){
            /**读取所有在线人数发给所有客户端去更新自己的在线人数列表*/
            StringBuilder rs=new StringBuilder();
            Collection<String>  onlineNames=ServerChat.onLineSockets.values();
            //判断是否存在在线人数
            if(onlineNames!=null&& onlineNames.size()>0) {
                for (String name : onlineNames) {
                    rs.append(name + Constants.SPILIT);
                }
                //去掉最后一个分隔符
                msg = rs.substring(0, rs.lastIndexOf(Constants.SPILIT));//[name1,name2,name3]
                /**将消息发送给所有的客户端*/
                sendMsgToAll(flag, msg);
            }
        }else if(flag==2||flag==3){
                //读到消息  群发的  或者 @消息
                String newMsg=dis.readUTF();//消息
                //得到发件人
                String sendName=ServerChat.onLineSockets.get(socket);
                //内容
                StringBuilder msgFinal=new StringBuilder();
                //时间
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:EEE");
                if(flag==2){
                    msgFinal.append(sendName).append("   ").append(sdf.format(System.currentTimeMillis()*2)).append("\r\n");
                    msgFinal.append("   ").append(newMsg).append("\r\n");
                    sendMsgToAll(flag,msgFinal.toString());
                }else if(flag==3){
                    msgFinal.append(sendName).append("   ").append(sdf.format(System.currentTimeMillis()*2)).append("对你私发\r\n");
                    msgFinal.append("   ").append(newMsg).append("\r\n");
                    //私发
                    //得到谁给谁发
                    String destName=dis.readUTF();
                    sendMsgToOne(destName,msgFinal.toString());

                }
            }
        }
    /**
    * 私发消息
    * */
    private void sendMsgToOne(String destName, String msg) throws IOException {
        //拿到所有在线socket管道 给这些管道些出消息
        Set<Socket> allOnLineSockets = ServerChat.onLineSockets.keySet();
        for (Socket sk : allOnLineSockets) {
            //得到当前需要私发的socket
            if (ServerChat.onLineSockets.get(sk).trim().equals(destName)) {
                DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
                dos.writeInt(2);//消息类型
                dos.writeUTF(msg);
                dos.flush();

            }
        }
    }

    /**
     * 群发消息
    * */
    private void sendMsgToAll(int flag, String msg) throws IOException {
        //拿到所有在线socket管道 给这些管道些出消息
        Set<Socket> allOnLineSockets=ServerChat.onLineSockets.keySet();
        for (Socket sk:allOnLineSockets) {
            DataOutputStream dos=new DataOutputStream(sk.getOutputStream());
            dos.writeInt(flag);//消息类型
            dos.writeUTF(msg);
            dos.flush();

        }
    }


}
