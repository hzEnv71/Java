package study44container;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        //创建一个Window对象
        Frame frame=new Frame("Panel演示");
        //创建Panel对象，必须依附于window存在
        Panel p=new Panel();
        //创建一个文本框和一个按钮，放入Panel容器中
        TextField textField=new TextField(30);
        TextField textField1=new TextField("测试文本框",40);
        p.add(textField);
        p.add(textField1);
        p.add(new Button("测试按钮"));
        //把Panel放入window中
        frame.add(p);
        //设置window的位置及大小
        frame.setBounds(200,200,500,300);
        //设置window可见
        frame.setVisible(true);

    }
}
