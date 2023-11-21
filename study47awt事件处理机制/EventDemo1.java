package study47awt事件处理机制;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo1 {
    Frame frame=new Frame("事件处理机制测试");
    TextField tf=new TextField(30);
    //事件源
    Button ok=new Button("确定");
    public void init(){
        //组装视图
        //监听器
        MyListener myListener=new MyListener();
        //注册监听
        ok.addActionListener(myListener);
        //把tf和ok放入Frame中
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);

        frame.pack();
        frame.setVisible(true);

    }
    private class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("hello world");
        }
    }

    public static void main(String[] args) {
        new EventDemo1().init();
    }
}
