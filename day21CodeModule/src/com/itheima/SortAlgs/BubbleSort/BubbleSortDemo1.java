package com.itheima.SortAlgs.BubbleSort;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。

            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。

            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */

        //每一轮循环可确定一个最大数据并放在最右边


        //待排序数据
        int[] arr = {2, 5, 4, 1, 3, 9, 8, 11, 0, 6};

        //冒泡排序
        //外循环n个数据则执行n-1次
        //每个循环内部是循环比较排序，并且外层循环每循环一次，内层循环就少循环一次
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环次数于外层循环有关
            //外层循环完成几次，内层就少循环几次
            //因为每完成一次外循环，就有一个较大值被放在最右边
            //因此-i可提高效率
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //比较相邻位置数据,大的放在右边
                if (arr[j] > arr[j + 1]) {
                    //交换数据
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
