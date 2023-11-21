package study16异常;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println("开始");

//        System.out.println(arr[3]);
        try{
            System.out.println(arr[3]);//相当于new ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("你输入的数据有问题");
            e.printStackTrace();
        }

        System.out.println("结束");
    }
}
