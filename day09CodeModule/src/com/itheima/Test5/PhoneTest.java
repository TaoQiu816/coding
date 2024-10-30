package com.itheima.Test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //数组存储三个手机对象，计算三部手机平均价格
        //对象数组
        Phone[] ph = new Phone[3];

        //键盘输入手机信息
        //输入对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ph.length; i++) {
            //定义手机对象
            Phone P = new Phone();

            //品牌
            System.out.println("请输入品牌");
            String band = sc.next();
            P.setBand(band);
            //价格
            System.out.println("请输入价格");
            double price = sc.nextDouble();
            P.setPrice(price);
            //颜色
            System.out.println("请输入颜色");
            String color = sc.next();
            P.setBand(color);

            //对象存储到数组中
            ph[i] = P;
        }

        //求平均价格
        //求和变量
        double sum = 0;
        for (int i = 0; i < ph.length; i++) {
            sum = sum + ph[i].getPrice();
        }
        //求平均
        double avgPrice = sum / ph.length;
        System.out.println("三部手机平均价格" + avgPrice);
    }
}
