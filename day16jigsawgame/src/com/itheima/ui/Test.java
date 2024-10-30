package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //1.创建游戏的主界面
        JFrame gameJframe = new JFrame();
        //set方法设置窗口大小,单位：像素
        gameJframe.setSize(603,680);
        //界面默认隐藏，还需调用方法来显示
        gameJframe.setVisible(true);


        //2.创建登陆界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //3.创建注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);
    }
}
