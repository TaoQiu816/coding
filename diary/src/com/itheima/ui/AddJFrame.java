package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class AddJFrame extends JFrame implements ActionListener {

    //本地存储数据的路径
    /*String diaryDataPath = "diary\\diaryData.data";*/
    String diaryDataPath = "diary\\diary";
    //File file = new File(diaryDataPath);
    //存储已有数据
    ArrayList<Diary> list = new ArrayList<>();

    //定义标题输入框
    JTextField titleText  = new JTextField();

    //定义内容的输入区域
    JTextArea contentText = new JTextArea();

    //定义保存按钮
    JButton save = new JButton("保存");

    //定义取消按钮
    JButton cancel = new JButton("取消");

    //传递已经读取的diary对象集合，就不用再次读取了
    public AddJFrame(ArrayList<Diary> list){

        //将读取到的数据存入集合
        this.list=list;
        //初始化界面
        initFrame();

        //初始化组件
         initView();

        //让界面展示出来
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == save){
            System.out.println("保存按钮被点击了");
            //点击保存按钮后，如果标题非空，保存到本地文件
            //判断标题是否为空，为空则提示，并且不再执行后续逻辑
            if (titleText.getText().length()==0){
                //标题为空，提示不能为空
                showJDialog("标题不能为空");
                return;//终止方法，不再执行后续
            }

            //标题非空，写入本地文件
            //根据写入内容创建对象，添加到集合
            //序号从1开始，所以序号为list.size()+1
            Diary newDiary = new Diary(list.size() + 1, titleText.getText(), contentText.getText());
            list.add(newDiary);//添加进集合

            //将新集合重新写入本地文件（序列化）
            /*try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(diaryDataPath));
                oos.writeObject(list);
                oos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }*/
            //将每个日记单独存一个文件
            for (int i = 0; i < list.size(); i++) {
                Diary diary = list.get(i);
                String path = diaryDataPath+"\\diary"+(i+1)+".data";
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                    oos.writeObject(diary);
                    oos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

            //写入完毕，弹窗提醒
            showJDialog("添加成功");
            // 返回主界面(隐藏当前界面)
            this.setVisible(false);
            //返回主界面
            try {
                new NoteJFrame();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }


        }else if(obj == cancel){
            System.out.println("取消按钮被点击了");
            //点击取消，也回到主界面，舍弃刚刚的数据
            //清空文本框
            titleText.setText("");
            contentText.setText("");
            //返回主界面
            //弹框提示
            showJDialog("添加失败");
            //返回
            this.setVisible(false);
            try {
                new NoteJFrame();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义文字：标题
        JLabel subject = new JLabel("标题");
        subject.setBounds(70,90,100,30);
        subject.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(subject);

        //定义文字：内容
        JLabel content = new JLabel("内容");
        content.setBounds(70,140,100,30);
        content.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(content);


        //设置标题的输入框
        titleText.setBounds(120,90,426,30);
        titleText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(titleText);

        //设置内容的输入框
        contentText.setBounds(120,140,426,300);
        contentText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(contentText);

        //设置保存按钮
        save.setBounds(132,466,140,40);
        save.setFont(new Font("宋体",Font.PLAIN,24));
        save.addActionListener(this);
        this.getContentPane().add(save);

        //设置取消按钮
        cancel.setBounds(312,466,140,40);
        cancel.setFont(new Font("宋体",Font.PLAIN,24));
        cancel.addActionListener(this);
        this.getContentPane().add(cancel);

    }


    //对添加界面的一些设置
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记（添加日记）");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212,212,212));
    }


    //只创建一个弹框对象
    JDialog jDialog = new JDialog();

    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }


}
