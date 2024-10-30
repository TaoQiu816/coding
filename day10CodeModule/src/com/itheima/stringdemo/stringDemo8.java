package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo8 {
    //定义一个方法实现字符串反转
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = sc.next();
        String result = reverser(str);
        System.out.println(result);
    }

    //字符串反转
    public static String reverser(String str){
        String result = new String();//定义空字符串
        //或者string result = ""
        //atr.length().forr就是反向循环
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }
}
