package com.itheima.search;

import java.util.ArrayList;

public class basicSearchAlg3 {
    public static void main(String[] args) {
        //需求：定义一个方法利用基本查找，查询某个元素的索引。考虑是否重复
        //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr ={131, 127, 147, 81, 103, 23, 7, 79, 81};
        int num = 81;
        System.out.println(search(arr, num));
    }

    //心得:如果要返回多个数据，可以把这些数据放到数组或者集合中
    public static ArrayList<Integer> search(int[] arr, int num){
        //存储查找到的索引
        ArrayList<Integer> list = new ArrayList<>();
        int[] index;
        //顺序查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                list.add(i);
            }
        }
        return list;
    }
}
