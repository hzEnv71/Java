package study2继承和关键字;

public class NewPhone extends Phone {
    @Override//检查方法重写是否正确，如果与父类方法不一致则报错
    public void call(String name) {
        System.out.println("开启视频模式");
//        System.out.println("给" + name + "打电话");
        super.call(name);//访问父类“成员”方法,用于重写
//        call(name);错误用法

    }
   public void message(String id){//在方法重写中，子类的方法访问权限要比父类的访问权限大

        System.out.println("打开信息");
//        System.out.println("给"+id+"发信息");
        super.message(id);
    }
    public void wucan(){
        super.wucan();
    }

}
