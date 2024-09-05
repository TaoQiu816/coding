package com.itheima.logicoperator;

import java.util.Scanner;

public class logicoperator_demo3 {
    public static void main(String[] args) {

        //需求：利用三元运算符，获取两个数的最大值

        //从键盘获取两个要比较的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("输入第二个整数：");
        int number2 = sc.nextInt();

        //利用三元运算符求出最大值
        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
