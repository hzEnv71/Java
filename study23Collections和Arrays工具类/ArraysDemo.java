package study23Collections和Arrays工具类;



public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr={91,34,22,75,63};
//        1
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(arrayToString(arr));//调用方法
//        2
        for(int x=0;x< arr.length-1;x++){
            for(int i=0;i< arr.length-1;i++){
                if (arr[i] > arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(arrayToString(arr));//调用方法
    }
//把数组中的元素按一定的规则进行拼接成一个字符串[元素1，元素2，....]
    public static String arrayToString(int[] arr) {
            StringBuilder sb=new StringBuilder();
            sb.append("[");
            for(int i=0;i<arr.length;i++)
            {
                if(i==arr.length-1)
                {
                    sb.append(arr[i]);
                }
                else
                {
                    sb.append(arr[i]).append(",");
                }

            }
            sb.append("]");
            String s= sb.toString();
            return s;
        }
    }

