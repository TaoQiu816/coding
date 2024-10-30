package com.itheima.bigDecimaDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimaDemo2 {
    public static void main(String[] args) {
        //bigdecimal的运算
        BigDecimal bd1 = BigDecimal.valueOf(0.365);
        BigDecimal bd2 = BigDecimal.valueOf(0.136);

        //加法
        System.out.println(bd1.add(bd2));

        //减法
        System.out.println(bd1.subtract(bd2));

        //乘法
        System.out.println(bd1.multiply(bd2));

        //除法（有重载）
        //可以除尽的时候不会报错，除不尽的时候会报错，要用重载的方法
        System.out.println(bd2.divide(bd1));
        //重载：指定精确几位以及舍入模式,舍入模式参见帮助文档
        System.out.println(bd2.divide(bd1,5, RoundingMode.HALF_UP));
    }
}
