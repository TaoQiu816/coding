package com.itheima.methoddemo.Test;

public class arrayTest5 {
    public static void main(String[] args) {
        //交换数组中的数据
        //交换前1，2，3，4，5
        //交换后5，4，3，2，1
        int[] arr = {1, 2, 3, 4, 5};

        //不用从头到尾都循环，循环到交换的两个交换的数据索引相等或者相邻即终止循环

        /*for (int i = 0; i < arr.length; i++) {
            //暂存数组变量
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }*/
        //i从头开始，j从尾开始，只要i<j则说明还要继续循环
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //temp暂存arr[i],交换i和j索引对应的数据
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //遍历新数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
