package com.itheima.methoddemo.arraydemo;

public class Arrdemo3 {
    public static void main(String[] args) {
        //数组的动态初始化,需要指定数组的长度,数组元素为系统给出的默认初始化值

        //其中，整数类型：默认初始化值为0
        //小数类型：默认初始化值为0.0
        //字符类型：默认初始化值为‘/0000’，打印出来为空格
        //布尔类型：默认初始化值为false
        //字符串类型：默认初始化值为null
        //引用类型：默认初始化值为null,例如字符串为引用类型
        String[] arr = new String[50];
        arr[0]="aaa";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        int[] arr1=new int[3];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);



    }
}
