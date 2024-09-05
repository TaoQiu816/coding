package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //录入整数表示身上的钱，大于100吃网红餐厅，否则沙县小吃

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上的钱");
        int money = sc.nextInt();

        if (money > 100 ){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃沙县小吃");
        }

    }
}
