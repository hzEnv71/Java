package study45layout;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame=new Frame("BroderLayout测试");
        //1.给frame设置BorderLayout布局管理器
        frame.setLayout(new BorderLayout(30,10));
        //2.往frame的指定区域添加组件
        frame.add(new Button("北"),BorderLayout.NORTH);
        frame.add(new Button("南"),BorderLayout.SOUTH);
        frame.add(new Button("东"),BorderLayout.EAST);
        frame.add(new Button("西"),BorderLayout.WEST);
        frame.add(new Button("中"),BorderLayout.CENTER);
        //3.设置最佳大小，pack方法
        frame.setBounds(200,200,800,500);

        frame.setVisible(true);
    }
}
