package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        //回文数
        //给定一个整数，若是回文整数返回true，否则返回false
        //回文数:从左到右和从右到左读都是一样的

        //获取给定整数
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //临时记录number
        int temp = number;
        //记录倒序数字
        int numberBack = 0;

        //利用while循环获取所给数字从右往左倒序数字
        while (number != 0) {//到最后number只剩0
            //从右往左获取每一位数字
            int x = number % 10;
            //修改number记录的值
            number = number / 10;
            //将number从右到左依次拼接到numberbaCK的最左边
            numberBack = numberBack * 10 + x;

        }

        //输出比较结果
        System.out.println(numberBack == temp);

    }
}
