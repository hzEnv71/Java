package study10成员内部类;

public class Outer {
    private int num = 10;

    /* public class Inter {
         public void show(){
             System.out.println(num);
         }
     }*/
    public  class Inter {
        private void show() {
            System.out.println(num);
            System.out.println("成员内部类");
        }
    }
    public  void method(){
        Inter i=new Inter();
        i.show();
    }
}
