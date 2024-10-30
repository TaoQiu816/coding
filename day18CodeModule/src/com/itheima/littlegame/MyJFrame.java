package com.itheima.littlegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements ActionListener {

    JButton yesButton = new JButton("帅爆了啊");
    JButton midButton = new JButton("一般般吧");
    JButton noButton = new JButton("不帅，有点磕碜");
    JButton daButton = new JButton("饶了我吧");
    boolean flag;

    //空参构造
    public MyJFrame() {

        //初始化框架
        initJFrame();

        //初始化并添加页面内容
        initView();

        //显示
        this.setVisible(true);
    }

    private void initView() {
        //清除页面所有内容
        this.getContentPane().removeAll();

        if (flag) {
            //展示按钮
            daButton.setBounds(50, 20, 100, 30);
            daButton.addActionListener(this);
            this.getContentPane().add(daButton);
        }


        //显示恶搞的问题
        JLabel question = new JLabel("你觉得自己帅吗?");
        question.setBounds(120, 150, 300, 50);
        //设置字体
        question.setFont(new Font("微软雅黑", 0, 30));

        //设置选项按钮的格式
        yesButton.setBounds(200, 250, 100, 30);
        midButton.setBounds(200, 325, 100, 30);
        noButton.setBounds(160, 400, 180, 30);

        //绑定动作监听
        yesButton.addActionListener(this);
        midButton.addActionListener(this);
        noButton.addActionListener(this);

        //将问题和按钮都添加到隐藏容器
        this.getContentPane().add(question);
        this.getContentPane().add(yesButton);
        this.getContentPane().add(midButton);
        this.getContentPane().add(noButton);

        //刷新界面
        this.getContentPane().repaint();


    }

    //初始化框架
    private void initJFrame() {
        //设置宽高
        this.setSize(500, 600);
        //标题
        this.setTitle("恶搞好基友");
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);//关闭窗后则关闭应用程序
        //取消内部默认布局才能使用XY轴坐标设置
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //动作监听
        //点击任意一个按钮之后会在不同时间后关机
        Object source = e.getSource();

        if (source == yesButton) {
            //一分钟后关机
            showDialog("你太自信了，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 600");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (source == midButton) {
            //一小时后关机
            showDialog("你还是太自信了，也要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (source == noButton) {
            //两小时后关机
            showDialog("你还是有一点自知之明的，还是要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (source == daButton) {
            //给好基友一个弹框
            showDialog("这次就饶了你~");

            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

    }

    public void showDialog(String content) {
        //弹框
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        //弹框置顶，居中
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        //弹窗不关闭，永远无法操作下面的界面
        jDialog.setModal(true);

        JLabel jLabel = new JLabel(content);
        jLabel.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(jLabel);

        //显示弹框
        jDialog.setVisible(true);
    }
}
