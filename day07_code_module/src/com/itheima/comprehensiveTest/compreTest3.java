package com.itheima.comprehensiveTest;

import java.util.Random;

public class compreTest3 {
    public static void main(String[] args) {
        //需求：
        //
        //​	定义方法实现随机产生一个5位的验证码
        //
        //验证码格式：
        //
        //​	长度为5
        //
        //​	前四位是大写字母或者小写字母
        //
        //​	最后一位是数字
        //ASCII吗中字母对应的范围：A-65，小写加32，即97开始

        ////在以后如果我们要在一堆没有什么规律的数据中随机抽取
        //        //可以先把这些数据放到数组当中
        //        //再随机抽取一个索引

        //将大小写字母都存放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i<=25){
                //前26 个放小写字母
                chs[i] = (char) (97 + i);
            }else {
                //后26个存放大写字母
                chs[i] = (char) (65 + i -26);
            }
        }

        Random r = new Random();
        //存放验证码
        String result = "";
        //随机抽字母
        for (int i = 0; i < 4; i++) {
            //随机索引
            int randomIndex = r.nextInt(chs.length);
            //字符串拼接
            result = result + chs[randomIndex];
        }
        //拼接最后一位数字
        result = result + r.nextInt(10);
        System.out.println(result);
    }
}
