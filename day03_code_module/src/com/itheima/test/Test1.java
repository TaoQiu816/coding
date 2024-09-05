package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个十位数，获取其中的个位、十位、百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //2.获取个位、十位、百位
        //公式
        //个位：数字 % 10
        //十位：数字 / 10 % 10
        //百位：数字 / 100 % 10
        //千位：数字 / 1000 % 10
        //。。。以此类推
        System.out.println("个位是" +
                number % 10);
        System.out.println("十位是" +
                number / 10 % 10);
        System.out.println("百位是" +
                number / 100 % 10);

    }
}
