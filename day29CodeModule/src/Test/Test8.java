package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws IOException {
        //将正确的用户名和密码手动保存在本地的userinfo.txt文件中:
        //保存格式为
        //username=zhangsan&password=123
        //让用户键盘录入用户名和密码
        //比较用户录入的和正确的用户名密码是否一致
        //如果一致则打印登陆成功
        //如果不一致则打印登陆失败

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
        /*System.out.println(rightUsername);
        System.out.println(rightPassword);*/

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        //验证
        if (username.equals(rightUsername)&&password.equals(rightPassword)){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

    }
}
