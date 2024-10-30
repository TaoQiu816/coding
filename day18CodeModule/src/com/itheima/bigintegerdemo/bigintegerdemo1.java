package com.itheima.bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class bigintegerdemo1 {
    public static void main(String[] args) {
        //构造方法
        /*public BigInteger( int num, Random rnd)        //获取随机大整数，范围：[0 ~ 2的num次方-1]
        常用1：public BigInteger(String val)                //获取指定的大整数
        public BigInteger(String val, int radix)    //获取指定进制的大整数

        下面这个不是构造，而是一个静态方法获取BigInteger对象
       常用2： public static BigInteger valueOf ( long val)    //静态方法获取BigInteger的对象，内部有优化*/


        //对象一旦创建，对象里面的数据就不会发生改变，只要计算就会产生一个新的对象

        //获取一个随机的大整数
        BigInteger bd1 = new BigInteger(10, new Random());
        System.out.println(bd1);

        //获取指定的大整数,参数的字符串只能写整数
        BigInteger bd2 = new BigInteger("999999999999999999");
        System.out.println(bd2);

        //获取指定进制的大整数
        //字符串中的数字必须是整数
        //字符串中的数字必须和进制吻合
        BigInteger bd3 = new BigInteger("122",3);
        System.out.println(bd3);

        //静态方法获取BigInteger的对象，内部有优化
        //细节：能表示的范围比较小，只能在long类型的范围之内，超出就不行
        //在内部对常用的数字进行了优化：-16~16
        //提前把-16到16先创建好Biginteger的对象，如果多次获取不会创建新对象，而是用现成的
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);

    }
}
