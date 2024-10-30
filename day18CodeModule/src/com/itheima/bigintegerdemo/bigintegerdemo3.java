package com.itheima.bigintegerdemo;

import java.math.BigInteger;

public class bigintegerdemo3 {
    public static void main(String[] args) {

        BigInteger bd = new BigInteger("27670116110564327424");
        System.out.println(bd);

        //biginteger的底层存储原理
        //首先有一变量（取值-1，0，1）表示正数负数还是0
        //还有一数组将大整数分割存储，每32位为数组中的一个元素，并且从右向左，每一组转换为十进制再存在数组之中

    }
}
