package study38引用;

public class newInterDemo {
    public static void main(String[] args) {
        /**Lambda表达式针对有一个抽象方法的接口，实现接口功能作为方法参数*/
//        userMethod1(()-> System.out.println("接口中show1方法"));
//        userMethod2(()-> { System.out.println("接口中show2方法");return 666;});
//        userMethod3((i,j)-> System.out.println("接口中show3方法"));
//        userMethod4((i,j)->{ System.out.println("接口中show4方法");return i*j;});
//        userMethod5(2,2,(i, j) -> { System.out.println("接口中show5方法");return i * j;});
        /**当Lambda表达式的主体只有一条语句，可用方法引用替换*/
//        userMethod6( new newObject() ,object-> object.method1());
//        userMethod6(new newObject(),newObject::method1);
//        userMethod7(new newObject(),object ->{object.method2();return 110;});
//        userMethod7(new newObject(), newObject::method2);
//        newObject o = new newObject();
//        userMethod8(10, i->o.method3(10));
//        userMethod8(10,o::method3);
        userMethod9(10,i -> new newObject(i));
        userMethod9(10,newObject::new);
    }

    /* public static void userMethod1(newInter inter){
         inter.show1();
     }*/
   /* public static void userMethod2(newInter inter){
        int i=inter.show2();
        System.out.println(i);
    }*/
   /*public static void userMethod3(newInter inter){
       inter.show3(1,2);
   }*/
  /* public static void userMethod4(newInter inter){
       int i=inter.show4(1,2);
       System.out.println(i);
   }*/
   /* public static void userMethod5(int m,int n,newInter inter) {
        int i = inter.show5(m,n);
        System.out.println(i);
    }*/
   /* public static void userMethod6(newObject object, newInter inter) {
        inter.show6(object);
    }*/
   /* public static void userMethod7(newObject object, newInter inter) {
        int i=inter.show7(object);
        System.out.println(i);
    }*/
    /*public static void userMethod8( newInter inter) {
        inter.show8();
    }*/
    /*public static void userMethod8(int i, newInter inter) {
         int ii=inter.show8(i);
        System.out.println(ii);
    }*/
    public static void userMethod9(int i, newInter inter) {
        newObject object=inter.show9(i);
        System.out.println(object.getAge());
    }
}
