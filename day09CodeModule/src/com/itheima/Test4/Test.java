package com.itheima.Test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //关于键盘录入的注意事项
        //第一套体系
        //nextInt():接受整数
        //nextDouble():接受小数
        //next():接受字符串
        //遇到空格，制表符，回车就停止接受，这些符号后面的数字就不再接受了

        //第二套体系
        //nextLine():接受字符串
        //可以接受空格，制表符，遇到回车才停止接收数据

        //注意：键盘录入的两个体系不能混用
        //弊端：如果先用第一套体系，再用第二套体系，会导致nextLine接收不到数据
        //因为第一套体系最后一定会输入回车，而回车不会进入第一套体系的接收数据，从而直接变成nextline的接收数据

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");//123 456
        int num1 = sc.nextInt();
        System.out.println(num1);//123
        System.out.println("请输入第二个整数");//
        int num2 = sc.nextInt();
        System.out.println(num2);//456
    }
}
