package com.itheima.Test;

public class test4 {
    public static void main(String[] args) {
        //可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        //如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        //运算结果:
        //1层台阶 1种爬法
        //2层台阶 2种爬法
        //7层台阶 21种爬法

        //每一步：可以爬一步，可以爬两步，最后一步也是这样
        //所以：第n个台阶的爬法 = 第n-1个台阶的爬法 + 第n-2个台阶的爬法
        System.out.println(getMethod(20));
    }

    //递归
    //获取右step步台阶时有多少种爬法
    public static int getMethod(int step) {
        if (step == 1) {
            return 1;
        } else if (step == 2) {
            return 2;
        }

        return getMethod(step - 2) + getMethod(step - 1);
    }
}
