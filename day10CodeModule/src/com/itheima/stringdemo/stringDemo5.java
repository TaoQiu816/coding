package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo5 {
    public static void main(String[] args) {
        //键盘录入一个字符串，在控制台遍历该字符串
        //public char charAt(index):根据索引返回字符串中的字符
        //public int length():返回字符串长度
        //注意与数组的长度相区分，数组的长度arr.lrngth是一个固有属性，不用加括号
        //而字符串长度是字符串对象调用函数，字符串对象.length()
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String s = sc.next();

        //循环遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));//也是字符串对象调用函数
        }
    }
}
