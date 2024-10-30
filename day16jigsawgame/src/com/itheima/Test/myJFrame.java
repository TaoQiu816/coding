package com.itheima.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class myJFrame extends JFrame implements ActionListener {

//按钮对象会被多个方法使用到，因此写在成员位置
    //创建按钮对象
    JButton jtb1 = new JButton("点我啊");
    //创建按钮对象
    JButton jtb2 = new JButton("再点我啊");

    //空参构造
    public myJFrame() {
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



        //设置按钮大小和位置
        jtb1.setBounds(0,0,100,50);
        //对按钮添加动作监听,由于次类实现了actionlistener，因此可以直接写在括号内（实现类）
        jtb1.addActionListener(this);
        //添加按钮到隐藏容器
        this.getContentPane().add(jtb1);


        //设置按钮大小和位置
        jtb2.setBounds(100,0,100,50);
        //对按钮添加动作监听,由于次类实现了actionlistener，因此可以直接写在括号内（实现类）
        jtb2.addActionListener(this);
        //添加按钮到隐藏容器
        this.getContentPane().add(jtb2);

        //页面可视化
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被操作的按钮对象
        Object source = e.getSource();
        Random r = new Random();
        if (source == jtb1){
            //点击第一个按钮则随即改变按钮大小
            jtb1.setSize(r.nextInt(500),r.nextInt(500));
        } else if (source == jtb2) {
            //点击第二个则随即改变其位置
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }

    }
}
