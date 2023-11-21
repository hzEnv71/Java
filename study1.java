import java.awt.*;
import java.awt.datatransfer.Clipboard; //Clipboard类实现一种使用剪切/复制/粘贴操作传输数据的机制。
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
/*
   操作类中，注意：Clipboard类的使用{Clipboard类实现一种使用剪切/复制/粘贴操作传输数据的机制。}
 */


public class study1 {
    public static void main(String[] args) throws AWTException {
        String str = "";// “要重复输出的话”  这里默认微信8.0.0中的烟花，如果是改成...
        Robot robot = new Robot();
        robot.delay(4000);// 单位为毫秒,延迟三秒(这个可自己设置)，主要是为了预留出打开窗口的时间
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();//将文本数据复制或剪切到系统剪贴板中
        String[] authors = str.split("[,]");// 字符串根据,分割
        for (int j = 0; j < 100; j++) {  //循环的次数（自己设置，不要太大）
            for (int i = 0; i < authors.length; i++) {
                String str1 = authors[i];
                Transferable text = new StringSelection(str1);
                clip.setContents(text, null);
                // 按下了ctrl+v，完成粘贴功能
                robot.keyPress(KeyEvent.VK_CONTROL);// 按下Control键
                robot.keyPress(KeyEvent.VK_V);// 按下V键
                robot.keyRelease(KeyEvent.VK_CONTROL);// 释放ctrl按键
                robot.delay(500);// 延迟一秒再发送（时间自己设置，如果是轰炸，就设置小点，单位是 ms，0-60000ms不定）
                robot.keyPress(KeyEvent.VK_ENTER);// 回车
            }
        }
    }
}

