package com.itheima.comprehensiveTest;

public class doublearrayDemo1 {
    public static void main(String[] args) {
        //二维数组练习
        //商场每个季度营业额，计算每个季度总营业额和全年总营业额
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //记录年营业额
        int sumYear = 0;
        for (int i = 0; i < arr.length; i++) {
            //每个索引i对应一个二维数组，也就是一个季度
            //记录季度总营业额
            int sumQuarter = getSumQuarter(arr[i]);
            sumYear = sumYear + sumQuarter;
            System.out.println("第" + (i + 1) + "季度营业额为" + sumQuarter);
        }
        System.out.println("年度总营业额为" + sumYear);

    }

    public static int getSumQuarter(int[] arr) {
        int sumQuarter = 0;
        for (int j = 0; j < arr.length; j++) {
            sumQuarter = sumQuarter + arr[j];
        }
        return sumQuarter;
    }


}
