package study45layout;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        Frame frame=new Frame("BoxLayout测试");
        //设置window的位置及大小
        frame.setBounds(200,200,500,300);
        /*
        //1.基于frame容器,创建一个BOxLayout对象，并且，该对象存放数组是垂直存放
//        BoxLayout boxLayout=new BoxLayout(frame,BoxLayout.Y_AXIS);//竖直排列
        BoxLayout boxLayout=new BoxLayout(frame,BoxLayout.X_AXIS);//水平排列
        //2.把BoxLayout对象设置给frame
        frame.setLayout(boxLayout);
        //3.往frame中添加两个按钮组件
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));
        */
       /*
        //1.创建一个水平排列组件的Box容器
        Box hBox=Box.createHorizontalBox();
        //2.往当前容器中添加两个按钮
        hBox.add(new Button("水平按钮1"));
        hBox.add(new Button("水平按钮2"));
        //3.创建一个水平排列组件的Box容器
        Box vBox=Box.createVerticalBox();
        //4.往当前容器中添加两个按钮
        vBox.add(new Button("垂直按钮1"));
        vBox.add(new Button("垂直按钮2"));
        //5.把两个Box容器添加到frame中展示
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        */
        //1.创建水平排列的Box容器
        Box hBox=Box.createHorizontalBox();
        //2.往当前容器中添加按钮，在多个按钮之间添加分割
        hBox.add(new Button("水平按钮1"));
        hBox.add(Box.createHorizontalGlue());//该分割在两个方向上都可以拉伸
        hBox.add(new Button("水平按钮2"));
        hBox.add(Box.createHorizontalStrut(30));//设置宽度
        hBox.add(new Button("水平按钮3"));
        //3.创建竖直排列的Box容器
        Box vBox=Box.createVerticalBox();
        //4.往当前容器中添加两个按钮，在多个按钮之间添加分割
        vBox.add(new Button("垂直按钮1"));
        vBox.add(Box.createVerticalGlue());//该分割在两个方向上都可以拉伸
        vBox.add(new Button("垂直按钮2"));
        vBox.add(Box.createVerticalStrut(30));//设置高度
        vBox.add(new Button("垂直按钮3"));
        //5.把两个Box容器添加到frame中展示
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);

        frame.setVisible(true);
    }
}
