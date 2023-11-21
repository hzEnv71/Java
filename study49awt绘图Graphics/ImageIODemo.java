package study49awt绘图Graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIODemo {
    //创建窗口
    private Frame frame=new Frame("窗口手绘程序");
    //创建菜单条
    MenuBar menuBar=new MenuBar();
    //创建菜单组件
    Menu menu=new Menu("文件");
    //创建菜单项组件
    MenuItem open=new MenuItem("打开");
    MenuItem save=new MenuItem("另存为");
    //声明BufferedImage对象，记录本地获取到内存中的图片
    BufferedImage bi;
    private class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
             g.drawImage(bi,0,0,null);
        }
    }
    //创建画布
    MyCanvas drawArea=new MyCanvas();
    public void init(){
        //组装视图
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //展示一个文件对话框
                FileDialog fileDialog=new FileDialog(frame,"打开图片",FileDialog.LOAD);
                fileDialog.setVisible(true);
                //获取用户选择的图片路径及名称
                String dir=fileDialog.getDirectory();
                String fileName=fileDialog.getFile();
                try {
                    bi= ImageIO.read(new File(dir,fileName));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                drawArea.repaint();
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //展示一个文件对话框
                FileDialog fileDialog=new FileDialog(frame,"保存图片",FileDialog.SAVE);
                fileDialog.setVisible(true);
                //获取用户保存的图片路径及名称
                String dir=fileDialog.getDirectory();
                String fileName=fileDialog.getFile();
                try {
                    ImageIO.write(bi,"JPEG",new File(dir,fileName));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //向菜单添加菜单项
        menu.add(open);
        menu.add(save);
        //向菜单条添加菜单
        menuBar.add(menu);
        //在窗口设置菜单条,添加位图
        frame.setMenuBar(menuBar);
        frame.add(drawArea);
        //设置窗口最佳大小
        frame.setBounds(200,150,600,400);
        //设置窗口可见
        frame.setVisible(true);
        //设置windowListener,监听用户点击x的动作
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {
        new ImageIODemo().init();
    }
}
