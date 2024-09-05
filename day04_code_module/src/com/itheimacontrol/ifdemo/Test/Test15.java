package com.itheimacontrol.ifdemo.Test;

public class Test15 {
    public static void main(String[] args) {
        //求和1到100中的偶数
        //求和变量
        int sum = 0;
        //循环获取1到100
        //可用快捷键100.fori创建循环语句

        for (int i = 1; i <= 100; i++) {
            //判断若为偶数则求和
            if (i % 2 == 0) {
                sum += i;
            }
        }
        //输出结果
        System.out.println("1到100之间的所有偶数和为：" + sum);
    }
}
