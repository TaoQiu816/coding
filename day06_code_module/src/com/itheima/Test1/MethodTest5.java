package com.itheima.Test1;

public class MethodTest5 {
    public static void main(String[] args) {
        //数组遍历，结果在同行显示[11,22,33,44,55]
        int[] arr = {11, 22, 33, 44, 55};
        //调用方法，遍历数组
        printArr(arr);
    }

    //方法定义
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

        }
        System.out.println("]");
    }
}


/*//先打印数据，再进行换行
        System.out.println("aaa");
//只打印不换行
        System.out.print("bbb");
        System.out.print("ddd");
//不打印任何内容，只换行
        System.out.println();*/
