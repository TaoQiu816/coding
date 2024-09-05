package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //利用三元运算符获取三个和尚身高的最大值

        //存储身高
        int height1 = 150, height2 = 210, height3  = 165;

        //获取最大身高
        //先比较前两者
        int temp = height1 > height2 ? height1 : height2;
        int max = height3 > temp ? height3 : temp;

        System.out.println(max);


    }


}
