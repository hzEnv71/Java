import java.util.Scanner;

public class telephonefee{
    public static void main(String args[]){
        double callcharge=20;

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        int calltime=Integer.parseInt(s);
        if(calltime>=0){
            if(calltime<=100)
                System.out.println("电话费用"+callcharge+"元");
            else {
                callcharge = callcharge + (calltime - 100) * 0.15;
                System.out.println("电话费用" + callcharge + "元");
            }
        }
        else
            System.out.println("输入时间错误");
    }
}
