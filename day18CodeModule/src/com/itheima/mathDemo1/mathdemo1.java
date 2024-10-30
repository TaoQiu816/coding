package com.itheima.mathDemo1;

import javax.sound.midi.Soundbank;

public class mathdemo1 {
    public static void main(String[] args) {

        //math中的方法都是静态方法，直接通过类名调用（遵循工具类

        //abs()方法  获取参数绝对值
        System.out.println(Math.abs(-78));
        System.out.println(Math.abs(-78.9876543));
        System.out.println(Math.abs(98));
        //小bug：如int取值范围：-2147483648~2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //如-2147483648没有正数与之对应，可使用absExact()返回此bug产生的错误

        //ceil()方法  向上取整（数轴的正方向，返回的是double类型）
        System.out.println(Math.ceil(6.66));
        System.out.println(Math.ceil(7.3));
        System.out.println(Math.ceil(-12.3));
        //floor()方法  向下取整（数轴的负方向，返回的是double类型）
        System.out.println(Math.floor(6.66));
        System.out.println(Math.floor(7.3));
        System.out.println(Math.floor(-12.3));

        //round()  四舍五入（返回double）
        System.out.println(Math.round(6.66));
        System.out.println(Math.round(7.3));
        System.out.println(Math.round(-12.3));
        System.out.println(Math.round(-12.7));

        //max  获取两个数据的最大值
        System.out.println(Math.max(7, 6));
        System.out.println(Math.max(7.896, 6.235));
        System.out.println(Math.max(-1.37, -2.016));
        //min  获取两个数据的最小值
        System.out.println(Math.min(7, 6));
        System.out.println(Math.min(7.896, 6.235));
        System.out.println(Math.min(-1.37, -2.016));

        //pow(a,b)  获取a的b次幂,参数均为double类型，幂次可以为小数和负数
        System.out.println(Math.pow(2, 3));
        //开平方根
        System.out.println(Math.sqrt(16));
        //开立方根
        System.out.println(Math.cbrt(8));

        //random()  返回[0,1)之间的随机数（小数）
        System.out.println(Math.random());


    }
}
