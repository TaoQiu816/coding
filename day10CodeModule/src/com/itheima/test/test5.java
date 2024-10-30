package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
        //给定两个字符串形式表示的非负整数num1和num2
        //返回两者的乘积，他们的乘积也要表示成字符串形式
        //用已有的知识完成
        String str1 = "98765";
        String str2 = "64";

        //转换成整数
        int num = toNumber(str1)*toNumber(str2);
        System.out.println(num);
        String result = "" + num;
        System.out.println(result);


    }

    public static int toNumber(String str){
        //转换成字符数组
        //char[] c = str.toCharArray();
        //记录所转换的整数
        int num =0;
        for (int i = 0; i < str.length(); i++) {
            //从左往右获取每一位
            int x = str.charAt(i) -48;
            //更新最终整数
            num = num*10 + x;
        }
        System.out.println(num);
        return num;
    }
}
