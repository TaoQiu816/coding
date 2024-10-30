package com.itheima.IntegerDemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //常用方法，四个静态方法

        //进制转换（返回string），三个静态方法，直接类名调用
        //转换成二进制（字符串）
        String binaryString = Integer.toBinaryString(100);
        System.out.println(binaryString);

        //转换成八进制（字符串）
        String octalString = Integer.toOctalString(100);
        System.out.println(octalString);

        //转换成十六进制（字符串）
        String hexString = Integer.toHexString(100);
        System.out.println(hexString);

        //将字符串类型的整数转换成int类型的整数
        //强类型语言：每种数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法直接计算的
        int i = Integer.parseInt("100");
        System.out.println(i);
        System.out.println(i+1);
        //细节：
        //1.在类型转换的时候，括号中的参数必须是数字而不能是其他，否则会报错
        //2.8种包装类中，除了Character之外都有对应的parseXxx的方法，进行类型转换
        String bool = "true";
        boolean b = Boolean.parseBoolean(bool);
        System.out.println(!b);

    }
}
