package com.itheima.SortAlgs.SelectSort;

public class selectSortAlg1 {
    public static void main(String[] args) {
        //选择排序
        /*
            选择排序：
                1，从0索引开始，跟后面的元素一一比较。
                2，小的放前面，大的放后面。
                3，第一次循环结束后，最小的数据已经确定。
                4，第二次循环从1索引开始以此类推。

         */


        //待排序数据
        int[] arr = {2, 5, 4, 1, 3, 9, 8, 11, 0, 6};

        //n个数据，共循环（外循环） n-1 次（从0索引到倒数第二个索引）
        //外循环表示我拿着哪个索引上的数据跟后面的数据进行比较
        for (int i = 0; i < arr.length - 1; i++) {
            //外循环的变量i就是当前索引位置
            //内循环：将本索引(也就是i)的数据依次和之后的数据进行比较，小的换到本位制
            for (int j = i + 1; j < arr.length; j++) {//自己不用和自己进行比较，因此i+1可提高效率
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
