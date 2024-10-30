package com.itheima.stringBuilder;

import java.util.Scanner;

public class stringBuilderDemo3 {
    public static void main(String[] args) {
        //使用stringBuilder的场景
        //1.字符串拼接
        //2.字符串反转
        //对称字符串
        //键盘接受字符串，程序判断是否对称
        //StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        //int max = sc.nextInt();
        System.out.println("输入字符串");
        String str = sc.next();

        //字符串反转
        String result = new StringBuilder().append(str).reverse().toString();
        if (str.equals(result)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }

    }
}
