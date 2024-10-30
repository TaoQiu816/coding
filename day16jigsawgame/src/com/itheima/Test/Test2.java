package com.itheima.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        //创建框体对象
        JFrame jFrame = new JFrame();
        //设置矿体尺寸
        jFrame.setSize(608,680);
        //设置标题
        jFrame.setTitle("事件演示");
        //设置页面置顶
        jFrame.setAlwaysOnTop(true);

        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);

        //创建按钮对象
        JButton jtb = new JButton("点我啊");
        //设置按钮大小和位置
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //addActionListener：表示给组件添加监听事件（动作监听包括左键点击和空格键）
        //括号内为ActionListener l是一个接口，调用接口时要调用接口的实现类对象，从而还要定义ActionListener的实现类并在括号内创建其对象
        //jtb.addActionListener(new MyActionListener());
        //参数：表示事件被触发之后要执行的代码

        //使用匿名内部类简化代码，因为按钮只在此处被按到才有响应
        //对象也只使用一次，可以不单独创建对象
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });

        //还可以使用实现actionlistener的方式写，见myJFrame


        //将按钮添加到隐藏容器中
        jFrame.getContentPane().add(jtb);



        //界面可视化
        jFrame.setVisible(true);
    }
}
