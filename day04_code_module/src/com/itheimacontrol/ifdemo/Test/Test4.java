package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //支付金额判断

        //录入实际付款金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入实际支付的金额：");
        int money = sc.nextInt();

        //判断是否支付成功
        if (money >= 600){
            System.out.println("支付成功");
        }else{
            System.out.println("支付失败");
        }
    }
}
