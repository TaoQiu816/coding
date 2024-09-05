package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        //求商和余数
        //给定两个正整数且不超过int范围，作为被除数和除数
        //将两数相除，不能使用乘法除法和%运算符，得到商和余数

        //获取被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int dividend = sc.nextInt();
        System.out.println("请输入除数");
        int divisor = sc.nextInt();

        //记录减法次数即为商
        int count =0;
        //被除数依次减去除数直到被除数小于除数，获得最终的商和余数
        while (dividend >=divisor){
            dividend = dividend - divisor;
            count++;
        }

        System.out.println("商为"+count);
        System.out.println("余数为"+dividend);
    }
}
