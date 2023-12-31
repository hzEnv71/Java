package study46awt基本组件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo1 {
    public static void main(String[] args) {
        Frame frame=new Frame("对话框测试");
        //1.创建两个对话框对象，一个模式，一个非模式
        Dialog d1=new Dialog(frame,"模式对话框",true);
        Dialog d2=new Dialog(frame,"非模式对话框",false);
        //2.通过setBounds方法设置Dialog的位置及大小
        d1.setBounds(20,30,300,200);
        d2.setBounds(20,30,300,200);
        //3.创建两个按钮
        Button b1=new Button("打开模式对话框");
        Button b2=new Button("打开非模式对话框");
        //4.给两个按钮添加点击后的行为
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });
        //5.把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);
        //6.设置最佳大小，pack方法
        frame.pack();

        frame.setVisible(true);
    }
}
