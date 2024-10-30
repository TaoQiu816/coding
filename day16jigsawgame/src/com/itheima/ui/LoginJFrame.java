package com.itheima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginJFrame extends JFrame implements MouseListener {
    //登录界面
    //集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<User>();

    //已有的用户数据
    //静态代码块（初始用户信息）
    static {
        list.add(new User("zhangsan", "123"));
        list.add(new User("lisi", "1234"));
    }

    //添加登录按钮
    JButton login = new JButton();
    //添加注册按钮
    JButton register = new JButton();

    //获取正确的验证码
    String codeStr = CodeUtill.getcode();
    //显示验证码（通过jlable管理
    JLabel rightCode;

    //添加用户名输入框（明文显示的输入框）
    JTextField username = new JTextField();
    //添加密码输入框（密文显示的输入框）
    JPasswordField password = new JPasswordField();
    //验证码输入框
    JTextField code = new JTextField();


    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //在界面中添加内容
        initView();


        //界面默认隐藏，还需调用方法来显示
        this.setVisible(true);//显示当前页面
    }

    private void initView() {

        //this.getContentPane().removeAll();

        //添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("day16jigsawgame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);//用户名的位置与大小
        this.getContentPane().add(usernameText);//添加到隐藏容器

        //用户名输入框设置
        username.setBounds(195, 134, 200, 30);//用户名输入框的大小和位置
        this.getContentPane().add(username);

        //添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("day16jigsawgame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //密码输入框设置
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("day16jigsawgame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码输入框设置
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        codeStr = CodeUtill.getcode();
        rightCode = new JLabel(codeStr);
        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);//添加到界面

        //登录按钮设置
        login.setBounds(123, 310, 128, 47);
        //设置登录按钮的图标
        login.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //注册按钮设置
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("day16jigsawgame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        //登录和注册按钮绑定鼠标监听事件
        login.addMouseListener(this);
        register.addMouseListener(this);
        //验证码绑定鼠标监听
        rightCode.addMouseListener(this);

        //this.getContentPane().repaint();
    }

    private void initJFrame() {
        //set方法设置窗口大小,单位：像素
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图游戏 V1.0登录");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭,3表示关闭其中一个窗口，虚拟机就结束工作
        //this.setDefaultCloseOperation(3);
        //或者直接使用EXIT_ON_CLOSE
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        this.setLayout(null);//取消内部默认布局，只有取消了才会按照XY轴的形式添加组件
    }

    //弹框显示输入错误
    public void showJDialog(String content) {
        //弹框对象
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        //弹框置顶
        jDialog.setAlwaysOnTop(true);
        //居中
        jDialog.setLocationRelativeTo(null);
        // //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //管理弹出的文字
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        //添加到弹框
        jDialog.add(warning);

        //显示弹框
        jDialog.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //获取用户输入的数据

        Object source = e.getSource();
        //点击登陆后，验证用户名与密码是否正确

        //点击验证码后更换验证码
        if (source == rightCode) {
            //更新验证码
            updateCode();
        } else if (source == login) {
            //点击登录按钮
            //首先获取输入框中的输入
            String usernameInput = username.getText();
            String passwordInput = new String(password.getPassword());
            String codeInput = code.getText();
            //System.out.println(usernameInput+","+passwordInput+","+codeInput);

            //创建一个User对象，用于后续比对
            User userInfo = new User(usernameInput, passwordInput);
            System.out.println("用户输入的用户名为" + usernameInput);
            System.out.println("用户输入的密码为" + passwordInput);

            //对于输入的用户名、密码、验证码，首先要满足非空
            if (codeInput.length() == 0) {
                //校验验证码是否为空
                updateCode();
                showJDialog("验证码不能为空");
            } else if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                //校验用户名或者密码是否为空
                updateCode();
                showJDialog("用户名或者密码为空");
            } else if (!codeInput.equalsIgnoreCase(codeStr)) {
                //校验验证码是否正确
                updateCode();
                showJDialog("验证码错误");
            } else if (contains(userInfo)) {
                //用户名和密码比对正确，进入游戏界面
                new GameJFrame();
            } else {
                updateCode();
                showJDialog("用户名或密码错误");
            }

        } else if (source == register) {
            System.out.println("点击了注册按钮");
        }

    }

    private void updateCode() {
        codeStr = CodeUtill.getcode();
        rightCode.setText(codeStr);
    }

    //判断输入的用户名和密码是否否正确(用户在集合中是否存在
    private boolean contains(User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User rightUser = list.get(i);
            if (rightUser.getUsrerName().equals(userInfo.getUsrerName()) && rightUser.getPassword().equals(userInfo.getPassword()) ) {
                return true;
            }
        }
        //执行到此说明不存在
        return false;
    }

    @Override//按下不松开时
    public void mousePressed(MouseEvent e) {

        Object source = e.getSource();
        if (source == login) {
            //按下登录按钮不松时，改变登录按钮的颜色（也就是切换登录按钮的背景图片）
            //setIcon方法
            login.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\登录按下.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\注册按下.png"));
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            //登录按钮松开时，换回原背景
            //setIcon方法
            login.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\登录按钮.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("day16jigsawgame\\image\\login\\注册按钮.png"));
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
