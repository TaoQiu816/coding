package com.itheima.methoddemo.Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //求质数
        //键盘录入一个正整数判断是否为质数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //从2循环到number-1看是否能被整除

        //标记思想，表示默认是一个质数
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //只要能被循环中的任一个数整数则标记为非质数
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
    }

    //简化思路：若不是质数，那么该数字的因子a和b两者以其平方根为中心，一定有一个小于等于平方根，另一个大于等于其平方根
    //因此可以使用其平方根缩减循环次数
    //for(int i =1;i <= number的平方根；i++)
}

