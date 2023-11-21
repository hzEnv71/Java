package study49awt绘图Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PingPongBall {
    private Frame frame =new Frame("弹球游戏");
    //桌面宽度
    private final int TABLE_WIDTH=300;
    //桌面高度
    private final int TABLE_HEIGHT=400;
    //球拍的高度和宽度
    private final int RACKET_WIDTH=100;
    private final int RACKET_HEIGHT=20;
    //设置小球的大小
    private final int BALL_SIZE=16;
    //定义变量，记录小球的坐标
    private int ballX=120;
    private int ballY=20;
    //定义变量，记录小球在x和y上移动的速度
    private int speedX=20;
    private int speedY=10;
    //定义变量，记录球拍的坐标
    private int racketX=120;
    private final int racketY=340;
    //定义变量，标识当前游戏是否结束
    private boolean isOver=false;
    //声明一个定时器
    private Timer timer;

    //自定义一个类，继承Canvas类，充当画布
    private class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            //绘制内容
            if(isOver){
                //游戏结束
                g.setColor(Color.BLUE);
                g.setFont(new Font("Times",Font.BOLD,30));
                g.drawString("游戏结束",50,200);
            }else{
                //游戏中
                //绘制小球
                g.setColor(Color.darkGray);
                g.fillOval(ballX,ballY,BALL_SIZE,BALL_SIZE);
                //绘制球拍
                g.setColor(Color.BLUE);
                g.fillRect(racketX,racketY,RACKET_WIDTH,RACKET_HEIGHT);
            }
        }
    }
    //创建绘画区域
    MyCanvas drawArea=new MyCanvas();

    public void init(){
        //组装视图，游戏逻辑的控制

        //完成球拍坐标的变化
        KeyListener listener =new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode=e.getKeyCode();

                if(keyCode==KeyEvent.VK_LEFT){
                    //<-应该向左移动
                    if(racketX>0){
                        racketX-=20;
                    }
                }
                if(keyCode==KeyEvent.VK_RIGHT){
                    //->应该向右移动
                    if(racketX<(TABLE_WIDTH-RACKET_WIDTH)){
                        racketX+=20;
                    }
                }

            }
        };


        //给Frame和drawArea注册监听器
        frame.addKeyListener(listener);
        drawArea.addKeyListener(listener);
        //小球坐标的控制
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //根据边界范围，修正速度
                if(ballX<=0||ballX>=TABLE_WIDTH-BALL_SIZE){
                    speedX=-speedX;
                }
                if(ballY<=0||(ballY>racketY-BALL_SIZE&&ballX>racketX&&ballX<(racketX+RACKET_WIDTH))){
                    speedY=-speedY;
                }
                if(ballY>racketY-BALL_SIZE&&(ballX<racketX||ballX>racketX+RACKET_WIDTH)){
                    //当前小球超过了球拍的范围，游戏结束
                    //停止计时器
                    timer.stop();
                    //修改游戏结束的标记
                    isOver=true;
                    //重绘界面
                    drawArea.repaint();

                }
                //更新小球的坐标。重绘界面
                ballX+=speedX;
                ballY+=speedY;
                //重绘界面
                drawArea.repaint();
            }
        };
        //设置windowListener,监听用户点击x的动作
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        timer=new Timer(100,actionListener);
        timer.start();
        //设置桌面大小
        drawArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        frame.add(drawArea);


        //设置frame最佳大小并设置可见
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PingPongBall().init();

    }


}
