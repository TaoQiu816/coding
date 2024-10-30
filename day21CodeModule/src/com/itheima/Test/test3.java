package com.itheima.Test;

public class test3 {
    public static void main(String[] args) {
        //有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!以后每天猴子都吃当前剩下来的一半，然后
        //再多吃一个，第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?

        //day10：1个
        //day9：(day10 +1)*2
        //8天：(day9 +1)*2

        //递归
        System.out.println(getSum(1));
    }

    //获取第day日的桃子个数
    public static int getSum(int day){
        if (day<=0||day>=11){
            System.out.println("当前数据错误");
        }
        //出口：第10天
        //反向递归
        if (day==10){
            return 1;
        }
        //当前天的桃子数=下一天桃子数*2+1
        return (getSum(day + 1)  + 1)* 2;
    }
}
