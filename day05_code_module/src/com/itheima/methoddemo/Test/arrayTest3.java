package com.itheima.methoddemo.Test;

public class arrayTest3 {
    public static void main(String[] args) {
        //数组常见操作：求最值
        //定义数组
        int[] arr = {33, 5, 27, 44, 55};

        //max存储最大值，初始默认arr[0],只要是数组中的值就行
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);


    }
}
