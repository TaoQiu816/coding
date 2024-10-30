package com.itheima.stringdemo;

public class stringDemo2 {
    public static void main(String[] args) {
        //字符串的比较
        String s1 = "abc";
        String s2 = "Abc";
        String S3 = new String("abc");

        //==号比较
        //引用数据类型比较的是地址值
        System.out.println(s1 == s2);
        System.out.println(s1 == S3);

        //比较字符串对象中的内容是否相同
        //不忽略大小写，要求完全一模一样
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(S3));
        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(S3));
    }
}
