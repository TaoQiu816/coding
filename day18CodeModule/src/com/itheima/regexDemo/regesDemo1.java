package com.itheima.regexDemo;

import com.sun.source.tree.IfTree;

public class regesDemo1 {
    public static void main(String[] args) {
        //使用已有知识校验qq号
        String qq = "90a4751515";
        char[] qqArr = qq.toCharArray();


        System.out.println(checkQQ(qqArr, qq));

        //使用正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }

    private static boolean checkQQ(char[] qqArr, String qq) {
        //要求6到20位，0不能开头，必须全是数字
        if (qqArr.length < 6 || qqArr.length > 20) {
            System.out.println("长度非法");
            return false;
        }

        if (qq.startsWith("0")) {
            System.out.println("首位不能为0");
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);

            if (c < '0' || c > '9') {
                System.out.println("不全是数字");
                return false;
            }


        }
        System.out.println("号码合法");
        return true;
    }


}
