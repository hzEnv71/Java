package study46awt基本组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame frame=new Frame("FileDialog测试");
        //1.创建两个对象
        FileDialog d1=new FileDialog(frame,"选择要打开的文件",FileDialog.LOAD);
        FileDialog d2=new FileDialog(frame,"选择要保存的路径",FileDialog.SAVE);

        //2.创建两个按钮
        Button b1=new Button("打开文件");
        Button b2=new Button("保存文件");
        //4.给两个按钮添加点击后的行为,获取打开或保存的路径文件名
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);//代码会堵塞到这里

                //获取选择的2路径和文件
                String directory =d1.getDirectory();
                String file=d1.getFile();
                System.out.println("打开的文件路径为："+directory);
                System.out.println("打开的文件名称为："+file);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);//代码会堵塞到这里

                //获取选择的2路径和文件
                String directory =d2.getDirectory();
                String file=d2.getFile();
                System.out.println("保存的文件路径为："+directory);
                System.out.println("保存的文件名称为："+file);
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
