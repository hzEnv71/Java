package study47awt事件处理机制;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerDemo1 {
    public static void main(String[] args) {
        Frame frame =new Frame("这里测试监听器");
        //创建组件
        TextField tf=new TextField(30);
        Choice names=new Choice();
        names.add("赵云");
        names.add("张飞");
        names.add("关羽");

        //给文本域添加TextListener，监听内容的变化
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text=tf.getText();
                System.out.println("当前文本框中的内容是："+text);
            }
        });
        //给下拉选择框添加ItemListener，监听条目选项的变化
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item=e.getItem();
                System.out.println("当前选中的条目为："+item);
            }
        });
        //给frame注册ContainerListener，监听容器中组件的添加
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child =e.getChild();
                System.out.println("frame中添加了："+child);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });
        //给frame注册WindowListener，监听用户点击x的动作
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //添加到frame中
        Box hBox=Box.createHorizontalBox();
        hBox.add(names);
        hBox.add(tf);
        frame.add(hBox);

        frame.pack();
        frame.setVisible(true);

    }
}
