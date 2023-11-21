package study44container;

import java.awt.*;

public class WindowDemo {
    public static void main(String[] args) {
        //创建创窗口对象
        Frame frame=new Frame("windows窗口");
        //指定窗口位置，大小
        frame.setLocation(200,200);
        frame.setSize(500,300);
        //设置窗口对象可见
        frame.setVisible(true);
        /*frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/

    }
}
