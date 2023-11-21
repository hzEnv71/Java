package study50Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JOptionPaneTest {

    JFrame jFrame=new JFrame("消息对话框测试");
    JTextArea jta=new JTextArea(6,30);
    //声明按钮
    JButton btn=new JButton(new AbstractAction("弹出消息对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出消息对话框，并显示 文本域中输入的内容
            String text=jta.getText();
            //参数：int messageType 指定消息对话框的类型，错误消息，警告消息，问题消息
            JOptionPane.showMessageDialog(jFrame,text,"消息对话框",JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(jFrame,text,"消息对话框",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(jFrame,text,"消息对话框",JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(jFrame,text,"消息对话框",JOptionPane.QUESTION_MESSAGE);

            //JOptionPane.showMessageDialog(jFrame,text,"消息对话框",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\微信图片_20220310072820.jpg"));
            //弹出确认对话框
//            int result=JOptionPane.showConfirmDialog(jFrame,text,"确认对话框",JOptionPane.DEFAULT_OPTION);
//            int result=JOptionPane.showConfirmDialog(jFrame,text,"确认对话框",JOptionPane.YES_NO_OPTION);
          /*  int result=JOptionPane.showConfirmDialog(jFrame,text,"确认对话框",JOptionPane.YES_NO_CANCEL_OPTION);
            if(result==JOptionPane.YES_OPTION){
                jta.append("你点击了 是 ");
            }
            if(result==JOptionPane.NO_OPTION){
                jta.append("你点击了 否 ");
            }
            if(result==JOptionPane.OK_OPTION){
                jta.append("你点击了 ok ");
            }
            if(result==JOptionPane.CANCEL_OPTION){
                jta.append("你点击了 cancel ");
            }

*/
            //弹出输入对话框
            /*String result=JOptionPane.showInputDialog(jFrame,"请输入：","输入对话框",JOptionPane.INFORMATION_MESSAGE);
            jta.append(result);*/
            //弹出选项对话框
            int result=JOptionPane.showOptionDialog(jFrame,"请选择：","选择对话框",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,new String[]{"大","中","小"},"小");
            switch (result){
                case 0:
                    jta.setText("你选择了 大");
                    break;
                case 1:
                    jta.setText("你选择了 中");
                    break;
                case 2:
                    jta.setText("你选择了 小");
                    break;
            }

        }
    });
    public void init(){
        //组装视图
        jFrame.add(jta);
        jFrame.add(btn, BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JOptionPaneTest().init();
    }
}
