package study44container;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        //创建一个Window对象
        Frame frame=new Frame("ScrollPane演示");
        //创建ScrollPane对象
        ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);


        //往ScrollPane中添加内容
        sp.add(new TextField("测试文本"));
        sp.add(new Button("测试按钮"));
        //把ScrollPane添加到Frame中
        frame.add(sp);
        //设置window的位置及大小
        frame.setBounds(200,200,500,300);
        //设置window可见
        frame.setVisible(true);
    }
}
