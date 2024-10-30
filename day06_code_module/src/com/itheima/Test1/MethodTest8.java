package com.itheima.Test1;

import java.util.Scanner;

public class MethodTest8 {
    public static void main(String[] args) {
        //定义方法将数组arr从索引from开始（包括from）到索引to结束(不含to)的元素复制到新数组中，将新数组返回
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        //获取两个索引
        Scanner sc = new Scanner(System.in);
        System.out.println("输入索引from:");
        int from = sc.nextInt();
        System.out.println("输入索引to:");
        int to = sc.nextInt();

        //调用方法获得新数组
        int[] brr = copyOfRange(arr, from, to);

        //输出新数组
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    //复制数组
    public static int[] copyOfRange(int[] arr, int from, int to) {
        //动态定义新数组
        int[] brr = new int[to - from];
        //可伪造索引
        //int index =0;
        if (to > arr.length - 1 || from < 0) {
            System.out.println("输入索引非法");
        } else {
            for (int i = from; i < to; i++) {
                brr[i - from] = arr[i];
                //brr[index]=arr[i];
                //index++;
            }
        }


        return brr;
    }
}
