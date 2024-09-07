package com.itheima.methoddemo.test;

import java.util.Scanner;

public class logicoperator_test1 {
    public static void main(String[] args) {
        //键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();

        //如果有一个是6或者和为6的倍数则为真
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
