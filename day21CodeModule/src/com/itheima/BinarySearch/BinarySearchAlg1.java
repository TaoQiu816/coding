package com.itheima.BinarySearch;

public class BinarySearchAlg1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //前提：查找的数据必须有序

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 1));
    }

    public static int binarySearch(int[] arr, int num) {
        //起始min和max为最小和最大索引，代表查找范围
        int min = 0;
        int max = arr.length - 1;

        //mid为两者和除以2
        // int mid = 0;
        while (true) {
            //由于min索引不超过max，因此当min超过max时说明没找到
            //终止条件
            if (min > max) {
                //return -1;
                break;
            }

            //找到中间位置

            int mid = (min + max) / 2;
            //比较要查找元素和中间位置元素，更新范围
            if (num < arr[mid]) {
                //中位数左侧，更新范围
                max = mid - 1;
            } else if (num > arr[mid]) {
                //中位数右侧，更新范围
                min = mid + 1;
            } else {
                //等于中位数,返回中位数索引
                return mid;
            }


        }
        //执行到此说明没找到
        return -1;
    }
}
