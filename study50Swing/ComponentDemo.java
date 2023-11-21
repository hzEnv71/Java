package study50Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentDemo {
    //创建窗口
    JFrame jFrame=new JFrame("基本组件测试");
    //创建菜单条
    JMenuBar jMenuBar=new JMenuBar();
    //创建菜单项
    JMenu fileMenu=new JMenu("文件");
    JMenu editMenu=new JMenu("编辑");

    JMenu formatMenu=new JMenu("格式");
    //创建菜单项
    JMenuItem auto=new JMenuItem("自动换行");
    JMenuItem copy=new JMenuItem("复制");
    JMenuItem paste=new JMenuItem("粘贴");

    JMenuItem comment=new JMenuItem("注释");
    JMenuItem cancelComment=new JMenuItem("取消注释");
    //声明文本域
    JTextArea jTextArea=new JTextArea(10,25);

    String[] colors={"红色","绿色","蓝色"};
    //声明列表框
    JList<String> colorList=new JList<>(colors);
    //声明选择相关组件
    JComboBox<String> colorSelect=new JComboBox<>();
    //创建按钮组
    ButtonGroup buttonGroup1=new ButtonGroup();
    //创建具有指定文本和选择状态的单选按钮
    JRadioButton male=new JRadioButton("男",false);
    JRadioButton female=new JRadioButton("女",true);
    //创建一个带有文本的复选框，并指定是否最初选择它
    JCheckBox isMarried=new JCheckBox("是否已婚",true);
    //声明底部,创建文本框并附带按钮
    JTextField jTextField=new JTextField(40);
    JButton ok=new JButton("确定");
    //声明右键菜单
    JPopupMenu jPopupMenu=new JPopupMenu();
    //声明菜单组
    ButtonGroup buttonGroup2=new ButtonGroup();
    JRadioButtonMenuItem metalItem=new JRadioButtonMenuItem("Metal 风格");
    JRadioButtonMenuItem nimbusItem=new JRadioButtonMenuItem("Nimbus 风格");
    JRadioButtonMenuItem windowsItem=new JRadioButtonMenuItem("Windows 风格",true);
    JRadioButtonMenuItem windowsClassicItem=new JRadioButtonMenuItem("Windows 经典风格");
    JRadioButtonMenuItem motifItem=new JRadioButtonMenuItem("Motif 风格");
    //初始化界面
    public void init(){
        //组装视图
        //组装底部
        JPanel bottomPanel=new JPanel();
        bottomPanel.add(jTextField);
        bottomPanel.add(ok);
        //向窗口添加容器并设置位置
        jFrame.add(bottomPanel, BorderLayout.SOUTH);
        //组装选择相关组件
        JPanel selectPanel=new JPanel();
        //向 JComboBox中添加颜色菜单项
        colorSelect.addItem("红色");
        colorSelect.addItem("绿色");
        colorSelect.addItem("蓝色");

        selectPanel.add(colorSelect);
        buttonGroup1.add(male);
        buttonGroup1.add(female);
        selectPanel.add(male);
        selectPanel.add(female);
        selectPanel.add(isMarried);
        //组装文本域和选择相关组件
        Box topLeft=Box.createVerticalBox();
        topLeft.add(jTextArea);
        topLeft.add(selectPanel);
        //组装顶部
        Box top=Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);
        jFrame.add(top);
        //组装顶部菜单
        formatMenu.add(comment);
        formatMenu.add(cancelComment);

        editMenu.add(auto);
        editMenu.addSeparator();
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.addSeparator();
        editMenu.add(formatMenu);

        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);

        jFrame.setJMenuBar(jMenuBar);
        //组装右键菜单
        jPopupMenu.add(metalItem);
        jPopupMenu.add(nimbusItem);
        jPopupMenu.add(windowsItem);
        jPopupMenu.add(windowsClassicItem);
        jPopupMenu.add(motifItem);

        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //当前选择的风格
                String actionCommand=e.getActionCommand();
                try {
                    changeFlavor(actionCommand);
                } catch (UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (InstantiationException ex) {
                    ex.printStackTrace();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        };
        metalItem.addActionListener(listener);
        nimbusItem.addActionListener(listener);
        windowsItem.addActionListener(listener);
        windowsClassicItem.addActionListener(listener);
        motifItem.addActionListener(listener);

        jPopupMenu.add(motifItem);
        jPopupMenu.add(nimbusItem);
        jPopupMenu.add(windowsItem);
        jPopupMenu.add(windowsClassicItem);
        jPopupMenu.add(motifItem);

        jTextArea.setComponentPopupMenu(jPopupMenu);
        //监听点击x的动作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);


    }

    public static void main(String[] args) {
        new ComponentDemo().init();
    }
    //定义方法，用于改变界面风格
    private void changeFlavor(String command) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        switch (command){
            case "Metal 风格":
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            case "Nimbus 风格":
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            case "Windows 风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                break;
            case "Windows 经典风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                break;
            case "Motif 风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                break;
        }
        //刷新组件外观
        SwingUtilities.updateComponentTreeUI(jFrame.getContentPane());
        SwingUtilities.updateComponentTreeUI(jMenuBar);
        SwingUtilities.updateComponentTreeUI(jPopupMenu);
    }
}
