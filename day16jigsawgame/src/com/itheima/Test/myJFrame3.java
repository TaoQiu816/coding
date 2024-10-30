package com.itheima.Test;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myJFrame3 extends JFrame implements MouseListener {
    public myJFrame3() {
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

        //创建按钮对象
        JButton jtb1 = new JButton("点我啊");
        //设置按钮大小和位置
        jtb1.setBounds(0,0,100,50);
        //按钮绑定事件
        jtb1.addMouseListener(this);
        //添加按钮到隐藏容器
        this.getContentPane().add(jtb1);


        //页面可视化
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标离开");
    }
}
