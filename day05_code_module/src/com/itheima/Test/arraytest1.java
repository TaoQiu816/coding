package com.itheima.Test;

public class arraytest1 {
    public static void main(String[] args) {
        //统计数组中可以被3整除的数字

        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //统计可以被3整数的数字
        //统计变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("数组中可以被3整除的数字共有" + count + "个");
    }
}
