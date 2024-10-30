package com.itheima.Test;

public class test5 {
    public static void main(String[] args) {
        //可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶,有时候爬三个。
        //如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        //1个台阶：1种方法
        //2个台阶：2中方法
        //3个台阶：1+1+2

        System.out.println(getSum(20));

    }
    public static int getSum(int step){
        if (step==1){
            return 1;
        } else if (step == 2) {
            return 2;
        } else if (step == 3) {
            return 4;
        }
        return getSum(step-1)+getSum(step-2)+getSum(step-3);
    }
}
