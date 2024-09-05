package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //键盘录入两个数字表示取值范围
        //统计该范围内既能被3整除又能被5整除的数字个数

        //1.键盘录入取值范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数表示取值范围边界");
        System.out.println("第一个数：");
        int number1 = sc.nextInt();
        System.out.println("第二个数：");
        int number2 = sc.nextInt();

        //判断输入的两个数大小从而作为循环的始末
        //初始化范围边界变量
        int start = 0;
        int end = 0;
        //start为始，end为末
        if (number1 <= number2) {
            start = number1;
            end = number2;
        } else {
            start = number2;
            end = number1;
        }
        //计数变量
        int count = 0;

        //根据min和max定循环,可用end.fori获取其中的每个数字
        for (int i = start; i <= end; i++) {
            //判断是否满足整除条件
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println("在" + start + "到" + end + "范围内可同时被3和5整除的数字共有" + count + "个");

    }
}
