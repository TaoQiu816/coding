package com.itheima.Test;

public class arraytest2 {
    public static void main(String[] args) {
        //数组元素若为奇数则扩大两倍，偶数则变为其一半
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //遍历并更改数据
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = 2 * arr[i];
            }
        }

        //遍历新数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //一个循环最好只做一件事
    }
}
