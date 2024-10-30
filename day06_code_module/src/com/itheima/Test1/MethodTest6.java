package com.itheima.Test1;

public class MethodTest6 {
    //设计一个方法求数组的最大值，并将最大值返回
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 88, 99, 77, 66, 55, 21, 33, 45, 62, 36};
        int max = getArrMax(arr);
        System.out.println(max);
    }

    //定义方法求数组最大值
    public static int getArrMax(int[] arr) {
        //存储最大值变量,初始默认为数组的某一个数据
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
