package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//为整个游戏界面添加键盘监听，用于图片移动
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //Jframe 表示界面 窗体
    //所以子类也表示界面 窗体
    //游戏主界面
    int[][] randomArr = new int[4][4];
    //记录空白方块再二维数组中的位置
    int x = 0;
    int y = 0;
    //记录当前所展示图片的路径,换图片时直接改变path所记录的路径即可
    String path = "day16jigsawgame\\image\\animal\\animal1\\";

    //记录最终游戏完成时的图片顺序，对比数组元素判断游戏是否完成
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //游戏步数统计
    int step = 0;


    //创建每个选项下的条目对象
    JMenuItem replyItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");
    //更换图片下的条目
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");


    //构造方法，空参构造，直接定好界面大小与是否可视化
    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始话数据，打乱顺序
        initData();
        //初始化图片，将打乱后的图片加载到游戏窗中
        initImage();




        //界面默认隐藏，还需调用方法来显示，建议写在最后
        this.setVisible(true);
    }

    //当游戏图片数组randomArr与win的元素完全相同时返回真，否则为假
    private boolean victory() {
        for (int i = 0; i < win.length; i++) {
            for (int j = 0; j < win[i].length; j++) {
                if (win[i][j] != randomArr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void initData() {
        //打乱一维数组中的数据1~16，并以四个一组存入二维数组

        //定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组顺序，与随机索引数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //随机索引

            int randomIndex = r.nextInt(16);

            //交换数据
            int x = tempArr[randomIndex];
            tempArr[randomIndex] = tempArr[i];
            tempArr[i] = x;
        }
        //存入二维数组
        //int[][] newArr = new int[4][4];
        //法二:遍历一维数组
        for (int i = 0; i < tempArr.length; i++) {
            randomArr[i / 4][i % 4] = tempArr[i];
            if (tempArr[i] == 0) {
                //记录空白方块位置
                x = i / 4;
                y = i % 4;
            }
        }

        //return randomArr;
    }


    //初始化图片，将图片加载到游戏窗中
    private void initImage() {


        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();


        //游戏胜利判断，胜利时显示胜利图标
        if (victory()) {
            //游戏胜利
            JLabel winJLable = new JLabel(new ImageIcon("D:\\JAVA_study\\java_study_code\\day16jigsawgame\\image\\win.png"));
            //设置大小位置
            winJLable.setBounds(203, 283, 197, 73);
            //添加进隐藏容器
            this.getContentPane().add(winJLable);
        }

        //容器管理文字显示步数
        JLabel stepCount = new JLabel("步数：" + step);
        //设置文字位置和大小
        stepCount.setBounds(50, 30, 100, 20);
        //添加到隐藏容器
        this.getContentPane().add(stepCount);
/*
        //创建ImageIcon对象
        ImageIcon icon = new ImageIcon("D:\\JAVA_study\\java_study_code\\day16jigsawgame\\image\\animal\\animal1\\1.jpg");

        //创建JLable对象(管理容器，可管理图片和文字)
        JLabel jLabel = new JLabel(icon);
        //指定图片位置与大小，位置为坐标，原点在左上角，x轴向右，y向下
        //坐标为图片左上角所在的位置
        jLabel.setBounds(0,0,105,105);

        //将管理容器添加到界面中,默认放在界面正中央
        //this.add(jLabel);
        //整个界面包含菜单和标题，组件是放在隐藏容器中的，要先获取隐藏容器，并把图片放在隐藏容器中
        //隐藏容器不需要创建对象，其对象在创建界面对象的时候自动就创建出来了；
        this.getContentPane().add(jLabel);*/
        //相对路径是相对当前项目而言的
        //绝对路径是从盘符开始的

        //记录图片名顺序
        // int number = 1;
        //使用双层循环添加图片到隐藏容器中
        for (int i = 0; i < 4; i++) {//i为行，共四行
            //--外循环：添加四行图片
            for (int j = 0; j < 4; j++) {//为列，共四列
                //内循环：每行添加四列图片
/*

                //记录图片的位置，并且每轮循环所取图片不同
                StringBuilder sb = new StringBuilder();
                //添加图片所在文件夹
                sb.append("D:\\JAVA_study\\java_study_code\\day16jigsawgame\\image\\animal\\animal1\\");
                //添加图片名称获得完整路径，并转换为字符串
                String imgPath = sb.append(i*4+1+j).append(".jpg").toString();
*/

                //创建ImageIcon对象
                //创建JLable对象(管理容器，可管理图片和文字)
                JLabel jLabel = new JLabel(new ImageIcon(path + randomArr[i][j] + ".jpg"));
                //指定图片位置与大小，位置为坐标，原点在左上角，x轴向右，y向下
                //坐标为图片左上角所在的位置
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                //整个界面包含菜单和标题，组件是放在隐藏容器中的，要先获取隐藏容器，并把图片放在隐藏容器中
                //隐藏容器不需要创建对象，其对象在创建界面对象的时候自动就创建出来了；
                //添加边框，这种是斜面边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                this.getContentPane().add(jLabel);
                //添加完一个图片后，图片顺序记号自增，表示下次加载下一张图片
                //number++;

            }

        }

        //先加载的图片在上方，后加载的图片在下方
        //添加背景图片
        //管理容器
        JLabel background = new JLabel(new ImageIcon("day16jigsawgame\\image\\background.png"));
        //设置容器位置大小
        background.setBounds(40, 40, 508, 560);
        //吧背景图片添加进界面中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    //初始化菜单(菜单设置)
    private void initJMenuBar() {
        //初始化菜单
        //创建整个的总菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上每个选项的对象（功能，关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //更换图片，点击后有对应的图片选项，所以也是一个Jmenu
        JMenu changeImg = new JMenu("更换图片");
        //功能中添加更换图片的JMenu
        functionJMenu.add(changeImg);

        //图片更换的条目添加到menu中
        changeImg.add(girlItem);
        changeImg.add(animalItem);
        changeImg.add(sportItem);


        //将每一个选项下的条目添加到选项之中
        functionJMenu.add(replyItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replyItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //将菜单中的每个选项添加到菜单之中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单,将已设置好的菜单放入界面
        this.setJMenuBar(jMenuBar);
    }


    //初始化界面(界面设置)
    private void initJFrame() {
        //this为当前调用处对象的地址值，在main中创建gameJfram的对象，并空参构造
        //所以可实现各种设置
        //set方法设置窗口大小,单位：像素
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式,3表示关闭其中一个窗口，虚拟机就结束工作
        //this.setDefaultCloseOperation(3);
        //或者直接使用EXIT_ON_CLOSE
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //为游戏界面添加键盘监听
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //按下A不松时显示完整图片
        int code = e.getKeyCode();
        if (code == 65) {
            //先清除界面中的所有图片
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel jLabel = new JLabel(new ImageIcon(path + "all.jpg"));
            //设置大小位置
            jLabel.setBounds(83, 134, 420, 420);
            //添加到隐藏容器
            this.getContentPane().add(jLabel);
            //添加背景图片
            //管理容器
            JLabel background = new JLabel(new ImageIcon("day16jigsawgame\\image\\background.png"));
            //设置容器位置大小
            background.setBounds(40, 40, 508, 560);
            //吧背景图片添加进界面中
            this.getContentPane().add(background);

            //刷新界面
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //当游戏胜利时，不能再继续进行操作
        if (victory()) {
            return;
        }

        //对上下左右进行判断
        //左37，上38，右39，下40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            //边界判断
            if (y == 0) {
                //在最左侧，左边没有图
                return;
            }
            //与左边图片交换位置，也就是交换二维数组对应索引的数字
            //左边的是x,y-1
            randomArr[x][y] = randomArr[x][y - 1];
            randomArr[x][y - 1] = 0;
            //换序后更新0的位置
            y--;
            //每操作一次，步数+1
            step++;
            //显示换序后的图片
            initImage();


        } else if (code == 38) {
            //边界判断
            if (x == 0) {
                //最上边
                return;
            }
            System.out.println("向上移动");
            randomArr[x][y] = randomArr[x - 1][y];
            randomArr[x - 1][y] = 0;
            x--;

            //每操作一次，步数+1
            step++;
            //显示换序后的图片
            initImage();
        } else if (code == 39) {
            //边界判断
            if (y == 3) {
                //在最右边
                return;
            }
            System.out.println("向右移动");
            randomArr[x][y] = randomArr[x][y + 1];
            randomArr[x][y + 1] = 0;
            y++;

            //每操作一次，步数+1
            step++;
            //显示换序后的图片
            initImage();
        } else if (code == 40) {
            //边界判断
            if (x == 3) {
                //
                return;
            }
            System.out.println("向下移动");
            randomArr[x][y] = randomArr[x + 1][y];
            randomArr[x + 1][y] = 0;
            x++;

            //每操作一次，步数+1
            step++;
            //显示换序后的图片
            initImage();
        }

        //松开A后显示原有拼图
        if (code == 65) {
            initImage();
        } else if (code == 87) {
            //按下W时游戏作弊，直接完成游戏
            randomArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取被点击的条目对象并对照，执行相关操作
        Object source = e.getSource();

        if (source == replyItem) {
            //重新游戏
            //打乱数组
            initData();
            //计步清零
            step = 0;
            //加载图片
            initImage();

        } else if (source == reloginItem) {
            //重新登陆
            //隐藏当前界面
            this.setVisible(false);
            //打开登陆界面
            new LoginJFrame();
        } else if (source == closeItem) {
            //关闭游戏
            //直接关闭虚拟机
            System.exit(0);
        } else if (source == accountItem) {
            //显示公众号二维码
            //创建弹框对象
            JDialog jDialog = new JDialog();
            //创建管理图片的容器对象
            JLabel account = new JLabel(new ImageIcon("day16jigsawgame\\image\\about.png"));
            //设置位置和宽高
            account.setBounds(0, 0, 258, 258);
            //添加到弹框中
            jDialog.getContentPane().add(account);
            //设置弹框大小
            jDialog.setSize(344, 344);
            //设置弹框置顶
            jDialog.setAlwaysOnTop(true);
            //弹框剧中
            jDialog.setLocationRelativeTo(null);
            //设置弹框不操作则无法继续后续操作
            jDialog.setModal(true);
            //显示弹框
            jDialog.setVisible(true);

        }

        Random r = new Random();
        //监听图片更换事件
        if (source==girlItem){
            //选择美女图片
            //随机选取13组图片之一
            int image = r.nextInt(13)+1;
            //更新图片路径
            path = "day16jigsawgame\\image\\girl\\girl"+image+"\\";
            //重新游戏
            //打乱数组
            initData();
            //计步清零
            step = 0;
            //加载图片
            initImage();
        } else if (source == animalItem) {
            //选择动物图片
            //随机选取8组图片之一
            int image = r.nextInt(8)+1;
            //更新图片路径
            path = "day16jigsawgame\\image\\animal\\animal"+image+"\\";
            //重新游戏
            //打乱数组
            initData();
            //计步清零
            step = 0;
            //加载图片
            initImage();
        } else if (source == sportItem) {
            //选择运动图片
            //随机选取10组图片之一
            int image = r.nextInt(10)+1;
            //更新图片路径
            path = "day16jigsawgame\\image\\sport\\sport"+image+"\\";
            //重新游戏
            //打乱数组
            initData();
            //计步清零
            step = 0;
            //加载图片
            initImage();
        }
    }
}
