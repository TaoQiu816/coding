package com.itheima.bigDecimaDemo;

import java.math.BigDecimal;

public class bigDecimaDemo1 {
    public static void main(String[] args) {
        //bigDecimal作用：1.小数的精确计算
        //2.表示很大的小数

        //构造方法
        //public BigDecimal(double val)   结果有一定的不可预知性
        //public BigDecimal(String val)   结果精确，不存在上面方法的不可预知问题

        //1.传递double类型的小数传递对象
        //这种方法有可能是不精确的，不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //2.通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);
        System.out.println(bd4);

        //3.通过静态方法获取对象，valueof
        BigDecimal bd5 = BigDecimal.valueOf(10);
        BigDecimal bd6 = BigDecimal.valueOf(10);//0~10的整数使用的是现有的对象
        System.out.println(bd5 == bd6);

        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        BigDecimal bd8 = BigDecimal.valueOf(10);
        System.out.println(bd7 == bd8);

        //细节：
        //1.如果表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超出了doouble的取值范围，建议使用构造方法
        //3.如果传递的是0~10之间的整数并且包含0和10，那么方法会返回已经创建好的对象，不会重新new，节约内存


    }
}
