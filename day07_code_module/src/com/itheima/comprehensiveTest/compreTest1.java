package com.itheima.comprehensiveTest;

import java.util.Scanner;

public class compreTest1 {
    public static void main(String[] args) {
        //需求:
        //
        //​	机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //
        //​	按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

        //输入价格、月份、是否头等舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入是否头等舱：（1为头等舱，0为经济舱）");
        int seat = sc.nextInt();


        ////ctrl + alt + M 自动抽取方法

        //淡旺季分类折扣调用方法
        if (month>=5 && month<=10){
            //旺季
            //price = getTicket(price, seat, 0.85, 0.9);
            price = getPrice(seat, price, 0.9, 0.85);
            //System.out.println(price);
        } else if ((month>=11 && month<=12)||(month>=1 && month<=4)) {
            //淡季
            //price = getTicket(price, seat, 0.65, 0.7);
            price = getPrice(seat, price, 0.7, 0.65);
            //System.out.println(price);
        }else {
            System.out.println("月份不存在");
        }

        System.out.println(price);



        //调用方法计算机票实际价格
    }

    public static double getPrice(int seat, double price, double x, double x1) {
        if (seat == 1) {
            //头等舱
            price = price * x;
        } else {
            //经济舱
            price = price * x1;
        }
        return price;
    }

    /*//根据机票情况计算价格,discount1为经济舱折扣，discount为头等舱折扣
    public static double getTicket(double price, int seat, double discount1, double discount2){
        //根据是否头等舱分类计算折扣价格
        if (seat == 1){
            //头等舱
            price = price*discount2;
        }else {
            //经济舱
            price = price*discount1;
        }

        return price;
    }*/

}
