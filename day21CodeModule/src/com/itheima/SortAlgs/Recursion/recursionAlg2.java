package com.itheima.SortAlgs.Recursion;

public class recursionAlg2 {
    public static void main(String[] args) {
        //递归求阶乘

        //心得：递归方法内部再次调用方法时，参数必须更加靠近出口

        System.out.println(getFactorial(5));
    }

    //计算num的阶乘
    public static int getFactorial(int num) {
        //出口
        if (num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
