package com.itheima.methoddemo.test;

import java.util.Scanner;

public class compareoperator_test1 {
    public static void main(String[] args) {

        //键盘录入时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("输入对象衣服时髦程度：");
        int girlfashion = sc.nextInt();
        System.out.println("输入自己衣服时髦程度：");
        int myfashion = sc.nextInt();

        //2.对比时髦度
        boolean result = myfashion > girlfashion;

        //3.输出结果
        System.out.println(result);
    }
}
