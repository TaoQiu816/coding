package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //这个字符串是new出来的
        String s1 = sc.next();
        //直接赋值的字符串
        String s2 = "abc";

        System.out.println(s1 == s2);


    }
}
