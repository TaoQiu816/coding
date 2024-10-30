package com.itheima.Test;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        //有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子
        //小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?

        //1,1,2,3,5,8
        //特点：从第三个数据开始，是前两个数据之和（斐波那契数列）
        /*//创建长度为12的数组
        int[] arr = new int[12];

        //手动给第一和第二个数据赋值
        arr[0]=1;
        arr[1]=1;

        //利用循环给剩余数据赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));*/

        //方法2：递归
        System.out.println(getNum(12));
    }

    //获取第month个月的兔子对数
    public static int getNum(int month) {
        //出口
        if (month == 1 || month == 2) {
            return 1;
        }
        //递归调用
        return getNum(month - 1) + getNum(month - 2);
    }
}
