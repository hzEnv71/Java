package study45layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        Frame frame=new Frame("CardLayout测试");
        //设置window的位置及大小
        frame.setBounds(200,200,500,300);
        //1。创建一个Panel对象，里面存放多张卡片
        Panel p1=new Panel();
        //2.创建CardLayout对象，并且把对象设置给之前创建的容器
        CardLayout cardLayout=new CardLayout();
        p1.setLayout(cardLayout);
        //3.往Panel中存储多个组件
        String[] names={"第一张","第二张","第三张", "第四张","第五张"};
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i],new Button(names[i]));

        }
        //4.把Panel放到frame的中间区域
        frame.add(p1);

        //5.创建另一个Panel p2，用来存储多个组件
        Panel p2=new Panel();
        //6.创建5个按钮组件
        Button 上一张 = new Button("上一张");
        Button 下一张 = new Button("下一张");
        Button 第一张 = new Button("第一张");
        Button 最后一张 = new Button("最后一张");
        Button 第三张 = new Button("第三张");
        //7.创建一个事件监听器，监听按钮的点击动作
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand=e.getActionCommand();//这个字符串其实就是按钮上的文字
                switch (actionCommand){
                    case "上一张":
                        cardLayout.previous(p1);
                        break;
                    case "下一张":
                        cardLayout.next(p1);
                        break;
                    case "最后一张":
                        cardLayout.last(p1);
                        break;
                    case "第一张":
                        cardLayout.first(p1);
                        break;
                    case "第三张":
                        cardLayout.show(p1,"第三张");
                        break;


                }
            }
        };
        //8.把当前这个时间监听器和多个按钮绑定到一起
        上一张.addActionListener(listener);
        下一张.addActionListener(listener);
        第一张.addActionListener(listener);
        最后一张.addActionListener(listener);
        第三张.addActionListener(listener);
        //9.把按钮添加到容器p2中
        p2.add(上一张);
        p2.add(下一张);
        p2.add(第一张);
        p2.add(最后一张);
        p2.add(第三张);
        //10.把p2放到frame的南边区域
        frame.add(p2,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
