package com.itheima.Test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //定义数组存储三部汽车对象
        //汽车对象的数据都通过键盘录入

        Car[] arr = new Car[3];

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象，从键盘获取数据并存放于数组
            Car C = new Car();
            //创建汽车对象的代码必须写在循环里面

            //品牌
            System.out.println("请输入汽车的品牌");
            String band = sc.next();
            C.setBand(band);
            //价格
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            C.setPrice(price);
            //颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            C.setColor(color);

            //数据存入数组
            arr[i] = C;
        }

        //查看数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("汽车品牌：" + arr[i].getBand() + ",汽车价格：" + arr[i].getPrice() +
                 ",汽车颜色" + arr[i].getColor()   );
        }
    }
}
