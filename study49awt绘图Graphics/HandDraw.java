package study49awt绘图Graphics;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class HandDraw {
    //创建窗口
    private Frame frame=new Frame("窗口手绘程序");
    //定义画图区域的宽高
    private final int AREA_WIDTH=600;
    private final int AREA_HEIGHT=600;
    //定义一个右键菜单，用于选择画笔的颜色
    private PopupMenu colorMenu=new PopupMenu();
    private MenuItem redItems=new MenuItem("红色");
    private MenuItem greenItems=new MenuItem("绿色");
    private MenuItem blueItems=new MenuItem("蓝色");
    //定义一个颜色，记录当前画笔的颜色
    private Color preColor =Color.BLACK;
    //创建一个BufferedImage位图对象
    BufferedImage bufferedImage=new BufferedImage(AREA_WIDTH,AREA_HEIGHT,BufferedImage.TYPE_INT_RGB);
    //通过位图，获取关联的Graphics对象
    Graphics graphics=bufferedImage.getGraphics();
    //定义一个类，继承Canvas
    private class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(bufferedImage,0,0,null);
        }
    }
    //创建画布
    MyCanvas drawArea=new MyCanvas();
    //定义变量，记录鼠标移动过程中，上一次所处的坐标
    private int preX=-1;
    private int preY=-1;

    public void init(){
        //组装视图，逻辑控制
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand=e.getActionCommand();
                switch (actionCommand){
                    case"红色":
                        preColor=Color.red;
                        break;
                    case"绿色":
                        preColor=Color.green;
                        break;
                    case"蓝色":
                        preColor=Color.blue;
                        break;
                }
            }
        };
        //注册三种画笔的事件监听
        redItems.addActionListener(actionListener);
        greenItems.addActionListener(actionListener);
        blueItems.addActionListener(actionListener);
        //把三种颜色的菜单添加到菜单项
        colorMenu.add(redItems);
        colorMenu.add(greenItems);
        colorMenu.add(blueItems);
        //把colorMenu设置给绘图区域
        drawArea.add(colorMenu);
        //给菜单右键注册事件监听
        drawArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                //当鼠标键被抬起时被调用
                boolean flag=e.isPopupTrigger();
                if(flag){
                    colorMenu.show(drawArea,e.getX(),e.getY());
                }

                //重置preX和preY
                preX=-1;
                preY=-1;
            }
        });
        //给frame注册WindowListener，监听用户点击x的动作
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //设置位图的背景为黄色
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0,AREA_WIDTH,AREA_HEIGHT);
        //通过监听鼠标的移动，完成线条的绘制
        drawArea.addMouseMotionListener(new MouseMotionAdapter() {
            //当鼠标左键移动时，调用方法
            @Override
            public void mouseDragged(MouseEvent e) {
                if(preX>0&&preY>0){
                    graphics.setColor(preColor);
                    //画线条，需要两组坐标，分别代表线条的起点和终点
                    graphics.drawLine(preX,preY,e.getX(),e.getY());
                }
                //修正preX的值和preY的值
                preX=e.getX();
                preY=e.getY();
                //重绘组件
                drawArea.repaint();
            }
        });
        //设置drawArea的大小
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
        frame.add(drawArea);
        // 设置frame最佳大小并设置可见
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new HandDraw().init();
    }

}
