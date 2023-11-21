package study12匿名内部类;

public class Demo {
    public static void main(String[] args) {
        Operator o=new Operator();
        Show s=new Fish()/*{
            @Override
            public void eat() {
               super.eat();
                System.out.println("鱼吃小鱼");
            }
        };*/;
        o.useShow(s);
        System.out.println("---------");

//       “ 匿名内部类 ”的使用
//优点:不需要再多写出“鱼”类了
        o.useShow(
//创建一个Show对象，然后重写eat方法，相当于Show s=new Show中的s//编译看左边，执行看右边
                new Show() {
            @Override
            public void eat() {
                System.out.println("鱼吃小鱼了");
                     }
              }

        );
    }
}
