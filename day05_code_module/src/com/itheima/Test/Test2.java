package com.itheima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //求平方根
        //键盘录入一个大于等于2的整数，计算并返回其平方根，结果只保留整数部分，舍去小数部分

        //录入整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不小于2的整数");
        int num = sc.nextInt();

        //大于等于其平方根的整数的平方也大于等于原数字比如10的平方根在3到4之间
        //从1开始平方与所给数字进行比较，若相等则即为所求平方根，若大于那么前一个数字就为平方根的整数部分
        /*int i=1;
        while (i*i < num){
            i++;
        }*/
        for (int i = 1; i <= num; i++) {
            //比较i的平方和num
            if (i*i == num){
                System.out.println(i);
                break;//一旦找到则跳出循环
            }else if (i*i > num){
                System.out.println(i-1);
                break;//一旦找到则跳出循环
            }

        }

    }
}
