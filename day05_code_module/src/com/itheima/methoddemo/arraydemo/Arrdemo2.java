package com.itheima.methoddemo.arraydemo;

public class Arrdemo2 {
    public static void main(String[] args) {
        //遍历数组并求和
        //数组定义
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
