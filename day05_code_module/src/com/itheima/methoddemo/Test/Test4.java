package com.itheima.methoddemo.Test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //猜数字
        //生成1到100的随机数
        Random r = new Random();
        //括号中的数字为随机数范围的上限，范围是从0到上限-1，包头不包尾
        int number = r.nextInt(100) + 1;


        //死循环
        while (true) {
            System.out.println("请输入你要猜的数字");

            Scanner sc = new Scanner(System.in);
            int guestnumber = sc.nextInt();

            if (guestnumber > number) {
                System.out.println("猜大了");
            } else if (guestnumber < number) {
                System.out.println("猜小了");

            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
