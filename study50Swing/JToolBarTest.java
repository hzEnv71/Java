package study50Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JToolBarTest {
    JFrame jf=new JFrame("工具条测试");
    JTextArea jta=new JTextArea(6,35);
    //声明工具条相关内容
    JToolBar jToolBar=new JToolBar("播放工具条",SwingConstants.HORIZONTAL);
    //创建action对象参数name，icon
    Action pre=new AbstractAction("上一曲") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("上一曲，\n");
        }
    };
    Action pause=new AbstractAction("暂停") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("暂停，\n");
        }
    };
    Action next=new AbstractAction("下一曲") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("下一曲，\n");
        }
    };
    public  void  init(){
        //组装视图
        /*jToolBar.add(pre);
        jToolBar.addSeparator();
        jToolBar.add(pause);
        jToolBar.addSeparator();
        jToolBar.add(next);*/

        //通过action对象来创建JButton

        JButton preBtn=new JButton(pre);
        JButton pauseBtn=new JButton(pause);
        JButton nextBtn=new JButton(next);
        jToolBar.add(preBtn);
        jToolBar.addSeparator();
        jToolBar.add(pauseBtn);
        jToolBar.addSeparator();
        jToolBar.add(nextBtn);

        //设置工具条可拖动
        jToolBar.setFloatable(true);

        //文本框默认不支持滚动条
        //把组件设置到JScrollPane中，该组件就支持滚动条了
        JScrollPane jScrollPane=new JScrollPane(jta);
        jf.add(jScrollPane);

        jf.add(jToolBar, BorderLayout.NORTH);
        jf.add(jta);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new JToolBarTest().init();
    }
}
