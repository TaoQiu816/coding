package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面

    public RegisterJFrame(){
        //set方法设置窗口大小,单位：像素
        this.setSize(488,500);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭,3表示关闭其中一个窗口，虚拟机就结束工作
        //this.setDefaultCloseOperation(3);
        //或者直接使用EXIT_ON_CLOSE
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //界面默认隐藏，还需调用方法来显示,建议放最后
        this.setVisible(true);
    }
}
