package com.itheima.methoddemo.Test;

import java.util.Random;

public class arrayTest4 {
    public static void main(String[] args) {
        //遍历数组求和，求所有数据平均数，统计有多少个数据比平均数小

        //生成10个1到100之间的随机数存入数组
        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        //数组所有数据的和
        //求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组所有元素和为" + sum);

        //求平均数
        double avg = sum / arr.length;
        System.out.println("平均值为" + avg);

        //计数变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("数组中共有" + count + "个数比平均值小");

        //遍历数组验证答案
        //println中去掉ln则不换行
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
