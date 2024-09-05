package com.itheimacontrol.ifdemo.Test;

public class Test14 {
    public static void main(String[] args) {
        //累加（1到5）
        //定义求和变量
        int sum = 0;
        //切记变量作用范围为所属的大括号，所以
        //1.求和变量不能定义在循环的里面，因为变量只在所属的大括号中有效
        //2.如果将变量定义再循环的里面，那么当前变量只能在本次循环中有效
        //本次循环结束之后，变量就会从内存中消失
        //下一次循环开始时，又会重新定义一个新变量
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;//或sum += i;
        }
        System.out.println("1到5和为" + sum);
    }
}
