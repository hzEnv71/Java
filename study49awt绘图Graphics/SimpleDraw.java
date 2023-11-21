package study49awt绘图Graphics;

import java.awt.*;
import java.awt.event.*;

public class SimpleDraw {
    private final String RECT_SHAPE="rect";
    private final String OVAL_SHAPE="oval";

   private Frame frame=new Frame("绘图测试");

   Button btnReact=new Button("绘制矩形");
   Button btnOval=new Button("绘制椭圆");

   //定义一个变量，记录当前要绘制椭圆还是矩形
    private String shape="";
   //自定义类，继承Canvas类，重写paint（Graphics g）方法完成画图
    private  class MyCanvas extends Canvas{
       @Override
       public void paint(Graphics g) {
           //绘制不同的图形
           if(shape.equals(RECT_SHAPE)){
               //绘制矩形
               g.setColor(Color.BLACK);//设置当前画笔的颜色为黑色
               g.drawRect(100,100,150,100);
           }
           else if(shape.equals(OVAL_SHAPE)){
               //绘制椭圆
               g.setColor(Color.RED);//设置当前画笔的颜色为红色
               g.drawOval(100,100,150,100);
           }
       }
   }
    //创建自定义的画布对象
    MyCanvas drawArea=new MyCanvas();

    public void init(){
        //组装视图
        btnReact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //修改标记的值为rect
                shape=RECT_SHAPE;
               drawArea.repaint();
            }
        });
        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改标记的值为oval
                shape=OVAL_SHAPE;
                drawArea.repaint();
            }
        });
        //设置windowListener,监听用户点击x的动作
        frame.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
             System.exit(0);
         }
         });



       //创建Panel,承载按钮
        Panel p=new Panel();
        p.add(btnReact);
        p.add(btnOval);

        frame.add(p,BorderLayout.SOUTH);
        //设置drawArea的大小
        drawArea.setPreferredSize(new Dimension(300,200));
        frame.add(drawArea);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleDraw().init();
    }

}
