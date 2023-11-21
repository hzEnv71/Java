package study49awt绘图Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gobang {
    //定义五子棋游戏窗口
    private JFrame frame=new JFrame("五子棋");
    //声明四个BufferedImage对象，分别记录四张图片
    BufferedImage table;
    BufferedImage black;
    BufferedImage white;
    BufferedImage selected;
    //声明棋盘的宽和高
    final int TABLE_WIDTH=1242;
    final int TABLE_HEIGHT=1409;
    //声明棋盘横向和纵向分别可以下多少子，15
    final int BOARD_SIZE=15;
    //声明每个棋子占用棋盘的比率
    final int RATE=TABLE_WIDTH/BOARD_SIZE;
    //声明变量，记录棋子对于x和y方向的偏移量
    final int X_OFFSET=6;
    final int Y_OFFSET=7;
    //声明一个二维数组，记录棋子，如果索引[i][j]处的值为 0-没有棋子  1-白棋  2-黑棋
    int [][] board =new int[BOARD_SIZE][BOARD_SIZE];
    //声明红色选择的坐标，该坐标就是二维数组board中的索引
    int selected_X=-1;
    int selected_Y=-1;
    //自定义类，继承Canvas
    private  class MyCanvas extends JPanel{
        @Override
        public void paint(Graphics g) {
            //绘图
            //绘制棋盘
            g.drawImage(table,0,0,null);
            //绘制选择框
            if(selected_X>0&&selected_Y>0) {
                g.drawImage(selected, selected_X*RATE+X_OFFSET, selected_Y*RATE+Y_OFFSET, null);
            }
            //绘制棋子
            for(int i=0;i<BOARD_SIZE;i++){
                for(int j=0;j<BOARD_SIZE;j++){
                    //绘制黑棋
                    if(board[i][j]==2) {
                        g.drawImage(black, i * RATE + X_OFFSET, j * RATE + Y_OFFSET, null);
                    }
                    //绘制白棋
                    if(board[i][j]==1){
                        g.drawImage(white,i*RATE+X_OFFSET,j*RATE+Y_OFFSET,null);
                    }
                    }
                }

            }
        }

    MyCanvas myCanvas=new MyCanvas();
    //声明变量，记录当前下棋的颜色
    int board_type=2;
    //声明底部要用到的组件
    Panel p=new Panel();
    Button whiteB=new Button("白棋");
    Button blackB=new Button("黑棋");
    Button deleteB=new Button("删除");
    //刷新按钮的颜色
    public void refreshBColor(Color whiteBColor,Color blackBColor,Color deleteBColor){
        whiteB.setBackground(whiteBColor);
        blackB.setBackground(blackBColor);
        deleteB.setBackground(deleteBColor);
    }
    public void init() throws IOException {
        //组装视图，编写逻辑控制
        whiteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改当前要下棋子的标志为1
                board_type=1;
                //刷新按钮的颜色
                refreshBColor(Color.green,Color.gray,Color.gray);
            }
        });
        blackB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改当前要下棋子的标志为2
                board_type=2;
                //刷新按钮的颜色
                refreshBColor(Color.gray,Color.green,Color.gray);
            }
        });
        deleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改当前要下棋子的标志为0
                board_type=0;
                //刷新按钮的颜色
                refreshBColor(Color.gray,Color.gray,Color.green);
            }
        });
        //向容器中添加按钮
        p.add(whiteB);
        p.add(blackB);
        p.add(deleteB);
        //向frame中添加p容器
        frame.add(p,BorderLayout.SOUTH);
        //组装棋盘
        //初始化图片
        table= ImageIO.read(new File("study49awt绘图Graphicsimg/微信图片_20220310072828.jpg"));
        white=ImageIO.read(new File("study49awt绘图Graphicsimg/微信图片_20220310072820.jpg"));
        black=ImageIO.read(new File("study49awt绘图Graphicsimg/微信图片_20220310072808.jpg"));
        selected=ImageIO.read(new File("study49awt绘图Graphicsimg/微信图片_20220310073140.jpg"));
        //处理鼠标移动
        myCanvas.addMouseMotionListener(new MouseMotionAdapter() {
            //当鼠标移动时调用
            @Override
            public void mouseMoved(MouseEvent e) {
                selected_X=(e.getX()-X_OFFSET)/RATE;
                selected_Y=(e.getY()-Y_OFFSET)/RATE;

                myCanvas.repaint();

            }
        });
        //处理鼠标点击
        myCanvas.addMouseListener(new MouseAdapter() {
            //当鼠标被点击时调用
            @Override
            public void mouseClicked(MouseEvent e) {
                int xPos=(e.getX()-X_OFFSET)/RATE;
                int yPos=(e.getY()-Y_OFFSET)/RATE;

                board[xPos][yPos]=board_type;
                myCanvas.repaint();
            }
            //当鼠标退出时重置
            @Override
            public void mouseExited(MouseEvent e) {
                selected_X=-1;
                selected_Y=-1;
                myCanvas.repaint();
            }
        });
        //设置画布的大小，并添加到frame中
        myCanvas.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        frame.add(myCanvas);

        //设置frame最佳大小并设置可见
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new Gobang().init();
    }

}
