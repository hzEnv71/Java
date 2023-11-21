package study45layout;

import java.awt.*;

public class FlowLayoutDemo {

        public static void main(String[] args) {
            Frame frame=new Frame("FlowLayout测试");
            //1.通过setLayout方法设置容器的布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//左对齐
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));//中间对齐
//            frame.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));//右对齐
            //2.添加多个按钮到Frame中
            for(int i=0;i<100;i++){
                frame.add(new Button("按钮"+i));
            }
            //3.设置最佳大小，pack方法
            frame.pack();

            frame.setVisible(true);
        }
    }


