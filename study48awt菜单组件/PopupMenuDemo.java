package study48awt菜单组件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuDemo {
    //创建窗口
    private Frame frame = new Frame("菜单组件测试");
    //创建文本域
    TextArea ta = new TextArea("Hello", 20, 30);
    //创建Panel容器
    Panel p = new Panel();
    //创建Popup
    PopupMenu popupMenu = new PopupMenu();
    //创建菜单项组件
    MenuItem comment = new MenuItem("注释");
    MenuItem auto = new MenuItem("自动换行");
    MenuItem copy = new MenuItem("复制");
    MenuItem paste = new MenuItem("粘贴");

    public void init() {
        //组装视图
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();

                ta.append("您点击了" + e.getActionCommand());
            }
        };
        comment.addActionListener(listener);
        auto.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

        popupMenu.add(comment);
        popupMenu.add(auto);
        popupMenu.add(copy);
        popupMenu.add(paste);

        p.add(popupMenu);

        //设置Panel的大小
        p.setPreferredSize(new Dimension(400,300));

        //给Panel添加鼠标事件，监听用户释放鼠标的动作
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag=e.isPopupTrigger();
                if(flag){
                    //显示PopupMenu
                    popupMenu.show(p,e.getX(),e.getY());
                }
            }
        });
        //放置ta和p
        frame.add(ta);
        frame.add(p,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuDemo().init();
    }

}