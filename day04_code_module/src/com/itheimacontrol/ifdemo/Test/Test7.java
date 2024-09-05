package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //记录商品总价
        int price = 1000;

        //键盘录入会员级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        int vip = sc.nextInt();

        //根据会员级别计算出实际支付的金额
        if (vip == 1){
            System.out.println("实际支付的钱为：" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("实际支付的钱为：" + (price * 0.8));
        }else if (vip == 3){
            System.out.println("实际支付的钱为：" + (price * 0.7));
        }else {
            System.out.println("实际支付的钱为：" + price);
        }

    }
}
