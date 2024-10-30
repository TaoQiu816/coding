package com.itheima.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myJFrame2 extends JFrame implements KeyListener {

    public myJFrame2() {
        //set方法设置窗口大小,单位：像素
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("演示");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭,3表示关闭其中一个窗口，虚拟机就结束工作
        //this.setDefaultCloseOperation(3);
        //或者直接使用EXIT_ON_CLOSE
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //绑定按钮事件
        this.addKeyListener(this);
        //页面可视化
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松会一直调用keypress
    //每个按键都有一个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("松开键盘");
        int  source = e.getKeyCode();
        if (source==65){
            System.out.println("按的是A");
        } else if (source==66) {
            System.out.println("按的是B");
        }
    }
}
