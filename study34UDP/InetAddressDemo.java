package study34UDP;
        /*
        static InetAddress getByName(String host) 确定主机名称的IP地址。可以是主机名称，也可以是IP地址                String getHostAddress() 返回文本显示中的IP地址字符串。
                String getHostName() 获取此IP地址的主机名。
                */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia=InetAddress.getByName("Ij");
//        InetAddress ia=InetAddress.getByName("172.20.10.5");
        System.out.println("主机名:"+ia.getHostName());
        System.out.println("IP地址:"+ia.getHostAddress());
    }
}
