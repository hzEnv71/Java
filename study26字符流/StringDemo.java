package study26字符流;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
//        编码
        byte[] b1=s.getBytes();
        byte[] b2=s.getBytes(StandardCharsets.UTF_8);//默认
        byte[] b3=s.getBytes("GBK");
        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));
        System.out.println(Arrays.toString(b3));
//        解码
        String s1=new String(b1);
        String s2=new String(b2,"UTF-8");
        String s3=new String(b3,"GBK");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
