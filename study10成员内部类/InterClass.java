package study10成员内部类;

public class InterClass {
    private int num=10;

    //成员内部类

        public class Inter{//private可以在本类中被调用
            public void show(){
                System.out.println(num);
            }
        }
        public void method(){
//            show();//不能直接访问内部类中的方法
            Inter i=new Inter();
            i.show();
        }

}
