package com.itheima.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        //调用方法
        //调用时，形参和实参必须一一对应，否则就会报错
        getSum(10, 20);

    }

    //方法定义
    public static void getSum(int num1, int num2) {


        int sum = num1 + num2;

        System.out.println(sum);
    }
}
