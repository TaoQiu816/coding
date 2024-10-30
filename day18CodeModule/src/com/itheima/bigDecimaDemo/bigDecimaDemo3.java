package com.itheima.bigDecimaDemo;

import java.math.BigDecimal;

public class bigDecimaDemo3 {
    public static void main(String[] args) {
        //bigdecimal的底层存储
        //获取字符串每一位的ascii值，并存放于数组（包括负号和小数点）
        BigDecimal bd1 = new BigDecimal("0.226");
        BigDecimal bd2 = new BigDecimal("123.226");
        BigDecimal bd3 = new BigDecimal("-1.5");
    }
}
