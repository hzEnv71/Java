package study46awt基本组件;

import javax.swing.*;
import java.awt.*;

public class BasicComponentDemo {
    Frame frame=new Frame("基本组件测试");

    TextArea ta=new TextArea(5,20);

    Choice colorChooser=new Choice();
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox male=new Checkbox("男",cbg,true);
    Checkbox female=new Checkbox("女",cbg,true);

    Checkbox isMarried=new Checkbox("是否已婚");

    TextField tf=new TextField(20);
    Button ok=new Button("确认");

    List colorList =new List(6,true);
    public void init(){
        //组装界面
        //组装底部
        Box bBox= Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(ok);

        frame.add(bBox,BorderLayout.SOUTH);
        //组装选择部分
        colorChooser.add("红色");
        colorChooser.add("蓝色");
        colorChooser.add("绿色");

        Box cBox=Box.createHorizontalBox();
        cBox.add(colorChooser);
        cBox.add(male);
        cBox.add(female);
        cBox.add(isMarried);

        //组装文本域和选择部分
        Box topLeft=Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(cBox);
        //组装顶部左边和列表框
        colorList.add("红色");
        colorList.add("绿色");
        colorList.add("蓝色");


        Box top=Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);
        //设置最佳大小，pack方法
        frame.pack();

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new BasicComponentDemo().init();
    }
}
