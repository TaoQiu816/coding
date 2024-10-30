package BufferedStreamDemo.Test;

import org.w3c.dom.DOMStringList;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //实现一个验证程序运行次数的小程序。要求如下:
        //1.当程宁运行超过3次时给出提示:本软件只能免费使用3次,欢迎能注册会员后继续使用~
        //2.程序运行演小如下:
        //第一次运行控制台输出:欢迎使用本软件，第1次使用免费~
        //第二次运行控制台输出:欢迎使用本软件，第2次使川免费~
        //第三次运行控制台输出:欢迎使用本软件，第3次使用免费~
        //第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~

        //将计数器保存在文件中

        //1.读取计数器文件中的数据到内存中
        BufferedReader fis = new BufferedReader(new FileReader("day29CodeModule\\count.txt"));
        //读取整行
        String line = fis.readLine();
        fis.close();
        //转换成整数
        int count = Integer.parseInt(line);
        //本次相当于又使用了一次
        count++;

        if (count<=3){
            System.out.println("欢迎使用本软件,第"+count+"次免费试用");

        }else {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
        //改变计数器中的数字
        //new FileWriter要在读取之后，否则会清空文件
        BufferedWriter fow = new BufferedWriter(new FileWriter("day29CodeModule\\count.txt"));

        fow.write(count+1+"");
        fow.close();




    }
}
