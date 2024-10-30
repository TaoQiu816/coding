package com.itheima.Test1;

import java.util.Scanner;

public class MethodTest7 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一数是否存在，将结果返回给调用处
        int[] arr = {11,22,33,44,55,66,77,88,99};

        //所判断的数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的数字");
        int num = sc.nextInt();

        boolean flag = contains(arr, num);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int num){
        //标记是否存在
        //boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        //若未执行return true,则说明没有所查找的数字，随之执行return false
        return false;
    }
    //return的作用：1.结束方法。2.返回结果
    //若方法执行到了return，那么整个方法将全部结束，所在的循环也会随之结束
    //break关键字：用于结束循环或switch
}
