package com.itheima.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test1New {
    public static void main(String[] args) {
        //转换罗马数字
        //键盘录入字符串，长度小于等于9，只能是数字，将内容变成罗马数字
        //如果是0，则转换为长度为0的字符串""

        //1.键盘录入字符串，并验证是否合法
        //键盘录入
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            

            str = sc.next();
            //检验字符串是否合法
            boolean flag = checkStr(str);
            //若合法，则进入下一步
            if (flag){
                break;
            }else {
                //不合法则重新输入
                System.out.println("字符串不符合规则，重新输入");
                continue;
            }
        }
        //遍历字符串并转换为罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c -48;
            sb.append(toRome(num));
        }

        System.out.println(sb);


    }
    public static boolean checkStr(String str){
        //验证长度
        if (str.length()>9){
            return false;
        }
        //若长度和法则向下执行

        //验证是否都是数字
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if (c < '0' || c>'9'){
                return false;
            }
        }
        //若所有字符都验证完毕且未return，则都合法，返回true
        return true;
    }
    public static String toRome(int num){
        //存储罗马数字，索引与数字对应
        String[] rome = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return rome[num];

        //或者使用switch语句进行匹配
    }

}
