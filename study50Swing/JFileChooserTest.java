package study50Swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JFileChooserTest {
    //创建窗口对象
    JFrame jFrame=new JFrame("文件选择器测试");
    //创建菜单条
    JMenuBar jmb=new JMenuBar();
    //创建菜单
    JMenu jMenu=new JMenu("文件");

    JMenuItem open=new JMenuItem(new AbstractAction("打开") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser jFileChooser=new JFileChooser();
            jFileChooser.showOpenDialog(jFrame);
            //获取用户选择的文件
            File file=jFileChooser.getSelectedFile();
            //进行显示
            try {
                image= ImageIO.read(file);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    });
    JMenuItem save=new JMenuItem(new AbstractAction("另存为") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser jFileChooser=new JFileChooser();
            jFileChooser.showSaveDialog(jFrame);
            //获取用户选择的保存文件路径
            File file=jFileChooser.getSelectedFile();
            //进行显示
            try {
                ImageIO.write(image,"jpg",file);
                drawArea.repaint();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    });
    BufferedImage image;
    //swing提供的组件，都使用了图像缓冲区技术
    private class MyCanvas extends JPanel{
        @Override
        public void paint(Graphics g) {
            //把图片绘制到组件上即可
            g.drawImage(image,0,0,null);
        }
    }
    MyCanvas drawArea=new MyCanvas();

    public void init(){
        //组装视图
        jMenu.add(open);
        jMenu.add(save);

        jmb.add(jMenu);

        jFrame.setJMenuBar(jmb);

        drawArea.setPreferredSize(new Dimension(700,300));
        jFrame.add(drawArea);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JFileChooserTest().init();
    }
}
