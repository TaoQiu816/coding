package com.itheima.SortAlgs.Recursion;

public class recursionAlg1 {
    public static void main(String[] args) {
        //递归算法
        //注意：一定要有问题的出口，否则就会报错（内存溢出

        //核心：
        // 1.找出口（什么时候方法不再调用自己）
        //2.找规律，如何拆解为小问题

        //计算从1~100的和
        //大问题拆成小问题
        //1~100的和=100+（1~99的和）
        //1~99的和=99+（1~98的和）
        //。。。
        //1~2的和=2+（1~1的和）
        //1~1的和=1（递归的出口）

        System.out.println(getSum(100));
    }

    //求从num到num-1一直到1的和
    public static int getSum(int num) {
        //递归出口
        if (num == 1) {
            return 1;
        }

        //如果num不为1
        return num + getSum(num - 1);
    }
}
