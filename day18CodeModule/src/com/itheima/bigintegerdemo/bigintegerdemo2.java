package com.itheima.bigintegerdemo;

import java.math.BigInteger;

public class bigintegerdemo2 {
    public static void main(String[] args) {
        //biginteger是对象，不能直接进行运算，要调用方法
        BigInteger bd1 = BigInteger.valueOf(16);
        BigInteger bd2 = BigInteger.valueOf(3);

        //加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //减法
        BigInteger bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //乘法
        BigInteger bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //除法（只获得商）
        BigInteger bd6 = bd1.divide(bd2);
        System.out.println(bd6);

        //除法（获得商和余数
        BigInteger[] bd7 = bd1.divideAndRemainder(bd2);
        System.out.println(bd7[0]+"  "+bd7[1]);
        System.out.println(bd7);

        //比较是否相同
        boolean eq = bd1.equals(bd2);
        System.out.println(eq);

        //获取较大值/较小值(不会创建新对象，只是返回较大值对象或者较小值对象
        System.out.println(bd1.max(bd2));
        System.out.println(bd1.min(bd2));

        //次幂
        System.out.println(bd1.pow(2));

        //转换为基本数据类型，超出范围有误
        int i = bd1.intValue();
        long l = bd1.longValue();
        double v = bd1.doubleValue();
        System.out.println(i);
        System.out.println(l);
        System.out.println(v);
    }
}
