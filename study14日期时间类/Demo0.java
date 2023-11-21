package study14日期时间类;

import java.util.Arrays;

public class Demo0 {
    public static void main(String[] args) {

        String s="65,31,27,82,59";

        String[] strArray=s.split(",");//分割数组，存入字符串数组

        //将一个String数组存入int数组，调用Integer.parseInt();
        int[] arr=new int[strArray.length];
        for(int i=0;i< strArray.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);
        }
//      将数组排序
        Arrays.sort(arr);
//      拼接成一个字符串
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< arr.length;i++){
            if(i== arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        String str=sb.toString();
        System.out.println(str);

    }
}
