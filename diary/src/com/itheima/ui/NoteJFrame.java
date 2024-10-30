package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class NoteJFrame extends JFrame implements ActionListener, MouseListener {
    /*diary数据会被序列化为Diary对象
        loadDiaryData会读取本地存储diary数据的文件并返回存储对象的列表
        * */
    String diaryDataPath = "diary\\diary";
    //File file = new File(diaryDataPath);
    //存储读取到的diary对象
    ArrayList<Diary> list = new ArrayList<>();

    //int selectedIndex=-1;//表中被点到的行号，从0开始，默认-1表示未选中

    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");

    public NoteJFrame() throws IOException, ClassNotFoundException {
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if (obj == add) {
            System.out.println("添加按钮被点击");
            this.setVisible(false);
            //传递读取到的diary集合，就可以不用多次读取
            new AddJFrame(list);

        } else if (obj == update) {
            System.out.println("修改按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，跳转添加界面


            /*//1.先判断用户有没有选择表格中的数据
            System.out.println(selectedIndex);
            if (selectedIndex==-1){
                showJDialog("未选中要修改的数据行，请重试！");
                return;
            }*/
            //跳转到修改界面
            //new UpdateJFrame(list);



            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据
            int selectedRow = table.getSelectedRow();


            System.out.println(selectedRow);
            if (selectedRow<0){
                showJDialog("未选中要修改的数据行，请重试！");
                return;
            }
            //跳转到修改界面
            new UpdateJFrame(list,selectedRow);


        } else if (obj == delete) {
            //获取被点击的行号
            int selectedRow = table.getSelectedRow();
            System.out.println("删除按钮被点击");
           //int choose = table.getSelectedRow();
           if (selectedRow<0){
               showJDialog("请选择要删除的行");
               return;
           }

            int i1 = showChooseJDialog();
           if (i1==0){
               //删除指定信息
               list.remove(selectedRow);
               //删除对应文件
               File defile = new File("D:\\JAVA_study\\java_study_code\\diary"+"\\diary"+(selectedRow+1)+".data");
               System.out.println(defile);
               System.out.println(selectedRow);
               System.out.println(defile.delete());
               //刷新集合的数据（序号）
               for (int i = 0; i < list.size(); i++) {
                   list.get(i).setNumber(i+1);
               }
               //重新写数据
               //将每个日记单独存一个文件,并且更新序号
               for (int i = 0; i < list.size(); i++) {
                   Diary diary = list.get(i);
                   //更新序号
                   diary.setNumber(i+1);
                   String path = diaryDataPath+"\\diary"+diary.getNumber()+".data";

                   try {
                       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                       oos.writeObject(diary);
                       oos.close();
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }
               }
               //刷新页面
               try {
                   initView();
               } catch (IOException ex) {
                   ex.printStackTrace();
               } catch (ClassNotFoundException ex) {
                   ex.printStackTrace();
               }
           }

        } else if (obj == exportItem) {
            System.out.println("菜单的导出功能");
            //压缩到桌面
            try {
                toZip();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } else if (obj == importItem) {
            System.out.println("菜单的导入功能");
            //解压缩到diary文件夹
            try {
                zipToFile();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //更新界面
            try {
                initView();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    private void zipToFile() throws IOException {
        File src= new File("C:\\Users\\PC\\Desktop\\diary.zip");//桌面
        File dest = new File(diaryDataPath);

        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        //获取每个entry对象并读取数据
        ZipEntry entry;
        while ((entry =zis.getNextEntry())!=null){
            //全是文件
            //创建同名新文件
            System.out.println(dest);
            System.out.println(entry.getName());
            File file = new File(dest, entry.getName());
            //读取entry数据并写入
            FileOutputStream fos = new FileOutputStream(file);
            int b;
            while ((b=zis.read())!=-1){//结束时返回-1
                fos.write(b);
            }

            fos.close();

        }
        zis.close();
    }

    private void toZip() throws IOException {
        File src= new File(diaryDataPath);
        File dest = new File("C:\\Users\\PC\\Desktop");//桌面

        //创建压缩流对象
        //getName返回的是相对路径
        String zipPath = dest.getAbsolutePath()+"\\diary.zip";
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath));
        //创建压缩包，并将所有zipEntry对象放进去

        //获取所有文件
        File[] files = src.listFiles();
        for (File file : files) {
            //变成zipentry对象
            //new ZipEntry的参数是文件或文件夹相对于zip文件的相对地址
            ZipEntry entry = new ZipEntry(file.getName());
            //放入压缩包
            zos.putNextEntry(entry);
            //读取当前文件数据，将文件数据写入压缩包
            //读取当前文件数据，将文件数据写入压缩包
            FileInputStream fis = new FileInputStream(file);
            int b;
            while ((b=fis.read())!=-1){
                zos.write(b);
            }
            fis.close();
            zos.closeEntry();//表示当前文件处理完毕
        }
        zos.close();

    }


    //初始化组件
    private void initView() throws IOException, ClassNotFoundException {
        //selectedIndex=-1;
        //刷新数据
        //获取文件的数据
        list = loadDiaryData(diaryDataPath);


        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);


        //将读取的数据列表转换成二维数组,数组长度为获取的对象个数，也就是list的长度
        //第一个维度：每个日记
        //第二个维度：序号 标题  内容
        Object[][] diaryData = new Object[list.size()][3];
        //Object[] singalData = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            //将对象的字段数据添加到数组
            Diary diary = list.get(i);
            diaryData[i][0] = diary.getNumber();
            diaryData[i][1] = diary.getTittle();
            diaryData[i][2] = diary.getText();
        }


        //定义表格的标题
        Object[] tableTitles = {"编号", "标题", "正文"};
        //定义表格的内容
        //二维数组中的每一个一维数组，是表格里面的一行数据
        Object[][] tabledatas = diaryData;
        /*Object[][] tabledatas = {
                {"编号1", "标题1", "正文1"},
                {"编号2", "标题2", "正文2"},
                {"编号3", "标题3", "正文3"},
                {"编号4", "标题4", "正文4"},
                {"编号5", "标题5", "正文5"},
                {"编号6", "标题6", "正文6"},
                {"编号7", "标题7", "正文7"},
                {"编号8", "标题8", "正文8"},
                {"编号9", "标题9", "正文9"},
                {"编号10", "标题10", "正文10"},
                {"编号11", "标题11", "正文11"},
                {"编号12", "标题12", "正文12"},
                {"编号13", "标题13", "正文13"},
                {"编号14", "标题14", "正文14"},
                {"编号15", "标题15", "正文15"},
                {"编号16", "标题16", "正文16"},
                {"编号17", "标题17", "正文17"},
                {"编号18", "标题18", "正文18"},
                {"编号19", "标题19", "正文19"},
                {"编号20", "标题20", "正文20"},
                {"编号21", "标题21", "正文21"},
                {"编号22", "标题22", "正文22"},
                {"编号23", "标题23", "正文23"},
                {"编号24", "标题24", "正文24"},
                {"编号25", "标题25", "正文25"},
                {"编号26", "标题26", "正文26"},
                {"编号27", "标题27", "正文27"},
                {"编号28", "标题28", "正文28"},
                {"编号29", "标题29", "正文29"},
                {"编号30", "标题30", "正文30"},
        };*/

        //定义表格组件
        //并给表格设置标题和内容
        table = new JTable(tabledatas, tableTitles);
        table.setBounds(40, 70, 504, 380);

        //表格添加监听，获取选择的行
        table.addMouseListener(this);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40, 70, 504, 380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    /*作用：读取diaryDataPath(日记数据文件的路径)的日记数据
     * 参数：日记数据文件的路径*/
    private ArrayList<Diary> loadDiaryData(String diaryDataPath) throws IOException, ClassNotFoundException {
        /*//读取数据文件,按行读取，UTF-8编码
        //反序列化流，存储的数据是将每条日记转换为了对象再序列化的
        File file = new File(diaryDataPath);
        //存储数据
        ArrayList<Diary> list = new ArrayList<>();


        //如果数据文件不存在或文件为空。先创建数据文件(读取文件不会创建不存在的文件)
        if (!file.exists()||file.length() == 0){
            file.createNewFile();
            //使用 ObjectInputStream 读取一个空文件，Java 会抛出 EOFException
            //避免空文件造成的EOFException
            //直接返回空集合
            return list;
        }

        //使用 ObjectInputStream 读取一个空文件，Java 会抛出 EOFException
        //避免空文件造成的EOFException

        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //读取并添加到集合
        list =(ArrayList<Diary>) ois.readObject();
        ois.close();
        return list;
*/
        ArrayList<Diary> list = new ArrayList<>();
        //获取diaryDataPath路径文件夹之下的所有文件并读取
        File file = new File(diaryDataPath);
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        for (File f : files) {
            System.out.println(f);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            Diary diary = (Diary) ois.readObject();
            list.add(diary);
            ois.close();
        }
        return list;

    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230, 230, 230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212, 212, 212));
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

    /*
     *  作用：展示一个带有确定和取消按钮的弹框
     *
     *  方法的返回值：
     *       0 表示用户点击了确定
     *       1 表示用户点击了取消
     *       该弹框用于用户删除时候，询问用户是否确定删除
     * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？", "删除信息确认", JOptionPane.YES_NO_OPTION);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //表格中被点击的行号，从0开始
        //selectedIndex = table.rowAtPoint(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /*//更新数据：用于有时候序号对不上的情况
    public void updateData() throws IOException {
        //数据重新写入
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setNumber(i+1);

        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(diaryDataPath));
        oos.writeObject(list);
        oos.close();
    }*/
}
