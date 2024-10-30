package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo10 {
    public static void main(String[] args) {
        //手机号屏蔽
        //String substring(int beginindex,int endindex)
        //截取字符串，并且包头不包尾，包左不包右
        //String substring(int beginindex)
        //直接从beginindex截取到末尾\
        //不影响原字符串

        //输入手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号");
        String phoneNumber = sc.next();

        //截取前三位
        String start = phoneNumber.substring(0, 3);
        //截取最后四位
        String end = phoneNumber.substring(7);

        String result = start + "****" + end;
        System.out.println(result);
    }
}
