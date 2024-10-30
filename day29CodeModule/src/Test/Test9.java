package Test;

import java.io.*;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws IOException {
        //将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        //保存格式为:username=zhangsan&password=123&count=0
        //让用户键盘录入用户名和密码
        //比较用户录入的和正确的用户名密码是否一致
        //如果一致则打印登陆成功
        //如果不一致则打印登陆失败，连续输错三次被锁定

        //从文件读取正确用户信息
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\src\\Test\\userinfo.txt"));
        //读取一行
        String line = br.readLine();
        br.close();
        //拆分
        String[] userInfo = line.split("&");
        //拆分获取用户名及密码
        String rightUsername = userInfo[0].split("=")[1];
        String rightPassword = userInfo[1].split("=")[1];
        //连续输入错的次数count
        int count = Integer.parseInt(userInfo[2].split("=")[1]);

        //用户输入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        //对比用户名密码以及count
        if (username.equals(rightUsername) && password.equals(rightPassword) && count < 3) {
            //连续错误次数小于3，并且输入正确
            System.out.println("登陆成功");
            //count清零
            count = 0;
        } else {
            //输入错误，连续错误次数加一，并判断已经错误多少次
            count++;
            if (count < 3) {
                //连续错误次数小于3，提示剩余次数
                System.out.println("用户名或密码输入错误，还剩" + (3 - count) + "次机会");
            } else if (count == 3) {
                //连续错误三次，锁定账户
                System.out.println("已经连续输入三次，账户锁定");
            }
        }
        //数据重新写入
        writeInfo("username="+rightUsername+"&password="+rightPassword+"&count="+count);

    }

    public static void writeInfo(String userInfo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\src\\Test\\userinfo.txt"));
        //将传递的信息写入文件
        bw.write(userInfo);
        bw.close();
    }
}
