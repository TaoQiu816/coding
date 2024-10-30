package com.itheima.search;

public class basicSearchAlg1 {
    public static void main(String[] args) {
        //基本查找（需要一个容器，在容器中一一查找）
        //核心：从0索引开始挨个向后查找（顺序查找）

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr ={131, 127, 147, 81, 103, 23, 7, 79};
        int num = 81;
        System.out.println(search(arr, num));
    }
    public static boolean search(int[] arr, int num ){
        //顺序查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
