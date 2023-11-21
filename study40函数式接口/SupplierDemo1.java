package study40函数式接口;

import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,50,70};
        int maxValue=getMax(()->{
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
