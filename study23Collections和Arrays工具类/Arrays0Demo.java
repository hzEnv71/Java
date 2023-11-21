package study23Collections和Arrays工具类;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arrays0Demo {
    public static void main(String[] args) {
        int[] arr={13,86,34,97,25};
//            String[] arr={"13","86","34","97","25"};


        System.out.println("before"+ Arrays.toString(arr));//返回字符串表示形式
        Arrays.sort(arr);//按数学顺序排序数组
        System.out.println("after"+Arrays.toString(arr));//返回字符串表示形式

//        List<Object> num=Arrays.asList(7,8,9,10);
        int[][] nums=new int[][]{{1,3},{2,2},{3,6},{3,9}};
        //方法一
        //>0 不变 <0 交换
        Arrays.sort(nums,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){//a ：second   b:first
                System.out.print(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
                if(a[0]==b[0]){
                    return a[1]-b[1];//后-前
                }else{
                    return a[0]-b[0];//后-前
                }
            }
        });

        // 方法二，使用匿名表达式
        // (a,b)->a[1]-b[1]会自动转变成上面的形式
//        Arrays.sort(nums,(a,b)->a[1]-b[1]);
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }

//        int[] a={2,5,4,3,1,8};
//        Arrays.sort(a,2,5);
//        System.out.println(Arrays.toString(a));
    }


    }
