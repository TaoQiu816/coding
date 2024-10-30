package com.itheima.stringdemo;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.awt.*;
import java.util.Scanner;

public class stringdemo4 {
    public static void main(String[] args) {
        //一直正确的用户名和米密码，模拟用户登录
        //总共给出三次机会，登录知乎，给出相应的提示
        String rightUserName = "admin";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //用户录入用户名和密码

            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //比较判断
            if ((username.equals(rightUserName)) && (password.equals(rightPassword))) {
                System.out.println("登录成功");
            } else if (i == 2){
                //三次输入错误，账户锁定
                System.out.println("账号"+ username +"被锁定");
            }else {
                System.out.println("用户名或密码错误，登陆失败,您还剩下" + (2 - i) + "次机会");

            }
        }


    }
}
