package com.itheima.IntegerDemo;

import java.util.Scanner;

public class IntegerDemo4 {
    public static void main(String[] args) {
        //对键盘录入的改进
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String next = sc.next();
        System.out.println(next);
        //原有方法的弊端：
        //当我们使用Next nextInt nextDouble在接受数据的时候，遇到空格，回车，制表符的时候就停止接收数据了
        //比如键盘输入123 123 那么此时只能接受到空格前面的数据

        sc.nextLine();//使用 sc.nextLine() 来消耗换行符，再读取第二次输入，就能确保两个输入都被正确接收。


        //要得到一整行的数据
        //约定：
        //以后家农安输入不管什么类型统一使用nextLine(遇到回车才停止)
        //在使用parse转换类型
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(Integer.parseInt(s)+1);
    }
}
