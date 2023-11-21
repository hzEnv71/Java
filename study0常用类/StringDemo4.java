package study0常用类;

public class StringDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String s=array(arr);

        System.out.println("s:"+s);
    }

    public static String array(int[]arr)
    {
        String s=" ";
        s+="[";
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1){
//                s+=s.charAt(i);//charAt()相当于寻找指定位置的值
                s+=arr[i];
            }
            else{
                s+=arr[i];
                s+=",";
            }
        }
        s+="]";
        return s;

    }
}
