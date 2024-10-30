package com.itheima.search;

public class basicSearchAlg2 {
    public static void main(String[] args) {
        //需求：定义一个方法利用基本查找，查询某个元素的索引。不考虑是否重复
        //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr ={131, 127, 147, 81, 103, 23, 7, 79};
        int num = 81;
        System.out.println(search(arr, num));
    }
    public static int search(int[] arr, int num){
        //顺序查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
