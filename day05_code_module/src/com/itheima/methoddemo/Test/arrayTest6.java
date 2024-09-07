package com.itheima.methoddemo.Test;

import java.util.Random;

public class arrayTest6 {
    public static void main(String[] args) {
        //随机打乱数组中的数据
        int[] arr = {1, 2, 3, 4, 5};

        //利用随机数作为随机索引，从而随机打乱数组元素
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //从0索引开始，与随机索引对应的数据进行交换，打乱数据
            int randomIndex = r.nextInt(arr.length);

            //交换数据
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }


        //暂存数组变量
        /*int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;*/

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
