package com.itheima.stringdemo;

import com.itheima.apiDemo.ScannerDemo1;

import java.util.Scanner;

public class stringDemo6 {
    public static void main(String[] args) {
        //统计字符次数
        //键盘录入字符串，统计该字符串中大写字母字符。小写字母字符，数字字符出现的次数
        //小写字母范围：97~122
        //大写字母范围：65~90

        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        //计数变量
        int countBig = 0;//大写字母
        int countSmall =0;//小写字母
        int countNumber =0;//数字字符

        //其实，char类型的变量在参与计算的时候会自动提升为int类型，查询ascii码表
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' &&c<='z'){
                countSmall++;
            } else if (c >= 'A' &&c<='Z') {
                countBig++;
            }else if (c >= '0' &&c<='9'){//数字字符要加单引号，
                countNumber++;
            }
        }
        /*for (int i = 0; i < str.length(); i++) {
            byte number = (byte) str.charAt(i);

            if (number >= 65 && number <= 90){
                countBig++;
            } else if (number>=97 && number <=122) {
                countSmall++;
            }else {
                countNumber++;
            }
        }*/

        System.out.println("大写字母" + countBig);
        System.out.println("小写字母" + countSmall);
        System.out.println("数组" + countNumber);
    }
}
