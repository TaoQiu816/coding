package com.itheima.SortAlgs.Recursion;

import javax.swing.border.BevelBorder;
import java.util.Arrays;
import java.util.Random;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        //快速排序
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。（基准数归位）
            后面以此类推。
      */
        //int[] arr = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        int[] arr = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }

        long before = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long after = System.currentTimeMillis();
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }*/
        System.out.println(Arrays.toString(arr));
        System.out.println(after-before);



    }
    /*
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     * */
    public static void quickSort(int[] arr, int i, int j){

        //变量记录要查找的范围
        int start = i;
        int end = j;

        //递归出口
        if (start>end){

            return;
        }

        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字（基准数要归位的位置）
        //循环终止条件：start和end相等时
        while (start!=end){

            //注意此处必须先移动end
            //原因：基准数归位时是与比基准数小的元素交换位置，因此找到比基准数小的数要优先



            //利用end，从后往前找，找到比基准数小的数字
            while (true){
                //终止条件
                if (start>=end || baseNumber>arr[end]){
                    break;
                }
                //当end处的元素比基准数大的时候，继续向左寻找
                end--;
            }
            //利用start，从前往后找，找到比基准数大的数字
            while (true){
                //终止条件
                if (end<=start || arr[start]>baseNumber){
                    break;
                }
                //当start处的元素比基准数大的时候，继续向右寻找
                start++;
            }
            //到此说明end和start均找到了满足要求的元素
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        //当start和end指向同一个元素的时候，循环结束
        //表示已经找到了基准数在数组中应该存入的位置
        //基准数归位：将基准数与应存入位置的元素进行交换
        //也就是拿着这个范围中的第一个数据和start指向的元素进行交换
        int temp =arr[i];
        arr[i]=arr[start];
        arr[start]=temp;

        //确定基准数归为后，左边的数据范围，重复上面的操作
        quickSort(arr,i,start-1);
        //确定基准数归为后，右边的数据范围，重复上面的操作
        quickSort(arr,end+1,j);

    }
}
