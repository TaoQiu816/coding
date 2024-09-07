package com.itheima.methoddemo.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //判断两个老虎体重是否相同
        //获取两个老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();

        //比较体重是否相等
        System.out.println(weight1 == weight2 ? "相同" : "不同");
    }
}
